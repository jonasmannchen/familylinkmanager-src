package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmj extends gms {
    private gmt a;
    private Long b;
    private Long c;
    private Long d;

    gmj() {
    }

    @Override // flm.gms
    final gms a(gmt gmtVar) {
        if (gmtVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = gmtVar;
        return this;
    }

    @Override // flm.gms
    final gms a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // flm.gms
    public final gms b(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // flm.gms
    public final gms c(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    @Override // flm.gms
    public final gmr a() {
        String strConcat = "";
        if (this.a == null) {
            strConcat = String.valueOf("").concat(" type");
        }
        if (this.b == null) {
            strConcat = String.valueOf(strConcat).concat(" messageId");
        }
        if (this.c == null) {
            strConcat = String.valueOf(strConcat).concat(" uncompressedMessageSize");
        }
        if (this.d == null) {
            strConcat = String.valueOf(strConcat).concat(" compressedMessageSize");
        }
        if (!strConcat.isEmpty()) {
            String strValueOf = String.valueOf(strConcat);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Missing required properties:".concat(strValueOf) : new String("Missing required properties:"));
        }
        return new gmi(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
    }
}
