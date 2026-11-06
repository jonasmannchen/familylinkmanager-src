package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnz {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    fnz(boolean z) {
        this.a = z;
    }

    public fnz(fny fnyVar) {
        this.a = fnyVar.b;
        this.b = fnyVar.d;
        this.c = fnyVar.e;
        this.d = fnyVar.c;
    }

    public final fnz a(fnx... fnxVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[fnxVarArr.length];
        for (int i = 0; i < fnxVarArr.length; i++) {
            strArr[i] = fnxVarArr[i].s;
        }
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
        return this;
    }

    public final fnz a(foi... foiVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[foiVarArr.length];
        for (int i = 0; i < foiVarArr.length; i++) {
            strArr[i] = foiVarArr[i].d;
        }
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
        return this;
    }

    public final fnz a(boolean z) {
        if (!this.a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        this.d = true;
        return this;
    }

    public final fny a() {
        return new fny(this);
    }
}
