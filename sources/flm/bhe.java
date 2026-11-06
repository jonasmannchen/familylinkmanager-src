package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhe extends bhl {
    private final /* synthetic */ bhc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bhe(bhc bhcVar, int i, int i2) {
        super(i, i2);
        this.j = bhcVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        bhc.a();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        bhc.b();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void terminated() {
        bhc.c();
    }

    @Override // flm.bhl
    protected final void a() {
        bhc.d();
    }
}
