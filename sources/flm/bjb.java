package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjb {
    public static boolean a(Context context, int i) {
        if (!a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            aqy aqyVarA = aqy.a(context);
            if (packageInfo == null) {
                return false;
            }
            if (aqyVarA.a(packageInfo, false)) {
                return true;
            }
            if (!aqyVarA.a(packageInfo, true)) {
                return false;
            }
            if (aqx.c(aqyVarA.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @TargetApi(19)
    public static boolean a(Context context, int i, String str) {
        return bjj.a.a(context).a(i, str);
    }
}
