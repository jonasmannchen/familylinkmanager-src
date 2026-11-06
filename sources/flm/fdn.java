package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdn extends fin implements fkg {
    public static final fdn h = new fdn();
    private static volatile fko i;
    public int a;
    public eux b;
    public ewn e;
    public int f;
    public String c = "";
    public String d = "";
    public fjf g = fkr.b;

    private fdn() {
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
                return new fks(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0001\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\t\u0004\u0006\f\u0005\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", ewl.b(), "g", ewx.class});
            case 3:
                return new fdn();
            case 4:
                return new fdo();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (fdn.class) {
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
        fin.G.put(fdn.class, h);
    }
}
