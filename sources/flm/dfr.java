package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dfr implements Runnable {
    private final /* synthetic */ dge a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ dlk c;
    private final /* synthetic */ dli d;
    private final /* synthetic */ dmb e;

    dfr(dge dgeVar, Runnable runnable, dlk dlkVar, dli dliVar, dmb dmbVar) {
        this.a = dgeVar;
        this.b = runnable;
        this.c = dlkVar;
        this.d = dliVar;
        this.e = dmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dge dgeVar = this.a;
        Runnable runnable = this.b;
        dlk dlkVar = this.c;
        dli dliVar = this.d;
        dmb dmbVar = this.e;
        boolean z = dlkVar != null && dlkVar.a();
        dkm.a(5, "PrimesInit", "initAfterResumed: %b", Boolean.valueOf(z));
        if (!z || !((Boolean) dmbVar.a()).booleanValue()) {
            dkm.a(5, "PrimesInit", "executing Primes-init task", new Object[0]);
            runnable.run();
        } else {
            dkm.a(5, "PrimesInit", "scheduling Primes-init task", new Object[0]);
            djv djvVar = new djv(dgeVar, dliVar);
            dgeVar.a(djvVar);
            djvVar.execute(runnable);
        }
    }
}
