package flm;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsg {
    private static volatile Thread a;
    private static volatile Handler b;

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void b() {
        if (a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Handler c() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static void a(Runnable runnable) {
        c().post(runnable);
    }
}
