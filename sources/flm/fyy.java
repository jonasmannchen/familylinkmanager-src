package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyy implements Runnable {
    private final long a;
    private final /* synthetic */ fyo b;

    fyy(fyo fyoVar, long j) {
        this.b = fyoVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.b(fvc.e.b(String.format("deadline exceeded after %dns", Long.valueOf(this.a))));
    }
}
