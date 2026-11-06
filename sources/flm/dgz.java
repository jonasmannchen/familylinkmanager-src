package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgz implements Runnable {
    private final /* synthetic */ dgy a;

    dgz(dgy dgyVar) {
        this.a = dgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgx dgxVar = this.a.a;
        if (dgxVar.d.getAndSet(false)) {
            dgxVar.a(gtl.PRIMES_CRASH_MONITORING_INITIALIZED, dgxVar.e);
            dgxVar.a(gtl.PRIMES_FIRST_ACTIVITY_LAUNCHED, (grz) null);
        }
    }
}
