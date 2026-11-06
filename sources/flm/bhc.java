package flm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhc extends AbstractExecutorService implements bgr {
    private static final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1, new bjf("GlobalScheduler"));
    public final bhl a;
    public final Object b = new Object();
    private final so f = new so(0);
    public final so c = new so(0);
    private volatile boolean g = false;
    private final ScheduledExecutorService e = d;

    public bhc(int i, int i2) {
        this.a = new bhe(this, i, i2);
    }

    private static boolean a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.convert(j, timeUnit) >= bgp.a.e;
    }

    private final bhf b(Callable callable) {
        return new bhf(this, callable);
    }

    private static egx a(ScheduledFuture scheduledFuture, egv egvVar) {
        return new bhd(scheduledFuture, egvVar);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egx schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable, null), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egx schedule(Callable callable, long j, TimeUnit timeUnit) {
        bhf bhfVarB;
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.b) {
            e();
            bhfVarB = b(callable);
            scheduledFutureSchedule = this.e.schedule(bhfVarB.a(a(j, timeUnit)), j, timeUnit);
            if (!scheduledFutureSchedule.isDone()) {
                this.f.put(bhfVarB, scheduledFutureSchedule);
            }
        }
        return a(scheduledFutureSchedule, bhfVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egx scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bhf bhfVarB;
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.b) {
            e();
            bhfVarB = b(Executors.callable(runnable, null));
            scheduledFutureScheduleAtFixedRate = this.e.scheduleAtFixedRate(bhfVarB.a(a(j2, timeUnit)), j, j2, timeUnit);
            this.c.put(bhfVarB, scheduledFutureScheduleAtFixedRate);
        }
        return (egx) bgs.a(a(scheduledFutureScheduleAtFixedRate, bhfVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final egx scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bhf bhfVarB;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.b) {
            e();
            bhfVarB = b(Executors.callable(runnable, null));
            scheduledFutureScheduleWithFixedDelay = this.e.scheduleWithFixedDelay(bhfVarB.a(a(j2, timeUnit)), j, j2, timeUnit);
            this.c.put(bhfVarB, scheduledFutureScheduleWithFixedDelay);
        }
        return (egx) bgs.a(a(scheduledFutureScheduleWithFixedDelay, bhfVarB));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        bhf bhfVarB;
        ScheduledFuture<?> scheduledFutureSchedule;
        if (bgp.a.h) {
            synchronized (this.b) {
                e();
                this.a.execute(runnable);
            }
            return;
        }
        synchronized (this.b) {
            e();
            bhfVarB = b(Executors.callable(runnable, null));
            scheduledFutureSchedule = this.e.schedule(bhfVarB.a(false), 0L, TimeUnit.MILLISECONDS);
            if (!scheduledFutureSchedule.isDone()) {
                this.f.put(bhfVarB, scheduledFutureSchedule);
            }
        }
        bgs.a(a(scheduledFutureSchedule, bhfVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egv submit(Runnable runnable) {
        egv egvVar;
        if (bgp.a.h) {
            synchronized (this.b) {
                e();
                egvVar = (egv) this.a.submit(runnable, null);
            }
            return egvVar;
        }
        return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egv submit(Runnable runnable, Object obj) {
        egv egvVar;
        if (bgp.a.h) {
            synchronized (this.b) {
                e();
                egvVar = (egv) this.a.submit(runnable, obj);
            }
            return egvVar;
        }
        return schedule(Executors.callable(runnable, obj), 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a */
    public final egv submit(Callable callable) {
        egv egvVar;
        if (bgp.a.h) {
            synchronized (this.b) {
                e();
                egvVar = (egv) this.a.submit(callable);
            }
            return egvVar;
        }
        return schedule(callable, 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.b) {
            this.g = true;
            if (this.f.isEmpty()) {
                this.a.shutdown();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        ArrayList arrayList;
        int i = 0;
        synchronized (this.b) {
            arrayList = new ArrayList(this.f.size() + this.c.size());
            this.g = true;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (((ScheduledFuture) this.f.c(i2)).cancel(true)) {
                    arrayList.add((bhf) this.f.b(i2));
                }
            }
            this.f.clear();
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                if (((ScheduledFuture) this.c.c(i3)).cancel(true)) {
                    arrayList.add((bhf) this.c.b(i3));
                }
            }
            this.c.clear();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(((bhf) obj).a());
        }
        arrayList2.addAll(this.a.shutdownNow());
        return arrayList2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.g;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    protected static void a() {
    }

    protected static void b() {
    }

    protected static void c() {
    }

    private final void e() {
        if (this.g) {
            throw new RejectedExecutionException();
        }
    }

    protected final void a(bhf bhfVar, boolean z) {
        if (this.f.remove(bhfVar) != null) {
            if (this.g && this.f.isEmpty()) {
                this.a.shutdown();
                return;
            }
            return;
        }
        if (z) {
            this.c.remove(bhfVar);
        }
    }

    protected static void d() {
    }

    static {
        d.setRemoveOnCancelPolicy(true);
    }
}
