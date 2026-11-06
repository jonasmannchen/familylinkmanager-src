package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghi implements ghh {
    private final long b = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - System.nanoTime();

    ghi() {
    }

    @Override // flm.ghh
    public final long a() {
        return System.nanoTime() + this.b;
    }
}
