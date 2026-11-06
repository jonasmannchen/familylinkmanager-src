package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gth extends fin implements fkg {
    public static final gth e = new gth();
    private static volatile fko f;
    public int a;
    public int b;
    public int c = 1;
    public gtj d;

    private gth() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\t\u0002", new Object[]{"a", "b", gtl.b(), "c", "d"});
            case 3:
                return new gth();
            case 4:
                return new gti();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (gth.class) {
                        fipVar = f;
                        if (fipVar == null) {
                            fipVar = new fip(e);
                            f = fipVar;
                        }
                        break;
                    }
                    return fipVar;
                }
                return fkoVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        fin.G.put(gth.class, e);
    }
}
