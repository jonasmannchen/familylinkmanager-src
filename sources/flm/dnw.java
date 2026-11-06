package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnw extends dnt {
    protected dnw(int i) {
        super(i);
    }

    public final int c(dod dodVar) {
        return dodVar.a.get(this.k + dodVar.b + 4 + 4);
    }

    @Override // flm.dnt
    public final int a(dod dodVar) {
        return dodVar.a.getInt(this.k + dodVar.b + 4);
    }

    @Override // flm.dnt
    public final int a(dod dodVar, int i) {
        return 0;
    }

    @Override // flm.dnt
    public final String b(dod dodVar, int i) {
        return "";
    }

    @Override // flm.dnt
    public final String c(dod dodVar, int i) {
        return "";
    }

    @Override // flm.dnt
    public final int b(dod dodVar) {
        return dodVar.b(c(dodVar)) * a(dodVar);
    }
}
