package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbz implements Runnable {
    private final /* synthetic */ fzc a;
    private final /* synthetic */ Throwable b;

    gbz(fzc fzcVar, Throwable th) {
        this.a = fzcVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
