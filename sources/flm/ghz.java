package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghz extends gib {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ int b;
    private final /* synthetic */ guc c;
    private final /* synthetic */ int d;
    private final /* synthetic */ gho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghz(gho ghoVar, boolean z, int i, guc gucVar, int i2) {
        super(ghoVar, (byte) 0);
        this.e = ghoVar;
        this.a = z;
        this.b = i;
        this.c = gucVar;
        this.d = i2;
    }

    @Override // flm.gib
    public final void a() {
        this.e.b.a(this.a, this.b, this.c, this.d);
    }
}
