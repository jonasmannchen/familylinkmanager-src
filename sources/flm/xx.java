package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xx implements Runnable {
    private final /* synthetic */ xw a;

    xx(xw xwVar) {
        this.a = xwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(true);
        this.a.invalidateSelf();
    }
}
