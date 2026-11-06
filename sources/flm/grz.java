package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grz extends fin implements fkg {
    public static final grz i = new grz();
    private static volatile fko j;
    public int a;
    public boolean b;
    public grq c;
    public int f;
    public long g;
    public String d = "";
    public String e = "";
    public String h = "";

    private grz() {
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
                return new fks(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004\u0006\u0005\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", gsb.b(), "g", "h"});
            case 3:
                return new grz();
            case 4:
                return new gsa();
            case 5:
                return i;
            case 6:
                fko fkoVar = j;
                if (fkoVar == null) {
                    synchronized (grz.class) {
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
        fin.G.put(grz.class, i);
    }
}
