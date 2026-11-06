package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elp extends fin implements fkg {
    public static final elp i = new elp();
    private static volatile fko j;
    public int a;
    public Object c;
    public int e;
    public long f;
    public long g;
    public long h;
    public int b = 0;
    public String d = "";

    private elp() {
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
                return new fks(i, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0004\u0003\u0002\u0005\u0004<\u0000\u0005<\u0000\u0006\f\u0003\u0007\u0002\u0006", new Object[]{"c", "b", "a", "d", "f", "g", emj.class, elb.class, "e", elr.b(), "h"});
            case 3:
                return new elp();
            case 4:
                return new elq();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (elp.class) {
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
        fin.G.put(elp.class, i);
    }
}
