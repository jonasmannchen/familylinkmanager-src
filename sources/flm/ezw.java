package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezw extends fin implements fkg {
    public static final ezw e = new ezw();
    private static volatile fko f;
    public int a;
    public ewv c;
    public String b = "";
    public fjf d = fkr.b;

    private ezw() {
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
                return new fks(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u001a", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ezw();
            case 4:
                return new ezx();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (ezw.class) {
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
        fin.G.put(ezw.class, e);
    }
}
