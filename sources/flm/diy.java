package flm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class diy implements Runnable {
    private final AtomicBoolean a = new AtomicBoolean(true);
    private final /* synthetic */ ExecutorService b;
    private final /* synthetic */ djp c;
    private final /* synthetic */ dmb d;
    private final /* synthetic */ dmb e;
    private final /* synthetic */ dmb f;
    private final /* synthetic */ djc g;
    private final /* synthetic */ djd h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ dix j;

    diy(dix dixVar, ExecutorService executorService, djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, djc djcVar, djd djdVar, boolean z) {
        this.j = dixVar;
        this.b = executorService;
        this.c = djpVar;
        this.d = dmbVar;
        this.e = dmbVar2;
        this.f = dmbVar3;
        this.g = djcVar;
        this.h = djdVar;
        this.i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getAndSet(false)) {
            this.j.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            if (this.i) {
                this.b.shutdown();
            }
        }
    }
}
