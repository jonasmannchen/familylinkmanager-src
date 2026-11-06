package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class fuo extends frm {
    fuo() {
    }

    protected abstract frm b();

    @Override // flm.frm
    public void a(int i) {
        b().a(i);
    }

    @Override // flm.frm
    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    @Override // flm.frm
    public void a() {
        b().a();
    }

    public String toString() {
        return dve.a(this).a("delegate", b()).toString();
    }
}
