package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtr extends fin implements fkg {
    private static volatile fko A;
    public static final gtr y = new gtr();
    public int a;
    public gpy b;
    public long c;
    public gtt e;
    public grv f;
    public gqf g;
    public grz h;
    public gth i;
    public gst j;
    public gom k;
    public gsh l;
    public gsn m;
    public gpr n;
    public gsj o;
    public grh p;
    public gpd r;
    public gpk s;
    public grt t;
    public gqu u;
    public gsd v;
    public gsx w;
    public gtn x;
    private byte z = 2;
    public String d = "";
    public String q = "";

    private gtr() {
    }

    public static gts n() {
        return (gts) ((fio) y.a(dp.au, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fin
    public final Object a(int i, Object obj) {
        fko fipVar;
        switch (i - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Byte.valueOf(this.z);
            case 1:
                this.z = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return new fks(y, "\u0001\u0017\u0000\u0001\u0001\u001c\u0017\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0005\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\f\t\u000b\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\b\u0010\u0012\t\u0011\u0015\t\u0014\u0016\t\u0015\u0017\t\u0016\u0018\t\u0017\u001b\t\u0012\u001c\t\u0019", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "t", "u", "v", "w", "s", "x"});
            case 3:
                return new gtr();
            case 4:
                return new gts();
            case 5:
                return y;
            case 6:
                fko fkoVar = A;
                if (fkoVar == null) {
                    synchronized (gtr.class) {
                        fipVar = A;
                        if (fipVar == null) {
                            fipVar = new fip(y);
                            A = fipVar;
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
        fin.G.put(gtr.class, y);
    }
}
