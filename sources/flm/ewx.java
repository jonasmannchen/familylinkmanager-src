package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewx extends fin implements fkg {
    public static final ewx d = new ewx();
    private static volatile fko e;
    public int a;
    public int b = 0;
    public Object c;

    private ewx() {
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
                return new fks(d, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"c", "b", "a", esw.class, exw.class, fdz.class, evb.class, eyk.class, fai.class, fdr.class, ewb.class, fdg.class, fdj.class, fdv.class, exu.class, fdt.class, ffk.class, eza.class});
            case 3:
                return new ewx();
            case 4:
                return new ewy();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (ewx.class) {
                        fipVar = e;
                        if (fipVar == null) {
                            fipVar = new fip(d);
                            e = fipVar;
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
        fin.G.put(ewx.class, d);
    }
}
