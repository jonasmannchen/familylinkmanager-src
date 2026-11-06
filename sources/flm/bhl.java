package flm;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bhl extends ThreadPoolExecutor implements egy {
    public final Executor a;
    public final Set b;
    public final BlockingQueue c;
    public final ReentrantLock d;
    public final Condition e;
    public int f;
    public final AtomicInteger g;
    public int h;
    public boolean i;
    private int j;
    private boolean k;

    public bhl(int i, int i2) {
        this(i, i2, new LinkedBlockingQueue());
    }

    private bhl(int i, int i2, BlockingQueue blockingQueue) {
        super(i, i, 0L, TimeUnit.NANOSECONDS, blockingQueue);
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.c = getQueue();
        this.d = new ReentrantLock();
        this.e = this.d.newCondition();
        this.f = 0;
        this.j = 0;
        this.g = new AtomicInteger();
        this.h = 0;
        this.a = GlobalExecutorsImpl.getPool(i2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egv submit(Callable callable) {
        return (egv) super.submit(callable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        this.d.lock();
        try {
            if (this.k) {
                a(runnable);
                return;
            }
            this.j++;
            if (this.f < getMaximumPoolSize()) {
                this.f++;
                this.a.execute(new bhn(this, runnable, b()));
                return;
            }
            BlockingQueue blockingQueue = this.c;
            dte dteVarB = b();
            if (!blockingQueue.offer(dteVarB == null ? runnable : new bhm(runnable, dteVarB))) {
                this.j--;
                a(runnable);
            }
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean remove(Runnable runnable) {
        return this.c.remove(runnable) || (bgp.a.b && this.c.remove(new bhm(runnable, null)));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        this.d.lock();
        try {
            this.k = true;
            this.d.unlock();
            terminated();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List shutdownNow() {
        this.d.lock();
        try {
            this.k = true;
            this.i = true;
            ArrayList arrayList = new ArrayList(this.c.size());
            this.c.drainTo(arrayList);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Thread) it.next()).interrupt();
            }
            this.d.unlock();
            terminated();
            return arrayList;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        this.d.lock();
        try {
            return this.k;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean isTerminating() {
        this.d.lock();
        try {
            return this.k && this.f != 0;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        this.d.lock();
        try {
            return this.k && this.f == 0;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        this.d.lock();
        while (true) {
            try {
                if (this.k && this.f == 0) {
                    this.d.unlock();
                    return true;
                }
                if (nanos <= 0) {
                    this.d.unlock();
                    return false;
                }
                nanos = this.e.awaitNanos(nanos);
            } catch (Throwable th) {
                this.d.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getPoolSize() {
        return getActiveCount();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getActiveCount() {
        this.d.lock();
        try {
            return this.b.size();
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getLargestPoolSize() {
        this.d.lock();
        try {
            return this.h;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getTaskCount() {
        this.d.lock();
        try {
            return this.j;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getCompletedTaskCount() {
        return this.g.get();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getKeepAliveTime(TimeUnit timeUnit) {
        if (this.a instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) this.a).getKeepAliveTime(timeUnit);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public ThreadFactory getThreadFactory() {
        if (this.a instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) this.a).getThreadFactory();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setCorePoolSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean prestartCoreThread() {
        this.d.lock();
        try {
            if (this.f >= getCorePoolSize()) {
                return false;
            }
            if (this.c.isEmpty()) {
                return false;
            }
            this.f++;
            this.a.execute(new bhn(this, (Runnable) this.c.poll()));
            return true;
        } finally {
            this.d.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int prestartAllCoreThreads() {
        int i = 0;
        while (prestartCoreThread()) {
            i++;
        }
        return i;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean allowsCoreThreadTimeOut() {
        if (this.a instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) this.a).allowsCoreThreadTimeOut();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    private final void a(Runnable runnable) {
        getRejectedExecutionHandler().rejectedExecution(runnable, this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public String toString() {
        long taskCount = getTaskCount();
        long completedTaskCount = getCompletedTaskCount();
        int activeCount = getActiveCount();
        int largestPoolSize = getLargestPoolSize();
        int maximumPoolSize = getMaximumPoolSize();
        String str = isShutdown() ? " " : " !";
        String str2 = isTerminated() ? "" : "!";
        return new StringBuilder(String.valueOf(str).length() + 243 + String.valueOf(str2).length()).append("PooledThreadPoolExecutor[getTaskCount() = ").append(taskCount).append(", getCompletedTaskCount() = ").append(completedTaskCount).append(", getActiveCount() = ").append(activeCount).append(", getLargestPoolSize() = ").append(largestPoolSize).append(", getMaximumPoolSize() = ").append(maximumPoolSize).append(str).append("isShutDown(), ").append(str2).append("isTerminated()]").toString();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new egw(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Callable callable) {
        return egw.a(callable);
    }

    protected void a() {
    }

    private static dte b() {
        if (bgp.a.b) {
            if (bpj.c()) {
                return duj.b(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            }
            return duj.a(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
        return null;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (egv) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable) {
        return (egv) super.submit(runnable);
    }
}
