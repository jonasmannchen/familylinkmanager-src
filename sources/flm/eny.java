package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eny extends fin implements fkg {
    public static final eny e = new eny();
    private static volatile fko f;
    public int a;
    public int b;
    public int c;
    public int d;

    private eny() {
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
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002", new Object[]{"a", "b", eoz.b(), "c", eor.b(), "d"});
            case 3:
                return new eny();
            case 4:
                return new enz();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (eny.class) {
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
        fin.G.put(eny.class, e);
    }
}
