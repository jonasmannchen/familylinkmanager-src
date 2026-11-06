package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gci extends gbb {
    public final /* synthetic */ gch a;
    private final /* synthetic */ fyz b;

    gci(gch gchVar, fyz fyzVar) {
        this.a = gchVar;
        this.b = fyzVar;
    }

    @Override // flm.gbb
    protected final fyz a() {
        return this.b;
    }

    @Override // flm.gbb, flm.fyz
    public final void a(fza fzaVar) {
        this.a.a.a();
        super.a(new gcj(this, fzaVar));
    }
}
