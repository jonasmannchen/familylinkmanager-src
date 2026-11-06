package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dlf implements dlc, dld {
    private volatile int c;
    private boolean b = false;
    public volatile dpu a = null;

    dlf(int i) {
        this.c = i;
    }

    @Override // flm.dlc
    public final void a() {
        d();
    }

    @Override // flm.dld
    public final void b() {
        e();
    }

    private final synchronized void d() {
        this.b = dpy.a(dlo.a, "More Insights", this.c, 100);
    }

    private final void e() {
        if (this.b) {
            this.a = dpy.a(dlo.a, "More Insights");
        }
    }

    final synchronized void c() {
        synchronized (this) {
            e();
        }
    }
}
