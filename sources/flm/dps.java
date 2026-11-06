package flm;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dps {
    public String a;
    public final int b;
    public long c;
    public long d;
    public final long e;
    public int f;
    public volatile List g;

    static dps a(String str, int i, long j, int i2) {
        return new dps(str, i, SystemClock.elapsedRealtime(), -1L, j, i2);
    }

    public static dps a(dlo dloVar, String str, int i, long j, long j2, long j3, int i2) {
        dse.a(dloVar);
        return new dps(str, i, j, j2, j3, i2);
    }

    private dps(String str, int i, long j, long j2, long j3, int i2) {
        this.d = -1L;
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        if (this.f == dp.U) {
            this.g = Collections.synchronizedList(new ArrayList());
        } else {
            this.g = Collections.emptyList();
        }
    }

    public final void a(List list) {
        if (this.g == Collections.EMPTY_LIST) {
            this.g = new ArrayList();
        }
        this.g.addAll(list);
    }

    public final void a(dlo dloVar, dps dpsVar) {
        dse.a(dloVar);
        if (this.g == Collections.EMPTY_LIST) {
            this.g = new ArrayList();
        }
        this.g.add(dpsVar);
    }

    public final boolean a() {
        return this.f == dp.U;
    }

    static {
        new dps("", dp.R, SystemClock.elapsedRealtime(), -1L, Thread.currentThread().getId(), dp.W);
    }
}
