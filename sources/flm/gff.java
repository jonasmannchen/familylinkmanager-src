package flm;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gff {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final dvw g;

    gff(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, dvw dvwVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = dvwVar;
        dvwVar.a();
    }

    final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
