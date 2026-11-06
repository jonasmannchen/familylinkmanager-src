package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwp extends ch {
    bwp(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `TimeLimitKeyValueEntity`(`key`,`value`) VALUES (?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bwr bwrVar = (bwr) obj;
        if (bwrVar.a == null) {
            bwVar.a(1);
        } else {
            bwVar.a(1, bwrVar.a);
        }
        if (bwrVar.b == null) {
            bwVar.a(2);
        } else {
            bwVar.a(2, bwrVar.b);
        }
    }
}
