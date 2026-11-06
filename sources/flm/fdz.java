package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdz extends fin implements fkg {
    public static final fdz b;
    private static volatile fko c;
    public fjb a = fiu.b;

    private fdz() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new fks(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", fdx.b()});
            case 3:
                return new fdz();
            case 4:
                return new feb();
            case 5:
                return b;
            case 6:
                fko fkoVar = c;
                if (fkoVar == null) {
                    synchronized (fdz.class) {
                        fipVar = c;
                        if (fipVar == null) {
                            fipVar = new fip(b);
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
        new fea();
        b = new fdz();
        fin.G.put(fdz.class, b);
    }
}
