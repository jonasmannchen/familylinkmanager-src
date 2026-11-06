package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ean extends eal {
    private final /* synthetic */ eal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ean(eal ealVar) {
        super(new eao(ealVar.a));
        this.b = ealVar;
    }

    @Override // flm.eal, flm.dwo, flm.dzs
    public final void a(dzq dzqVar) {
        this.b.b(dzqVar);
    }

    @Override // flm.eal, flm.dwo
    public final void b(dzq dzqVar) {
        this.b.a(dzqVar);
    }

    @Override // flm.eal, flm.dwo, flm.dzs
    public final boolean a(Comparable comparable) {
        return !this.b.a(comparable);
    }

    @Override // flm.eal, flm.dzs
    public final dzs b() {
        return this.b;
    }
}
