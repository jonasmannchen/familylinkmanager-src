package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fye extends fru {
    public volatile int a;
    public final boolean b;
    public final gmx c;
    private final /* synthetic */ fyc d;

    fye(fyc fycVar, gmx gmxVar, fuf fufVar) {
        this.d = fycVar;
        dvl.a(fufVar, "method");
        this.b = fufVar.g;
        gmz gmzVarA = fycVar.c.a(fyc.a(false, fufVar.b), gmxVar);
        if (gmzVarA == null) {
            throw null;
        }
        this.c = gmzVarA.a();
    }

    @Override // flm.fru
    public final frt a(ftv ftvVar) {
        if (this.c != gmo.a) {
            ftvVar.b(this.d.d);
            ftvVar.a(this.d.d, this.c.b);
        }
        return new fyf(this.c);
    }
}
