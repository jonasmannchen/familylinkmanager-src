package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grj extends fin implements fkg {
    public static final grj l = new grj();
    private static volatile fko m;
    public int a;
    public long c;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public long j;
    public int k;
    public String b = "";
    public String d = "";

    private grj() {
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
                return new fks(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0005\u0003\u0003\u0005\u0004\u0004\u0002\u0005\u0005\u0002\u0006\u0006\u0002\b\u0007\f\t\b\u0005\u0001\t\b\u0002\n\u0004\u0007", new Object[]{"a", "b", "e", "f", "g", "h", "j", "k", grl.b(), "c", "d", "i"});
            case 3:
                return new grj();
            case 4:
                return new grk();
            case 5:
                return l;
            case 6:
                fko fkoVar = m;
                if (fkoVar == null) {
                    synchronized (grj.class) {
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
        fin.G.put(grj.class, l);
    }
}
