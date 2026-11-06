package flm;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpy {
    private static final AtomicReference a = new AtomicReference(null);

    public static boolean a(dlo dloVar, String str, int i, int i2) {
        dse.a(dloVar);
        dse.a(str);
        if (a.get() != null) {
            dkm.a(3, "Tracer", "Ignore Tracer.start(), current active trace...", new Object[0]);
            return false;
        }
        if (a.compareAndSet(null, new dpu(str))) {
            dkm.a(3, "Tracer", "Start tracing with buffer: %d", Integer.valueOf(i2));
            return true;
        }
        dkm.a(3, "Tracer", "Ignore Tracer.start(), current active trace...", new Object[0]);
        return false;
    }

    public static dpu a(dlo dloVar, String str) {
        dse.a(dloVar);
        dse.b(!TextUtils.isEmpty(str));
        dpu dpuVar = (dpu) a.getAndSet(null);
        if (dpuVar != null) {
            dpuVar.b.a = str;
        }
        dkm.a(3, "Tracer", "Stop trace: %s", str);
        return dpuVar;
    }

    public static void a(dlo dloVar) {
        dse.a(dloVar);
        dpu dpuVar = (dpu) a.getAndSet(null);
        if (dpuVar != null) {
            dkm.a(3, "Tracer", "Cancel trace: %s", dpuVar.b.a);
        }
    }

    public static grj[] a(dlo dloVar, dpu dpuVar) {
        dse.a(dloVar);
        dsg.b();
        if (dpuVar.a.get() == 0) {
            return null;
        }
        return new dpt(dpuVar.a()).a();
    }

    public static void a(dlo dloVar, String str, long j, long j2) {
        dse.a(dloVar);
        dpu dpuVar = (dpu) a.get();
        if (dpuVar != null && dpuVar.b.c <= j) {
            dkm.a(3, "TraceData", "Sideload span: %s. startMs: %d, durationMs: %d", str, Long.valueOf(j), Long.valueOf(j2));
            dps dpsVarA = dps.a(dlo.a, str, dp.R, j, j + j2, Thread.currentThread().getId(), dp.W);
            synchronized (dpuVar.d) {
                dpuVar.d.add(dpsVarA);
            }
            dpuVar.a.incrementAndGet();
        }
    }

    public static void b(dlo dloVar) {
        dse.a(dloVar);
        a.set(null);
    }
}
