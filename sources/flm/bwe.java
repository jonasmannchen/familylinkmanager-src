package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwe extends ct {
    bwe(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "UPDATE PolicyEntity SET status = 3 WHERE generation < ?";
    }
}
