package flm;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.google.android.gms.common.app.BaseApplicationContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btw {
    public static boolean a(fae faeVar) {
        int i;
        BaseApplicationContext baseApplicationContextA = ayt.a();
        if (Build.VERSION.SDK_INT >= 28) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a((DevicePolicyManager) baseApplicationContextA.getSystemService(DevicePolicyManager.class));
            devicePolicyManager.clearUserRestriction(btb.a, "no_share_location");
            devicePolicyManager.addUserRestriction(btb.a, "no_config_location");
            a((Context) baseApplicationContextA);
            LocationManager locationManager = (LocationManager) dvl.a((LocationManager) baseApplicationContextA.getSystemService(LocationManager.class));
            boolean zIsLocationEnabled = locationManager.isLocationEnabled();
            boolean z = (faeVar == fae.OFF || faeVar == fae.LOCATION_MODE_UNSPECIFIED) ? false : true;
            if (zIsLocationEnabled != z) {
                locationManager.setLocationEnabledForUser(z, Process.myUserHandle());
                btt.a(faeVar);
            }
            return zIsLocationEnabled != z;
        }
        int i2 = Settings.Secure.getInt(baseApplicationContextA.getContentResolver(), "location_mode", 0);
        switch (faeVar.ordinal()) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            default:
                btv.d("Policy", "Unknown LocationMode %s, defaulting to high accuracy.", faeVar);
                btt.a("Policy", "location", "Unknown LocationMode %s", faeVar);
                i = 3;
                break;
        }
        DevicePolicyManager devicePolicyManager2 = (DevicePolicyManager) dvl.a(baseApplicationContextA.getSystemService("device_policy"));
        if (i == 0) {
            devicePolicyManager2.addUserRestriction(btb.a, "no_share_location");
        } else {
            devicePolicyManager2.clearUserRestriction(btb.a, "no_share_location");
        }
        a((Context) baseApplicationContextA);
        if (i2 != i) {
            Settings.Secure.putInt(baseApplicationContextA.getContentResolver(), "location_mode", i);
            btt.a(faeVar);
        }
        return i2 != i;
    }

    private static void a(Context context) {
        dfa.a(context.getContentResolver(), "network_location_opt_in", "1");
    }

    public static fae a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return fae.OFF;
            case 1:
                return fae.DEVICE_ONLY;
            case 2:
                return fae.BATTERY_SAVING;
            case 3:
                return fae.HIGH_ACCURACY;
            default:
                btv.d("Report", "Unknown android LocationMode %s, defaulting to off.", Integer.valueOf(i));
                btt.a("Report", "location", "Unknown android LocationMode %s", Integer.valueOf(i));
                return fae.LOCATION_MODE_UNSPECIFIED;
        }
    }
}
