package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqd extends fin implements fkg {
    public static final gqd j = new gqd();
    private static volatile fko k;
    public int a;
    public int d;
    public int e;
    public int f;
    public gqh i;
    public String b = "";
    public String c = "";
    public String g = "";
    public fje h = fjs.b;

    private gqd() {
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
                return new fks(j, "\u0001\b\u0000\u0001\u0002\u0019\b\u0000\u0001\u0000\u0002\b\u0001\u0003\u0004\u0003\u0006\u000b\u0006\u0007\u000b\u0007\u0011\b\u0012\u0015\u0017\u0016\t\u0015\u0019\b\u0002", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "c"});
            case 3:
                return new gqd();
            case 4:
                return new gqe();
            case 5:
                return j;
            case 6:
                fko fkoVar = k;
                if (fkoVar == null) {
                    synchronized (gqd.class) {
                        fipVar = k;
                        if (fipVar == null) {
                            fipVar = new fip(j);
                            k = fipVar;
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
        fin.G.put(gqd.class, j);
    }
}
