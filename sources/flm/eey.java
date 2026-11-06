package flm;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eey {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    private final boolean[] h;

    eey(String str, char[] cArr) {
        this.a = (String) dvl.a(str);
        this.b = (char[]) dvl.a(cArr);
        try {
            this.d = eft.a(cArr.length, RoundingMode.UNNECESSARY);
            int iMin = Math.min(8, Integer.lowestOneBit(this.d));
            try {
                this.e = 8 / iMin;
                this.f = this.d / iMin;
                this.c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    dvl.a(c < 128, "Non-ASCII character: %s", c);
                    dvl.a(bArr[c] == -1, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    zArr[eft.a(i2 << 3, this.d, RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
            } catch (ArithmeticException e) {
                String strValueOf = String.valueOf(new String(cArr));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Illegal alphabet ".concat(strValueOf) : new String("Illegal alphabet "), e);
            }
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(new StringBuilder(35).append("Illegal alphabet length ").append(cArr.length).toString(), e2);
        }
    }

    final boolean a(int i) {
        return this.h[i % this.e];
    }

    final int a(char c) throws efb {
        if (c > 127) {
            String strValueOf = String.valueOf(Integer.toHexString(c));
            throw new efb(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
        }
        byte b = this.g[c];
        if (b == -1) {
            if (c <= ' ' || c == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c));
                throw new efb(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            throw new efb(new StringBuilder(25).append("Unrecognized character: ").append(c).toString());
        }
        return b;
    }

    public final String toString() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eey) {
            return Arrays.equals(this.b, ((eey) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}
