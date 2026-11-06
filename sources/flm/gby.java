package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gby implements Runnable {
    private final /* synthetic */ fzc a;
    private final /* synthetic */ long b;

    gby(fzc fzcVar, long j) {
        this.a = fzcVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
