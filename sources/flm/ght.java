package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ght extends gib {
    private final /* synthetic */ int a;
    private final /* synthetic */ long b;
    private final /* synthetic */ gho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ght(gho ghoVar, int i, long j) {
        super(ghoVar, (byte) 0);
        this.c = ghoVar;
        this.a = i;
        this.b = j;
    }

    @Override // flm.gib
    public final void a() {
        this.c.b.a(this.a, this.b);
    }
}
