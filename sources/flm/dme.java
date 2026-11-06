package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dme {
    public static final dme d = new dme();
    public final long a;
    public long b;
    public int c;
    public boolean e;

    dme() {
        this(SystemClock.elapsedRealtime());
    }

    public static boolean a(dme dmeVar) {
        return dmeVar == null || dmeVar == d;
    }

    private dme(long j) {
        this.b = -1L;
        this.c = dp.M;
        this.e = false;
        this.a = j;
    }

    dme(long j, long j2) {
        this.b = -1L;
        this.c = dp.M;
        this.e = false;
        boolean z = j2 >= j;
        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
        if (!z) {
            throw new IllegalArgumentException(dse.a("End time %s is before start time %s.", objArr));
        }
        this.a = j;
        this.b = j2;
    }

    final long a() {
        return this.b - this.a;
    }
}
