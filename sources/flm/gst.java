package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gst extends fin implements fkg {
    public static final gst k = new gst();
    private static volatile fko l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public fjf j = fkr.b;

    private gst() {
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
                return new fks(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", gsv.class});
            case 3:
                return new gst();
            case 4:
                return new gsu();
            case 5:
                return k;
            case 6:
                fko fkoVar = l;
                if (fkoVar == null) {
                    synchronized (gst.class) {
                        fipVar = l;
                        if (fipVar == null) {
                            fipVar = new fip(k);
                            l = fipVar;
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
        fin.G.put(gst.class, k);
    }
}
