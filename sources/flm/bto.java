package flm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bto {
    public static void a(final Context context, Notification.Builder builder) {
        builder.setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, 1, (Intent) dvi.c(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.kids.familylinkhelper")).a(btq.a).a(new dvz(context) { // from class: flm.btp
            private final Context a;

            {
                this.a = context;
            }

            @Override // flm.dvz
            public final Object a() {
                Context context2 = this.a;
                Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.kids.familylink");
                if (launchIntentForPackage == null) {
                    return new Intent("android.intent.action.VIEW").setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter(bbz.MARKET_URI_PARAM_ID, "com.google.android.apps.kids.familylink").appendQueryParameter("url", bto.a(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage("com.google.android.apps.kids.familylink")).toUri(0)).appendQueryParameter("referrer", context2.getPackageName()).build()).putExtra("overlay", true).putExtra("callerId", context2.getPackageName());
                }
                bto.a(launchIntentForPackage);
                return launchIntentForPackage;
            }
        }), 134217728));
    }

    static Intent a(Intent intent) {
        try {
            return intent.putExtra("account_id", 1).putExtra("extra_dashboard_user_id", bts.a(bts.b())).putExtra("home_fragment_type_extra", "dashboard_fragment");
        } catch (alt | IOException e) {
            btv.c("Policy", e, "Failed to get kid account id", new Object[0]);
            return intent;
        }
    }
}
