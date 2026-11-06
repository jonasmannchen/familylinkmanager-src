package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqk implements dql {
    dqk() {
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, Long l) {
        grk grkVar = (grk) fkfVar;
        if (l == null) {
            grkVar.c();
            grj grjVar = (grj) grkVar.a;
            grjVar.a &= -3;
            grjVar.c = 0L;
            return;
        }
        long jLongValue = l.longValue();
        grkVar.c();
        grj grjVar2 = (grj) grkVar.a;
        grjVar2.a |= 2;
        grjVar2.c = jLongValue;
    }

    @Override // flm.dql
    public final /* synthetic */ void a(fkf fkfVar, String str) {
        grk grkVar = (grk) fkfVar;
        if (str == null) {
            grkVar.c();
            grj grjVar = (grj) grkVar.a;
            grjVar.a &= -5;
            grjVar.d = grj.l.d;
            return;
        }
        grkVar.b(str);
    }

    @Override // flm.dql
    public final /* synthetic */ String a(fkf fkfVar) {
        return ((grj) ((grk) fkfVar).a).d;
    }

    @Override // flm.dql
    public final /* synthetic */ String b(fkf fkfVar) {
        return ((grj) ((grk) fkfVar).a).b;
    }
}
