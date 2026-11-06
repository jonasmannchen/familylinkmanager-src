package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcj extends gbc {
    private final /* synthetic */ fza a;
    private final /* synthetic */ gci b;

    gcj(gci gciVar, fza fzaVar) {
        this.b = gciVar;
        this.a = fzaVar;
    }

    @Override // flm.gbc
    protected final fza b() {
        return this.a;
    }

    @Override // flm.gbc, flm.fza
    public final void b(fvc fvcVar, ftv ftvVar) {
        this.b.a.a.a(fvcVar.a());
        super.b(fvcVar, ftvVar);
    }

    @Override // flm.gbc, flm.fza
    public final void a(fvc fvcVar, int i, ftv ftvVar) {
        this.b.a.a.a(fvcVar.a());
        super.a(fvcVar, i, ftvVar);
    }
}
