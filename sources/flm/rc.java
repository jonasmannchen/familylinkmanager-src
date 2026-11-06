package flm;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rc {
    public HandlerThread b;
    public Handler c;
    private final String h;
    public final Object a = new Object();
    private Handler.Callback f = new rd(this);
    private final int g = 10;
    public final int d = 10000;
    private int e = 0;

    public rc(String str, int i, int i2) {
        this.h = str;
    }

    final void a(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new HandlerThread(this.h, this.g);
                this.b.start();
                this.c = new Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    public final Object a(Callable callable, int i) {
        Object obj;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new rg(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                obj = atomicReference.get();
                reentrantLock.unlock();
            } else {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                do {
                    try {
                        nanos = conditionNewCondition.awaitNanos(nanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        obj = atomicReference.get();
                        reentrantLock.unlock();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return obj;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
