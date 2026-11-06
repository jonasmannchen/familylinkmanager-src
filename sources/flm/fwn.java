package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fwn extends fwu {
    private boolean a;
    private boolean b;
    private Runnable c;
    public final ghd i;
    public fza j;
    public boolean k;
    public fsp l;
    public volatile boolean m;
    public boolean n;
    public ftv o;
    public fvc p;

    protected fwn(int i, ghd ghdVar, ghk ghkVar) {
        super(i, ghdVar, ghkVar);
        this.l = fsp.a;
        this.b = false;
        this.i = (ghd) dvl.a(ghdVar, "statsTraceCtx");
    }

    @Override // flm.gef
    public void a(boolean z) {
        this.b = true;
        if (this.p != null) {
            if (this.p.a() && z) {
                this.p = fvc.i.a("Encountered end-of-stream mid-frame");
                this.o = new ftv();
            }
            b(this.p, false, this.o);
        } else {
            dvl.b(this.n, "status should have been reported on deframer closed");
        }
        if (this.c != null) {
            this.c.run();
            this.c = null;
        }
    }

    public final void b(fvc fvcVar, boolean z, ftv ftvVar) {
        a(fvcVar, dp.aK, z, ftvVar);
    }

    public final void a(fvc fvcVar, int i, boolean z, ftv ftvVar) {
        dvl.a(fvcVar, "status");
        dvl.a(ftvVar, "trailers");
        if (!this.n || z) {
            this.n = true;
            synchronized (this.r) {
                this.t = true;
            }
            if (this.b) {
                this.c = null;
                a(fvcVar, i, ftvVar);
            } else {
                this.c = new fwo(this, fvcVar, i, ftvVar);
                b(z);
            }
        }
    }

    final void a(fvc fvcVar, int i, ftv ftvVar) {
        if (!this.a) {
            this.a = true;
            ghd ghdVar = this.i;
            if (ghdVar.b.compareAndSet(false, true)) {
                for (fvi fviVar : ghdVar.a) {
                    fviVar.a();
                }
            }
            this.j.a(fvcVar, i, ftvVar);
            if (this.s != null) {
                ghk ghkVar = this.s;
                if (fvcVar.a()) {
                    ghkVar.d++;
                } else {
                    ghkVar.e++;
                }
            }
        }
    }

    @Override // flm.fwu
    protected final /* synthetic */ ghf b() {
        return this.j;
    }
}
