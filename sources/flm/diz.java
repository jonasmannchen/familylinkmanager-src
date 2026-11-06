package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class diz implements Runnable {
    private final /* synthetic */ djp a;
    private final /* synthetic */ dmb b;
    private final /* synthetic */ dmb c;
    private final /* synthetic */ dmb d;
    private final /* synthetic */ djc e;
    private final /* synthetic */ djd f;
    private final /* synthetic */ dix g;

    diz(dix dixVar, djp djpVar, dmb dmbVar, dmb dmbVar2, dmb dmbVar3, djc djcVar, djd djdVar) {
        this.g = dixVar;
        this.a = djpVar;
        this.b = dmbVar;
        this.c = dmbVar2;
        this.d = dmbVar3;
        this.e = djcVar;
        this.f = djdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dkm.a(5, "Primes", "background initialization", new Object[0]);
            this.g.a(this.a, this.b, this.c, this.d, this.e, this.f);
        } catch (RuntimeException e) {
            dkm.b("Primes", "Primes failed to initialized in the background", e, new Object[0]);
            this.g.b();
        } finally {
            this.g.b.countDown();
        }
    }
}
