package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhk implements Runnable {
    private final /* synthetic */ bhj a;

    bhk(bhj bhjVar) {
        this.a = bhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = Thread.currentThread();
        this.a.run();
        this.a.b = true;
        this.a.a = null;
    }
}
