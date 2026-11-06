package flm;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbj implements cat {
    @Override // flm.cat
    public final void a(Bundle bundle) throws bxj {
        if (SupervisionDatabase.h().k().d("key_in_gl_sign_out") == 3) {
            return;
        }
        Account accountC = bts.c();
        if (accountC != null) {
            try {
                bts.a(accountC);
                accountC = bts.c();
            } catch (alt | IOException e) {
                btv.c("Job", e, "Failed to refresh tokens", new Object[0]);
                throw new bxj("Failure while refreshing tokens.");
            }
        }
        if (accountC == null) {
            caw.c(euz.SUPERVISION_STATE_CHANGED);
        }
    }
}
