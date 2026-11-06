package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqu extends fin implements fkg {
    public static final gqu h = new gqu();
    private static volatile fko i;
    public int a;
    public fjf b = fkr.b;
    public fjf c = fkr.b;
    public fjf d = fkr.b;
    public fjf e = fkr.b;
    public fjf f = fkr.b;
    public gqq g;

    private gqu() {
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
                return new fks(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b\u0007\t\u0001", new Object[]{"a", "b", gqm.class, "c", gqo.class, "d", gqk.class, "e", gqw.class, "f", gra.class, "g"});
            case 3:
                return new gqu();
            case 4:
                return new gqv();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (gqu.class) {
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
        fin.G.put(gqu.class, h);
    }
}
