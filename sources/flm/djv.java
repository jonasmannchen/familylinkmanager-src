package flm;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djv implements dfx, Executor {
    private final dli a;
    private final dge b;
    private Runnable c;
    private boolean d;
    private volatile Activity e;
    private boolean f;

    djv(dge dgeVar, dli dliVar) {
        this.b = dgeVar;
        this.a = dliVar;
    }

    @Override // flm.dfx
    public final void b(Activity activity) {
        this.b.b(this);
        synchronized (this) {
            this.e = activity;
            if (this.c != null) {
                a(this.c);
                this.c = null;
            } else {
                this.d = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (this.d || this.b.b.a.b.get() > 0) {
                a(runnable);
            } else {
                this.c = runnable;
            }
        }
    }

    private final void a(Runnable runnable) {
        if (!this.f) {
            this.f = true;
            if (this.a == null) {
                runnable.run();
                return;
            }
            dli dliVar = this.a;
            Activity activity = this.e;
            dliVar.a();
        }
    }
}
