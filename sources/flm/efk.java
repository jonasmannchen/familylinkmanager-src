package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efk extends fin implements fkg {
    public static final efk i = new efk();
    private static volatile fko k;
    public int a;
    public efh b;
    public int d;
    public efq h;
    private byte j = 2;
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";

    private efk() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i2, Object obj) {
        fko fipVar;
        switch (i2 - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.j);
            case 1:
                this.j = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ԉ\u0000\u0002Ԉ\u0001\u0003Ԅ\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0006\bЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new efk();
            case 4:
                return new efl();
            case 5:
                return i;
            case 6:
                fko fkoVar = k;
                if (fkoVar == null) {
                    synchronized (efk.class) {
                        fipVar = k;
                        if (fipVar == null) {
                            fipVar = new fip(i);
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
        fin.G.put(efk.class, i);
    }
}
