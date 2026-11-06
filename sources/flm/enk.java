package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enk extends fin implements fkg {
    public static final enk e = new enk();
    private static volatile fko f;
    public int a;
    public int b = 0;
    public Object c;
    public ems d;

    private enk() {
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
                return new fks(e, "\u0001\n\u0001\u0001\u0002\u000b\n\u0000\u0000\u0000\u0002:\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\t\t", new Object[]{"c", "b", "a", emq.class, emu.class, eoe.class, eni.class, enm.class, ena.class, emy.class, ene.class, "d"});
            case 3:
                return new enk();
            case 4:
                return new enl();
            case 5:
                return e;
            case 6:
                fko fkoVar = f;
                if (fkoVar == null) {
                    synchronized (enk.class) {
                        fipVar = f;
                        if (fipVar == null) {
                            fipVar = new fip(e);
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
        fin.G.put(enk.class, e);
    }
}
