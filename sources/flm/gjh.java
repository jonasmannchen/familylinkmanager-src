package flm;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjh {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public gjh(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }

    final String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c;
        this.c++;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            this.c++;
        }
        if (this.c >= this.b) {
            String strValueOf = String.valueOf(this.a);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf) : new String("Unexpected end of DN: "));
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                this.c++;
            }
            if (this.g[this.c] != '=' || this.c == this.b) {
                String strValueOf2 = String.valueOf(this.a);
                throw new IllegalStateException(strValueOf2.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf2) : new String("Unexpected end of DN: "));
            }
        }
        this.c++;
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && ((this.g[this.d] == 'O' || this.g[this.d] == 'o') && ((this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')))) {
            this.d += 4;
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    final char b() {
        int i;
        int i2;
        this.c++;
        if (this.c == this.b) {
            String strValueOf = String.valueOf(this.a);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf) : new String("Unexpected end of DN: "));
        }
        switch (this.g[this.c]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
                return this.g[this.c];
            default:
                int iA = a(this.c);
                this.c++;
                if (iA < 128) {
                    return (char) iA;
                }
                if (iA < 192 || iA > 247) {
                    return '?';
                }
                if (iA <= 223) {
                    i = 1;
                    i2 = iA & 31;
                } else if (iA <= 239) {
                    i = 2;
                    i2 = iA & 15;
                } else {
                    i = 3;
                    i2 = iA & 7;
                }
                int i3 = i2;
                for (int i4 = 0; i4 < i; i4++) {
                    this.c++;
                    if (this.c == this.b || this.g[this.c] != '\\') {
                        return '?';
                    }
                    this.c++;
                    int iA2 = a(this.c);
                    this.c++;
                    if ((iA2 & 192) != 128) {
                        return '?';
                    }
                    i3 = (i3 << 6) + (iA2 & 63);
                }
                return (char) i3;
        }
    }

    final int a(int i) {
        int i2;
        int i3;
        if (i + 1 >= this.b) {
            String strValueOf = String.valueOf(this.a);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Malformed DN: ".concat(strValueOf) : new String("Malformed DN: "));
        }
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c >= 'A' && c <= 'F') {
            i2 = c - '7';
        } else {
            String strValueOf2 = String.valueOf(this.a);
            throw new IllegalStateException(strValueOf2.length() != 0 ? "Malformed DN: ".concat(strValueOf2) : new String("Malformed DN: "));
        }
        char c2 = this.g[i + 1];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 >= 'A' && c2 <= 'F') {
            i3 = c2 - '7';
        } else {
            String strValueOf3 = String.valueOf(this.a);
            throw new IllegalStateException(strValueOf3.length() != 0 ? "Malformed DN: ".concat(strValueOf3) : new String("Malformed DN: "));
        }
        return (i2 << 4) + i3;
    }
}
