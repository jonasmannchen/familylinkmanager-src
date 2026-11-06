package flm;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dkx implements Callable {
    private final /* synthetic */ Callable a;
    private final /* synthetic */ dkv b;

    dkx(dkv dkvVar, Callable callable) {
        this.b = dkvVar;
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
            throw th;
        }
    }
}
