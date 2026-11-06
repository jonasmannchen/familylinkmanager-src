package flm;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zd implements Runnable {
    private final /* synthetic */ ze a;
    private final /* synthetic */ MenuItem b;
    private final /* synthetic */ zi c;
    private final /* synthetic */ zc d;

    zd(zc zcVar, ze zeVar, MenuItem menuItem, zi ziVar) {
        this.d = zcVar;
        this.a = zeVar;
        this.b = menuItem;
        this.c = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            this.d.a.f = true;
            this.a.b.a(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, (zy) null, 4);
        }
    }
}
