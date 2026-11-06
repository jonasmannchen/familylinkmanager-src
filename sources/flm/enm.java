package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enm extends fin implements fkg {
    public static final enm h = new enm();
    private static volatile fko i;
    public int a;
    public long b;
    public ens c;
    public enn d;
    public enn e;
    public long f;
    public long g;

    private enm() {
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
                return new fks(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new enm();
            case 4:
                return new enp();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (enm.class) {
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
        fin.G.put(enm.class, h);
    }
}
