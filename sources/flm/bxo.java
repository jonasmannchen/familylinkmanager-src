package flm;

import android.content.Context;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxo {
    public static void a(String str) {
        if (((Boolean) buw.i.b()).booleanValue()) {
            BaseApplicationContext baseApplicationContextA = ayt.a();
            bel.a((Context) baseApplicationContextA).a("com.google.android.gms.kids.features.location.LocationDebugNotifications", 395493039, buc.a(baseApplicationContextA, R.drawable.ic_familylink_notification_white_24).setContentTitle("Location refresh in progress").setOngoing(false).setPriority(2).setCategory("service").setVisibility(1).setContentText(str).build());
        }
    }
}
