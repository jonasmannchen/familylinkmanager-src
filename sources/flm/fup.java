package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class fup extends frn {
    fup() {
    }

    protected abstract frn b();

    @Override // flm.frn
    public void a(ftv ftvVar) {
        b().a(ftvVar);
    }

    @Override // flm.frn
    public void a(fvc fvcVar, ftv ftvVar) {
        b().a(fvcVar, ftvVar);
    }

    @Override // flm.frn
    public void a() {
        b().a();
    }

    public String toString() {
        return dve.a(this).a("delegate", b()).toString();
    }
}
