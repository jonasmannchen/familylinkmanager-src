package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjg {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public gjg(boolean z) {
        this.a = z;
    }

    public gjg(gjf gjfVar) {
        this.a = gjfVar.b;
        this.b = gjfVar.c;
        this.c = gjfVar.d;
        this.d = gjfVar.e;
    }

    public final gjg a(gje... gjeVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[gjeVarArr.length];
        for (int i = 0; i < gjeVarArr.length; i++) {
            strArr[i] = gjeVarArr[i].t;
        }
        this.b = strArr;
        return this;
    }

    public final gjg a(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr == null) {
            this.b = null;
        } else {
            this.b = (String[]) strArr.clone();
        }
        return this;
    }

    public final gjg a(gjt... gjtVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (gjtVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[gjtVarArr.length];
        for (int i = 0; i < gjtVarArr.length; i++) {
            strArr[i] = gjtVarArr[i].d;
        }
        this.c = strArr;
        return this;
    }

    public final gjg b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr == null) {
            this.c = null;
        } else {
            this.c = (String[]) strArr.clone();
        }
        return this;
    }

    public final gjg a(boolean z) {
        if (!this.a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        this.d = true;
        return this;
    }

    public final gjf a() {
        return new gjf(this);
    }
}
