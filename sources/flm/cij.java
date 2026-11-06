package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cij extends fin implements fkg {
    public static final cij C = new cij();
    private static volatile fko I;
    public ezq A;
    public eye B;
    public int a;
    public int b;
    public int c;
    public boolean g;
    public exj h;
    public int i;
    public int j;
    public faw q;
    public fdl s;
    public eyu t;
    public eyy u;
    public ezu v;
    public eya w;
    public ehq x;
    public eie y;
    public fac z;
    private byte H = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String r = "";

    private cij() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.H);
            case 1:
                this.H = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(C, "\u0001\u001b\u0000\u0001\u0001Ñ\u001b\u0000\u0000\u0001\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002\n\b\u0003\u000b\b\u0004\f\u0007\u0005\r\t\u00062\u0004\u00073\u0004\b4\b\td\b\ne\b\u000bf\b\f\u0096\b\r\u0097\b\u000e\u0098\t\u000f\u0099\b\u0010È\t\u0011É\t\u0012Ê\t\u0013Ë\t\u0014ÌЉ\u0015Í\t\u0016Î\t\u0017Ï\t\u0018Ð\t\u0019Ñ\t\u001a", new Object[]{"a", "b", cia.b(), "c", cid.b(), "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B"});
            case 3:
                return new cij();
            case 4:
                return new cik();
            case 5:
                return C;
            case 6:
                fko fkoVar = I;
                if (fkoVar == null) {
                    synchronized (cij.class) {
                        fipVar = I;
                        if (fipVar == null) {
                            fipVar = new fip(C);
                            I = fipVar;
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
        fin.G.put(cij.class, C);
    }
}
