package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqi implements dql {
    dqi() {
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, Long l) {
        gts gtsVar = (gts) fkfVar;
        if (l == null) {
            gtsVar.c();
            gtr gtrVar = (gtr) gtsVar.a;
            gtrVar.a &= -3;
            gtrVar.c = 0L;
            return;
        }
        long jLongValue = l.longValue();
        gtsVar.c();
        gtr gtrVar2 = (gtr) gtsVar.a;
        gtrVar2.a |= 2;
        gtrVar2.c = jLongValue;
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, String str) {
        gts gtsVar = (gts) fkfVar;
        if (str != null) {
            gtsVar.a(str);
        } else {
            gtsVar.a();
        }
    }

    @Override // flm.dql
    public final /* synthetic */ String a(fkf fkfVar) {
        return ((gtr) ((gts) fkfVar).a).d;
    }

    @Override // flm.dql
    public final /* synthetic */ String b(fkf fkfVar) {
        return ((gtr) ((gts) fkfVar).a).q;
    }
}
