package flm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fmj {
    public static final fmj a = new fmj("DOUBLE", 0, fmo.DOUBLE, 1);
    public static final fmj b = new fmj("FLOAT", 1, fmo.FLOAT, 5);
    public static final fmj c = new fmj("INT64", 2, fmo.LONG, 0);
    public static final fmj d = new fmj("UINT64", 3, fmo.LONG, 0);
    public static final fmj e = new fmj("INT32", 4, fmo.INT, 0);
    public static final fmj f = new fmj("FIXED64", 5, fmo.LONG, 1);
    public static final fmj g = new fmj("FIXED32", 6, fmo.INT, 5);
    public static final fmj h = new fmj("BOOL", 7, fmo.BOOLEAN, 0);
    public static final fmj i;
    public static final fmj j;
    public static final fmj k;
    public static final fmj l;
    public static final fmj m;
    public static final fmj n;
    public static final fmj o;
    public static final fmj p;
    public static final fmj q;
    public static final fmj r;
    private static final /* synthetic */ fmj[] u;
    public final fmo s;
    public final int t;

    public static fmj[] values() {
        return (fmj[]) u.clone();
    }

    private fmj(String str, int i2, fmo fmoVar, int i3) {
        super(str, i2);
        this.s = fmoVar;
        this.t = i3;
    }

    /* synthetic */ fmj(String str, int i2, fmo fmoVar, int i3, byte b2) {
        this(str, i2, fmoVar, i3);
    }

    static {
        final int i2 = 3;
        final int i3 = 2;
        final String str = "STRING";
        final int i4 = 8;
        final fmo fmoVar = fmo.STRING;
        i = new fmj(str, i4, fmoVar, i3) { // from class: flm.fmk
            {
                int i5 = 8;
                int i6 = 2;
                byte b2 = 0;
            }
        };
        final String str2 = "GROUP";
        final int i5 = 9;
        final fmo fmoVar2 = fmo.MESSAGE;
        j = new fmj(str2, i5, fmoVar2, i2) { // from class: flm.fml
            {
                int i6 = 9;
                int i7 = 3;
                byte b2 = 0;
            }
        };
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final fmo fmoVar3 = fmo.MESSAGE;
        k = new fmj(str3, i6, fmoVar3, i3) { // from class: flm.fmm
            {
                int i7 = 10;
                int i8 = 2;
                byte b2 = 0;
            }
        };
        final String str4 = "BYTES";
        final int i7 = 11;
        final fmo fmoVar4 = fmo.BYTE_STRING;
        l = new fmj(str4, i7, fmoVar4, i3) { // from class: flm.fmn
            {
                int i8 = 11;
                int i9 = 2;
                byte b2 = 0;
            }
        };
        m = new fmj("UINT32", 12, fmo.INT, 0);
        n = new fmj("ENUM", 13, fmo.ENUM, 0);
        o = new fmj("SFIXED32", 14, fmo.INT, 5);
        p = new fmj("SFIXED64", 15, fmo.LONG, 1);
        q = new fmj("SINT32", 16, fmo.INT, 0);
        r = new fmj("SINT64", 17, fmo.LONG, 0);
        u = new fmj[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
    }
}
