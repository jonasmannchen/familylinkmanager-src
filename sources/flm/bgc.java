package flm;

import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgc {
    private final long a;
    private final int b;
    private final so c;

    public bgc() {
        this.a = 60000L;
        this.b = 10;
        this.c = new so(10);
    }

    public bgc(int i, long j) {
        this.a = j;
        this.b = 1024;
        this.c = new so();
    }

    public final Long a(String str) {
        Long l;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        synchronized (this) {
            long j2 = j;
            while (this.c.size() >= this.b) {
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    if (jElapsedRealtime - ((Long) this.c.c(size)).longValue() > j2) {
                        this.c.d(size);
                    }
                }
                long j3 = j2 / 2;
                Log.w("ConnectionTracker", new StringBuilder(94).append("The max capacity ").append(this.b).append(" is not enough. Current durationThreshold is: ").append(j3).toString());
                j2 = j3;
            }
            l = (Long) this.c.put(str, Long.valueOf(jElapsedRealtime));
        }
        return l;
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this) {
            z = this.c.remove(str) != null;
        }
        return z;
    }
}
