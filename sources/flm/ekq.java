package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekq extends fin implements fkg {
    public static final ekq a = new ekq();
    private static volatile fko b;

    private ekq() {
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
                return new fks(a, "\u0001\u0000", null);
            case 3:
                return new ekq();
            case 4:
                return new eks();
            case 5:
                return a;
            case 6:
                fko fkoVar = b;
                if (fkoVar == null) {
                    synchronized (ekq.class) {
                        fipVar = b;
                        if (fipVar == null) {
                            fipVar = new fip(a);
                            b = fipVar;
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
        fin.G.put(ekq.class, a);
    }
}
