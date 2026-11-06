package flm;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cto {
    public final Account a;
    public final String b;
    public final long c;
    public long d = Long.MAX_VALUE;
    public long e = Long.MAX_VALUE;
    public String f;

    cto(Account account, String str, long j) {
        this.a = (Account) bdi.checkNotNull(account, "account");
        this.b = (String) bdi.checkNotNull(str, "reason");
        this.c = j;
    }
}
