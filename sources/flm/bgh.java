package flm;

import com.google.android.gms.common.stats.StatsEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgh implements Runnable {
    private final String a;
    private final StatsEvent b;
    private final /* synthetic */ bgd c;

    bgh(bgd bgdVar, String str, StatsEvent statsEvent) {
        this.c = bgdVar;
        this.a = str;
        this.b = statsEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g();
        this.c.b.submit(new bgf(this.c, this.a, this.b));
        synchronized (this.c.c) {
            bgg bggVar = (bgg) this.c.c.get(this.b.c());
            if (bggVar != null && bggVar.a == this.b) {
                this.c.c.remove(this.b.c());
            }
        }
    }
}
