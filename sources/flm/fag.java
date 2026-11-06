package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fag extends fin implements fkg {
    public static final fag l = new fag();
    private static volatile fko m;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    private fag() {
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
                return new fks(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new fag();
            case 4:
                return new fah();
            case 5:
                return l;
            case 6:
                fko fkoVar = m;
                if (fkoVar == null) {
                    synchronized (fag.class) {
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
        fin.G.put(fag.class, l);
    }
}
