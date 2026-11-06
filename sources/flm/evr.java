package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evr extends fin implements fkg {
    public static final evr f = new evr();
    private static volatile fko g;
    public int a;
    public String b = "";
    public String c = "";
    public fjf d = fkr.b;
    public String e = "";

    private evr() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0002\u0002\u001b\u0003\b\u0000\u0004\b\u0001", new Object[]{"a", "e", "d", fec.class, "b", "c"});
            case 3:
                return new evr();
            case 4:
                return new evs();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (evr.class) {
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
        fin.G.put(evr.class, f);
    }
}
