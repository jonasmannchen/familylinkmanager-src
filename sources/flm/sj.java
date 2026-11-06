package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sj {
    public final Object a;
    public final Object b;

    public sj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) obj;
        return si.a(sjVar.a, this.a) && si.a(sjVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a == null ? 0 : this.a.hashCode()) ^ (this.b != null ? this.b.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
