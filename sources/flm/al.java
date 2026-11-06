package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class al implements Runnable {
    private final /* synthetic */ ak a;

    al(ak akVar) {
        this.a = akVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = ak.b;
        }
        this.a.b(obj);
    }
}
