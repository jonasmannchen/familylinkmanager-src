package flm;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhb extends HandlerThread implements RejectedExecutionHandler {
    public final bhl a;
    private boolean b;

    public bhb(int i) {
        super("PooledHandlerThread", i);
        this.b = false;
        this.a = bgy.a(i);
        this.a.setRejectedExecutionHandler(this);
    }

    @Override // android.os.HandlerThread
    public final Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        this.a.shutdownNow();
        return this.b;
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        this.a.shutdown();
        return this.b;
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        this.b = true;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
    }
}
