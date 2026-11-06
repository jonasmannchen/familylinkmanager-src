package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adq implements Runnable {
    public final /* synthetic */ ado a;

    adq(ado adoVar) {
        this.a = adoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b = null;
        this.a.drawableStateChanged();
    }
}
