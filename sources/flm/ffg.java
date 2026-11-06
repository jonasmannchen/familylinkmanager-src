package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffg extends fin implements fkg {
    public static final ffg f = new ffg();
    private static volatile fko g;
    public int a;
    public int b;
    public long c;
    public fjf d = fkr.b;
    public long e;

    private ffg() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b\u0003\u0002\u0001\u0004\u0002\u0002", new Object[]{"a", "b", feu.b(), "d", ffi.class, "c", "e"});
            case 3:
                return new ffg();
            case 4:
                return new ffh();
            case 5:
                return f;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (ffg.class) {
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
        fin.G.put(ffg.class, f);
    }
}
