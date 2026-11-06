package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdo implements Runnable {
    private final /* synthetic */ gcb a;
    private final /* synthetic */ gdn b;

    gdo(gdn gdnVar, gcb gcbVar) {
        this.b = gdnVar;
        this.a = gcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c.D) {
            this.a.a(gda.b);
        }
        if (this.b.c.E) {
            return;
        }
        this.b.c.y.add(this.a);
    }
}
