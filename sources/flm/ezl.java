package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezl extends fin implements fkg {
    public static final ezl d = new ezl();
    private static volatile fko f;
    public int a;
    public esy b;
    public fcw c;
    private byte e = 2;

    private ezl() {
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
                return new fks(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\t\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ezl();
            case 4:
                return new ezm();
            case 5:
                return d;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (ezl.class) {
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
        fin.G.put(ezl.class, d);
    }
}
