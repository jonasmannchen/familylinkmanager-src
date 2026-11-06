package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpp {
    public final Object a = new Object();
    public int b = 0;
    public long c = 0;
    private final int d;

    public dpp(int i) {
        this.d = i;
    }

    public final boolean a() {
        boolean z = false;
        synchronized (this.a) {
            if (SystemClock.elapsedRealtime() - this.c <= 1000 && this.b >= this.d) {
                z = true;
            }
        }
        return z;
    }
}
