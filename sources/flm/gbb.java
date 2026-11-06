package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gbb implements fyz {
    gbb() {
    }

    protected abstract fyz a();

    @Override // flm.ghe
    public final void c(int i) {
        a().c(i);
    }

    @Override // flm.ghe
    public final void a(InputStream inputStream) {
        a().a(inputStream);
    }

    @Override // flm.ghe
    public final void f() {
        a().f();
    }

    @Override // flm.ghe
    public final void a(fry fryVar) {
        a().a(fryVar);
    }

    @Override // flm.fyz
    public final void b(fvc fvcVar) {
        a().b(fvcVar);
    }

    @Override // flm.fyz
    public final void e() {
        a().e();
    }

    @Override // flm.fyz
    public final void a(String str) {
        a().a(str);
    }

    @Override // flm.fyz
    public final void a(boolean z) {
        a().a(z);
    }

    @Override // flm.fyz
    public final void a(fsp fspVar) {
        a().a(fspVar);
    }

    @Override // flm.fyz
    public void a(fza fzaVar) {
        a().a(fzaVar);
    }

    @Override // flm.fyz
    public final void b(int i) {
        a().b(i);
    }

    @Override // flm.fyz
    public final void a(int i) {
        a().a(i);
    }

    @Override // flm.fyz
    public final void a(fsl fslVar) {
        a().a(fslVar);
    }

    public String toString() {
        return dve.a(this).a("delegate", a()).toString();
    }
}
