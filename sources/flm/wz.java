package flm;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wz implements ahk {
    private final /* synthetic */ wx a;

    wz(wx wxVar) {
        this.a = wxVar;
    }

    @Override // flm.ahk
    public final boolean a(MenuItem menuItem) {
        return this.a.c.onMenuItemSelected(0, menuItem);
    }
}
