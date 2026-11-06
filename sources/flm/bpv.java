package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bpv {
    public static int a(Context context) {
        String str;
        if (bsk.a != null) {
            str = bsk.a;
        } else {
            Process.myUid();
            PackageManager packageManager = context.getPackageManager();
            if ((biw.d() || !bsk.a(packageManager)) && !bsk.b(packageManager)) {
                Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
                if (bsk.a(packageManager, "com.google.android.gms")) {
                    biw.d();
                    str = bsk.a;
                } else {
                    Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
                    str = null;
                }
            } else {
                str = bsk.a;
            }
        }
        if (str != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return -1;
    }

    static {
        new AtomicInteger(1);
    }
}
