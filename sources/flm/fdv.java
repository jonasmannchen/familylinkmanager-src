package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdv extends fin implements fkg {
    public static final fdv f = new fdv();
    private static volatile fko g;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    private fdv() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\b\u0001\u0003\u0007\u0003\u0004\u0004\u0002\u0005\u0004\u0000", new Object[]{"a", "c", "e", "d", "b"});
            case 3:
                return new fdv();
            case 4:
                return new fdw();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (fdv.class) {
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
        fin.G.put(fdv.class, f);
    }
}
