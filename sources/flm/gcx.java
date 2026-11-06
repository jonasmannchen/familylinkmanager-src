package flm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcx implements Runnable {
    private static final Logger a = Logger.getLogger(gcx.class.getName());
    private final Runnable b;

    public gcx(Runnable runnable) {
        this.b = (Runnable) dvl.a(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(this.b);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", new StringBuilder(String.valueOf(strValueOf).length() + 35).append("Exception while executing runnable ").append(strValueOf).toString(), th);
            dvl.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 22).append("LogExceptionRunnable(").append(strValueOf).append(")").toString();
    }
}
