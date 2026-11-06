package flm;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggl implements Runnable, Executor {
    private static final Logger b = Logger.getLogger(ggl.class.getName());
    private static final ggm c = a();
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    private static ggm a() {
        try {
            return new ggn(AtomicIntegerFieldUpdater.newUpdater(ggl.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            return new ggo();
        }
    }

    public ggl(Executor executor) {
        dvl.a(executor, "'executor' must not be null.");
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.add((Runnable) dvl.a(runnable, "'r' must not be null."));
        a(runnable);
    }

    private final void a(Runnable runnable) {
        if (c.a(this, 0, -1)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.a(this, 0);
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    String strValueOf = String.valueOf(runnable);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", new StringBuilder(String.valueOf(strValueOf).length() + 35).append("Exception while executing runnable ").append(strValueOf).toString(), (Throwable) e);
                }
            } catch (Throwable th) {
                c.a(this, 0);
                throw th;
            }
        }
        c.a(this, 0);
        if (!this.e.isEmpty()) {
            a(null);
        }
    }
}
