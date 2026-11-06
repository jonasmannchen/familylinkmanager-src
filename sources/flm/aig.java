package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aig {
    public int a = 0;
    public long[] b = new long[4];

    aig() {
    }

    public final void a(long j) {
        if (this.a == this.b.length) {
            this.b = Arrays.copyOf(this.b, this.a << 1);
        }
        long[] jArr = this.b;
        int i = this.a;
        this.a = i + 1;
        jArr[i] = j;
    }
}
