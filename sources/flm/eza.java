package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eza extends fin implements fkg {
    public static final eza l;
    private static volatile fko m;
    public int a;
    public int e;
    public int g;
    public boolean i;
    public long k;
    public String b = "";
    public String c = "";
    public fjf d = fkr.b;
    public String f = "";
    public fjb h = fiu.b;
    public fjf j = fkr.b;

    private eza() {
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
                return new fks(l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0003\u0000\u0001\b\u0000\u0006\u001c\u0007\u001e\b\u0002\u0006\t\b\u0001\n\u001b\u000b\b\u0003\f\u0004\u0004\r\f\u0002\u000e\u0007\u0005", new Object[]{"a", "b", "d", "h", ezf.b(), "k", "c", "j", ezc.class, "f", "g", "e", ewh.b(), "i"});
            case 3:
                return new eza();
            case 4:
                return new eze();
            case 5:
                return l;
            case 6:
                fko fkoVar = m;
                if (fkoVar == null) {
                    synchronized (eza.class) {
                        fipVar = m;
                        if (fipVar == null) {
                            fipVar = new fip(l);
                            m = fipVar;
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
        new ezb();
        l = new eza();
        fin.G.put(eza.class, l);
    }
}
