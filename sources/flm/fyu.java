package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyu extends fzl {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ ftv b;
    private final /* synthetic */ fyr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyu(fyr fyrVar, fvc fvcVar, ftv ftvVar) {
        super(fyrVar.c.d);
        this.c = fyrVar;
        this.a = fvcVar;
        this.b = ftvVar;
    }

    @Override // flm.fzl
    public final void a() {
        if (!this.c.b) {
            this.c.a(this.a, this.b);
        }
    }
}
