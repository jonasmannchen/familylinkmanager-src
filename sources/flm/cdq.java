package flm;

import android.app.Notification;
import android.content.Context;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdq extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxi {
        if (bwgVar.a == fdc.TYPE_SHOW_NOTIFICATION) {
            if (cdbVar.e) {
                btv.d("Policy", "Don't need to show notifications when NO_UI", new Object[0]);
            } else {
                fck fckVarB = b(bwgVar);
                if (fckVarB.b.isEmpty() && fckVarB.c.isEmpty()) {
                    btv.d("Policy", "Notification is empty. Subkey: %s", bwgVar.b);
                } else {
                    String str = bwgVar.b;
                    String str2 = fckVarB.b;
                    String str3 = fckVarB.c;
                    BaseApplicationContext baseApplicationContextA = ayt.a();
                    Notification.Builder style = buc.a(baseApplicationContextA, R.drawable.ic_familylink_notification_white_24).setContentTitle(str2).setContentText(str3).setGroup("com.google.android.gms.kids.POLICY_UPDATES").setStyle(new Notification.BigTextStyle().bigText(str3));
                    bto.a(baseApplicationContextA, style);
                    bel.a((Context) baseApplicationContextA).a(str, R.id.kids_show_notification_policy_notification_id, style.build());
                }
            }
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }

    private static fck b(bwg bwgVar) throws bxi {
        try {
            return (fck) fin.b(fck.d, bwgVar.f);
        } catch (fjg e) {
            throw new bxi("Failure parsing policy", e);
        }
    }
}
