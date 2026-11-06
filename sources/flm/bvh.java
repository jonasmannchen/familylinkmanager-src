package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvh extends ch {
    bvh(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `ConsentStatusEntity`(`secondaryAccountEmail`,`isValid`,`timestamp`) VALUES (?,?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bvi bviVar = (bvi) obj;
        if (bviVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, bviVar.a);
        }
        bwVar.a(2, bviVar.b ? 1 : 0);
        bwVar.a(3, bviVar.c);
    }
}
