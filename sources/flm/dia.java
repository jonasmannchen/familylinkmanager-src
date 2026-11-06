package flm;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dia implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dhz b;

    dia(dhz dhzVar, Context context) {
        this.b = dhzVar;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.j.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.b);
            this.b.a.i.set(SystemClock.elapsedRealtime());
            dox doxVar = this.b.a.e;
            File fileA = dkj.a(this.a);
            if (doxVar.a != null) {
                doy doyVar = doxVar.a;
                if (doyVar.e.c == null) {
                    dkm.a(3, "LeakWatcherThread", "Skip heap dump. No leak suspects found.", new Object[0]);
                    return;
                }
                doyVar.b = (File) dse.a(fileA);
                doyVar.interrupt();
                dkm.a(3, "LeakWatcherThread", "Schedule for heap dump", new Object[0]);
            }
        }
    }
}
