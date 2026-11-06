package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewr extends fin implements fkg {
    public static final ewr d = new ewr();
    private static volatile fko e;
    public int a;
    public int b = 0;
    public Object c;

    private ewr() {
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
                return new fks(d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "a", fcu.class, etc.class, feg.class, fba.class});
            case 3:
                return new ewr();
            case 4:
                return new ews();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (ewr.class) {
                        fipVar = e;
                        if (fipVar == null) {
                            fipVar = new fip(d);
                            e = fipVar;
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
        fin.G.put(ewr.class, d);
    }
}
