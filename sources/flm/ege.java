package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ege {
    public static final ege a = new ege(null, null);
    public final Runnable b;
    public final Executor c;
    public ege next;

    ege(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
