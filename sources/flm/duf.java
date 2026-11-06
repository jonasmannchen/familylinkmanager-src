package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duf extends fin implements fkg {
    public static final duf g = new duf();
    private static volatile fko h;
    public int a;
    public long b;
    public long c;
    public fjf d = fkr.b;
    public long e;
    public dsm f;

    private duf() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001\u0005\u0000\u0002\u0005\u0001\u0003\u001b\u0004\u0002\u0002\n\t\u0003", new Object[]{"a", "b", "c", "d", dtf.class, "e", "f"});
            case 3:
                return new duf();
            case 4:
                return new dug();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (duf.class) {
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
        fin.G.put(duf.class, g);
    }
}
