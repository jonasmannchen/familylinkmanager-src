package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ebv {
    STRING('s', ebx.a, "-#", true),
    BOOLEAN('b', ebx.b, "-", true),
    CHAR('c', ebx.c, "-", true),
    DECIMAL('d', ebx.d, "-0+ ,", false),
    OCTAL('o', ebx.d, "-#0", false),
    HEX('x', ebx.d, "-#0", true),
    FLOAT('f', ebx.e, "-#0+ ,", false),
    EXPONENT('e', ebx.e, "-#0+ ", true),
    GENERAL('g', ebx.e, "-0+ ,", true),
    EXPONENT_HEX('a', ebx.e, "-#0+ ", true);

    public static final ebv[] f = new ebv[26];
    public final char g;
    public final ebx h;
    public final int i;
    public final String j;

    ebv(char c, ebx ebxVar, String str, boolean z) {
        this.g = c;
        this.h = ebxVar;
        this.i = ebw.a(str, z);
        this.j = new StringBuilder(2).append("%").append(c).toString();
    }

    static {
        for (ebv ebvVar : values()) {
            f[(ebvVar.g | ' ') - 97] = ebvVar;
        }
    }
}
