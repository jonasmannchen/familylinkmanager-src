package flm;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class dgk implements dms {
    public static final dms a = new dgk();

    private dgk() {
    }

    @Override // flm.dms
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
