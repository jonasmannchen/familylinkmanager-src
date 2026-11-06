package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvb extends ch {
    bvb(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `AppPendingDisableEntity`(`packageName`,`pendingTimestamp`) VALUES (?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bux buxVar = (bux) obj;
        if (buxVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, buxVar.a);
        }
        bwVar.a(2, buxVar.b);
    }
}
