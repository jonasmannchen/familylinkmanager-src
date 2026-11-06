package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fce extends fin implements fkg {
    public static final fce d = new fce();
    private static volatile fko e;
    public int a;
    public int b;
    public fjf c = fkr.b;

    private fce() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\f\u0000\u0003\u001a", new Object[]{"a", "b", eto.b(), "c"});
            case 3:
                return new fce();
            case 4:
                return new fcf();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (fce.class) {
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
        fin.G.put(fce.class, d);
    }
}
