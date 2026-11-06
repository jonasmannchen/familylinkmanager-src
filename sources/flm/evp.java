package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evp extends fin implements fkg {
    public static final evp d = new evp();
    private static volatile fko e;
    public int a;
    public fec b;
    public fjf c = fkr.b;

    private evp() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", evr.class});
            case 3:
                return new evp();
            case 4:
                return new evq();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (evp.class) {
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
        fin.G.put(evp.class, d);
    }
}
