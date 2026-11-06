package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxr extends gbd {
    private final fzj a;
    private final String b;
    private final /* synthetic */ fxq c;

    fxr(fxq fxqVar, fzj fzjVar, String str) {
        this.c = fxqVar;
        this.a = (fzj) dvl.a(fzjVar, "delegate");
        this.b = (String) dvl.a(str, "authority");
    }

    @Override // flm.gbd
    protected final fzj c() {
        return this.a;
    }

    @Override // flm.gbd, flm.fzb
    public final fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        frh frhVar = frjVar.e;
        if (frhVar != null) {
            gen genVar = new gen(this.a, fufVar, ftvVar, frjVar);
            fre freVarA = frd.a().a(frh.b, this.b).a(frh.a, fuw.NONE);
            frd frdVarA = this.a.a();
            freVarA.a(frdVarA.a.size()).putAll(frdVarA.a);
            if (frjVar.d != null) {
                freVarA.a(frh.b, frjVar.d);
            }
            try {
                freVarA.a();
                dve.a(frjVar.c, this.c.a);
                frhVar.a();
            } catch (Throwable th) {
                fvc fvcVarB = fvc.g.a("Credentials should use fail() instead of throwing exceptions").b(th);
                dvl.a(!fvcVarB.a(), "Cannot fail with OK status");
                dvl.b(genVar.a ? false : true, "apply() or fail() already called");
                genVar.a(new gay(fvcVarB));
            }
            return genVar.a();
        }
        return this.a.a(fufVar, ftvVar, frjVar);
    }
}
