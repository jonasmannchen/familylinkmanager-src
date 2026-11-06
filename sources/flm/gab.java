package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gab implements Runnable {
    private final /* synthetic */ fsl a;
    private final /* synthetic */ fzu b;

    gab(fzu fzuVar, fsl fslVar) {
        this.b = fzuVar;
        this.a = fslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
