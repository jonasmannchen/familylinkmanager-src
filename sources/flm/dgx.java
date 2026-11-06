package flm;

import android.app.Application;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgx extends dfm implements dkz {
    public volatile dim c;
    public final AtomicBoolean d;
    public volatile grz e;
    private final boolean f;
    private final int g;
    private final AtomicBoolean h;
    private final dge i;
    private volatile dhb j;
    private final dgw k;
    private final dqc l;
    private final boolean m;
    private final boolean n;

    dgx(dpz dpzVar, dgw dgwVar, dqc dqcVar, boolean z, dmb dmbVar, dmb dmbVar2, Application application, float f, boolean z2, boolean z3) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.J);
        this.h = new AtomicBoolean();
        dse.a(dqcVar);
        dse.a(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.i = dge.a(application);
        this.f = new dpq(f / 100.0f).a();
        this.g = (int) (100.0f / f);
        this.k = dgwVar;
        this.l = dqcVar;
        this.m = z;
        this.d = new AtomicBoolean(z2);
        this.n = z3;
    }

    private final grz g() {
        dsg.b();
        File file = new File(this.a.getFilesDir(), "primes_crash");
        try {
            if (file.exists()) {
                dkm.a(3, "CrashMetricService", "found persisted crash", new Object[0]);
                gsa gsaVar = (gsa) ((fio) grz.i.a(dp.au, (Object) null));
                if (a(file, gsaVar)) {
                    return (grz) ((fin) gsaVar.h());
                }
                dkm.a(5, "CrashMetricService", "could not delete crash file", new Object[0]);
            }
        } catch (IOException e) {
            dkm.a("CrashMetricService", "IO failure", e, new Object[0]);
        } catch (SecurityException e2) {
            dkm.a("CrashMetricService", "Unexpected SecurityException", e2, new Object[0]);
        }
        return null;
    }

    private static boolean a(File file, gsa gsaVar) throws Throwable {
        FileInputStream fileInputStream;
        try {
            long length = file.length();
            if (length > 0 && length < 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                fileInputStream = new FileInputStream(file);
                for (int i2 = 0; i2 < i; i2 += fileInputStream.read(bArr, i2, i - i2)) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                gsaVar.a(bArr, fib.b());
            } else {
                gsaVar.a(true);
                fileInputStream = null;
            }
            boolean zDelete = file.delete();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return zDelete;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    @Override // flm.dkz
    public final void e() {
        dkm.a(3, "CrashMetricService", "onPrimesInitialize", new Object[0]);
        grz grzVarG = null;
        if (this.n) {
            dkm.a(3, "CrashMetricService", "persistent crash enabled.", new Object[0]);
            try {
                grzVarG = g();
            } catch (RuntimeException e) {
                dkm.b("CrashMetricService", "Unexpected failure: ", e, new Object[0]);
            }
        }
        if (!this.d.get()) {
            if (h_() && (grzVarG != null || this.f)) {
                a(gtl.PRIMES_CRASH_MONITORING_INITIALIZED, grzVarG);
                return;
            } else {
                dkm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new Object[0]);
                return;
            }
        }
        this.e = grzVarG;
    }

    final void a(dim dimVar) {
        String strValueOf = String.valueOf(dim.a(dimVar));
        dkm.a(3, "CrashMetricService", strValueOf.length() != 0 ? "activeComponentName: ".concat(strValueOf) : new String("activeComponentName: "), new Object[0]);
        this.c = dimVar;
    }

    @Override // flm.dkz
    public final void f() {
        dkm.a(3, "CrashMetricService", "onFirstActivityCreated", new Object[0]);
        if (!this.d.get()) {
            if (h_() && this.f) {
                c().submit(new dha(this));
            } else {
                dkm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_FIRST_ACTIVITY_LAUNCHED' dropped.", new Object[0]);
            }
        }
        this.j = new dgy(this);
        this.i.a(this.j);
    }

    final void a(gtl gtlVar, grz grzVar) {
        gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
        gti gtiVar = (gti) ((fio) gth.e.a(dp.au, (Object) null));
        int i = this.g;
        gtiVar.c();
        gth gthVar = (gth) gtiVar.a;
        gthVar.a |= 2;
        gthVar.c = i;
        gtiVar.c();
        gth gthVar2 = (gth) gtiVar.a;
        if (gtlVar == null) {
            throw new NullPointerException();
        }
        gthVar2.a |= 1;
        gthVar2.b = gtlVar.e;
        if (grzVar != null) {
            gtk gtkVar = (gtk) ((fio) gtj.e.a(dp.au, (Object) null));
            gtkVar.c();
            gtj gtjVar = (gtj) gtkVar.a;
            if (grzVar == null) {
                throw new NullPointerException();
            }
            gtjVar.b = grzVar;
            gtjVar.a |= 1;
            gtiVar.a((gtj) ((fin) gtkVar.h()));
        }
        gtsVar.a(gtiVar);
        a((gtr) ((fin) gtsVar.h()));
    }

    @Override // flm.dfm
    final void d() {
        if (this.j != null) {
            this.i.b(this.j);
            this.j = null;
        }
        if (this.h.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof dhc)) {
            Thread.setDefaultUncaughtExceptionHandler(((dhc) Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }
}
