package flm;

import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gp implements gu {
    private final /* synthetic */ BaseTransientBottomBar a;

    gp(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // flm.gu
    public final void a() {
        this.a.c.a = null;
        if (this.a.k()) {
            this.a.h();
        } else {
            this.a.j();
        }
    }
}
