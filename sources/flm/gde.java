package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gde implements Runnable {
    private final /* synthetic */ gda a;

    gde(gda gdaVar) {
        this.a = gdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.C.get() || this.a.v == null) {
            return;
        }
        this.a.b(false);
        this.a.f();
    }
}
