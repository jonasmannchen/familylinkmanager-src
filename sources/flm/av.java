package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class av implements Runnable {
    private final /* synthetic */ au a;

    av(au auVar) {
        this.a = auVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        au auVar = this.a;
        if (auVar.b == 0) {
            auVar.c = true;
            auVar.f.a(y.ON_PAUSE);
        }
        this.a.a();
    }
}
