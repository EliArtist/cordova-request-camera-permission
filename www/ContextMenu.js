function CameraPermission() {}

CameraPermission.prototype.init = function(onSuccess, onError) {
    exec(onSuccess, onError, "CameraPermission", "init");
}

module.exports = CameraPermission;