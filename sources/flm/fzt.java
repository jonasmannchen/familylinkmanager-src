package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzt extends fzu {
    public final ftq a;
    private final fsc c = fsc.a();
    private final /* synthetic */ fzn d;

    fzt(fzn fznVar, ftq ftqVar) {
        this.d = fznVar;
        this.a = ftqVar;
    }

    final void a(fzb fzbVar) {
        fsc fscVarC = this.c.c();
        try {
            fyz fyzVarA = fzbVar.a(this.a.c(), this.a.b(), this.a.a());
            this.c.a(fscVarC);
            a(fyzVarA);
        } catch (Throwable th) {
            this.c.a(fscVarC);
            throw th;
        }
    }

    @Override // flm.fzu, flm.fyz
    public final void b(fvc fvcVar) {
        super.b(fvcVar);
        synchronized (this.d.a) {
            if (this.d.d != null) {
                boolean zRemove = this.d.f.remove(this);
                if (!this.d.a() && zRemove) {
                    this.d.b.a(this.d.c);
                    if (this.d.g != null) {
                        this.d.b.a(this.d.d);
                        this.d.d = null;
                    }
                }
            }
        }
        this.d.b.a();
    }
}
