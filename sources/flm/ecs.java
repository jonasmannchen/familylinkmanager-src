package flm;

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
abstract class ecs {
    private static final ecs a;
    private static final ecs b;
    private static final ecs c;
    private static final ecs d;
    private static final /* synthetic */ ecs[] e;

    public static ecs[] values() {
        return (ecs[]) e.clone();
    }

    abstract int a(Object obj, Object obj2);

    private ecs(String str, int i) {
        super(str, i);
    }

    static ecs a(Object obj) {
        if (obj instanceof String) {
            return b;
        }
        if (obj instanceof Boolean) {
            return a;
        }
        if (obj instanceof Long) {
            return c;
        }
        if (obj instanceof Double) {
            return d;
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 18).append("invalid tag type: ").append(strValueOf).toString());
    }

    /* synthetic */ ecs(String str, int i, byte b2) {
        this(str, i);
    }

    static {
        final int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        final String str = "BOOLEAN";
        a = new ecs(str, i4) { // from class: flm.ect
            {
                byte b2 = 0;
            }

            @Override // flm.ecs
            final int a(Object obj, Object obj2) {
                return ((Boolean) obj).compareTo((Boolean) obj2);
            }
        };
        final String str2 = "STRING";
        b = new ecs(str2, i3) { // from class: flm.ecu
            {
                int i5 = 1;
                byte b2 = 0;
            }

            @Override // flm.ecs
            final int a(Object obj, Object obj2) {
                return ((String) obj).compareTo((String) obj2);
            }
        };
        final String str3 = "LONG";
        c = new ecs(str3, i2) { // from class: flm.ecv
            {
                int i5 = 2;
                byte b2 = 0;
            }

            @Override // flm.ecs
            final int a(Object obj, Object obj2) {
                return ((Long) obj).compareTo((Long) obj2);
            }
        };
        final String str4 = "DOUBLE";
        d = new ecs(str4, i) { // from class: flm.ecw
            {
                int i5 = 3;
                byte b2 = 0;
            }

            @Override // flm.ecs
            final int a(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        };
        e = new ecs[]{a, b, c, d};
    }
}
