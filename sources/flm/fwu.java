package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fwu implements fxf, gef {
    private int a;
    private boolean b;
    public fzm q;
    public final Object r = new Object();
    public final ghk s;
    public boolean t;

    protected fwu(int i, ghd ghdVar, ghk ghkVar) {
        dvl.a(ghdVar, "statsTraceCtx");
        this.s = (ghk) dvl.a(ghkVar, "transportTracer");
        this.q = new gee(this, frx.a, i, ghdVar, ghkVar);
    }

    protected abstract ghf b();

    @Override // flm.gef
    public final void a(ghg ghgVar) {
        b().a(ghgVar);
    }

    protected final void b(boolean z) {
        if (z) {
            this.q.close();
        } else {
            this.q.a();
        }
    }

    public final void b(int i) {
        try {
            this.q.c(i);
        } catch (Throwable th) {
            a(th);
        }
    }

    private final boolean c() {
        boolean z;
        synchronized (this.r) {
            z = this.b && this.a < 32768 && !this.t;
        }
        return z;
    }

    public void a() {
        dvl.b(b() != null);
        synchronized (this.r) {
            dvl.b(this.b ? false : true, "Already allocated");
            this.b = true;
        }
        d();
    }

    final void c(int i) {
        synchronized (this.r) {
            this.a += i;
        }
    }

    public final void d(int i) {
        boolean z;
        synchronized (this.r) {
            dvl.b(this.b, "onStreamAllocated was not called, but it seems the stream is active");
            boolean z2 = this.a < 32768;
            this.a -= i;
            z = !z2 && (this.a < 32768);
        }
        if (z) {
            d();
        }
    }

    private final void d() {
        boolean zC;
        synchronized (this.r) {
            zC = c();
        }
        if (zC) {
            b().a();
        }
    }
}
