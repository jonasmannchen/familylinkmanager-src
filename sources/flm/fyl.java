package flm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class fyl {
    private static final Logger a = Logger.getLogger(fyl.class.getName());
    private final Object b = new Object();
    private final Queue c = new ArrayDeque();
    private boolean d;

    fyl() {
    }

    final void a() {
        Runnable runnable;
        boolean z = false;
        while (true) {
            synchronized (this.b) {
                if (z) {
                    z = z;
                } else if (!this.d) {
                    this.d = true;
                    z = true;
                } else {
                    return;
                }
                runnable = (Runnable) this.c.poll();
                if (runnable == null) {
                    this.d = false;
                    return;
                }
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    final fyl a(Runnable runnable) {
        synchronized (this.b) {
            this.c.add((Runnable) dvl.a(runnable, "runnable is null"));
        }
        return this;
    }

    void a(Throwable th) {
        a.logp(Level.WARNING, "io.grpc.internal.ChannelExecutor", "handleUncaughtThrowable", "Runnable threw exception in ChannelExecutor", th);
    }
}
