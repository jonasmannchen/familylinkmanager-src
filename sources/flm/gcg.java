package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcg implements Runnable {
    private final /* synthetic */ fzj a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ gcb c;

    gcg(gcb gcbVar, fzj fzjVar, boolean z) {
        this.c = gcbVar;
        this.a = fzjVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o.a(this.a, this.b);
    }
}
