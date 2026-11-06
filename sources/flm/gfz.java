package flm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfz {
    private final AtomicLong a = new AtomicLong();

    gfz() {
    }

    final long a(long j) {
        return this.a.addAndGet(j);
    }
}
