package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gbc implements fza {
    gbc() {
    }

    protected abstract fza b();

    @Override // flm.fza
    public final void a(ftv ftvVar) {
        b().a(ftvVar);
    }

    @Override // flm.fza
    public void b(fvc fvcVar, ftv ftvVar) {
        b().b(fvcVar, ftvVar);
    }

    @Override // flm.fza
    public void a(fvc fvcVar, int i, ftv ftvVar) {
        b().a(fvcVar, i, ftvVar);
    }

    @Override // flm.ghf
    public final void a(ghg ghgVar) {
        b().a(ghgVar);
    }

    @Override // flm.ghf
    public final void a() {
        b().a();
    }

    public String toString() {
        return dve.a(this).a("delegate", b()).toString();
    }
}
