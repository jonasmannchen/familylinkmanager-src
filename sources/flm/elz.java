package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elz extends fin implements fkg {
    public static final elz e = new elz();
    private static volatile fko f;
    public int a;
    public int b = 0;
    public Object c;
    public emb d;

    private elz() {
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
                return new fks(e, "\u0001\u0006\u0001\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\t\u0006\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "a", elu.class, enk.class, elw.class, "d", emh.class, elp.class});
            case 3:
                return new elz();
            case 4:
                return new ema();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (elz.class) {
                        fipVar = f;
                        if (fipVar == null) {
                            fipVar = new fip(e);
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
        fin.G.put(elz.class, e);
    }
}
