package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebw {
    public static final ebw a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    private static int a(char c) {
        return ((int) ((e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    public static ebw a(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return a;
        }
        int i3 = z ? 128 : 0;
        while (i != i2) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '0') {
                int i5 = i4 - 1;
                if (cCharAt > '9') {
                    throw eei.a("invalid flag", str, i5);
                }
                int i6 = cCharAt - '0';
                int i7 = i4;
                int i8 = i6;
                while (i7 != i2) {
                    int i9 = i7 + 1;
                    char cCharAt2 = str.charAt(i7);
                    if (cCharAt2 == '.') {
                        return new ebw(i3, i8, a(str, i9, i2));
                    }
                    char c = (char) (cCharAt2 - '0');
                    if (c >= '\n') {
                        throw eei.a("invalid width character", str, i9 - 1);
                    }
                    int i10 = c + (i8 * 10);
                    if (i10 > 999999) {
                        throw eei.a("width too large", str, i5, i2);
                    }
                    i8 = i10;
                    i7 = i9;
                }
                return new ebw(i3, i8, -1);
            }
            int iA = a(cCharAt);
            if (iA < 0) {
                if (cCharAt == '.') {
                    return new ebw(i3, -1, a(str, i4, i2));
                }
                throw eei.a("invalid flag", str, i4 - 1);
            }
            int i11 = 1 << iA;
            if ((i3 & i11) != 0) {
                throw eei.a("repeated flag", str, i4 - 1);
            }
            i3 = i11 | i3;
            i = i4;
        }
        return new ebw(i3, -1, -1);
    }

    private static int a(String str, int i, int i2) {
        if (i == i2) {
            throw eei.a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw eei.a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw eei.a("precision too large", str, i, i2);
            }
        }
        if (i3 == 0 && i2 != i + 1) {
            throw eei.a("invalid precision", str, i, i2);
        }
        return i3;
    }

    static int a(String str, boolean z) {
        int i = z ? 128 : 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = a(str.charAt(i2));
            if (iA < 0) {
                String strValueOf = String.valueOf(str);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "invalid flags: ".concat(strValueOf) : new String("invalid flags: "));
            }
            i |= 1 << iA;
        }
        return i;
    }

    ebw(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this == a;
    }

    public final boolean a(int i, boolean z) {
        if (a()) {
            return true;
        }
        if ((this.b & (i ^ (-1))) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i2 = this.b;
        boolean z2 = this.c != -1;
        if ((i2 & 9) != 9 && (i2 & 96) != 96) {
            return (i2 & 96) == 0 || z2;
        }
        return false;
    }

    public final boolean b() {
        return (this.b & 128) != 0;
    }

    public final StringBuilder a(StringBuilder sb) {
        if (!a()) {
            int i = this.b & (-129);
            for (int i2 = 0; (1 << i2) <= i; i2++) {
                if (((1 << i2) & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
            }
            if (this.c != -1) {
                sb.append(this.c);
            }
            if (this.d != -1) {
                sb.append('.').append(this.d);
            }
        }
        return sb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ebw)) {
            return false;
        }
        ebw ebwVar = (ebw) obj;
        return ebwVar.b == this.b && ebwVar.c == this.c && ebwVar.d == this.d;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        e = jCharAt;
        a = new ebw(0, -1, -1);
    }
}
