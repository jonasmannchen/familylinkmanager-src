package flm;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ggk implements Executor {
    private static final Logger a = Logger.getLogger(ggk.class.getName());
    private boolean b;
    private ArrayDeque c;

    ggk() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dvl.a(runnable, "'task' must not be null.");
        if (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", new StringBuilder(String.valueOf(strValueOf).length() + 35).append("Exception while executing runnable ").append(strValueOf).toString(), th);
        } finally {
            if (this.c != null) {
                a();
            }
            this.b = false;
        }
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String strValueOf = String.valueOf(runnable);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", new StringBuilder(String.valueOf(strValueOf).length() + 35).append("Exception while executing runnable ").append(strValueOf).toString(), th);
                }
            } else {
                return;
            }
        }
    }
}
