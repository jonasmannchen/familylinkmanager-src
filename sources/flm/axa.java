package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axa implements Runnable {
    private final /* synthetic */ awz a;

    axa(awz awzVar) {
        this.a = awzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b.disconnect();
    }
}
