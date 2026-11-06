package flm;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xb implements zj {
    private final /* synthetic */ wx a;

    xb(wx wxVar) {
        this.a = wxVar;
    }

    @Override // flm.zj
    public final boolean a(zi ziVar, MenuItem menuItem) {
        return false;
    }

    @Override // flm.zj
    public final void a(zi ziVar) {
        if (this.a.c != null) {
            if (this.a.a.h()) {
                this.a.c.onPanelClosed(108, ziVar);
            } else if (this.a.c.onPreparePanel(0, null, ziVar)) {
                this.a.c.onMenuOpened(108, ziVar);
            }
        }
    }
}
