package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcy extends fir implements fkg {
    public static final fcy e = new fcy();
    private static volatile fko h;
    public int a;
    public fda b;
    public fde c;
    private byte g = 2;
    public String d = "";

    private fcy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.g);
            case 1:
                this.g = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new fcy();
            case 4:
                return new fcz();
            case 5:
                return e;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (fcy.class) {
                        fipVar = h;
                        if (fipVar == null) {
                            fipVar = new fip(e);
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
        fin.G.put(fcy.class, e);
    }
}
