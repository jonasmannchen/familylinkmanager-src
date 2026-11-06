package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cl {
    public boolean a;
    private final long[] b;
    private final boolean[] c;
    private final int[] d;

    cl(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
        this.d = new int[i];
        Arrays.fill(this.b, 0L);
        Arrays.fill(this.c, false);
    }

    final int[] a() {
        synchronized (this) {
        }
        return null;
    }
}
