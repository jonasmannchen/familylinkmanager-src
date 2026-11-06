package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drq implements drr {
    @Override // flm.drr
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // flm.drr
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
