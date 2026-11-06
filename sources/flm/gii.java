package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gii implements Runnable {
    private final /* synthetic */ fxh a;

    gii(fxh fxhVar) {
        this.a = fxhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fxh fxhVar = this.a;
        long jMax = Math.max(fxhVar.a << 1, fxhVar.a);
        if (fxhVar.b.c.compareAndSet(fxhVar.a, jMax)) {
            fxg.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{fxhVar.b.b, Long.valueOf(jMax)});
        }
    }
}
