package flm;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class edi extends ecy {
    public static final AtomicReference b = new AtomicReference();
    private static edc d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile ecg c;

    static void b() {
        while (true) {
            edi ediVar = (edi) edj.a.poll();
            if (ediVar == null) {
                c();
                return;
            }
            ediVar.c = ((edc) b.get()).a(ediVar.a());
        }
    }

    edi(String str) {
        super(str);
        this.c = d != null ? d.a(a()) : null;
    }

    private static void c() {
        while (true) {
            edk edkVar = (edk) f.poll();
            if (edkVar != null) {
                e.getAndDecrement();
                ecg ecgVar = edkVar.a;
                ecf ecfVar = edkVar.b;
                if (ecfVar.k() || ecgVar.a(ecfVar.d())) {
                    ecgVar.a(ecfVar);
                }
            } else {
                return;
            }
        }
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        if (this.c != null) {
            return this.c.a(level);
        }
        return true;
    }

    @Override // flm.ecg
    public final void a(ecf ecfVar) {
        if (this.c != null) {
            this.c.a(ecfVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new edk(this, ecfVar));
        if (this.c != null) {
            c();
        }
    }

    static {
        boolean z = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z2 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if (z || z2) {
            d = new edb();
        } else {
            d = null;
        }
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }
}
