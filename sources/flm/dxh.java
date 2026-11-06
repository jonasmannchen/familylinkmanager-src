package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxh extends dxu {
    public static final long serialVersionUID = 0;

    dxh(dxf dxfVar) {
        super(dxfVar);
    }

    @Override // flm.dxu
    final Object readResolve() {
        return a(new dxg());
    }
}
