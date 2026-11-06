package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwq extends ct {
    bwq(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "DELETE FROM TimeLimitLocalOverrideEntity WHERE timestamp < ?";
    }
}
