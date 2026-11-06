package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gbd implements fzj {
    gbd() {
    }

    protected abstract fzj c();

    @Override // flm.gec
    public final Runnable a(ged gedVar) {
        return c().a(gedVar);
    }

    @Override // flm.gec
    public final void a(fvc fvcVar) {
        c().a(fvcVar);
    }

    @Override // flm.gec
    public final void b(fvc fvcVar) {
        c().b(fvcVar);
    }

    @Override // flm.fzb
    public fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        return c().a(fufVar, ftvVar, frjVar);
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        c().a(fzcVar, executor);
    }

    @Override // flm.ftk
    public final ftg b() {
        return c().b();
    }

    @Override // flm.fzj
    public final frd a() {
        return c().a();
    }

    public String toString() {
        return dve.a(this).a("delegate", c()).toString();
    }
}
