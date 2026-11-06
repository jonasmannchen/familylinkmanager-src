package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efq extends fin implements fkg {
    public static final efq d = new efq();
    private static volatile fko f;
    public int a;
    public efm b;
    private byte e = 2;
    public fjf c = fkr.b;

    private efq() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ԉ\u0000\u0002Л", new Object[]{"a", "b", "c", efm.class});
            case 3:
                return new efq();
            case 4:
                return new efr();
            case 5:
                return d;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (efq.class) {
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
        fin.G.put(efq.class, d);
    }
}
