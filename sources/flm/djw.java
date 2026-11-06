package flm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djw implements ThreadFactory {
    public final int a;
    private final AtomicInteger b;
    private final String c;

    djw(int i) {
        this("Primes", i);
    }

    djw(String str, int i) {
        this.b = new AtomicInteger(1);
        this.a = i;
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        djx djxVar = new djx(this, runnable);
        String str = this.c;
        Thread thread = new Thread(djxVar, new StringBuilder(String.valueOf(str).length() + 12).append(str).append("-").append(this.b.getAndIncrement()).toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
