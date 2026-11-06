package flm;

import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eev extends eeo implements Serializable {
    public static final ees a = new eev(0);
    public static final long serialVersionUID = 0;
    private final int b;

    private eev(int i) {
        this.b = i;
    }

    @Override // flm.ees
    public final eet a() {
        return new eew(this.b);
    }

    public final String toString() {
        return new StringBuilder(31).append("Hashing.murmur3_32(").append(this.b).append(")").toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eev) && this.b == ((eev) obj).b;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.b;
    }

    @Override // flm.eeo, flm.ees
    public final eeq a(CharSequence charSequence, Charset charset) {
        int i = 0;
        if (dva.b.equals(charset)) {
            int length = charSequence.length();
            int iA = this.b;
            int i2 = 0;
            int i3 = 0;
            while (i3 + 4 <= length) {
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence.charAt(i3 + 1);
                char cCharAt3 = charSequence.charAt(i3 + 2);
                char cCharAt4 = charSequence.charAt(i3 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                iA = a(iA, a(cCharAt | (cCharAt2 << '\b') | (cCharAt3 << 16) | (cCharAt4 << 24)));
                i3 += 4;
                i2 += 4;
            }
            long jA = 0;
            while (i3 < length) {
                char cCharAt5 = charSequence.charAt(i3);
                if (cCharAt5 < 128) {
                    jA |= ((long) cCharAt5) << i;
                    i += 8;
                    i2++;
                } else if (cCharAt5 < 2048) {
                    jA |= b(cCharAt5) << i;
                    i += 16;
                    i2 += 2;
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    jA |= a(cCharAt5) << i;
                    i += 24;
                    i2 += 3;
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i3);
                    if (iCodePointAt == cCharAt5) {
                        return a(charSequence.toString().getBytes(charset));
                    }
                    i3++;
                    jA |= b(iCodePointAt) << i;
                    i2 += 4;
                }
                if (i >= 32) {
                    iA = a(iA, a((int) jA));
                    jA >>>= 32;
                    i -= 32;
                }
                i3++;
            }
            return b(a((int) jA) ^ iA, i2);
        }
        return a(charSequence.toString().getBytes(charset));
    }

    @Override // flm.eeo
    public final eeq a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        dvl.a(0, i2 + 0, bArr.length);
        int i4 = this.b;
        int i5 = 0;
        while (i5 + 4 <= i2) {
            int iA = a(i4, a(a(bArr, i5 + 0)));
            i5 += 4;
            i4 = iA;
        }
        int i6 = i5;
        int i7 = 0;
        while (i6 < i2) {
            i7 ^= (bArr[i6 + 0] & 255) << i3;
            i6++;
            i3 += 8;
        }
        return b(a(i7) ^ i4, i2);
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    static int a(int i) {
        return Integer.rotateLeft((-862048943) * i, 15) * 461845907;
    }

    static int a(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    static eeq b(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return eeq.a(i5 ^ (i5 >>> 16));
    }

    static long b(int i) {
        return ((240 | ((long) (i >>> 18))) & 255) | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    static long a(char c) {
        return (((c >>> '\f') | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8) | (((c & '?') | 128) << 16);
    }

    static long b(char c) {
        return (((c >>> 6) | 960) & 255) | (((c & '?') | 128) << 8);
    }

    static {
        new eev(eeu.a);
    }
}
