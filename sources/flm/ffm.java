package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffm extends fin implements fkg {
    public static final ffm c = new ffm();
    private static volatile fko e;
    public int a;
    public ffp b;
    private byte d = 2;

    private ffm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.d);
            case 1:
                this.d = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(c, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bЉ\u0006", new Object[]{"a", "b"});
            case 3:
                return new ffm();
            case 4:
                return new ffn();
            case 5:
                return c;
            case 6:
                fko fkoVar = e;
                if (fkoVar == null) {
                    synchronized (ffm.class) {
                        fipVar = e;
                        if (fipVar == null) {
                            fipVar = new fip(c);
                            e = fipVar;
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
        fin.G.put(ffm.class, c);
    }
}
