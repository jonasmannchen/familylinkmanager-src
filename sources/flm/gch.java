package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gch extends gbd {
    public final fxs a;
    private final fzj b;

    gch(fzj fzjVar, fxs fxsVar) {
        this.b = fzjVar;
        this.a = fxsVar;
    }

    @Override // flm.gbd
    protected final fzj c() {
        return this.b;
    }

    @Override // flm.gbd, flm.fzb
    public final fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        return new gci(this, super.a(fufVar, ftvVar, frjVar));
    }
}
