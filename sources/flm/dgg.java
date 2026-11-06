package flm;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgg implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private Boolean h;
    private volatile String i;
    private volatile Activity j;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();

    dgg() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        this.c.incrementAndGet();
        this.j = null;
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfu) {
                ((dfu) dftVar).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getApplicationContext();
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfz) {
                ((dfz) dftVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getApplicationContext();
        this.b.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfx) {
                ((dfx) dftVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getApplicationContext();
        this.e.incrementAndGet();
        this.i = null;
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfw) {
                ((dfw) dftVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getApplicationContext();
        this.f.incrementAndGet();
        this.j = activity;
        for (dft dftVar : this.a) {
            if (dftVar instanceof dga) {
                ((dga) dftVar).a();
            }
        }
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfy) {
                ((dfy) dftVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getApplicationContext();
        this.g.incrementAndGet();
        this.j = null;
        for (dft dftVar : this.a) {
            if (dftVar instanceof dfv) {
                ((dfv) dftVar).a(activity);
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (dft dftVar : this.a) {
            if (dftVar instanceof dgd) {
                ((dgd) dftVar).a();
            }
        }
        if (i >= 20 && this.j != null) {
            a(false, this.j);
        }
        this.j = null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    private final void a(Activity activity) {
        a(Boolean.valueOf(dpl.b(activity.getApplicationContext())), activity);
    }

    private final void a(Boolean bool, Activity activity) {
        if (!bool.equals(this.h)) {
            this.h = bool;
            if (bool.booleanValue()) {
                dkm.a(3, "AppLifecycleTracker", "App transition to foreground", new Object[0]);
                for (dft dftVar : this.a) {
                    if (dftVar instanceof dgc) {
                        ((dgc) dftVar).a();
                    }
                }
                return;
            }
            dkm.a(3, "AppLifecycleTracker", "App transition to background", new Object[0]);
            for (dft dftVar2 : this.a) {
                if (dftVar2 instanceof dgb) {
                    ((dgb) dftVar2).b();
                }
            }
        }
    }
}
