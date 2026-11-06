package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exu extends fin implements fkg {
    public static final exu b = new exu();
    private static volatile fko c;
    public fjf a = fkr.b;

    private exu() {
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
                return new fks(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new exu();
            case 4:
                return new exv();
            case 5:
                return b;
            case 6:
                fko fkoVar = c;
                if (fkoVar == null) {
                    synchronized (exu.class) {
                        fipVar = c;
                        if (fipVar == null) {
                            fipVar = new fip(b);
                            c = fipVar;
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
        fin.G.put(exu.class, b);
    }
}
