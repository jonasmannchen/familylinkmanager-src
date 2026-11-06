package flm;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimeraresources.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buc {
    private static final List a = Arrays.asList(new String[0]);

    public static Notification.Builder a(Context context, int i) {
        return a(context, i, "kids_setting_updates_channel");
    }

    public static Notification.Builder a(Context context, int i, String str) {
        dvl.a(!TextUtils.isEmpty(str), "A channel ID must be provided to create notification.");
        Notification.Builder builder = new Notification.Builder(context);
        if (biw.d()) {
            if (biw.d()) {
                bek bekVarA = bek.a(context);
                for (String str2 : a) {
                    if (bekVarA.a(str2) != null && biw.d()) {
                        bekVarA.a.deleteNotificationChannel(str2);
                    }
                }
                a(bekVarA, "kids_setting_updates_channel", context.getString(R.string.kid_supervision_setting_updates_channel_name), context.getString(R.string.kid_supervision_setting_updates_channel_description), 2, 1, null, false, false, null, null);
                a(bekVarA, "kids_alerts_channel", context.getString(R.string.kid_supervision_alerts_channel_name), context.getString(R.string.kid_supervision_alerts_channel_description), 4, 1, null, true, true, null, null);
            }
            builder.setChannelId(str);
        } else if ("kids_alerts_channel".equals(str)) {
            builder.setCategory("alarm");
            builder.setPriority(1);
            builder.setVibrate(new long[0]);
        }
        if (biw.a() && !((fqp) fqo.a.a()).a()) {
            builder.setSmallIcon(Icon.createWithBitmap(btm.a(context.getResources().getDrawable(i))));
        } else {
            builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
        }
        return builder;
    }

    @TargetApi(26)
    private static void a(bek bekVar, String str, String str2, String str3, int i, int i2, long[] jArr, boolean z, boolean z2, Uri uri, AudioAttributes audioAttributes) {
        dvl.a(!TextUtils.isEmpty(str));
        dvl.a(true);
        NotificationChannel notificationChannelA = bekVar.a(str);
        if (notificationChannelA != null) {
            CharSequence name = notificationChannelA.getName();
            if (name == null || !str2.equals(name.toString())) {
                notificationChannelA.setName(str2);
            }
            if (!str3.equals(notificationChannelA.getDescription())) {
                notificationChannelA.setDescription(str3);
                return;
            }
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setDescription(str3);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setVibrationPattern(null);
        notificationChannel.enableLights(z);
        if (z2) {
            notificationChannel.setSound(null, null);
        }
        if (biw.d()) {
            bekVar.a.createNotificationChannel(notificationChannel);
        }
    }
}
