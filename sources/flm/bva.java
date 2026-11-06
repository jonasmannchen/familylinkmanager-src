package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bva extends ch {
    bva(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR IGNORE INTO `AppStateEntity`(`packageName`,`flags`) VALUES (?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bve bveVar = (bve) obj;
        if (bveVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, bveVar.a);
        }
        bwVar.a(2, bveVar.b);
    }
}
