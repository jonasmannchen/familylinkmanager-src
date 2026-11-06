package flm;

import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eft {
    public static int a(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf("x").length() + 26).append("x").append(" (").append(i).append(") must be > 0").toString());
        }
        switch (efu.a[roundingMode.ordinal()]) {
            case 1:
                efw.a((((i + (-1)) & i) == 0) & (i > 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((((-1257966797) >>> iNumberOfLeadingZeros) - i) ^ (-1)) ^ (-1)) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    public static int a(int i, int i2, RoundingMode roundingMode) {
        boolean z;
        boolean z2 = true;
        dvl.a(roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (efu.a[roundingMode.ordinal()]) {
            case 1:
                efw.a(i4 == 0);
                z2 = false;
                return z2 ? i3 + i5 : i3;
            case 2:
                z2 = false;
                if (z2) {
                }
            case 3:
                if (i5 >= 0) {
                    z2 = false;
                }
                if (z2) {
                }
            case 4:
                if (z2) {
                }
            case 5:
                if (i5 <= 0) {
                    z2 = false;
                }
                if (z2) {
                }
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        z = ((i3 & 1) != 0) && (roundingMode == RoundingMode.HALF_EVEN);
                    }
                    z2 = z;
                } else if (iAbs2 <= 0) {
                    z2 = false;
                }
                if (z2) {
                }
            default:
                throw new AssertionError();
        }
    }
}
