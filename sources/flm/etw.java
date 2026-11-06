package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etw extends fin implements fkg {
    public static final etw x = new etw();
    private static volatile fko y;
    public int a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public int f;
    public ffe g;
    public int h;
    public ffe i;
    public long j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public ffi p;
    public int q;
    public ffi r;
    public long s;
    public ffi t;
    public int u;
    public fei v;
    public eua w;

    private etw() {
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
                return new fks(x, "\u0001\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0000\u0000\u0001\t\u0014\u0002\t\u000e\u0003\t\u0005\u0005\t\u0010\u0006\t\u0007\u0007\u000b\t\b\u0007\u0000\t\f\u0001\n\u0002\u0002\u000b\u0002\u0003\f\f\u0004\r\t\u0016\u000e\u0002\r\u0010\f\u000f\u0011\f\u0006\u0012\u0002\u0011\u0013\u0002\b\u0014\u0003\n\u0015\u0003\u000b\u0016\u0002\f\u0017\t\u0012\u0018\f\u0013", new Object[]{"a", "v", "p", "g", "r", "i", "k", "b", "c", esu.b(), "d", "e", "f", esu.b(), "w", "o", "q", ety.b(), "h", ety.b(), "s", "j", "l", "m", "n", "t", "u", eue.b()});
            case 3:
                return new etw();
            case 4:
                return new etx();
            case 5:
                return x;
            case 6:
                fko fkoVar = y;
                if (fkoVar == null) {
                    synchronized (etw.class) {
                        fipVar = y;
                        if (fipVar == null) {
                            fipVar = new fip(x);
                            y = fipVar;
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
        fin.G.put(etw.class, x);
    }
}
