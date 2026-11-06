package flm;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.chimeraresources.R;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dix implements diw {
    private static final AtomicInteger c = new AtomicInteger();
    public final dmb a;
    public final CountDownLatch b;
    private final Application d;
    private final AtomicReference e = new AtomicReference();

    dix(Application application, dmb dmbVar, boolean z) {
        new AtomicBoolean();
        this.b = new CountDownLatch(1);
        dse.b(true);
        this.d = (Application) dse.a(application);
        this.a = (dmb) dse.a(dmbVar);
        c.incrementAndGet();
        this.e.set(new dir(z));
    }

    final diw a() {
        return (diw) this.e.get();
    }

    final Runnable a(ExecutorService executorService, djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, boolean z) {
        return new diy(this, executorService, djpVar, dmbVar, dmbVar2, dmbVar3, new djc(dge.a(this.d)), new djd(dge.a(this.d), this.a), z);
    }

    final void a(ExecutorService executorService, djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, djc djcVar, djd djdVar) {
        try {
            executorService.submit(new diz(this, djpVar, dmbVar, dmbVar2, dmbVar3, djcVar, djdVar));
        } catch (RuntimeException e) {
            dkm.b("Primes", "Primes failed to initialized", e, new Object[0]);
            b();
        }
    }

    final void a(djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, djc djcVar, djd djdVar) {
        dkg.a.a = dgv.a();
        dse.a(Integer.valueOf(R.string.primes_marker));
        dlw dlwVar = (dlw) dmbVar3.a();
        dlwVar.a(djcVar);
        dlwVar.a(djdVar);
        dlwVar.a(this.d, this.a);
        if (dlwVar.a) {
            b();
            return;
        }
        dkg.a.b = dgv.a();
        SharedPreferences sharedPreferences = (SharedPreferences) dmbVar2.a();
        djl djlVarA = djl.a((djl) dse.a(djpVar.a()));
        dkg.a.c = dgv.a();
        djz djzVar = (djz) dse.a((djz) dmbVar.a());
        if (dlwVar.a) {
            b();
            return;
        }
        dkg.a.d = dgv.a();
        dja djaVar = new dja(this, djlVarA);
        diw diwVar = (diw) this.e.get();
        dir dirVar = diwVar instanceof dir ? (dir) diwVar : null;
        if (diwVar != null) {
            dhn dhnVar = new dhn(this.d, this.a, djaVar, djlVarA, djzVar, sharedPreferences, dlwVar, dirVar.e);
            dgo dgoVar = new dgo(dhnVar, this.d.getPackageName());
            if (dlwVar.a) {
                b();
                return;
            }
            diw diwVar2 = (diw) this.e.get();
            if ((diwVar2 instanceof dir) && this.e.compareAndSet(diwVar2, dgoVar)) {
                for (dkz dkzVar : dgoVar.a()) {
                    dkzVar.e();
                    synchronized (djcVar) {
                        if (!djcVar.b) {
                            djcVar.a.add(dkzVar);
                        } else {
                            dkzVar.f();
                        }
                    }
                }
                if (!dlwVar.a) {
                    dir dirVar2 = (dir) diwVar2;
                    dirVar2.a(dgoVar);
                    synchronized (dirVar2.d) {
                        dirVar2.a = dgoVar;
                    }
                    dirVar2.a(dgoVar);
                    djb djbVar = new djb(dhnVar);
                    synchronized (djdVar.b) {
                        if (djdVar.c) {
                            ((ScheduledExecutorService) djdVar.a.a()).submit(djbVar);
                        } else {
                            djdVar.b.add(djbVar);
                        }
                    }
                }
                diwVar2.b();
            } else {
                dkm.a(3, "Primes", "Primes shutdown during initialization", new Object[0]);
                dgoVar.b();
            }
            if (djlVarA.l().a() || djlVarA.o().a() || djzVar.a || djzVar.b) {
                File fileA = dkj.a(this.d);
                if (fileA.exists()) {
                    fileA.delete();
                }
                dkj.c(this.d);
            }
            dkg.a.e = dgv.a();
        }
    }

    @Override // flm.diw
    public final void b() {
        ((diw) this.e.getAndSet(new din())).b();
        try {
            Application application = this.d;
            synchronized (dge.class) {
                if (dge.a != null) {
                    dgf dgfVar = dge.a.b;
                    application.unregisterActivityLifecycleCallbacks(dgfVar.a);
                    application.unregisterComponentCallbacks(dgfVar.a);
                    dge.a = null;
                }
            }
        } catch (RuntimeException e) {
            dkm.a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    static boolean d() {
        return true;
    }

    @Override // flm.diw
    public final void a(dmm dmmVar, String str, boolean z, long j, long j2, gpr gprVar) {
        a().a(dmmVar, str, z, j, j2, gprVar);
    }

    @Override // flm.diw
    public final dme c() {
        return a().c();
    }

    @Override // flm.diw
    public final void a(dme dmeVar, String str, boolean z, int i) {
        a().a(dmeVar, str, z, i);
    }

    @Override // flm.diw
    public final void a(dmd dmdVar, grh grhVar, gpr gprVar) {
        a().a(dmdVar, grhVar, gprVar);
    }
}
