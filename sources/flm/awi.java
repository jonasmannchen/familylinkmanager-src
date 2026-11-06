package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class awi implements Runnable {
    private final /* synthetic */ avy a;

    awi(avy avyVar) {
        this.a = avyVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
            }
        } catch (RuntimeException e) {
            awp awpVar = this.a.a;
            awpVar.e.sendMessage(awpVar.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }
}
