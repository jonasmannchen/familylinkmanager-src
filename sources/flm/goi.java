package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class goi extends fin implements fkg {
    public static final goi k = new goi();
    private static volatile fko l;
    public int a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public gpr f;
    public int g;
    public long h;
    public gpa i;
    public long j;

    private goi() {
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
                return new fks(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0005\u0003\u0002\u0006\u0006\t\u0007\u0007\u0002\b\b\u0005\u0001\t\b\u0002\n\b\u0003\u000b\t\u0004", new Object[]{"a", "b", gok.b(), "g", gok.b(), "h", "i", "j", "c", "d", "e", "f"});
            case 3:
                return new goi();
            case 4:
                return new goj();
            case 5:
                return k;
            case 6:
                fko fkoVar = l;
                if (fkoVar == null) {
                    synchronized (goi.class) {
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
        fin.G.put(goi.class, k);
    }
}
