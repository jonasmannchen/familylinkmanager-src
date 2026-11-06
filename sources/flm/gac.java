package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gac implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ fzu b;

    gac(fzu fzuVar, String str) {
        this.b = fzuVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
