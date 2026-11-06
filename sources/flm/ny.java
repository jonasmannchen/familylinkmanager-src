package flm;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ny {
    private static String b;
    private static ob g;
    private final Context d;
    private final NotificationManager e;
    private static final Object a = new Object();
    private static Set c = new HashSet();
    private static final Object f = new Object();

    public ny(Context context) {
        this.d = context;
        this.e = (NotificationManager) this.d.getSystemService("notification");
    }

    public final void a(String str, int i) {
        this.e.cancel(str, i);
    }

    public final void a(String str, int i, Notification notification) {
        boolean z = false;
        Bundle bundleA = nr.a(notification);
        if (bundleA != null && bundleA.getBoolean("android.support.useSideChannel")) {
            z = true;
        }
        if (z) {
            nz nzVar = new nz(this.d.getPackageName(), i, str, notification);
            synchronized (f) {
                if (g == null) {
                    g = new ob(this.d.getApplicationContext());
                }
                g.a.obtainMessage(0, nzVar).sendToTarget();
            }
            this.e.cancel(str, i);
            return;
        }
        this.e.notify(str, i, notification);
    }

    public static Set a(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
                set = c;
            } else {
                set = c;
            }
            throw th;
        }
        return set;
    }
}
