package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghs extends gib {
    private final /* synthetic */ int a;
    private final /* synthetic */ gjv b;
    private final /* synthetic */ byte[] c;
    private final /* synthetic */ gho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghs(gho ghoVar, int i, gjv gjvVar, byte[] bArr) {
        super(ghoVar, (byte) 0);
        this.d = ghoVar;
        this.a = i;
        this.b = gjvVar;
        this.c = bArr;
    }

    @Override // flm.gib
    public final void a() {
        this.d.b.a(this.a, this.b, this.c);
        this.d.b.b();
    }
}
