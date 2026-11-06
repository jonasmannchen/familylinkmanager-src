package flm;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fwk extends fwt implements fyz, gem {
    public static final Logger p = Logger.getLogger(fwk.class.getName());
    private final gbf a;
    private boolean b;
    private ftv c;
    private volatile boolean d;
    public final ghk q;
    public boolean r;

    public fwk(ghn ghnVar, ghd ghdVar, ghk ghkVar, ftv ftvVar, frj frjVar, boolean z) {
        dvl.a(ftvVar, "headers");
        this.q = (ghk) dvl.a(ghkVar, "transportTracer");
        this.r = gbh.a(frjVar);
        this.b = z;
        if (z) {
            this.a = new fwl(this, ftvVar, ghdVar);
        } else {
            this.a = new gej(this, ghnVar, ghdVar);
            this.c = ftvVar;
        }
    }

    public abstract fwm a();

    @Override // flm.fwt
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract fwn c();

    @Override // flm.fyz
    public final void a(fsl fslVar) {
        this.c.b(gbh.b);
        this.c.a(gbh.b, Long.valueOf(Math.max(0L, fslVar.a(TimeUnit.NANOSECONDS))));
    }

    @Override // flm.fyz
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // flm.fyz
    public final void b(int i) {
        ((fwn) c()).q.b(i);
    }

    @Override // flm.fyz
    public final void a(boolean z) {
        ((fwn) c()).k = z;
    }

    @Override // flm.fyz
    public final void a(fsp fspVar) {
        fwn fwnVar = (fwn) c();
        dvl.b(fwnVar.j == null, "Already called start");
        fwnVar.l = (fsp) dvl.a(fspVar, "decompressorRegistry");
    }

    @Override // flm.fyz
    public final void a(fza fzaVar) {
        fwn fwnVar = (fwn) c();
        dvl.b(fwnVar.j == null, "Already called setListener");
        fwnVar.j = (fza) dvl.a(fzaVar, "listener");
        if (!this.b) {
            a().a(this.c, null);
            this.c = null;
        }
    }

    @Override // flm.fwt
    protected final gbf d() {
        return this.a;
    }

    @Override // flm.ghe
    public final void c(int i) {
        a().a(i);
    }

    @Override // flm.gem
    public final void a(ghm ghmVar, boolean z, boolean z2, int i) {
        dvl.a(ghmVar != null || z, "null frame before EOS");
        a().a(ghmVar, z, z2, i);
    }

    @Override // flm.fyz
    public final void e() {
        if (!((fwn) c()).m) {
            ((fwn) c()).m = true;
            d().c();
        }
    }

    @Override // flm.fyz
    public final void b(fvc fvcVar) {
        dvl.a(!fvcVar.a(), "Should not cancel with OK status");
        this.d = true;
        a().a(fvcVar);
    }
}
