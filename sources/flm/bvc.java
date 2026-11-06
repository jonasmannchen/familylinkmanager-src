package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvc extends ct {
    bvc(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "UPDATE AppStateEntity SET flags = (flags & ~? | ?) WHERE packageName = ?";
    }
}
