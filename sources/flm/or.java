package flm;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class or {
    public static final Executor b;
    private static ow i;
    private static volatile Executor j;
    private static final ThreadFactory a = new os();
    private static final BlockingQueue h = new LinkedBlockingQueue(10);
    public volatile int e = dp.B;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();
    public final ox c = new ot(this);
    public final FutureTask d = new ou(this, this.c);

    private static Handler b() {
        ow owVar;
        synchronized (or.class) {
            if (i == null) {
                i = new ow();
            }
            owVar = i;
        }
        return owVar;
    }

    protected abstract Object a(Object... objArr);

    or() {
    }

    final void c(Object obj) {
        if (!this.g.get()) {
            d(obj);
        }
    }

    final Object d(Object obj) {
        b().obtainMessage(1, new ov(this, obj)).sendToTarget();
        return obj;
    }

    protected void a(Object obj) {
    }

    protected static void a() {
    }

    protected void b(Object obj) {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) h, a);
        b = threadPoolExecutor;
        j = threadPoolExecutor;
    }
}
