package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gbe extends ftt {
    private final ftt a;

    gbe(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // flm.frl
    public final frm a(fuf fufVar, frj frjVar) {
        return this.a.a(fufVar, frjVar);
    }

    @Override // flm.frl
    public final String a() {
        return this.a.a();
    }

    @Override // flm.ftt
    public final void c() {
        this.a.c();
    }

    @Override // flm.ftt
    public final void d() {
        this.a.d();
    }

    public String toString() {
        return dve.a(this).a("delegate", this.a).toString();
    }
}
