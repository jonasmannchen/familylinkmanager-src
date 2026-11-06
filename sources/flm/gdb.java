package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdb implements Executor {
    private final /* synthetic */ gda a;

    gdb(gda gdaVar) {
        this.a = gdaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.k.a(runnable);
        this.a.k.a();
    }
}
