package flm;

import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gn implements gt {
    public final /* synthetic */ BaseTransientBottomBar a;

    gn(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // flm.gt
    public final void a() {
    }

    @Override // flm.gt
    public final void b() {
        if (gz.a().c(this.a.h)) {
            BaseTransientBottomBar.a.post(new go(this));
        }
    }
}
