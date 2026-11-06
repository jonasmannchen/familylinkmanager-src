package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffi extends fin implements fkg {
    public static final ffi i = new ffi();
    private static volatile fko j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public ffa f;
    public ffa g;
    public long h;

    private ffi() {
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
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\f\u0002\u0004\t\u0004\u0005\t\u0005\u0006\u0002\u0003\u0007\u0002\u0006", new Object[]{"a", "b", "c", exf.b(), "d", feu.b(), "f", "g", "e", "h"});
            case 3:
                return new ffi();
            case 4:
                return new ffj();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (ffi.class) {
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
        fin.G.put(ffi.class, i);
    }
}
