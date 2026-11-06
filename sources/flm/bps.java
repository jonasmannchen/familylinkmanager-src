package flm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bps implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    bps() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, new StringBuilder(20).append("gcm-task#").append(this.a.getAndIncrement()).toString());
        thread.setPriority(4);
        return thread;
    }
}
