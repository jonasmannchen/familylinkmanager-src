package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghy extends gib {
    private final /* synthetic */ int a;
    private final /* synthetic */ gjv b;
    private final /* synthetic */ gho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghy(gho ghoVar, int i, gjv gjvVar) {
        super(ghoVar, (byte) 0);
        this.c = ghoVar;
        this.a = i;
        this.b = gjvVar;
    }

    @Override // flm.gib
    public final void a() {
        this.c.b.a(this.a, this.b);
    }
}
