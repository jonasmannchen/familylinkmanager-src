package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eui extends fin implements fkg {
    public static final eui a = new eui();
    private static volatile fko c;
    private byte b = 2;

    private eui() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.b);
            case 1:
                this.b = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(a, "\u0001\u0000", new Object[0]);
            case 3:
                return new eui();
            case 4:
                return new euj();
            case 5:
                return a;
            case 6:
                fko fkoVar = c;
                if (fkoVar == null) {
                    synchronized (eui.class) {
                        fipVar = c;
                        if (fipVar == null) {
                            fipVar = new fip(a);
                            c = fipVar;
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
        fin.G.put(eui.class, a);
    }
}
