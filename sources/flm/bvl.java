package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvl extends ch {
    bvl(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR ABORT INTO `DeviceEventEntity`(`id`,`type`,`timestampMillis`,`packageName`,`value`) VALUES (nullif(?, 0),?,?,?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bvn bvnVar = (bvn) obj;
        bwVar.a(1, bvnVar.a);
        bwVar.a(2, bvnVar.b);
        bwVar.a(3, bvnVar.c);
        if (bvnVar.d == null) {
            bwVar.a(4);
        } else {
            bwVar.a(4, bvnVar.d);
        }
        if (bvnVar.e == null) {
            bwVar.a(5);
        } else {
            bwVar.a(5, bvnVar.e);
        }
    }
}
