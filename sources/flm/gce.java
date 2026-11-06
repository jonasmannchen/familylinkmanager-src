package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gce implements Runnable {
    private final /* synthetic */ fsb a;
    private final /* synthetic */ gcb b;

    gce(gcb gcbVar, fsb fsbVar) {
        this.b = gcbVar;
        this.a = fsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.a(this.a);
    }
}
