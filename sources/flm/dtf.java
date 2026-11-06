package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtf extends fin implements fkg {
    public static final dtf i = new dtf();
    private static volatile fko j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;

    private dtf() {
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
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0007\u0006\u0007\u0004\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new dtf();
            case 4:
                return new dtg();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (dtf.class) {
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
        fin.G.put(dtf.class, i);
    }
}
