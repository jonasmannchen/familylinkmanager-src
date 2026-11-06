package flm;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsw {
    public final UUID a;
    private final AtomicLong b;

    dsw() {
        this(UUID.randomUUID(), new SecureRandom().nextLong());
    }

    private dsw(UUID uuid, long j) {
        this.a = uuid;
        this.b = new AtomicLong((25214903917L ^ j) & 281474976710655L);
    }

    final long a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.b.get();
            long j4 = ((25214903917L * j) + 11) & 281474976710655L;
            int i = (int) (j4 >>> 16);
            j2 = ((j4 * 25214903917L) + 11) & 281474976710655L;
            long j5 = ((long) i) << 32;
            j3 = ((long) ((int) (j2 >>> 16))) + j5;
        } while (!this.b.compareAndSet(j, j2));
        return j3;
    }
}
