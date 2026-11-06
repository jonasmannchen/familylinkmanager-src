package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwf extends ct {
    bwf(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "UPDATE PolicyEntity SET status = ? WHERE type = ? AND subKey = ?";
    }
}
