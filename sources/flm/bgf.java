package flm;

import com.google.android.gms.common.stats.StatsEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgf implements Runnable {
    private final String a;
    private final Object b;
    private final /* synthetic */ bgd c;

    bgf(bgd bgdVar, String str, Object obj) {
        this.c = bgdVar;
        this.a = str;
        this.b = obj;
    }

    bgf(bgd bgdVar, String str, StatsEvent statsEvent, StatsEvent statsEvent2) {
        this.c = bgdVar;
        this.a = str;
        this.b = statsEvent2.a(statsEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
