package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class gmk extends gmu {
    private final gkt a;
    private final gmw b;
    private final long c;
    private final long d;
    private final long e;

    gmk(gkt gktVar, gmw gmwVar, long j, long j2, long j3) {
        this.a = gktVar;
        this.b = gmwVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    @Override // flm.gmu
    public final gkt a() {
        return this.a;
    }

    @Override // flm.gmu
    public final gmw b() {
        return this.b;
    }

    @Override // flm.gmu
    public final long c() {
        return this.c;
    }

    @Override // flm.gmu
    public final long d() {
        return this.d;
    }

    @Override // flm.gmu
    public final long e() {
        return this.e;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        long j = this.c;
        long j2 = this.d;
        return new StringBuilder(String.valueOf(strValueOf).length() + 159 + String.valueOf(strValueOf2).length()).append("NetworkEvent{kernelTimestamp=").append(strValueOf).append(", type=").append(strValueOf2).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.e).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gmu)) {
            return false;
        }
        gmu gmuVar = (gmu) obj;
        if (this.a != null ? this.a.equals(gmuVar.a()) : gmuVar.a() == null) {
            if (this.b.equals(gmuVar.b()) && this.c == gmuVar.c() && this.d == gmuVar.d() && this.e == gmuVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c))) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d))) * 1000003) ^ ((int) ((this.e >>> 32) ^ this.e));
    }
}
