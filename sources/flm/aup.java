package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aup {
    public final asw a;
    private final boolean b;
    private final int c;
    private final ata d;

    private aup(asw aswVar, ata ataVar) {
        this.b = false;
        this.a = aswVar;
        this.d = ataVar;
        this.c = bcx.hashCode(this.a, this.d);
    }

    public aup(asw aswVar) {
        this.b = true;
        this.a = aswVar;
        this.d = null;
        this.c = System.identityHashCode(this);
    }

    public static aup a(asw aswVar, ata ataVar) {
        return new aup(aswVar, ataVar);
    }

    public final String a() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aup)) {
            return false;
        }
        aup aupVar = (aup) obj;
        return !this.b && !aupVar.b && bcx.equal(this.a, aupVar.a) && bcx.equal(this.d, aupVar.d);
    }
}
