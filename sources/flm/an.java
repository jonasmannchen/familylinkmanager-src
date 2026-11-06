package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class an extends ao implements w {
    private final af d;
    private final /* synthetic */ ak e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ak akVar, af afVar, at atVar) {
        super(akVar, atVar);
        this.e = akVar;
        this.d = afVar;
    }

    @Override // flm.ao
    final boolean a() {
        return this.d.getLifecycle().a().a(z.STARTED);
    }

    @Override // flm.w
    public final void a(af afVar, y yVar) {
        if (this.d.getLifecycle().a() == z.DESTROYED) {
            this.e.a(this.a);
        } else {
            a(a());
        }
    }

    @Override // flm.ao
    final boolean a(af afVar) {
        return this.d == afVar;
    }

    @Override // flm.ao
    final void b() {
        this.d.getLifecycle().b(this);
    }
}
