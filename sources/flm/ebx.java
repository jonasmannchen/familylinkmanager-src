package flm;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
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
public abstract class ebx {
    public static final ebx a;
    public static final ebx b;
    public static final ebx c;
    public static final ebx d;
    public static final ebx e;
    private static final /* synthetic */ ebx[] g;
    public final boolean f;

    public static ebx[] values() {
        return (ebx[]) g.clone();
    }

    public abstract boolean a(Object obj);

    private ebx(String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.f = z2;
    }

    /* synthetic */ ebx(String str, int i, boolean z, boolean z2, byte b2) {
        this(str, i, z, z2);
    }

    static {
        final int i = 4;
        final int i2 = 3;
        final int i3 = 2;
        final boolean z = true;
        final int i4 = 0;
        final String str = "GENERAL";
        final byte b2 = 0 == true ? 1 : 0;
        a = new ebx(str, i4, b2, z) { // from class: flm.eby
            {
                int i5 = 0;
                boolean z2 = true;
                byte b3 = 0 == true ? 1 : 0;
                byte b4 = 0 == true ? 1 : 0;
            }

            @Override // flm.ebx
            public final boolean a(Object obj) {
                return true;
            }
        };
        final String str2 = "BOOLEAN";
        final boolean z2 = true ? 1 : 0;
        final byte b3 = 0 == true ? 1 : 0;
        final byte b4 = 0 == true ? 1 : 0;
        b = new ebx(str2, z2, b3, b4) { // from class: flm.ebz
            {
                boolean z3 = false;
                int i5 = 1;
                byte b5 = 0 == true ? 1 : 0;
                byte b6 = 0 == true ? 1 : 0;
            }

            @Override // flm.ebx
            public final boolean a(Object obj) {
                return obj instanceof Boolean;
            }
        };
        final String str3 = "CHARACTER";
        final byte b5 = 0 == true ? 1 : 0;
        final byte b6 = 0 == true ? 1 : 0;
        c = new ebx(str3, i3, b5, b6) { // from class: flm.eca
            {
                boolean z3 = false;
                int i5 = 2;
                byte b7 = 0 == true ? 1 : 0;
                byte b8 = 0 == true ? 1 : 0;
            }

            @Override // flm.ebx
            public final boolean a(Object obj) {
                if (obj instanceof Character) {
                    return true;
                }
                if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                    return Character.isValidCodePoint(((Number) obj).intValue());
                }
                return false;
            }
        };
        final String str4 = "INTEGRAL";
        final boolean z3 = true ? 1 : 0;
        final byte b7 = 0 == true ? 1 : 0;
        d = new ebx(str4, i2, z3, b7) { // from class: flm.ecb
            {
                boolean z4 = false;
                int i5 = 3;
                boolean z5 = true;
                byte b8 = 0 == true ? 1 : 0;
            }

            @Override // flm.ebx
            public final boolean a(Object obj) {
                return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
            }
        };
        final String str5 = "FLOAT";
        final boolean z4 = true ? 1 : 0;
        final boolean z5 = true ? 1 : 0;
        e = new ebx(str5, i, z4, z5) { // from class: flm.ecc
            {
                boolean z6 = true;
                int i5 = 4;
                byte b8 = 0;
            }

            @Override // flm.ebx
            public final boolean a(Object obj) {
                return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
            }
        };
        g = new ebx[]{a, b, c, d, e};
    }
}
