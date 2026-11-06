package flm;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfo {
    public final Account a;
    public final String b;
    public final String c;
    public final Bundle d = new Bundle();
    public String e;

    public bfo(baw bawVar) {
        this.b = bawVar.getAuthPackageName();
        this.d.putString(alu.a, this.b);
        if (!bawVar.isProxyingAuthentication()) {
            this.d.putInt("callerUid", bawVar.getCallingUid());
        }
        if (bawVar.getVisibleActions() != null) {
            this.d.putString("request_visible_actions", TextUtils.join(" ", bawVar.getVisibleActions()));
        }
        this.a = bawVar.getResolvedAccount();
        this.c = bawVar.getScopesString();
    }
}
