package flm;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gda extends ftt implements ftf {
    public final fzn A;
    public volatile boolean D;
    public volatile boolean E;
    public final fxu G;
    public final fxs H;
    public final fym I;
    public final fsz J;
    public Boolean K;
    public Map L;
    public ggh N;
    public final long O;
    public final long P;
    public final boolean Q;
    public ScheduledFuture S;
    public gdu T;
    public fxo U;
    private final String Y;
    private final fuj Z;
    private final frd aa;
    private final ftn ab;
    private final long ac;
    private final frl ad;
    private final gff af;
    public final fzd e;
    public final Executor f;
    public final gep g;
    public final gdk h;
    public final ghh i;
    public final int j;
    public boolean l;
    public final fsp m;
    public final frz n;
    public final dvz o;
    public final ggp q;
    public final fxp r;
    public final String s;
    public fui t;
    public boolean u;
    public gdn v;
    public volatile fts w;
    public boolean x;
    public static final Logger a = Logger.getLogger(gda.class.getName());
    private static final Pattern W = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    private static final fvc X = fvc.j.a("Channel shutdownNow invoked");
    public static final fvc b = fvc.j.a("Channel shutdown invoked");
    public static final fvc c = fvc.j.a("Subchannel shutdown invoked");
    public final ftg d = ftg.a(getClass().getName());
    public final fyl k = new gdv(this);
    public final fzk p = new fzk();
    public final Set y = new HashSet(16, 0.75f);
    public final Set z = new HashSet(1, 0.75f);
    public final gdz B = new gdz(this);
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final CountDownLatch F = new CountDownLatch(1);
    public final gfz M = new gfz();
    private final ged ae = new gdj(this);
    public final gca R = new gdl(this);
    public final fyw V = new gdg(this);

    @Override // flm.ftk
    public final ftg b() {
        return this.d;
    }

    final void a(boolean z) {
        if (z) {
            dvl.b(this.t != null, "nameResolver is null");
            dvl.b(this.v != null, "lbHelper is null");
        }
        if (this.t != null) {
            h();
            this.t.b();
            this.t = null;
            this.u = false;
        }
        if (this.v != null) {
            this.v.a.a();
            this.v = null;
        }
        this.w = null;
    }

    final void e() {
        if (!this.C.get() && !this.x) {
            if (this.R.a()) {
                b(false);
            } else {
                g();
            }
            if (this.v == null) {
                a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "exitIdleMode", "[{0}] Exiting idle mode", this.d);
                this.v = new gdn(this, this.t);
                this.v.a = this.ab.a(this.v);
                gdr gdrVar = new gdr(this, this.v);
                try {
                    this.t.a(gdrVar);
                    this.u = true;
                } catch (Throwable th) {
                    gdrVar.a(fvc.a(th));
                }
            }
        }
    }

    final void f() {
        a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "enterIdleMode", "[{0}] Entering idle mode", this.d);
        a(true);
        this.A.a((fts) null);
        this.t = a(this.Y, this.Z, this.aa);
        if (this.I != null) {
            fym fymVar = this.I;
            ftb ftbVar = new ftb();
            ftbVar.a = "Entering IDLE state";
            ftbVar.b = ftc.CT_INFO;
            fymVar.a(ftbVar.a(this.i.a()).a());
        }
        this.p.a(fsa.IDLE);
        if (this.R.a()) {
            e();
        }
    }

    final void b(boolean z) {
        gff gffVar = this.af;
        gffVar.e = false;
        if (z && gffVar.f != null) {
            gffVar.f.cancel(false);
            gffVar.f = null;
        }
    }

    final void g() {
        if (this.ac != -1) {
            gff gffVar = this.af;
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.ac);
            long jA = gffVar.a() + nanos;
            gffVar.e = true;
            if (jA - gffVar.d < 0 || gffVar.f == null) {
                if (gffVar.f != null) {
                    gffVar.f.cancel(false);
                }
                gffVar.f = gffVar.a.schedule(new gfh(gffVar), nanos, TimeUnit.NANOSECONDS);
            }
            gffVar.d = jA;
        }
    }

    final void h() {
        if (this.S != null) {
            this.S.cancel(false);
            this.T.a = true;
            this.S = null;
            this.T = null;
            this.U = null;
        }
    }

    gda(fwp fwpVar, fzd fzdVar, fxp fxpVar, gep gepVar, dvz dvzVar, List list, ghh ghhVar) {
        this.Y = (String) dvl.a(fwpVar.h, "target");
        this.Z = fwpVar.g;
        this.aa = (frd) dvl.a(fwpVar.d(), "nameResolverParams");
        this.t = a(this.Y, this.Z, this.aa);
        this.i = (ghh) dvl.a(ghhVar, "timeProvider");
        this.j = fwpVar.v;
        if (this.j > 0) {
            this.I = new fym(fwpVar.v, ghhVar.a(), "Channel");
        } else {
            this.I = null;
        }
        ftn ftnVar = fwpVar.j;
        this.ab = new fxj(this.I, ghhVar);
        this.g = (gep) dvl.a(fwpVar.f, "executorPool");
        dvl.a(gepVar, "balancerRpcExecutorPool");
        this.h = new gdk(gepVar);
        this.f = (Executor) dvl.a((Executor) this.g.a(), "executor");
        this.A = new fzn(this.f, this.k);
        this.A.a(this.ae);
        this.r = fxpVar;
        this.e = new fxq(fzdVar, this.f);
        boolean z = fwpVar.s;
        this.Q = false;
        this.q = new ggp(this.Q, fwpVar.o, fwpVar.p);
        frl frlVarA = frp.a(new gdw(this, this.t.a()), this.q);
        frg frgVar = fwpVar.y;
        this.ad = frp.a(frlVarA, list);
        this.o = (dvz) dvl.a(dvzVar, "stopwatchSupplier");
        if (fwpVar.n == -1) {
            this.ac = fwpVar.n;
        } else {
            dvl.a(fwpVar.n >= fwp.e, "invalid idleTimeoutMillis %s", fwpVar.n);
            this.ac = fwpVar.n;
        }
        this.af = new gff(new gdm(this), new gdb(this), this.e.a(), (dvw) dvzVar.a());
        this.l = fwpVar.k;
        this.m = (fsp) dvl.a(fwpVar.l, "decompressorRegistry");
        this.n = (frz) dvl.a(fwpVar.m, "compressorRegistry");
        this.s = fwpVar.i;
        this.P = fwpVar.q;
        this.O = fwpVar.r;
        this.G = new gdc(ghhVar);
        this.H = this.G.a();
        this.J = (fsz) dvl.a(fwpVar.u);
        fsz.a(this.J.c, this);
        a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "<init>", "[{0}] Created with target {1}", new Object[]{this.d, this.Y});
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static flm.fui a(java.lang.String r7, flm.fuj r8, flm.frd r9) {
        /*
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L14
            r0.<init>(r7)     // Catch: java.net.URISyntaxException -> L14
        Lb:
            if (r0 == 0) goto L1e
            flm.fui r0 = r8.a(r0, r9)
            if (r0 == 0) goto L1e
        L13:
            return r0
        L14:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            r0 = r1
            goto Lb
        L1e:
            java.util.regex.Pattern r0 = flm.gda.W
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L4c
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L94
            java.lang.String r3 = r8.a()     // Catch: java.net.URISyntaxException -> L94
            java.lang.String r4 = ""
            java.lang.String r5 = "/"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: java.net.URISyntaxException -> L94
            int r6 = r0.length()     // Catch: java.net.URISyntaxException -> L94
            if (r6 == 0) goto L8e
            java.lang.String r0 = r5.concat(r0)     // Catch: java.net.URISyntaxException -> L94
        L42:
            r5 = 0
            r1.<init>(r3, r4, r0, r5)     // Catch: java.net.URISyntaxException -> L94
            flm.fui r0 = r8.a(r1, r9)
            if (r0 != 0) goto L13
        L4c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "cannot find a NameResolver for %s%s"
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r7
            r5 = 1
            int r0 = r2.length()
            if (r0 <= 0) goto L9b
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
        L84:
            r4[r5] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4)
            r1.<init>(r0)
            throw r1
        L8e:
            java.lang.String r0 = new java.lang.String     // Catch: java.net.URISyntaxException -> L94
            r0.<init>(r5)     // Catch: java.net.URISyntaxException -> L94
            goto L42
        L94:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L9b:
            java.lang.String r0 = ""
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.gda.a(java.lang.String, flm.fuj, flm.frd):flm.fui");
    }

    final void a(fts ftsVar) {
        this.w = ftsVar;
        this.A.a(ftsVar);
    }

    @Override // flm.frl
    public final frm a(fuf fufVar, frj frjVar) {
        return this.ad.a(fufVar, frjVar);
    }

    @Override // flm.frl
    public final String a() {
        return this.ad.a();
    }

    @Override // flm.ftt
    public final void c() {
        this.k.a(new gdf(this)).a();
    }

    @Override // flm.ftt
    public final void d() {
        this.k.a(new gde(this)).a();
    }

    static ggh a(frd frdVar) {
        return ggv.a((Map) frdVar.a(gbg.a));
    }

    public final String toString() {
        return dve.a(this).a("logId", this.d.a).a("target", this.Y).toString();
    }
}
