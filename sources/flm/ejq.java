package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejq extends fin implements fkg {
    public static final ejq e = new ejq();
    private static volatile fko f;
    public int a;
    public fjf b = fkr.b;
    public ekc c;
    public eko d;

    private ejq() {
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
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\t\u0001", new Object[]{"a", "b", eju.class, "c", "d"});
            case 3:
                return new ejq();
            case 4:
                return new ejr();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (ejq.class) {
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
        fin.G.put(ejq.class, e);
    }
}
