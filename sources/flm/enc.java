package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enc extends fin implements fkg {
    public static final enc g = new enc();
    private static volatile fko h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public fjf f = fkr.b;

    private enc() {
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
                return new fks(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0005\u0007\u0004\u0006\u001a", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new enc();
            case 4:
                return new end();
            case 5:
                return g;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (enc.class) {
                        fipVar = h;
                        if (fipVar == null) {
                            fipVar = new fip(g);
                            h = fipVar;
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
        fin.G.put(enc.class, g);
    }
}
