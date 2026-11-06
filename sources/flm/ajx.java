package flm;

import android.os.SystemClock;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajx {
    public static final boolean a = VolleyLog.DEBUG;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.b.add(new ajy(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void a(String str) {
        this.c = true;
        long j = this.b.size() == 0 ? 0L : ((ajy) this.b.get(this.b.size() - 1)).c - ((ajy) this.b.get(0)).c;
        if (j > 0) {
            long j2 = ((ajy) this.b.get(0)).c;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(j), str);
            long j3 = j2;
            for (ajy ajyVar : this.b) {
                long j4 = ajyVar.c;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(ajyVar.b), ajyVar.a);
                j3 = j4;
            }
        }
    }

    protected final void finalize() {
        if (!this.c) {
            a("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
