package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class czf {
    private static final Object a = new Object();

    @SuppressLint({"StaticFieldLeak"})
    private static Context b = null;
    private static volatile Boolean c = null;
    private static volatile Boolean d = null;

    public static void a(Context context) {
        Context applicationContext;
        drf.a(context);
        synchronized (a) {
            if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            if (b != context) {
                c = null;
            }
            b = context;
        }
    }
}
