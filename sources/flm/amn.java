package flm;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amn implements ata {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final Account f;

    public static amn a(String str, Account account) {
        bdi.checkNotEmpty(str);
        return new amn(str, 1, null, null, -1, null);
    }

    private amn(String str, int i, String str2, String str3, int i2, Account account) {
        bdi.checkNotNull(str, "moduleId must not be null");
        this.a = str;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        amn amnVar = (amn) obj;
        return this.b == amnVar.b && this.e == amnVar.e && bcx.equal(this.a, amnVar.a) && bcx.equal(this.c, amnVar.c) && bcx.equal(this.d, amnVar.d) && bcx.equal(this.f, amnVar.f);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), this.f);
    }
}
