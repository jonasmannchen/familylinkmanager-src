package flm;

import android.os.Binder;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ot extends ox {
    private final /* synthetic */ or b;

    ot(or orVar) {
        this.b = orVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.b.g.set(true);
        Object objA = null;
        try {
            try {
                Process.setThreadPriority(10);
                objA = this.b.a(this.a);
                Binder.flushPendingCommands();
                this.b.d(objA);
                return objA;
            } catch (Throwable th) {
                this.b.f.set(true);
                throw th;
            }
        } catch (Throwable th2) {
            this.b.d(objA);
            throw th2;
        }
    }
}
