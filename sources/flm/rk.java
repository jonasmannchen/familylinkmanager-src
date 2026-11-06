package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rk {
    private static final byte[] f = new byte[1792];
    public final CharSequence a;
    public final boolean b = false;
    public final int c;
    public int d;
    public char e;

    rk(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.c = charSequence.length();
    }

    static byte a(char c) {
        return c < 1792 ? f[c] : Character.getDirectionality(c);
    }

    final byte a() {
        this.e = this.a.charAt(this.d - 1);
        if (Character.isLowSurrogate(this.e)) {
            int iCodePointBefore = Character.codePointBefore(this.a, this.d);
            this.d -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.d--;
        byte bA = a(this.e);
        if (this.b) {
            if (this.e == '>') {
                int i = this.d;
                while (this.d > 0) {
                    CharSequence charSequence = this.a;
                    int i2 = this.d - 1;
                    this.d = i2;
                    this.e = charSequence.charAt(i2);
                    if (this.e == '<') {
                        return (byte) 12;
                    }
                    if (this.e == '>') {
                        break;
                    }
                    if (this.e == '\"' || this.e == '\'') {
                        char c = this.e;
                        while (this.d > 0) {
                            CharSequence charSequence2 = this.a;
                            int i3 = this.d - 1;
                            this.d = i3;
                            char cCharAt = charSequence2.charAt(i3);
                            this.e = cCharAt;
                            if (cCharAt == c) {
                                break;
                            }
                        }
                    }
                }
                this.d = i;
                this.e = '>';
                return (byte) 13;
            }
            if (this.e == ';') {
                int i4 = this.d;
                while (this.d > 0) {
                    CharSequence charSequence3 = this.a;
                    int i5 = this.d - 1;
                    this.d = i5;
                    this.e = charSequence3.charAt(i5);
                    if (this.e == '&') {
                        return (byte) 12;
                    }
                    if (this.e == ';') {
                        break;
                    }
                }
                this.d = i4;
                this.e = ';';
                return (byte) 13;
            }
        }
        return bA;
    }

    static {
        for (int i = 0; i < 1792; i++) {
            f[i] = Character.getDirectionality(i);
        }
    }
}
