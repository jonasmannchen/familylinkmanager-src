package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ara {
    public final short[] a;
    public final long[] b;
    private final int c;

    public ara(long[] jArr) {
        bdi.checkArgument(jArr.length % 4 == 0);
        bdi.checkArgument(jArr.length < 32767, "too many digests");
        this.b = jArr;
        this.c = Math.max(4, 29 - Integer.numberOfLeadingZeros(jArr.length));
        this.a = new short[1 << this.c];
        Arrays.fill(this.a, Short.MAX_VALUE);
        int length = jArr.length - 4;
        while (length >= 0) {
            bdi.checkArgument(length == 0 || jArr[length] > jArr[length + (-4)], "Must be sorted");
            this.a[a(jArr[length])] = (short) length;
            length -= 4;
        }
    }

    final int a(long j) {
        return (int) (j >>> (64 - this.c));
    }
}
