package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efm extends fin implements fkg {
    public static final efm e = new efm();
    private static volatile fko g;
    public int a;
    private byte f = 2;
    public String b = "";
    public String c = "";
    public fjf d = fkr.b;

    private efm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.f);
            case 1:
                this.f = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Ԉ\u0000\u0002\b\u0001\u0004б", new Object[]{"a", "b", "c", "d", efo.class});
            case 3:
                return new efm();
            case 4:
                return new efn();
            case 5:
                return e;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (efm.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(e);
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
        fin.G.put(efm.class, e);
    }
}
