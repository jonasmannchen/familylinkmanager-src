package flm;

import android.annotation.TargetApi;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bik {
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;

    @TargetApi(20)
    public static boolean a(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return c.booleanValue();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        return a(context) && (!biw.b() || (c(context) && !biw.d()));
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return d.booleanValue();
    }
}
