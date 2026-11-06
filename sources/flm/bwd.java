package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwd extends cg {
    bwd(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "DELETE FROM `PolicyEntity` WHERE `type` = ? AND `subKey` = ?";
    }

    @Override // flm.cg
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bwg bwgVar = (bwg) obj;
        bwVar.a(1, bwgVar.a.z);
        if (bwgVar.b == null) {
            bwVar.a(2);
        } else {
            bwVar.a(2, bwgVar.b);
        }
    }
}
