package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsb {
    public final fsa a;
    public final fvc b;

    public static fsb a(fsa fsaVar) {
        dvl.a(fsaVar != fsa.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new fsb(fsaVar, fvc.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fsb)) {
            return false;
        }
        fsb fsbVar = (fsb) obj;
        return this.a.equals(fsbVar.a) && this.b.equals(fsbVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.a()) {
            return this.a.toString();
        }
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(strValueOf2).length()).append(strValueOf).append("(").append(strValueOf2).append(")").toString();
    }

    public fsb(fsa fsaVar, fvc fvcVar) {
        this.a = (fsa) dvl.a(fsaVar, "state is null");
        this.b = (fvc) dvl.a(fvcVar, "status is null");
    }
}
