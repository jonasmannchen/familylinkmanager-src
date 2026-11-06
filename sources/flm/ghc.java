package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghc implements gep {
    private final gha a;

    private ghc(gha ghaVar) {
        this.a = ghaVar;
    }

    public static ghc a(gha ghaVar) {
        return new ghc(ghaVar);
    }

    @Override // flm.gep
    public final Object a() {
        return ggw.a.a(this.a);
    }

    @Override // flm.gep
    public final Object a(Object obj) {
        ggw.a(this.a, obj);
        return null;
    }
}
