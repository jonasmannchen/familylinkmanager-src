package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvr extends ch {
    bvr(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `KeyValue`(`key`,`value`) VALUES (?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bvo bvoVar = (bvo) obj;
        if (bvoVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, bvoVar.a);
        }
        if (bvoVar.b == null) {
            bwVar.a(2);
        } else {
            bwVar.a(2, bvoVar.b);
        }
    }
}
