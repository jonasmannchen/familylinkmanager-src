package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fde extends fin implements fkg {
    public static final fde c = new fde();
    private static volatile fko d;
    public int a;
    public fgy b = fgy.a;

    private fde() {
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
                return new fks(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new fde();
            case 4:
                return new fdf();
            case 5:
                return c;
            case 6:
                fko fkoVar = d;
                if (fkoVar == null) {
                    synchronized (fde.class) {
                        fipVar = d;
                        if (fipVar == null) {
                            fipVar = new fip(c);
                            d = fipVar;
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
        fin.G.put(fde.class, c);
    }
}
