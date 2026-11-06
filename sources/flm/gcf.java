package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcf implements Runnable {
    private final /* synthetic */ gcb a;

    gcf(gcb gcbVar) {
        this.a = gcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.a(this.a);
    }
}
