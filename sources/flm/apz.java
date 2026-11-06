package flm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimeraresources.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apz {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private static rv b = null;
    private static final Object c = new Object();
    private static volatile boolean d = false;
    private static long e = (-a) << 1;

    public static boolean a(Context context, String str) {
        if (context != null && a(context)) {
            drf.b(context);
            try {
                if (!((foy) fox.a.a()).a()) {
                    return false;
                }
                synchronized (c) {
                    if (b == null || !b.contains(str)) {
                        String str2 = String.format("Application \"%s\" (%s) is an unverified version of a Google application, but is considered trusted by Google Play services because an account on your device has opted into accepting debug certificates. If you do not wish to run unverified apps, please uninstall immediately.", b(context, str), str);
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (biw.d()) {
                            notificationManager.createNotificationChannel(new NotificationChannel("googlecertificates", "Security warning", 2));
                        }
                        Notification.Builder smallIcon = (biw.d() ? new Notification.Builder(context, "googlecertificates") : new Notification.Builder(context)).setContentText(str2).setSmallIcon(R.drawable.common_ic_googleplayservices);
                        smallIcon.setStyle(new Notification.BigTextStyle().bigText(str2));
                        smallIcon.setLocalOnly(true);
                        if (!biw.d()) {
                            smallIcon.setPriority(-1);
                        }
                        Notification notificationBuild = smallIcon.build();
                        String strValueOf = String.valueOf("GMS_TEST_KEYS_WARNING_NOTIFICATION_TAG");
                        String strValueOf2 = String.valueOf(str);
                        notificationManager.notify(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), 1, notificationBuild);
                        if (b == null) {
                            b = new rv();
                        }
                        b.add(str);
                    }
                }
                return true;
            } catch (SecurityException e2) {
                Log.w("DebugCertificatesHelper", "Flags cannot be read", e2);
                return false;
            }
        }
        return false;
    }

    private static boolean a(Context context) {
        if (e > SystemClock.elapsedRealtime() - a) {
            return d;
        }
        try {
            int i = Settings.Global.getInt(context.getContentResolver(), "adb_enabled");
            e = SystemClock.elapsedRealtime();
            boolean z = i == 1;
            d = z;
            return z;
        } catch (Settings.SettingNotFoundException e2) {
            return false;
        }
    }

    private static String b(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return "(could not get application name)";
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
