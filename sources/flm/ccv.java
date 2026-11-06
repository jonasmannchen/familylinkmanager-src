package flm;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccv implements t {
    private final Context a;
    private final ccw b = new ccw();
    private boolean c = false;

    public ccv(Context context) {
        this.a = context;
    }

    @Override // flm.t
    public final void a(af afVar) {
    }

    @Override // flm.t
    public final void b(af afVar) {
    }

    @Override // flm.t
    public final void c(af afVar) {
    }

    @Override // flm.t
    public final void d(af afVar) {
    }

    @Override // flm.t
    public final void a() {
        if (!this.c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.setPriority(999);
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
            intentFilter.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter.addAction("android.intent.action.USER_FOREGROUND");
            if (!bus.b(this.a)) {
                intentFilter.addAction("android.intent.action.DATE_CHANGED");
                intentFilter.addAction("android.location.MODE_CHANGED");
            }
            this.a.registerReceiver(this.b, intentFilter);
            this.c = true;
            btv.c("Persistent", "Registered system events observer", new Object[0]);
        }
    }

    @Override // flm.t
    public final void b() {
        if (this.c) {
            btv.c("Persistent", "Un-register system events observer", new Object[0]);
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
