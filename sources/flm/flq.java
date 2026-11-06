package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class flq {
    flq() {
    }

    abstract Object a(Object obj);

    abstract void a(Object obj, int i, int i2);

    abstract void a(Object obj, int i, long j);

    abstract void a(Object obj, int i, fgy fgyVar);

    abstract void a(Object obj, int i, Object obj2);

    abstract void a(Object obj, fmp fmpVar);

    abstract void a(Object obj, Object obj2);

    abstract boolean a();

    abstract Object b();

    abstract Object b(Object obj);

    abstract void b(Object obj, int i, long j);

    abstract void b(Object obj, fmp fmpVar);

    abstract void b(Object obj, Object obj2);

    abstract Object c(Object obj);

    abstract Object c(Object obj, Object obj2);

    abstract void d(Object obj);

    abstract int e(Object obj);

    abstract int f(Object obj);

    final boolean a(Object obj, fkt fktVar) throws fjg {
        int iB = fktVar.b();
        int i = iB >>> 3;
        switch (iB & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                a(obj, i, fktVar.g());
                return true;
            case 1:
                b(obj, i, fktVar.i());
                return true;
            case 2:
                a(obj, i, fktVar.n());
                return true;
            case 3:
                Object objB = b();
                int i2 = 4 | (i << 3);
                while (fktVar.a() != Integer.MAX_VALUE && a(objB, fktVar)) {
                }
                if (i2 != fktVar.b()) {
                    throw fjg.e();
                }
                a(obj, i, a(objB));
                return true;
            case 4:
                return false;
            case 5:
                a(obj, i, fktVar.j());
                return true;
            default:
                throw fjg.f();
        }
    }
}
