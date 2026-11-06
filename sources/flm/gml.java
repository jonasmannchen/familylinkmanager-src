package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gml extends gmv {
    private gmw a;
    private Long b;
    private Long c;
    private Long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.gmv
    public final gmv a(gmw gmwVar) {
        if (gmwVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = gmwVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.gmv
    public final gmv a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // flm.gmv
    public final gmv b(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // flm.gmv
    public final gmv c(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    @Override // flm.gmv
    public final gmu a() {
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
        return new gmk(null, this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
    }
}
