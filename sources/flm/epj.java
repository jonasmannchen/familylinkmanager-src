package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epj extends epn {
    private final boolean a;
    private final boolean b;
    private final long c;

    epj(boolean z, boolean z2, long j) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    @Override // flm.epn
    public final boolean a() {
        return this.a;
    }

    @Override // flm.epn
    public final boolean b() {
        return this.b;
    }

    @Override // flm.epn
    public final long c() {
        return this.c;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return new StringBuilder(115).append("OtpVerificationResult{isOtpValid=").append(z).append(", hasInferredGenerationTime=").append(z2).append(", generationTimeMillis=").append(this.c).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epn)) {
            return false;
        }
        epn epnVar = (epn) obj;
        return this.a == epnVar.a() && this.b == epnVar.b() && this.c == epnVar.c();
    }

    public final int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c));
    }
}
