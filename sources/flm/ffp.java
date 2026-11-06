package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffp extends fir implements fkg {
    public static final ffp a = new ffp();
    private static volatile fko c;
    private byte b = 2;

    private ffp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.b);
            case 1:
                this.b = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return new fks(a, "\u0001\u0000", null);
            case 3:
                return new ffp();
            case 4:
                return new ffq();
            case 5:
                return a;
            case 6:
                fko fkoVar = c;
                if (fkoVar == null) {
                    synchronized (ffp.class) {
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
        fin.G.put(ffp.class, a);
    }
}
