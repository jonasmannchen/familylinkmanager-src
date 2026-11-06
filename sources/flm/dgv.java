package flm;

import android.os.Debug;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgv {
    public final long a;
    public final long b;

    dgv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static dgv a() {
        return new dgv(System.nanoTime(), Debug.threadCpuTimeNanos());
    }
}
