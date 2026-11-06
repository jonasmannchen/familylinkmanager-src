package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eio implements edc {
    private final dxm a;

    public eio(edc... edcVarArr) {
        this.a = dxm.a((Object[]) edcVarArr);
    }

    @Override // flm.edc
    public final ecg a(String str) {
        dxn dxnVarI = dxm.i();
        dxm dxmVar = this.a;
        int size = dxmVar.size();
        int i = 0;
        while (i < size) {
            Object obj = dxmVar.get(i);
            i++;
        }
        return new ein(str, dxnVarI.a());
    }
}
