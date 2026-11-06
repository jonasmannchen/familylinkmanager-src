package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ad extends lv {
    ad() {
    }

    @Override // flm.lv
    public final void a(lg lgVar) {
        aa.a(lgVar, y.ON_CREATE);
        if ((lgVar instanceof ai) && lgVar.l().a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            lgVar.l().a().a(new ab(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").a();
        }
    }

    @Override // flm.lv
    public final void b(lg lgVar) {
        aa.a(lgVar, y.ON_START);
    }

    @Override // flm.lv
    public final void c(lg lgVar) {
        aa.a(lgVar, y.ON_RESUME);
    }
}
