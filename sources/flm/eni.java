package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eni extends fin implements fkg {
    public static final eni d = new eni();
    private static volatile fko e;
    public int a;
    public fjf b = fkr.b;
    public fjf c = fkr.b;

    private eni() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0002\u0000\u0004\u001b\u0005\u001b", new Object[]{"a", "b", eng.class, "c", eng.class});
            case 3:
                return new eni();
            case 4:
                return new enj();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (eni.class) {
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
        fin.G.put(eni.class, d);
    }
}
