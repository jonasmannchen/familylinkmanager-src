package flm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxi implements gcy {
    private final AtomicLong a = new AtomicLong();

    fxi() {
    }

    @Override // flm.gcy
    public final void a(long j) {
        this.a.getAndAdd(1L);
    }
}
