package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gph extends fin implements fkg {
    public static final gph b = new gph();
    private static volatile fko c;
    public fjf a = fkr.b;

    private gph() {
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
                return new fks(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", gpf.class});
            case 3:
                return new gph();
            case 4:
                return new gpi();
            case 5:
                return b;
            case 6:
                fko fkoVar = c;
                if (fkoVar == null) {
                    synchronized (gph.class) {
                        fipVar = c;
                        if (fipVar == null) {
                            fipVar = new fip(b);
                            c = fipVar;
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
        fin.G.put(gph.class, b);
    }
}
