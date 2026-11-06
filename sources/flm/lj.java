package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lj implements af {
    private final /* synthetic */ lg a;

    lj(lg lgVar) {
        this.a = lgVar;
    }

    @Override // flm.af
    public final x getLifecycle() {
        if (this.a.U == null) {
            this.a.U = new ag(this.a.V);
        }
        return this.a.U;
    }
}
