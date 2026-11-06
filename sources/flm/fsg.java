package flm;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsg implements Runnable {
    public final fse a;
    private final Executor b;
    private final /* synthetic */ fsc c;

    fsg(fsc fscVar, Executor executor, fse fseVar) {
        this.c = fscVar;
        this.b = executor;
        this.a = fseVar;
    }

    final void a() {
        try {
            this.b.execute(this);
        } catch (Throwable th) {
            fsc.a.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.c);
    }
}
