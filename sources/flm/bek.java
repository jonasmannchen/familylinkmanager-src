package flm;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bek {
    public final NotificationManager a;
    public final String b;
    public final bei c;
    private final Context d;
    private final CharSequence e;
    private final bej f;
    private final boolean g;
    private final Set h = Collections.newSetFromMap(new ConcurrentHashMap());

    private bek(Context context, NotificationManager notificationManager, String str, CharSequence charSequence, bej bejVar, bei beiVar, boolean z) {
        this.d = context;
        this.a = (NotificationManager) bdi.checkNotNull(notificationManager);
        this.b = str;
        this.e = charSequence;
        this.f = bejVar;
        this.c = beiVar;
        this.g = z;
    }

    public static bek a(Context context) {
        Context applicationContext = context.getApplicationContext();
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        String strA = bie.a(applicationContext);
        CharSequence charSequenceB = biw.d() ? bie.b(applicationContext) : "";
        if (strA == null || charSequenceB == null) {
            strA = "gmscore";
            charSequenceB = bie.c(applicationContext);
        }
        return new bek(applicationContext, notificationManager, strA, charSequenceB, bej.a, bei.a(applicationContext, strA), applicationContext.getApplicationInfo() != null && applicationContext.getApplicationInfo().targetSdkVersion >= 26);
    }

    public final void a(int i, Notification notification) {
        if (a()) {
            this.a.notify(i, notification);
        } else {
            a(null, i, notification);
        }
    }

    @TargetApi(5)
    public final void a(String str, int i, Notification notification) {
        if (a()) {
            this.a.notify(str, i, notification);
            return;
        }
        bdi.checkNotNull(notification);
        if (bej.a(this.b)) {
            this.a.notify(str, i, a(notification));
            this.c.a();
            return;
        }
        this.c.c();
    }

    public final void a(int i) {
        this.a.cancel(i);
        if (!a()) {
            this.c.b();
        }
    }

    @TargetApi(26)
    public final NotificationChannel a(String str) {
        if (biw.d()) {
            return this.a.getNotificationChannel(str);
        }
        return null;
    }

    static boolean a() {
        return !((fpe) fpd.a.a()).c();
    }

    final Notification a(Notification notification) {
        if (biw.d() && this.g && TextUtils.isEmpty(notification.getChannelId())) {
            if (notification.priority != 0) {
                Log.e("NotificationManager", "Notifications that use non-default priority should use NotificationChannels.");
            }
            if (!this.h.contains(this.b)) {
                this.a.createNotificationChannel(new NotificationChannel(this.b, this.e, 3));
                this.h.add(this.b);
            }
            return Notification.Builder.recoverBuilder(this.d, notification).setChannelId(this.b).build();
        }
        return notification;
    }
}
