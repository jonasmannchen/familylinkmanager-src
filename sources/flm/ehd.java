package flm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehd implements ThreadFactory {
    private final /* synthetic */ ThreadFactory a;
    private final /* synthetic */ String b;
    private final /* synthetic */ AtomicLong c;
    private final /* synthetic */ Boolean d;
    private final /* synthetic */ Integer e;
    private final /* synthetic */ Thread.UncaughtExceptionHandler f;

    public ehd(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
        this.f = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        if (this.b != null) {
            threadNewThread.setName(ehc.a(this.b, Long.valueOf(this.c.getAndIncrement())));
        }
        if (this.d != null) {
            threadNewThread.setDaemon(this.d.booleanValue());
        }
        if (this.e != null) {
            threadNewThread.setPriority(this.e.intValue());
        }
        if (this.f != null) {
            threadNewThread.setUncaughtExceptionHandler(this.f);
        }
        return threadNewThread;
    }
}
