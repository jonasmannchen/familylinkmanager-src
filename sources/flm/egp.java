package flm;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egp {
    private static final Logger a = Logger.getLogger(egp.class.getName());
    private egq b;
    private boolean c;

    public final void a(Runnable runnable, Executor executor) {
        dvl.a(runnable, "Runnable was null.");
        dvl.a(executor, "Executor was null.");
        synchronized (this) {
            if (this.c) {
                b(runnable, executor);
            } else {
                this.b = new egq(runnable, executor, this.b);
            }
        }
    }

    public final void a() {
        egq egqVar = null;
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                egq egqVar2 = this.b;
                this.b = null;
                while (egqVar2 != null) {
                    egq egqVar3 = egqVar2.c;
                    egqVar2.c = egqVar;
                    egqVar = egqVar2;
                    egqVar2 = egqVar3;
                }
                while (egqVar != null) {
                    b(egqVar.a, egqVar.b);
                    egqVar = egqVar.c;
                }
            }
        }
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length()).append("RuntimeException while executing runnable ").append(strValueOf).append(" with executor ").append(strValueOf2).toString(), (Throwable) e);
        }
    }
}
