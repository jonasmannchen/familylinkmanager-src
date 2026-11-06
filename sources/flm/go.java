package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class go implements Runnable {
    private final /* synthetic */ gn a;

    go(gn gnVar) {
        this.a = gnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b(3);
    }
}
