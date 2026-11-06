package flm;

import android.app.Application;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpf {
    private static volatile int a;
    private static volatile int b;

    public static int a(Application application) {
        if (a == 0) {
            synchronized (dpf.class) {
                if (a == 0) {
                    int iB = b(application);
                    if (iB < 10 || iB > 60) {
                        iB = 60;
                    }
                    a = (int) Math.ceil(1000.0d / ((double) iB));
                }
            }
        }
        return a;
    }

    public static int b(Application application) {
        if (b == 0) {
            synchronized (dpf.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) application.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }
}
