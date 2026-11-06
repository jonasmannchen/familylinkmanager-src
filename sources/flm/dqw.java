package flm;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqw extends ContentObserver {
    private final /* synthetic */ dqu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dqw(dqu dquVar, Handler handler) {
        super(null);
        this.a = dquVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        dqu dquVar = this.a;
        synchronized (dquVar.b) {
            dquVar.c = null;
            drf.a.incrementAndGet();
        }
        synchronized (dquVar) {
            Iterator it = dquVar.d.iterator();
            while (it.hasNext()) {
                ((dqx) it.next()).a();
            }
        }
    }
}
