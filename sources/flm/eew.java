package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eew extends eep {
    private int a;
    private long b;
    private int c;
    private int d = 0;
    private boolean e = false;

    eew(int i) {
        this.a = i;
    }

    private final void a(int i, long j) {
        this.b |= (4294967295L & j) << this.c;
        this.c += i << 3;
        this.d += i;
        if (this.c >= 32) {
            this.a = eev.a(this.a, eev.a((int) this.b));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // flm.eet
    public final eet a(byte b) {
        a(1, b & 255);
        return this;
    }

    @Override // flm.eep, flm.eet
    public final eet a(byte[] bArr, int i, int i2) {
        dvl.a(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 + 4 <= i2) {
            a(4, eev.a(bArr, i + i3));
            i3 += 4;
        }
        while (i3 < i2) {
            a(bArr[i + i3]);
            i3++;
        }
        return this;
    }

    @Override // flm.eep, flm.eet
    public final eet a(CharSequence charSequence, Charset charset) {
        if (dva.b.equals(charset)) {
            int length = charSequence.length();
            int i = 0;
            while (i + 4 <= length) {
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = charSequence.charAt(i + 1);
                char cCharAt3 = charSequence.charAt(i + 2);
                char cCharAt4 = charSequence.charAt(i + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                a(4, cCharAt | (cCharAt2 << '\b') | (cCharAt3 << 16) | (cCharAt4 << 24));
                i += 4;
            }
            while (i < length) {
                char cCharAt5 = charSequence.charAt(i);
                if (cCharAt5 < 128) {
                    a(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    a(2, eev.b(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    a(3, eev.a(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i);
                    if (iCodePointAt == cCharAt5) {
                        a(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    a(4, eev.b(iCodePointAt));
                }
                i++;
            }
            return this;
        }
        return super.a(charSequence, charset);
    }

    @Override // flm.eet
    public final eeq a() {
        dvl.b(!this.e);
        this.e = true;
        this.a ^= eev.a((int) this.b);
        return eev.b(this.a, this.d);
    }
}
