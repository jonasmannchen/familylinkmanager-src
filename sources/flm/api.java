package flm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class api {
    public static long a(byte[] bArr) {
        int length = bArr.length;
        if (length + 0 < 0 || length + 0 > bArr.length) {
            throw new IndexOutOfBoundsException(new StringBuilder(67).append("Out of bound index with offput: 0").append(" and length: ").append(length).toString());
        }
        if (length <= 32) {
            if (length > 16) {
                long j = (-7286425919675154353L) + ((long) (length << 1));
                long jB = (-5435081209227447693L) * b(bArr, 0);
                long jB2 = b(bArr, 8);
                long jB3 = b(bArr, (0 + length) - 8) * j;
                return a((b(bArr, (0 + length) - 16) * (-7286425919675154353L)) + Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30), jB + Long.rotateRight((-7286425919675154353L) + jB2, 18) + jB3, j);
            }
            if (length >= 8) {
                long j2 = (-7286425919675154353L) + ((long) (length << 1));
                long jB4 = (-7286425919675154353L) + b(bArr, 0);
                long jB5 = b(bArr, (0 + length) - 8);
                return a((Long.rotateRight(jB5, 37) * j2) + jB4, (Long.rotateRight(jB4, 25) + jB5) * j2, j2);
            }
            if (length >= 4) {
                return a(((((long) a(bArr, 0)) & 4294967295L) << 3) + ((long) length), ((long) a(bArr, (0 + length) - 4)) & 4294967295L, (-7286425919675154353L) + ((long) (length << 1)));
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j3 = (((long) (((bArr[(length - 1) + 0] & 255) << 2) + length)) * (-4348849565147123417L)) ^ (((long) ((bArr[0] & 255) + ((bArr[(length >> 1) + 0] & 255) << 8))) * (-7286425919675154353L));
            return (j3 ^ (j3 >>> 47)) * (-7286425919675154353L);
        }
        if (length <= 64) {
            long j4 = (-7286425919675154353L) + ((long) (length << 1));
            long jB6 = b(bArr, 0) * (-7286425919675154353L);
            long jB7 = b(bArr, 8);
            long jB8 = b(bArr, (0 + length) - 8) * j4;
            long jB9 = (b(bArr, (0 + length) - 16) * (-7286425919675154353L)) + Long.rotateRight(jB6 + jB7, 43) + Long.rotateRight(jB8, 30);
            long jA = a(jB9, Long.rotateRight(jB7 - 7286425919675154353L, 18) + jB6 + jB8, j4);
            long jB10 = b(bArr, 16) * j4;
            long jB11 = b(bArr, 24);
            long jB12 = (jB9 + b(bArr, (0 + length) - 32)) * j4;
            return a(((b(bArr, (0 + length) - 24) + jA) * j4) + Long.rotateRight(jB10 + jB11, 43) + Long.rotateRight(jB12, 30), Long.rotateRight(jB11 + jB6, 18) + jB10 + jB12, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i = 0 + (((length - 1) / 64) << 6);
        int i2 = (((length - 1) & 63) + i) - 63;
        long jB13 = 95310865018149119L + b(bArr, 0);
        long j5 = 2480279821605975764L;
        long j6 = ((-7956866745689871395L) ^ ((-7956866745689871395L) >>> 47)) * (-7286425919675154353L);
        int i3 = 0;
        while (true) {
            long jRotateRight = Long.rotateRight(jB13 + j5 + jArr[0] + b(bArr, i3 + 8), 37) * (-5435081209227447693L);
            long jRotateRight2 = Long.rotateRight(j5 + jArr[1] + b(bArr, i3 + 48), 42) * (-5435081209227447693L);
            long j7 = jRotateRight ^ jArr2[1];
            long jB14 = jRotateRight2 + jArr[0] + b(bArr, i3 + 40);
            long jRotateRight3 = Long.rotateRight(j6 + jArr2[0], 33) * (-5435081209227447693L);
            a(bArr, i3, jArr[1] * (-5435081209227447693L), jArr2[0] + j7, jArr);
            a(bArr, i3 + 32, jRotateRight3 + jArr2[1], jB14 + b(bArr, i3 + 16), jArr2);
            i3 += 64;
            if (i3 == i) {
                long j8 = (-5435081209227447693L) + ((255 & j7) << 1);
                jArr2[0] = jArr2[0] + ((long) ((length - 1) & 63));
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jB14 + jArr[0] + b(bArr, i2 + 8), 37) * j8;
                long jRotateRight5 = Long.rotateRight(jArr[1] + jB14 + b(bArr, i2 + 48), 42) * j8;
                long j9 = jRotateRight4 ^ (jArr2[1] * 9);
                long jB15 = jRotateRight5 + (jArr[0] * 9) + b(bArr, i2 + 40);
                long jRotateRight6 = Long.rotateRight(jArr2[0] + j7, 33) * j8;
                a(bArr, i2, jArr[1] * j8, j9 + jArr2[0], jArr);
                a(bArr, i2 + 32, jRotateRight6 + jArr2[1], jB15 + b(bArr, i2 + 16), jArr2);
                return a(a(jArr[0], jArr2[0], j8) + (((jB15 >>> 47) ^ jB15) * (-4348849565147123417L)) + j9, a(jArr[1], jArr2[1], j8) + jRotateRight6, j8);
            }
            j6 = j7;
            j5 = jB14;
            jB13 = jRotateRight3;
        }
    }

    private static long a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static void a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = b(bArr, i);
        long jB2 = b(bArr, i + 8);
        long jB3 = b(bArr, i + 16);
        long jB4 = b(bArr, i + 24);
        long j3 = jB + j;
        long j4 = jB2 + j3 + jB3;
        long jRotateRight = Long.rotateRight(j4, 44) + Long.rotateRight(j2 + j3 + jB4, 21);
        jArr[0] = j4 + jB4;
        jArr[1] = j3 + jRotateRight;
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static long b(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }
}
