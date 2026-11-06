package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chv extends fin implements fkg {
    public static final chv d = new chv();
    private static volatile fko f;
    public int a;
    public eta b;
    public int c;
    private byte e = 2;

    private chv() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.e);
            case 1:
                this.e = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", chx.b()});
            case 3:
                return new chv();
            case 4:
                return new chw();
            case 5:
                return d;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (chv.class) {
                        fipVar = f;
                        if (fipVar == null) {
                            fipVar = new fip(d);
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
        fin.G.put(chv.class, d);
    }
}
