package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fee extends fin implements fkg {
    public static final fee f = new fee();
    private static volatile fko g;
    public int a;
    public ffg b;
    public ffc c;
    public fey d;
    public fjf e = fkr.b;

    private fee() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\t\u0002", new Object[]{"a", "b", "c", "e", fei.class, "d"});
            case 3:
                return new fee();
            case 4:
                return new fef();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (fee.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(f);
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
        fin.G.put(fee.class, f);
    }
}
