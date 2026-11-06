package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ah {
    public z a;
    private w b;

    ah(ae aeVar, z zVar) {
        this.b = aj.a(aeVar);
        this.a = zVar;
    }

    final void a(af afVar, y yVar) {
        z zVarB = ag.b(yVar);
        this.a = ag.a(this.a, zVarB);
        this.b.a(afVar, yVar);
        this.a = zVarB;
    }
}
