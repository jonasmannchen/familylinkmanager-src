package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqk extends fin implements fkg {
    public static final gqk d = new gqk();
    private static volatile fko e;
    public int a;
    public int b;
    public fjb c = fiu.b;

    private gqk() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002'", new Object[]{"a", "b", "c"});
            case 3:
                return new gqk();
            case 4:
                return new gql();
            case 5:
                return d;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (gqk.class) {
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
        fin.G.put(gqk.class, d);
    }
}
