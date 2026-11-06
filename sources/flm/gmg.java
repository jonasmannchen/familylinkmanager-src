package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmg extends gmp {
    private final boolean a;
    private final gnd b;

    gmg(boolean z, gnd gndVar) {
        this.a = z;
        this.b = gndVar;
    }

    @Override // flm.gmp
    public final boolean a() {
        return this.a;
    }

    @Override // flm.gmp
    public final gnd b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String strValueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 53).append("EndSpanOptions{sampleToLocalSpanStore=").append(z).append(", status=").append(strValueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gmp)) {
            return false;
        }
        gmp gmpVar = (gmp) obj;
        if (this.a == gmpVar.a()) {
            if (this.b == null) {
                if (gmpVar.b() == null) {
                    return true;
                }
            } else if (this.b.equals(gmpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) ^ (1000003 * ((this.a ? 1231 : 1237) ^ 1000003));
    }
}
