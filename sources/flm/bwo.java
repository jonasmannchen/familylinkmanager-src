package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwo extends ch {
    bwo(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR FAIL INTO `TimeLimitLocalOverrideEntity`(`uuid`,`action`,`timestamp`,`entryVersion`,`entryId`) VALUES (?,?,?,?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bws bwsVar = (bws) obj;
        if (bwsVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, bwsVar.a);
        }
        bwVar.a(2, bwsVar.b.g);
        bwVar.a(3, bwsVar.c);
        bwVar.a(4, bwsVar.d);
        if (bwsVar.e == null) {
            bwVar.a(5);
        } else {
            bwVar.a(5, bwsVar.e);
        }
    }
}
