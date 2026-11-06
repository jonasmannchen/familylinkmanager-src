package flm;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bus {
    private static int a = -1;

    public static int a(Context context) {
        if (a != -1) {
            return a;
        }
        try {
            a = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            btv.d(null, "Could not get package info for gmscore", new Object[0]);
        }
        return a;
    }

    public static boolean b(Context context) {
        return a(context) >= 11800000;
    }
}
