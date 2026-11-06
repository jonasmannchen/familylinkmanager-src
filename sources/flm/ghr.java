package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghr extends gib {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ gho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghr(gho ghoVar, boolean z, int i, int i2) {
        super(ghoVar, (byte) 0);
        this.d = ghoVar;
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // flm.gib
    public final void a() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
