package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fei extends fin implements fkg {
    public static final fei h = new fei();
    private static volatile fko i;
    public int a;
    public Object c;
    public long d;
    public int e;
    public int g;
    public int b = 0;
    public String f = "";

    private fei() {
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
                return new fks(h, "\u0001\u0007\u0001\u0001\u0002\n\u0007\u0000\u0000\u0000\u0002\u0002\u0001\u0003\f\u0003\u0005\b\u0005\u0006\f\u0006\u0007<\u0000\b<\u0000\n<\u0000", new Object[]{"c", "b", "a", "d", "e", fej.b(), "f", "g", fem.b(), feq.class, feo.class, fes.class});
            case 3:
                return new fei();
            case 4:
                return new fel();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (fei.class) {
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
        fin.G.put(fei.class, h);
    }
}
