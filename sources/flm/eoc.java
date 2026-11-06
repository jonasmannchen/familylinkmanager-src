package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoc extends fin implements fkg {
    public static final eoc f = new eoc();
    private static volatile fko g;
    public int a;
    public int b;
    public int c;
    public enu d;
    public enu e;

    private eoc() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"a", "b", eoz.b(), "c", eor.b(), "d", "e"});
            case 3:
                return new eoc();
            case 4:
                return new eod();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (eoc.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(f);
                            g = fipVar;
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
        fin.G.put(eoc.class, f);
    }
}
