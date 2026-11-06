package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exw extends fin implements fkg {
    public static final exw f = new exw();
    private static volatile fko g;
    public int a;
    public String b = "";
    public int c;
    public long d;
    public int e;

    private exw() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0002\u0003\u0004\u0003\u0004\u0004\u0001", new Object[]{"a", "b", "d", "e", "c"});
            case 3:
                return new exw();
            case 4:
                return new exx();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (exw.class) {
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
        fin.G.put(exw.class, f);
    }
}
