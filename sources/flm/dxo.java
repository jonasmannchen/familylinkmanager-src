package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxo extends dwj {
    private final dxm a;

    dxo(dxm dxmVar, int i) {
        super(dxmVar.size(), i);
        this.a = dxmVar;
    }

    @Override // flm.dwj
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
