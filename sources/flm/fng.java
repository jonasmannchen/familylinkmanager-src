package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fng extends fir implements fkg {
    public static final fng k = new fng();
    private static volatile fko m;
    public int a;
    public long b;
    public long c;
    public int e;
    public boolean j;
    private byte l = 2;
    public String d = "";
    public fgy g = fgy.a;
    public long h = 180000;
    public fgy i = fgy.a;

    private fng() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.l);
            case 1:
                this.l = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(k, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0003\u0006\n\n\u000b\u0004\u0004\u000f\u0010\u000f\u0011\u0002\u0001\u0012\n\u0011\u0019\u0007\u0016", new Object[]{"a", "b", "d", "g", "e", "h", "c", "i", "j"});
            case 3:
                return new fng();
            case 4:
                return new fnh();
            case 5:
                return k;
            case 6:
                fko fkoVar = m;
                if (fkoVar == null) {
                    synchronized (fng.class) {
                        fipVar = m;
                        if (fipVar == null) {
                            fipVar = new fip(k);
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
        fin.G.put(fng.class, k);
    }
}
