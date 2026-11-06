package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmh extends gmq {
    private Boolean a;
    private gnd b;

    gmh() {
    }

    @Override // flm.gmq
    public final gmq a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    @Override // flm.gmq
    public final gmq a(gnd gndVar) {
        this.b = gndVar;
        return this;
    }

    @Override // flm.gmq
    public final gmp a() {
        String strConcat = "";
        if (this.a == null) {
            strConcat = String.valueOf("").concat(" sampleToLocalSpanStore");
        }
        if (!strConcat.isEmpty()) {
            String strValueOf = String.valueOf(strConcat);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Missing required properties:".concat(strValueOf) : new String("Missing required properties:"));
        }
        return new gmg(this.a.booleanValue(), this.b);
    }
}
