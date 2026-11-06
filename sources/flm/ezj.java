package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezj extends fin implements fkg {
    public static final ezj f = new ezj();
    private static volatile fko g;
    public int a;
    public eux b;
    public String c = "";
    public String d = "";
    public String e = "";

    private ezj() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\b\u0002\u0003\b\u0003\u0004\t\u0001\u0005\b\u0004", new Object[]{"a", "c", "d", "b", "e"});
            case 3:
                return new ezj();
            case 4:
                return new ezk();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (ezj.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(f);
                            g = fipVar;
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
        fin.G.put(ezj.class, f);
    }
}
