package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exj extends fin implements fkg {
    public static final exj g;
    private static volatile fko h;
    public int a;
    public String b = "";
    public int c;
    public exm d;
    public fam e;
    public fak f;

    private exj() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001\b\u0000\u0003\f\u0002\u0004\t\u0003\b\t\u0006\n\t\b", new Object[]{"a", "b", "c", exq.b(), "d", "e", "f"});
            case 3:
                return new exj();
            case 4:
                return new exl();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (exj.class) {
                        fipVar = h;
                        if (fipVar == null) {
                            fipVar = new fip(g);
                            h = fipVar;
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
        new exk();
        g = new exj();
        fin.G.put(exj.class, g);
    }
}
