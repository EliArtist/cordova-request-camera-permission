package de.requestcamerapermission;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CameraPermission extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            if(cordova.hasPermissions(Manifest.permission.CAMERA))
                return true;
            else
                cordova.requestPermissions(this, 0, [Manifest.permission.CAMERA]);

            if(cordova.hasPermissions(Manifest.permission.CAMERA))
                return true;
            else
                return false;
        }
        return false;
    }
}