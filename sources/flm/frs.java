package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class frs extends frl {
    private final frl a;
    private final fro b;

    frs(frl frlVar, fro froVar) {
        this.a = frlVar;
        this.b = (fro) dvl.a(froVar, "interceptor");
    }

    @Override // flm.frl
    public final frm a(fuf fufVar, frj frjVar) {
        return this.b.a(fufVar, frjVar, this.a);
    }

    @Override // flm.frl
    public final String a() {
        return this.a.a();
    }
}
