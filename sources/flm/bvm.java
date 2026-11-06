package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvm extends cg {
    bvm(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "DELETE FROM `DeviceEventEntity` WHERE `id` = ?";
    }

    @Override // flm.cg
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bwVar.a(1, ((bvn) obj).a);
    }
}
