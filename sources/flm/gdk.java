package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdk {
    private final gep a;
    private Executor b;

    gdk(gep gepVar) {
        this.a = (gep) dvl.a(gepVar, "executorPool");
    }

    final synchronized void a() {
        if (this.b != null) {
            this.a.a(this.b);
            this.b = null;
        }
    }
}
