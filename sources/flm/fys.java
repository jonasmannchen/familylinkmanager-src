package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fys extends fzl {
    private final /* synthetic */ ftv a;
    private final /* synthetic */ fyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fys(fyr fyrVar, ftv ftvVar) {
        super(fyrVar.c.d);
        this.b = fyrVar;
        this.a = ftvVar;
    }

    @Override // flm.fzl
    public final void a() {
        try {
            if (!this.b.b) {
                this.b.a.a(this.a);
            }
        } catch (Throwable th) {
            fvc fvcVarA = fvc.c.b(th).a("Failed to read headers");
            this.b.c.e.b(fvcVarA);
            this.b.a(fvcVarA, new ftv());
        }
    }
}
