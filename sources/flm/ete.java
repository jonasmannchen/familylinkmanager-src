package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ete extends fin implements fkg {
    public static final ete t;
    private static volatile fko u;
    public int a;
    public float i;
    public long j;
    public long k;
    public ewz m;
    public int o;
    public int r;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public fjf l = fkr.b;
    public fjf n = fkr.b;
    public String p = "";
    public fjf q = fkr.b;
    public fjf s = fkr.b;

    private ete() {
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
                return new fks(t, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0004\u0000\u0001\b\u0001\u0002\b\u0002\u0003\b\u0003\u0004\b\u0000\u0007\b\u0006\t\b\u0007\n\u0001\t\f\u0002\r\u000e\t\u000f\u000f\b\b\u0010\u001b\u0011\u001a\u0012\f\u0010\u0013\u0002\n\u0014\b\u0011\u0015\u001a\u0016\f\u0013\u001b\u001b", new Object[]{"a", "c", "d", "e", "b", "f", "g", "i", "k", "m", "h", "l", ezh.class, "n", "o", etj.b(), "j", "p", "q", "r", etg.b(), "s", etm.class});
            case 3:
                return new ete();
            case 4:
                return new eti();
            case 5:
                return t;
            case 6:
                fko fkoVar = u;
                if (fkoVar == null) {
                    synchronized (ete.class) {
                        fipVar = u;
                        if (fipVar == null) {
                            fipVar = new fip(t);
                            u = fipVar;
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
        new etf();
        t = new ete();
        fin.G.put(ete.class, t);
    }
}
