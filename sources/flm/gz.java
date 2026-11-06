package flm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gz {
    private static gz e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new ha(this));
    public hc c;
    public hc d;

    public static gz a() {
        if (e == null) {
            e = new gz();
        }
        return e;
    }

    private gz() {
    }

    public final void a(hb hbVar) {
        synchronized (this.a) {
            if (d(hbVar) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void b(hb hbVar) {
        synchronized (this.a) {
            if (d(hbVar) && this.c.c) {
                this.c.c = false;
                a(this.c);
            }
        }
    }

    public final boolean c(hb hbVar) {
        boolean z;
        synchronized (this.a) {
            z = d(hbVar) || e(hbVar);
        }
        return z;
    }

    public final void b() {
        if (this.d != null) {
            this.c = this.d;
            this.d = null;
            hb hbVar = (hb) this.c.a.get();
            if (hbVar != null) {
                hbVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public final boolean a(hc hcVar, int i) {
        hb hbVar = (hb) hcVar.a.get();
        if (hbVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(hcVar);
        hbVar.a(i);
        return true;
    }

    public final boolean d(hb hbVar) {
        return this.c != null && this.c.a(hbVar);
    }

    public final boolean e(hb hbVar) {
        return this.d != null && this.d.a(hbVar);
    }

    public final void a(hc hcVar) {
        if (hcVar.b != -2) {
            int i = 2750;
            if (hcVar.b > 0) {
                i = hcVar.b;
            } else if (hcVar.b == -1) {
                i = 1500;
            }
            this.b.removeCallbacksAndMessages(hcVar);
            this.b.sendMessageDelayed(Message.obtain(this.b, 0, hcVar), i);
        }
    }
}
