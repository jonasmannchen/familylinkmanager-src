package flm;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axp {
    public volatile Object a;
    public final axr b;
    private final axq c;

    public axp(Looper looper, Object obj, String str) {
        this.c = new axq(this, looper);
        this.a = bdi.checkNotNull(obj, "Listener must not be null");
        this.b = new axr(obj, bdi.checkNotEmpty(str));
    }

    public final void a(axs axsVar) {
        bdi.checkNotNull(axsVar, "Notifier must not be null");
        this.c.sendMessage(this.c.obtainMessage(1, axsVar));
    }
}
