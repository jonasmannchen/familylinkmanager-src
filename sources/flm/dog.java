package flm;

import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dog {
    public static boolean a(Application application) {
        if (Build.VERSION.SDK_INT >= 23) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) application.getSystemService("device_policy");
            int storageEncryptionStatus = devicePolicyManager == null ? 0 : devicePolicyManager.getStorageEncryptionStatus();
            if ((storageEncryptionStatus == 3 || storageEncryptionStatus == 4 || storageEncryptionStatus == 5) && Build.FINGERPRINT.contains("userdebug")) {
                return true;
            }
        }
        return false;
    }
}
