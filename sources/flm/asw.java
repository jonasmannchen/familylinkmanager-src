package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asw {
    public final String a;
    private final asx b;
    private final ath c;
    private final atf d;
    private final ati e;

    public asw(String str, asx asxVar, atf atfVar) {
        bdi.checkNotNull(asxVar, "Cannot construct an Api with a null ClientBuilder");
        bdi.checkNotNull(atfVar, "Cannot construct an Api with a null ClientKey");
        this.a = str;
        this.b = asxVar;
        this.c = null;
        this.d = atfVar;
        this.e = null;
    }

    public final atd a() {
        return this.b;
    }

    public final asx b() {
        bdi.checkState(this.b != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.b;
    }

    public final asz c() {
        if (this.d != null) {
            return this.d;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
