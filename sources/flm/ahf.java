package flm;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahf implements abf {
    private final /* synthetic */ Toolbar a;

    public ahf(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // flm.abf
    public final boolean a(MenuItem menuItem) {
        if (this.a.q != null) {
            return this.a.q.a(menuItem);
        }
        return false;
    }
}
