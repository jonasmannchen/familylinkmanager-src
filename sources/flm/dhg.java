package flm;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhg implements Window.OnFrameMetricsAvailableListener, dfw, dfx {
    public Activity a;
    public boolean b;
    public HandlerThread c;
    public Handler d;
    private final dhh e;
    private final boolean f;

    dhg(dhh dhhVar, boolean z) {
        this.e = dhhVar;
        this.f = z;
        if (z) {
            this.b = true;
        }
    }

    final void a() {
        if (this.a != null) {
            Window window = this.a.getWindow();
            if (this.d == null) {
                this.c = new HandlerThread("Primes-Jank");
                this.c.start();
                this.d = new Handler(this.c.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(this, this.d);
        }
    }

    private final void c() {
        if (this.a != null) {
            try {
                this.a.getWindow().removeOnFrameMetricsAvailableListener(this);
            } catch (RuntimeException e) {
                dkm.a("FrameMetricService", "remove frame metrics listener failed", e, new Object[0]);
            }
        }
    }

    @Override // flm.dfx
    public final void b(Activity activity) {
        if (this.f) {
            this.e.a(c(activity));
        }
        synchronized (this) {
            this.a = activity;
            if (this.b) {
                a();
            }
        }
    }

    @Override // flm.dfw
    public final void a(Activity activity) {
        synchronized (this) {
            if (this.b) {
                c();
            }
            this.a = null;
        }
        if (this.f) {
            this.e.b(c(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String c(Activity activity) {
        return activity instanceof dmn ? dim.a(((dmn) activity).a()) : activity.getClass().getName();
    }

    final void b() {
        synchronized (this) {
            this.b = false;
            c();
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        this.e.a((int) (frameMetrics.getMetric(8) / 1000000.0d));
    }
}
