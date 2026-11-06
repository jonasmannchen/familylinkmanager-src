package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqj implements dql {
    dqj() {
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, Long l) {
        goj gojVar = (goj) fkfVar;
        if (l == null) {
            gojVar.c();
            goi goiVar = (goi) gojVar.a;
            goiVar.a &= -3;
            goiVar.c = 0L;
            return;
        }
        long jLongValue = l.longValue();
        gojVar.c();
        goi goiVar2 = (goi) gojVar.a;
        goiVar2.a |= 2;
        goiVar2.c = jLongValue;
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, String str) {
        goj gojVar = (goj) fkfVar;
        if (str != null) {
            gojVar.a(str);
            return;
        }
        gojVar.c();
        goi goiVar = (goi) gojVar.a;
        goiVar.a &= -5;
        goiVar.d = goi.k.d;
    }

    @Override // flm.dql
    public final /* synthetic */ String a(fkf fkfVar) {
        return ((goi) ((goj) fkfVar).a).d;
    }

    @Override // flm.dql
    public final /* synthetic */ String b(fkf fkfVar) {
        return ((goi) ((goj) fkfVar).a).e;
    }
}
