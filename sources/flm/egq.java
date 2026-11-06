package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egq {
    public final Runnable a;
    public final Executor b;
    public egq c;

    egq(Runnable runnable, Executor executor, egq egqVar) {
        this.a = runnable;
        this.b = executor;
        this.c = egqVar;
    }
}
