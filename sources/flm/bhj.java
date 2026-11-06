package flm;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhj extends Thread {
    public volatile Thread a;
    public boolean b;
    private final ThreadPoolExecutor c;
    private final Runnable d;
    private boolean e;

    public bhj(int i, Runnable runnable) {
        super(runnable);
        this.e = false;
        this.a = null;
        this.b = false;
        this.c = GlobalExecutorsImpl.getPool(10);
        this.d = runnable;
        setPriority(10);
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        if (this.e) {
            throw new IllegalThreadStateException("Thread already started");
        }
        this.c.execute(new bhk(this));
        this.e = true;
    }

    @Override // java.lang.Thread
    public final long getId() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Thread
    public final StackTraceElement[] getStackTrace() {
        try {
            return this.a.getStackTrace();
        } catch (NullPointerException e) {
            return new StackTraceElement[0];
        }
    }

    @Override // java.lang.Thread
    public final Thread.State getState() {
        try {
            return this.a.getState();
        } catch (NullPointerException e) {
            if (!this.e) {
                return Thread.State.NEW;
            }
            if (!this.b) {
                return Thread.State.RUNNABLE;
            }
            return Thread.State.TERMINATED;
        }
    }

    @Override // java.lang.Thread
    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        try {
            this.a.interrupt();
        } catch (NullPointerException e) {
        }
    }

    @Override // java.lang.Thread
    public final boolean isInterrupted() {
        try {
            return this.a.isInterrupted();
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Thread
    public final String toString() {
        return this.d != null ? this.d.toString() : super.toString();
    }
}
