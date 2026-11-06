package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggy implements Runnable {
    private final /* synthetic */ ggz a;
    private final /* synthetic */ gha b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ggw d;

    ggy(ggw ggwVar, ggz ggzVar, gha ghaVar, Object obj) {
        this.d = ggwVar;
        this.a = ggzVar;
        this.b = ghaVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.a(this.c);
                this.d.b.remove(this.b);
                if (this.d.b.isEmpty()) {
                    this.d.c.shutdown();
                    this.d.c = null;
                }
            }
        }
    }
}
