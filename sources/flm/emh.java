package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emh extends fin implements fkg {
    public static final emh h = new emh();
    private static volatile fko i;
    public int a;
    public int b;
    public String c = "";
    public elf d;
    public ekz e;
    public emn f;
    public eln g;

    private emh() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i2, Object obj) {
        fko fipVar;
        switch (i2 - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new fks(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0002\u0003\t\u0003\u0004\t\u0004\u0005\t\u0005\u0006\b\u0001", new Object[]{"a", "b", epd.b(), "d", "e", "f", "g", "c"});
            case 3:
                return new emh();
            case 4:
                return new emi();
            case 5:
                return h;
            case 6:
                fko fkoVar = i;
                if (fkoVar == null) {
                    synchronized (emh.class) {
                        fipVar = i;
                        if (fipVar == null) {
                            fipVar = new fip(h);
                            i = fipVar;
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
        fin.G.put(emh.class, h);
    }
}
