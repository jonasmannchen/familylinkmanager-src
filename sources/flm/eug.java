package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eug extends fin implements fkg {
    public static final eug d = new eug();
    private static volatile fko f;
    public int a;
    private byte e = 2;
    public String b = "";
    public fjf c = fkr.b;

    private eug() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\b\u0001\u0003Л", new Object[]{"a", "b", "c", eta.class});
            case 3:
                return new eug();
            case 4:
                return new euh();
            case 5:
                return d;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (eug.class) {
                        fipVar = f;
                        if (fipVar == null) {
                            fipVar = new fip(d);
                            f = fipVar;
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
        fin.G.put(eug.class, d);
    }
}
