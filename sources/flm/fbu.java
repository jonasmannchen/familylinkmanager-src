package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbu extends fin implements fkg {
    public static final fbu c = new fbu();
    private static volatile fko d;
    public int a;
    public fag b;

    private fbu() {
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
                return new fks(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t\u0001", new Object[]{"a", "b"});
            case 3:
                return new fbu();
            case 4:
                return new fbv();
            case 5:
                return c;
            case 6:
                fko fkoVar = d;
                if (fkoVar == null) {
                    synchronized (fbu.class) {
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
        fin.G.put(fbu.class, c);
    }
}
