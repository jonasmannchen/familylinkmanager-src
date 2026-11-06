package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exm extends fin implements fkg {
    public static final exm h = new exm();
    private static volatile fko i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;

    private exm() {
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
                return new fks(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0004\u0004\b\u0006\u0006\b\u0002\u0007\f\u0007\t\b\u0005", new Object[]{"a", "b", "d", "f", "c", "g", exo.b(), "e"});
            case 3:
                return new exm();
            case 4:
                return new exn();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (exm.class) {
                        fipVar = i;
                        if (fipVar == null) {
                            fipVar = new fip(h);
                            i = fipVar;
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
        fin.G.put(exm.class, h);
    }
}
