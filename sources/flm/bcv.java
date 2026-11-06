package flm;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bcv implements Runnable {
    public final /* synthetic */ bcu this$0;
    public final /* synthetic */ CountDownLatch val$latch;
    public final /* synthetic */ bbn val$request;

    bcv(bcu bcuVar, CountDownLatch countDownLatch, bbn bbnVar) {
        this.this$0 = bcuVar;
        this.val$latch = countDownLatch;
        this.val$request = bbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.val$latch.await(((Long) aze.e.b()).longValue(), TimeUnit.MILLISECONDS)) {
                return;
            }
            this.this$0.log(this.val$request, 99);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
