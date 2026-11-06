package flm;

import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sq {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    private static int a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        int i5;
        if (z || i > 0) {
            if ((!z || i3 < 3) && i <= 99) {
                i4 = i2;
                i5 = i;
            } else {
                int i6 = i / 100;
                cArr[i2] = (char) (i6 + 48);
                i4 = i2 + 1;
                i5 = i - (i6 * 100);
            }
            if ((z && i3 >= 2) || i5 > 9 || i2 != i4) {
                int i7 = i5 / 10;
                cArr[i4] = (char) (i7 + 48);
                i4++;
                i5 -= i7 * 10;
            }
            cArr[i4] = (char) (i5 + 48);
            int i8 = i4 + 1;
            cArr[i8] = c;
            return i8 + 1;
        }
        return i2;
    }

    private static void a(long j, PrintWriter printWriter, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (a) {
            if (b.length < 0) {
                b = new char[0];
            }
            char[] cArr = b;
            if (j == 0) {
                cArr[0] = '0';
                i6 = 1;
            } else {
                if (j > 0) {
                    c = '+';
                } else {
                    j = -j;
                    c = '-';
                }
                int i7 = (int) (j % 1000);
                int iFloor = (int) Math.floor(j / 1000);
                int i8 = 0;
                if (iFloor > 86400) {
                    i8 = iFloor / 86400;
                    iFloor -= 86400 * i8;
                }
                if (iFloor > 3600) {
                    int i9 = iFloor / 3600;
                    i2 = i9;
                    i3 = iFloor - (i9 * 3600);
                } else {
                    i2 = 0;
                    i3 = iFloor;
                }
                if (i3 > 60) {
                    int i10 = i3 / 60;
                    i4 = i10;
                    i5 = i3 - (i10 * 60);
                } else {
                    i4 = 0;
                    i5 = i3;
                }
                cArr[0] = c;
                int iA = a(cArr, i8, 'd', 1, false, 0);
                int iA2 = a(cArr, i2, 'h', iA, iA != 1, 0);
                int iA3 = a(cArr, i4, 'm', iA2, iA2 != 1, 0);
                int iA4 = a(cArr, i7, 'm', a(cArr, i5, 's', iA3, iA3 != 1, 0), true, 0);
                cArr[iA4] = 's';
                i6 = iA4 + 1;
            }
            printWriter.print(new String(b, 0, i6));
        }
    }

    public static void a(long j, PrintWriter printWriter) {
        a(j, printWriter, 0);
    }

    public static void a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            a(j - j2, printWriter, 0);
        }
    }
}
