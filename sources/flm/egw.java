package flm;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egw extends FutureTask implements egv {
    private final egp a;

    public static egw a(Callable callable) {
        return new egw(callable);
    }

    private egw(Callable callable) {
        super(callable);
        this.a = new egp();
    }

    public egw(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.a = new egp();
    }

    @Override // flm.egv
    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.a.a();
    }
}
