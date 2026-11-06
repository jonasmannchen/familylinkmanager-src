package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eit extends fin implements fkg {
    public static final eit f = new eit();
    private static volatile fko h;
    public int a;
    public eip b;
    public efk c;
    private byte g = 2;
    public fgy d = fgy.a;
    public fjf e = fkr.b;

    private eit() {
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
                return new fks(f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0001\u0001\u0002\t\u0000\u0003Љ\u0001\b\n\u0003\t\u001b", new Object[]{"a", "b", "c", "d", "e", ejb.class});
            case 3:
                return new eit();
            case 4:
                return new eiu();
            case 5:
                return f;
            case 6:
                fko fkoVar = h;
                if (fkoVar == null) {
                    synchronized (eit.class) {
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
        fin.G.put(eit.class, f);
    }
}
