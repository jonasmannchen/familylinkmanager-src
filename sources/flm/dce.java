package flm;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dce implements atb {
    private final Account a;

    public dce(dcf dcfVar) {
        this(dcfVar.a);
    }

    private dce(Account account) {
        bdi.checkNotNull(account, "Must provide a valid account!");
        this.a = account;
    }

    @Override // flm.atb
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof dce) && this.a.equals(((dce) obj).a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
