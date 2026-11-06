package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxj extends ftn {
    private final fym a;
    private final ghh b;

    fxj(fym fymVar, ghh ghhVar) {
        this.a = fymVar;
        this.b = ghhVar;
    }

    @Override // flm.ftn
    public final ftm a(fto ftoVar) {
        return new fxk(ftoVar, this.a, this.b);
    }
}
