package flm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggn extends ggm {
    private final AtomicIntegerFieldUpdater a;

    ggn(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // flm.ggm
    public final boolean a(ggl gglVar, int i, int i2) {
        return this.a.compareAndSet(gglVar, 0, -1);
    }

    @Override // flm.ggm
    public final void a(ggl gglVar, int i) {
        this.a.set(gglVar, 0);
    }
}
