package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgn extends fin implements fkg {
    public static final bgn i = new bgn();
    private static volatile fko j;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public fjb f = fiu.b;
    public fjb g = fiu.b;
    public fjb h = fiu.b;

    private bgn() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i2, Object obj) {
        fko fipVar;
        switch (i2 - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0004\u0003\u0005)\u0006'\u0007'", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new bgn();
            case 4:
                return new bgo();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (bgn.class) {
                        fipVar = j;
                        if (fipVar == null) {
                            fipVar = new fip(i);
                            j = fipVar;
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
        fin.G.put(bgn.class, i);
    }
}
