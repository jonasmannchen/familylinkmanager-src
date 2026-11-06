package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxs {
    private final ghh a;
    private final gcy b = gcz.a();
    private final gcy c = gcz.a();
    private final gcy d = gcz.a();
    private volatile long e;

    fxs(ghh ghhVar) {
        this.a = ghhVar;
    }

    public final void a() {
        this.b.a(1L);
        this.e = this.a.a();
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a(1L);
        } else {
            this.d.a(1L);
        }
    }

    static {
        new fxt();
    }
}
