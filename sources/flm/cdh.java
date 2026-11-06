package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdh extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxj {
        fcm fcmVar = (fcm) fin.b(fcm.g, bwgVar.f);
        BaseApplicationContext baseApplicationContextA = ayt.a();
        btv.c("Policy", "Get supervision policy. is supervised is %s require lock is %s", Boolean.valueOf(fcmVar.b), Boolean.valueOf(fcmVar.c));
        if (!fcmVar.b) {
            btv.c("Policy", "Graduation. Revoke supervision.", new Object[0]);
            if (fcmVar.c) {
                btv.c("Policy", "Graduation. Lockdown the device.", new Object[0]);
                SupervisionDatabase.h().k().a(fcmVar.d, fcmVar.e, fcmVar.f);
                baseApplicationContextA.startService(TimeLimitCheckingIntentOperation.a("state"));
            } else {
                for (Account account : bhp.a((Context) baseApplicationContextA)) {
                    try {
                        alv.c(baseApplicationContextA, alv.b(baseApplicationContextA, account, "ac2dm", Bundle.EMPTY));
                        alv.b(baseApplicationContextA, account, "ac2dm", Bundle.EMPTY);
                    } catch (alt | IOException e) {
                        throw new bxj("Graduation: failed to invalidate auth token", e);
                    }
                }
                caw.b();
            }
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}
