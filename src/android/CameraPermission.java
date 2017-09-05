package de.requestcamerapermission;

import android.Manifest;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CameraPermission extends CordovaPlugin {

    private static final String [] permissions = {
        Manifest.permission.CAMERA
    };

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            if(cordova.hasPermission) {
                if(cordova.hasPermissions(permissions[0])) {
                    return true;
                } else {
                    cordova.requestPermissions(this, 0, permissions);
                }

                if(cordova.hasPermissions(permissions[0])) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}