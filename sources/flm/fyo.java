package flm;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyo extends frm {
    private static final Logger j = Logger.getLogger(fyo.class.getName());
    private static final byte[] k = "gzip".getBytes(Charset.forName("US-ASCII"));
    public final fuf a;
    public final Executor b;
    public final fxs c;
    public final fsc d;
    public fyz e;
    public volatile boolean f;
    public boolean g;
    private volatile ScheduledFuture l;
    private final boolean m;
    private final frj n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private final fyw r;
    private final ScheduledExecutorService t;
    private final fse s = new fyx(this);
    public fsp h = fsp.a;
    public frz i = frz.a;

    fyo(fuf fufVar, Executor executor, frj frjVar, fyw fywVar, ScheduledExecutorService scheduledExecutorService, fxs fxsVar, boolean z) {
        this.a = fufVar;
        this.b = executor == egn.INSTANCE ? new ggk() : new ggl(executor);
        this.c = fxsVar;
        this.d = fsc.a();
        this.m = fufVar.a == fuh.UNARY || fufVar.a == fuh.SERVER_STREAMING;
        this.n = frjVar;
        this.r = fywVar;
        this.t = scheduledExecutorService;
        this.o = z;
    }

    @Override // flm.frm
    public final void a(frn frnVar, ftv ftvVar) {
        fry fryVar;
        dvl.b(this.e == null, "Already started");
        dvl.b(!this.p, "call was cancelled");
        dvl.a(frnVar, "observer");
        dvl.a(ftvVar, "headers");
        if (this.d.d()) {
            this.e = geo.a;
            this.b.execute(new fyp(this, frnVar));
            return;
        }
        String str = this.n.f;
        if (str != null) {
            fryVar = (fry) this.i.b.get(str);
            if (fryVar == null) {
                this.e = geo.a;
                this.b.execute(new fyq(this, frnVar, str));
                return;
            }
        } else {
            fryVar = frx.a;
        }
        fsp fspVar = this.h;
        boolean z = this.g;
        ftvVar.b(gbh.c);
        if (fryVar != frx.a) {
            ftvVar.a(gbh.c, fryVar.a());
        }
        ftvVar.b(gbh.d);
        byte[] bArr = fspVar.c;
        if (bArr.length != 0) {
            ftvVar.a(gbh.d, bArr);
        }
        ftvVar.b(gbh.e);
        ftvVar.b(gbh.f);
        if (z) {
            ftvVar.a(gbh.f, k);
        }
        fsl fslVarC = c();
        if (!(fslVarC != null && fslVarC.a())) {
            fsl fslVar = this.n.b;
            fsl fslVarF = this.d.f();
            if (j.isLoggable(Level.FINE) && fslVarC != null && fslVar == fslVarC) {
                StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, fslVarC.a(TimeUnit.NANOSECONDS)))));
                if (fslVarF == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(fslVarF.a(TimeUnit.NANOSECONDS))));
                }
                j.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
            }
            if (this.o) {
                this.e = this.r.a(this.a, this.n, ftvVar, this.d);
            } else {
                fzb fzbVarA = this.r.a(new ger(this.a, ftvVar, this.n));
                fsc fscVarC = this.d.c();
                try {
                    this.e = fzbVarA.a(this.a, ftvVar, this.n);
                    this.d.a(fscVarC);
                } catch (Throwable th) {
                    this.d.a(fscVarC);
                    throw th;
                }
            }
        } else {
            fvc fvcVar = fvc.e;
            String strValueOf = String.valueOf(fslVarC);
            this.e = new gay(fvcVar.a(new StringBuilder(String.valueOf(strValueOf).length() + 19).append("deadline exceeded: ").append(strValueOf).toString()));
        }
        if (this.n.d != null) {
            this.e.a(this.n.d);
        }
        if (this.n.i != null) {
            this.e.b(this.n.i.intValue());
        }
        if (this.n.j != null) {
            this.e.a(this.n.j.intValue());
        }
        if (fslVarC != null) {
            this.e.a(fslVarC);
        }
        this.e.a(fryVar);
        if (this.g) {
            this.e.a(this.g);
        }
        this.e.a(this.h);
        this.c.a();
        this.e.a(new fyr(this, frnVar));
        this.d.a(this.s, (Executor) egn.INSTANCE);
        if (fslVarC != null && this.d.f() != fslVarC && this.t != null) {
            long jA = fslVarC.a(TimeUnit.NANOSECONDS);
            this.l = this.t.schedule(new gcx(new fyy(this, jA)), jA, TimeUnit.NANOSECONDS);
        }
        if (this.f) {
            b();
        }
    }

    final void b() {
        this.d.a(this.s);
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    final fsl c() {
        fsl fslVar = this.n.b;
        fsl fslVarF = this.d.f();
        if (fslVar != null) {
            if (fslVarF == null) {
                return fslVar;
            }
            return ((fslVar.a - fslVarF.a) > 0L ? 1 : ((fslVar.a - fslVarF.a) == 0L ? 0 : -1)) < 0 ? fslVar : fslVarF;
        }
        return fslVarF;
    }

    @Override // flm.frm
    public final void a(int i) {
        dvl.b(this.e != null, "Not started");
        dvl.a(i >= 0, "Number requested must be non-negative");
        this.e.c(i);
    }

    @Override // flm.frm
    public final void a(String str, Throwable th) {
        fvc fvcVarA;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            j.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancel", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (!this.p) {
            this.p = true;
            try {
                if (this.e != null) {
                    fvc fvcVar = fvc.c;
                    if (str != null) {
                        fvcVarA = fvcVar.a(str);
                    } else {
                        fvcVarA = fvcVar.a("Call cancelled without message");
                    }
                    if (th != null) {
                        fvcVarA = fvcVarA.b(th);
                    }
                    this.e.b(fvcVarA);
                }
            } finally {
                b();
            }
        }
    }

    @Override // flm.frm
    public final void a() {
        dvl.b(this.e != null, "Not started");
        dvl.b(!this.p, "call was cancelled");
        dvl.b(this.q ? false : true, "call already half-closed");
        this.q = true;
        this.e.e();
    }

    @Override // flm.frm
    public final void a(Object obj) {
        dvl.b(this.e != null, "Not started");
        dvl.b(!this.p, "call was cancelled");
        dvl.b(this.q ? false : true, "call was half-closed");
        try {
            if (this.e instanceof gfi) {
                gfi gfiVar = (gfi) this.e;
                ggb ggbVar = gfiVar.m;
                if (ggbVar.a) {
                    ggbVar.d.a.a(gfiVar.c.a(obj));
                } else {
                    gfiVar.a(new gfv(gfiVar, obj));
                }
            } else {
                this.e.a(this.a.a(obj));
            }
            if (!this.m) {
                this.e.f();
            }
        } catch (Error e) {
            this.e.b(fvc.c.a("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.e.b(fvc.c.b(e2).a("Failed to stream message"));
        }
    }

    static void a(frn frnVar, fvc fvcVar, ftv ftvVar) {
        frnVar.a(fvcVar, ftvVar);
    }

    public final String toString() {
        return dve.a(this).a("method", this.a).toString();
    }
}
