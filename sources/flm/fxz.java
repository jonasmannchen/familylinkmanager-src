package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxz implements fro {
    private final boolean a;
    private final boolean b;
    private final /* synthetic */ fxv c;

    fxz(fxv fxvVar, boolean z, boolean z2) {
        this.c = fxvVar;
        this.a = z;
        this.b = z2;
    }

    @Override // flm.fro
    public final frm a(fuf fufVar, frj frjVar, frl frlVar) {
        fxx fxxVar = new fxx(this.c, this.c.d.b(), fufVar.b, this.a, this.b);
        return new fya(frlVar.a(fufVar, frjVar.a(fxxVar)), fxxVar);
    }
}
