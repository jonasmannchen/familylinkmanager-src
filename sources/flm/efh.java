package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efh extends fin implements fkg {
    public static final efh e = new efh();
    private static volatile fko g;
    public int a;
    public long b;
    public int c;
    public int d;
    private byte f = 2;

    private efh() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.f);
            case 1:
                this.f = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԃ\u0000\u0002Ԇ\u0001\u0003Ԇ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new efh();
            case 4:
                return new efi();
            case 5:
                return e;
            case 6:
                fko fkoVar = g;
                if (fkoVar == null) {
                    synchronized (efh.class) {
                        fipVar = g;
                        if (fipVar == null) {
                            fipVar = new fip(e);
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
        fin.G.put(efh.class, e);
    }
}
