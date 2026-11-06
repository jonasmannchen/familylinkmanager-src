package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gpa extends fin implements fkg {
    public static final gpa ao = new gpa();
    private static volatile fko ap;
    public long A;
    public long B;
    public goy C;
    public long H;
    public goy I;
    public goy J;
    public goy K;
    public goy L;
    public goy M;
    public goy N;
    public goy O;
    public goy P;
    public goy Q;
    public goy R;
    public goy S;
    public goy T;
    public goy U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public int a;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public goy ak;
    public long al;
    public long am;
    public long an;
    public int b;
    public long c;
    public long d;
    public goy k;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    public fjf e = fkr.b;
    public fjf f = fkr.b;
    public fjf g = fkr.b;
    public fjf h = fkr.b;
    public fjf i = fkr.b;
    public fjf j = fkr.b;
    public fjf l = fkr.b;
    public fjf m = fkr.b;
    public fjf n = fkr.b;

    private gpa() {
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
                return new fks(ao, "\u0001<\u0000\u0002\u0001@<\u0000\t\u0000\u0001\u0002\u0000\u0003\u0002\u0002\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\t\u0004\f\u001b\u000e\u001b\u000f\u001b\u0010\u0002\u0005\u0011\u0002\u0006\u0012\u0002\u0007\u0013\u0002\b\u0014\u0002\t\u0015\u0002\n\u0016\u0002\u000b\u0017\u0002\f\u0018\u0002\r\u0019\u0002\u000e\u001a\u0002\u000f\u001b\u0002\u0010\u001c\u0002\u0011\u001d\u0002\u0012\u001e\t\u0013\u001f\u0002\u0014 \t\u0015!\t\u0016\"\t\u0017#\t\u0018$\t\u0019%\t\u001a&\t\u001b'\t\u001c(\t\u001d)\t\u001e*\t\u001f+\t ,\t!-\u0002\".\u0002#/\u0002$0\u0002%1\u0002&2\u0002'3\u0002(4\u0002)5\u0002*6\u0002+7\u0002,8\u0002-9\u0002.:\u0002/;\u00020=\t1>\u00022?\u00023@\u00024", new Object[]{"a", "b", "c", "d", "e", goy.class, "f", goy.class, "g", goy.class, "h", goy.class, "i", goy.class, "j", goy.class, "k", "l", goy.class, "m", gou.class, "n", gos.class, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an"});
            case 3:
                return new gpa();
            case 4:
                return new gpb();
            case 5:
                return ao;
            case 6:
                fko fkoVar = ap;
                if (fkoVar == null) {
                    synchronized (gpa.class) {
                        fipVar = ap;
                        if (fipVar == null) {
                            fipVar = new fip(ao);
                            ap = fipVar;
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
        fin.G.put(gpa.class, ao);
    }
}
