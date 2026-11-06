package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gpy extends fir implements fkg {
    public static final gpy d = new gpy();
    private static volatile fko g;
    public int a;
    public gpw b;
    public int c;
    private byte e = 2;

    private gpy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.e);
            case 1:
                this.e = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0000\u0003\f\u0002", new Object[]{"a", "b", "c", gqa.b()});
            case 3:
                return new gpy();
            case 4:
                return new gpz();
            case 5:
                return d;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (gpy.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(d);
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
        fin.G.put(gpy.class, d);
    }
}
