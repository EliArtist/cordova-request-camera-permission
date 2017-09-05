function CameraPermission() {}

CameraPermission.prototype.init = function(onSuccess, onError) {
    exec(onSuccess, onError, "CameraPermission", "init");
}

cordova.addConstructor(function() {
    if(!window.Cordova) {
        window.Cordova = cordova;
    }

    if(!window.plugins) window.plugins = {};
    window.plugins.CameraPermission = new CameraPermission();
});