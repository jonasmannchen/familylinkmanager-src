package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvv extends ch {
    bvv(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `KidsModuleInfo`(`key`,`apkPackageName`,`apkVersionCode`,`moduleVersion`) VALUES (?,?,?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bvs bvsVar = (bvs) obj;
        bwVar.a(1, bvsVar.a);
        if (bvsVar.b == null) {
            bwVar.a(2);
        } else {
            bwVar.a(2, bvsVar.b);
        }
        bwVar.a(3, bvsVar.c);
        bwVar.a(4, bvsVar.d);
    }
}
