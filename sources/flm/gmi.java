package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmi extends gmr {
    private final gmt a;
    private final long b;
    private final long c;
    private final long d;

    gmi(gmt gmtVar, long j, long j2, long j3) {
        this.a = gmtVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // flm.gmr
    public final gmt a() {
        return this.a;
    }

    @Override // flm.gmr
    public final long b() {
        return this.b;
    }

    @Override // flm.gmr
    public final long c() {
        return this.c;
    }

    @Override // flm.gmr
    public final long d() {
        return this.d;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        return new StringBuilder(String.valueOf(strValueOf).length() + 141).append("MessageEvent{type=").append(strValueOf).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.d).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gmr)) {
            return false;
        }
        gmr gmrVar = (gmr) obj;
        return this.a.equals(gmrVar.a()) && this.b == gmrVar.b() && this.c == gmrVar.c() && this.d == gmrVar.d();
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((this.b >>> 32) ^ this.b))) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c))) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d));
    }
}
