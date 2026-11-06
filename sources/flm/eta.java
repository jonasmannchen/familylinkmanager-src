package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eta extends fin implements fkg {
    public static final eta f = new eta();
    private static volatile fko h;
    public int a;
    public ete c;
    public etu d;
    public ets e;
    private byte g = 2;
    public String b = "";

    private eta() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.g);
            case 1:
                this.g = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\t\u0001\u0003\t\u0002\bЉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new eta();
            case 4:
                return new etb();
            case 5:
                return f;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (eta.class) {
                        fipVar = h;
                        if (fipVar == null) {
                            fipVar = new fip(f);
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
        fin.G.put(eta.class, f);
    }
}
