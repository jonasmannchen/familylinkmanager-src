package flm;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhf implements egv, RunnableFuture {
    private final Callable d;
    private final /* synthetic */ bhc h;
    private final ReentrantLock b = new ReentrantLock();
    private final Condition c = this.b.newCondition();
    private final egp e = new egp();
    private egv f = null;
    private boolean g = false;
    public bof a = null;

    public bhf(bhc bhcVar, Callable callable) {
        this.h = bhcVar;
        this.d = callable;
    }

    protected final Runnable a(boolean z) {
        if (bgp.a.d && bpj.b()) {
            if (z && bgp.a.c) {
                this.a = bpj.a();
                if (this.a != null) {
                    return new Runnable(this) { // from class: flm.bhg
                        private final bhf a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bhf bhfVar = this.a;
                            dtn dtnVarA = bpj.a(bhfVar.a);
                            dts dtsVar = bpj.b;
                            Object[] objArr = new Object[1];
                            bof bofVar = bhfVar.a;
                            objArr[0] = (bofVar.c == null ? bnx.d : bofVar.c).c;
                            String str = String.format("%s_scheduled_t", objArr);
                            dtsVar.a(str, dtnVarA, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                            try {
                                bhfVar.run();
                            } finally {
                                duj.b(str);
                            }
                        }
                    };
                }
                return this;
            }
            return a(this);
        }
        return this;
    }

    private static Runnable a(Runnable runnable) {
        if (duj.c(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
            return duc.a(runnable);
        }
        return runnable;
    }

    final Runnable a() {
        this.b.lock();
        try {
            bdi.checkState(!this.g);
            egw egwVarA = egw.a(this.d);
            this.f = egwVarA;
            this.f.a(new Runnable(this) { // from class: flm.bhh
                private final bhf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, egn.INSTANCE);
            return egwVarA;
        } finally {
            this.b.unlock();
        }
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.b.lock();
        try {
            if (this.g) {
                this.b.unlock();
                return;
            }
            synchronized (this.h.b) {
                if (Thread.interrupted()) {
                    this.b.unlock();
                    return;
                }
                bhl bhlVar = this.h.a;
                Callable callableA = this.d;
                if (duj.c(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
                    callableA = duc.a(callableA);
                }
                this.f = (egv) bhlVar.submit(callableA);
                this.h.a(this, false);
                this.f.a(a(new Runnable(this) { // from class: flm.bhi
                    private final bhf a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }), egn.INSTANCE);
                this.c.signalAll();
                this.b.unlock();
            }
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        this.b.lock();
        try {
            if (this.g) {
                this.b.unlock();
            } else {
                this.g = true;
                this.g = this.f == null || this.f.cancel(z);
                synchronized (this.h.b) {
                    this.g = this.g || this.h.c.containsKey(this);
                    if (this.g) {
                        this.h.a(this, true);
                    }
                }
                if (this.g) {
                    this.e.a();
                    this.c.signalAll();
                }
                z2 = this.g;
                this.b.unlock();
            }
            return z2;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        this.b.lock();
        try {
            return this.g;
        } finally {
            this.b.unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        this.b.lock();
        try {
            return this.g || (this.f != null && this.f.isDone());
        } finally {
            this.b.unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.b.lock();
        while (this.f == null && !this.g) {
            try {
                this.c.await();
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        }
        if (this.f == null) {
            throw new CancellationException();
        }
        egv egvVar = this.f;
        this.b.unlock();
        return egvVar.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        this.b.lock();
        while (this.f == null && !this.g && nanos > 0) {
            try {
                nanos = this.c.awaitNanos(nanos);
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        }
        if (nanos <= 0) {
            throw new TimeoutException();
        }
        if (this.f == null) {
            throw new CancellationException();
        }
        egv egvVar = this.f;
        this.b.unlock();
        return egvVar.get(nanos, TimeUnit.NANOSECONDS);
    }

    @Override // flm.egv
    public final void a(Runnable runnable, Executor executor) {
        this.e.a(runnable, executor);
    }

    public final String toString() {
        return this.d.toString();
    }

    final /* synthetic */ void b() {
        this.e.a();
    }
}
