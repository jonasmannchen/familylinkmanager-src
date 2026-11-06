package flm;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cuo implements cuf {
    @Override // flm.cuf
    public final att a(atp atpVar, Account account) {
        return atpVar.a(new cup(atpVar, account));
    }

    @Override // flm.cuf
    public final att a(atp atpVar, Account account, cui cuiVar) {
        return atpVar.b(new cuq(atpVar, account, cuiVar));
    }
}
