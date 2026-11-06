package flm;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmp {
    public static boolean a(Application application, String str) {
        try {
            ServiceInfo[] serviceInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                return false;
            }
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.name.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            dkm.a("PrimesJobScheduler", "Failed to find application package", e, new Object[0]);
            return false;
        }
    }
}
