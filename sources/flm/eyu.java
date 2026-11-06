package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyu extends fin implements fkg {
    public static final eyu d = new eyu();
    private static volatile fko e;
    public int a;
    public fjf b = fkr.b;
    public boolean c;

    private eyu() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0001\u0000\u0002\u001b\u0004\u0007\u0002", new Object[]{"a", "b", exs.class, "c"});
            case 3:
                return new eyu();
            case 4:
                return new eyv();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (eyu.class) {
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
        fin.G.put(eyu.class, d);
    }
}
