package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqm extends fin implements fkg {
    public static final gqm f = new gqm();
    private static volatile fko g;
    public int a;
    public int b;
    public String c = "";
    public fjb d = fiu.b;
    public int e;

    private gqm() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0005'\u0006\u0004\u0002", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new gqm();
            case 4:
                return new gqn();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (gqm.class) {
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
        fin.G.put(gqm.class, f);
    }
}
