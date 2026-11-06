package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvd extends ct {
    bvd(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "DELETE FROM AppPendingDisableEntity WHERE packageName = ?";
    }
}
