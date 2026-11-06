package flm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bue {
    public static void a(Context context, long j) {
        new Object[1][0] = Long.valueOf(j / 1000);
        btt.t();
        bel.a(context).a("com.google.android.gms.kids.OnboardedDisclaimerNotification", 1381097386, buc.a(context, R.drawable.ic_familylink_notification_white_24).setContentTitle(context.getString(R.string.kids_onboarded_disclaimer_title)).setContentText(context.getString(R.string.kids_onboarded_disclaimer_text)).setAutoCancel(false).setOngoing(true).setPriority(2).setCategory("service").setVisibility(1).addAction(new Notification.Action.Builder(0, context.getString(R.string.kids_onboarded_disclaimer_action), PendingIntent.getActivity(context, 0, new Intent().setClassName("com.google.android.gms", "com.google.android.gms.kids.KidSetupActivity").putExtra("flow_type", cic.a(cia.GELLER_EXIT_FLOW)).addFlags(268435456), 0)).build()).build());
        caw.a(j);
    }

    public static void a(Context context) {
        bel.a(context).a("com.google.android.gms.kids.OnboardedDisclaimerNotification", 1381097386);
    }
}
