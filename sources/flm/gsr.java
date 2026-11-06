package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsr extends fin implements fkg {
    public static final gsr g = new gsr();
    private static volatile fko h;
    public int a;
    public int c;
    public int d;
    public int f;
    public String b = "";
    public String e = "";

    private gsr() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new gsr();
            case 4:
                return new gss();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (gsr.class) {
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
        fin.G.put(gsr.class, g);
    }
}
