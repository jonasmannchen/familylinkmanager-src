package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewz extends fin implements fkg {
    public static final ewz g = new ewz();
    private static volatile fko h;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    private ewz() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\b\u0003\u0006\b\u0006\u0007\b\u0007", new Object[]{"a", "b", exb.b(), "c", "d", "e", "f"});
            case 3:
                return new ewz();
            case 4:
                return new exa();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (ewz.class) {
                        fipVar = h;
                        if (fipVar == null) {
                            fipVar = new fip(g);
                            h = fipVar;
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
        fin.G.put(ewz.class, g);
    }
}
