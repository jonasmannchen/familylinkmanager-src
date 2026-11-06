package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffc extends fin implements fkg {
    public static final ffc g = new ffc();
    private static volatile fko h;
    public int a;
    public int b;
    public long c;
    public ffa d;
    public fjf e = fkr.b;
    public long f;

    private ffc() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\t\u0002\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0003", new Object[]{"a", "b", feu.b(), "d", "e", ffe.class, "c", "f"});
            case 3:
                return new ffc();
            case 4:
                return new ffd();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (ffc.class) {
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
        fin.G.put(ffc.class, g);
    }
}
