package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fls extends flq {
    fls() {
    }

    @Override // flm.flq
    final boolean a() {
        return false;
    }

    private static void a(Object obj, flr flrVar) {
        ((fin) obj).E = flrVar;
    }

    @Override // flm.flq
    final void d(Object obj) {
        ((fin) obj).E.f = false;
    }

    @Override // flm.flq
    final /* synthetic */ int f(Object obj) {
        return ((flr) obj).a();
    }

    @Override // flm.flq
    final /* synthetic */ int e(Object obj) {
        flr flrVar = (flr) obj;
        int iD = flrVar.e;
        if (iD == -1) {
            iD = 0;
            for (int i = 0; i < flrVar.b; i++) {
                iD += fhp.d(flrVar.c[i] >>> 3, (fgy) flrVar.d[i]);
            }
            flrVar.e = iD;
        }
        return iD;
    }

    @Override // flm.flq
    final /* synthetic */ Object c(Object obj, Object obj2) {
        flr flrVar = (flr) obj;
        flr flrVar2 = (flr) obj2;
        if (!flrVar2.equals(flr.a)) {
            return flr.a(flrVar, flrVar2);
        }
        return flrVar;
    }

    @Override // flm.flq
    final /* synthetic */ void b(Object obj, fmp fmpVar) {
        flr flrVar = (flr) obj;
        if (fmpVar.a() == dp.aC) {
            for (int i = flrVar.b - 1; i >= 0; i--) {
                fmpVar.a(flrVar.c[i] >>> 3, flrVar.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < flrVar.b; i2++) {
            fmpVar.a(flrVar.c[i2] >>> 3, flrVar.d[i2]);
        }
    }

    @Override // flm.flq
    final /* synthetic */ void a(Object obj, fmp fmpVar) {
        ((flr) obj).a(fmpVar);
    }

    @Override // flm.flq
    final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (flr) obj2);
    }

    @Override // flm.flq
    final /* synthetic */ Object c(Object obj) {
        flr flrVar = ((fin) obj).E;
        if (flrVar == flr.a) {
            flr flrVar2 = new flr();
            a(obj, flrVar2);
            return flrVar2;
        }
        return flrVar;
    }

    @Override // flm.flq
    final /* synthetic */ Object b(Object obj) {
        return ((fin) obj).E;
    }

    @Override // flm.flq
    final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (flr) obj2);
    }

    @Override // flm.flq
    final /* synthetic */ Object a(Object obj) {
        flr flrVar = (flr) obj;
        flrVar.f = false;
        return flrVar;
    }

    @Override // flm.flq
    final /* synthetic */ Object b() {
        return new flr();
    }

    @Override // flm.flq
    final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((flr) obj).a(3 | (i << 3), (flr) obj2);
    }

    @Override // flm.flq
    final /* synthetic */ void a(Object obj, int i, fgy fgyVar) {
        ((flr) obj).a(2 | (i << 3), fgyVar);
    }

    @Override // flm.flq
    final /* synthetic */ void b(Object obj, int i, long j) {
        ((flr) obj).a(1 | (i << 3), Long.valueOf(j));
    }

    @Override // flm.flq
    final /* synthetic */ void a(Object obj, int i, int i2) {
        ((flr) obj).a(5 | (i << 3), Integer.valueOf(i2));
    }

    @Override // flm.flq
    final /* synthetic */ void a(Object obj, int i, long j) {
        ((flr) obj).a(0 | (i << 3), Long.valueOf(j));
    }
}
