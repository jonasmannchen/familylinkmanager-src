package flm;

import android.app.Application;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dfp implements dfn {
    public final /* synthetic */ Application a;
    private final /* synthetic */ dlh b;
    private final /* synthetic */ djp c;
    private final /* synthetic */ dmb d;
    private final /* synthetic */ dmb e;
    private final /* synthetic */ dmb f;
    private final /* synthetic */ dge g;

    dfp(Application application, dlh dlhVar, djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, dge dgeVar) {
        this.a = application;
        this.b = dlhVar;
        this.c = djpVar;
        this.d = dmbVar;
        this.e = dmbVar2;
        this.f = dmbVar3;
        this.g = dgeVar;
    }

    @Override // flm.dfn
    public final diw a() {
        Runnable runnableA;
        Application application = this.a;
        dlh dlhVar = this.b;
        dix dixVar = new dix(application, new dmc(new djs(dlhVar.a, dlhVar.c, dlhVar.d)), this.b.g);
        dlh dlhVar2 = this.b;
        ExecutorService executorServiceNewSingleThreadExecutor = dlhVar2.a != null ? dlhVar2.a : Executors.newSingleThreadExecutor(new djw("Primes-init", dlhVar2.b));
        dlk dlkVar = this.b.e;
        if (dlkVar == null) {
            runnableA = dixVar.a(executorServiceNewSingleThreadExecutor, this.c, this.d, this.e, this.f, this.b.a == null);
        } else {
            runnableA = dixVar.a(executorServiceNewSingleThreadExecutor, this.c, this.d, this.e, this.f, this.b.a == null);
            diw diwVarA = dixVar.a();
            if (diwVarA instanceof dir) {
                dir dirVar = (dir) diwVarA;
                CountDownLatch countDownLatch = dixVar.b;
                dirVar.b.set(runnableA);
                dirVar.c.set(countDownLatch);
            }
        }
        dli dliVar = this.b.f;
        dge dgeVar = this.g;
        dfq dfqVar = new dfq(this);
        if (dlkVar != null) {
            executorServiceNewSingleThreadExecutor.submit(new dfr(dgeVar, runnableA, dlkVar, dliVar, dfqVar));
            dsg.c().postDelayed(runnableA, 7000L);
        } else {
            dkm.a(5, "PrimesInit", "Primes instant initialization", new Object[0]);
            runnableA.run();
        }
        return dixVar;
    }
}
