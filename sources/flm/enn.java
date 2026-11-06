package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enn extends fin implements fkg {
    public static final enn i = new enn();
    private static volatile fko j;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    private enn() {
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
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006", new Object[]{"a", "b", "c", eoo.b(), "d", eot.b(), "e", eoo.b(), "f", "g", "h"});
            case 3:
                return new enn();
            case 4:
                return new eno();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (enn.class) {
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
        fin.G.put(enn.class, i);
    }
}
