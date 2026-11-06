package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyr implements fza {
    public final frn a;
    public boolean b;
    public final /* synthetic */ fyo c;

    public fyr(fyo fyoVar, frn frnVar) {
        this.c = fyoVar;
        this.a = (frn) dvl.a(frnVar, "observer");
    }

    @Override // flm.fza
    public final void a(ftv ftvVar) {
        this.c.b.execute(new fys(this, ftvVar));
    }

    @Override // flm.ghf
    public final void a(ghg ghgVar) {
        this.c.b.execute(new fyt(this, ghgVar));
    }

    final void a(fvc fvcVar, ftv ftvVar) {
        this.b = true;
        this.c.f = true;
        try {
            fyo fyoVar = this.c;
            fyo.a(this.a, fvcVar, ftvVar);
        } finally {
            this.c.b();
            this.c.c.a(fvcVar.a());
        }
    }

    @Override // flm.fza
    public final void b(fvc fvcVar, ftv ftvVar) {
        a(fvcVar, dp.aK, ftvVar);
    }

    @Override // flm.fza
    public final void a(fvc fvcVar, int i, ftv ftvVar) {
        fsl fslVarC = this.c.c();
        if (fvcVar.m == fvd.CANCELLED && fslVarC != null && fslVarC.a()) {
            fvcVar = fvc.e;
            ftvVar = new ftv();
        }
        this.c.b.execute(new fyu(this, fvcVar, ftvVar));
    }

    @Override // flm.ghf
    public final void a() {
        this.c.b.execute(new fyv(this));
    }
}
