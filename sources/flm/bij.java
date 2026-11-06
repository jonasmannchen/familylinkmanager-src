package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bij implements big {
    public static final bij a = new bij();

    @Override // flm.big
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // flm.big
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    private bij() {
    }
}
