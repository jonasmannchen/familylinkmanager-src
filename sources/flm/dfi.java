package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dfi implements dfh {
    private static boolean c() {
        try {
            SystemClock.elapsedRealtimeNanos();
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // flm.dfh
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // flm.dfh
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    static {
        c();
    }
}
