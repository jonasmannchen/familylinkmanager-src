package flm;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhd implements egx {
    private final ScheduledFuture a;
    private final egv b;

    bhd(ScheduledFuture scheduledFuture, egv egvVar) {
        this.a = scheduledFuture;
        this.b = egvVar;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z) || this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    @Override // flm.egv
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }
}
