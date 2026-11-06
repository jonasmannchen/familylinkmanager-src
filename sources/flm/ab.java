package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends lg {
    @Override // flm.lg
    public final void a_() {
        super.a_();
        a(y.ON_PAUSE);
    }

    @Override // flm.lg
    public final void i_() {
        super.i_();
        a(y.ON_STOP);
    }

    @Override // flm.lg
    public final void c() {
        super.c();
        a(y.ON_DESTROY);
    }

    private final void a(y yVar) {
        aa.a(this.y, yVar);
    }
}
