package flm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjf implements ThreadFactory {
    private final String a;
    private final int b;
    private final ThreadFactory c;

    public bjf(String str) {
        this(str, 0);
    }

    private bjf(String str, int i) {
        this.c = Executors.defaultThreadFactory();
        this.a = (String) bdi.checkNotNull(str, "Name must not be null");
        this.b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.c.newThread(new bjh(runnable, this.b));
        threadNewThread.setName(this.a);
        return threadNewThread;
    }
}
