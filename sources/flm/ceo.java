package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ceo extends cex {
    private final boolean a;
    private final boolean b;

    ceo(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // flm.cex
    public final boolean a() {
        return this.a;
    }

    @Override // flm.cex
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        return new StringBuilder(90).append("ExperimentFlags{secondaryAccountSignInEnabled=").append(z).append(", nativeAccountManagementEnabled=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cex)) {
            return false;
        }
        cex cexVar = (cex) obj;
        return this.a == cexVar.a() && this.b == cexVar.b();
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
