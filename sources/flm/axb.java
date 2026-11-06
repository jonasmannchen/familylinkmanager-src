package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axb {
    public final aup a;
    public final aqb b;

    axb(aup aupVar, aqb aqbVar) {
        this.a = aupVar;
        this.b = aqbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof axb)) {
            return false;
        }
        axb axbVar = (axb) obj;
        return bcx.equal(this.a, axbVar.a) && bcx.equal(this.b, axbVar.b);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("key", this.a).add("feature", this.b).toString();
    }
}
