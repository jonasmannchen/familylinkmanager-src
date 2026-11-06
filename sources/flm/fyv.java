package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyv extends fzl {
    private final /* synthetic */ fyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyv(fyr fyrVar) {
        super(fyrVar.c.d);
        this.a = fyrVar;
    }

    @Override // flm.fzl
    public final void a() {
        try {
            this.a.a.a();
        } catch (Throwable th) {
            fvc fvcVarA = fvc.c.b(th).a("Failed to call onReady.");
            this.a.c.e.b(fvcVarA);
            this.a.a(fvcVarA, new ftv());
        }
    }
}
