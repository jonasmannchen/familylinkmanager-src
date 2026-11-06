package flm;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctw implements cte {
    @Override // flm.cte
    public final att a(atp atpVar, Account account) {
        return atpVar.a(new ctx(atpVar, account));
    }

    @Override // flm.cte
    public final att a(atp atpVar, ctn ctnVar) {
        return atpVar.b(new cty(atpVar, ctnVar));
    }

    @Override // flm.cte
    public final att a(atp atpVar, long j) {
        return atpVar.b(new ctz(atpVar, j));
    }
}
