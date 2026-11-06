package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awy implements Runnable {
    private final /* synthetic */ apx a;
    private final /* synthetic */ awv b;

    awy(awv awvVar, apx apxVar) {
        this.b = awvVar;
        this.a = apxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
