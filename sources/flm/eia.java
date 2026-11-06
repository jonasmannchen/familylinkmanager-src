package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eia extends fin implements fkg {
    public static final eia d = new eia();
    private static volatile fko e;
    public int a;
    public String b = "";
    public int c;

    private eia() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", ehy.b()});
            case 3:
                return new eia();
            case 4:
                return new eib();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (eia.class) {
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
        fin.G.put(eia.class, d);
    }
}
