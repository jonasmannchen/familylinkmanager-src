package flm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aqf {
    public static final int c = aqx.a;
    public static final aqf d = new aqf();

    aqf() {
    }

    public int a(Context context) {
        return a(context, c);
    }

    public int a(Context context, int i) {
        int iA = aqx.a(context, i);
        if (aqx.d(context, iA)) {
            return 18;
        }
        return iA;
    }

    public static void b(Context context, int i) {
        aqx.b(context, 11925000);
    }

    public boolean a(int i) {
        return aqx.b(i);
    }

    @Deprecated
    public Intent b(int i) {
        return a((Context) null, i, (String) null);
    }

    public Intent a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context != null && bik.b(context)) {
                    return bbz.createAndroidWearUpdateIntent();
                }
                return bbz.createPlayStoreIntent("com.google.android.gms", a(context, str));
            case 3:
                return bbz.createSettingsIntent("com.google.android.gms");
            default:
                return null;
        }
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent intentA = a(context, i, str);
        if (intentA == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentA, 134217728);
    }

    public static void b(Context context) {
        if (!aqx.d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    public boolean c(Context context, int i) {
        return aqx.d(context, i);
    }

    public String c(int i) {
        return aqx.a(i);
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(c);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(bjj.a.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }
}
