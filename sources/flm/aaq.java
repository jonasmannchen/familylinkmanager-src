package flm;

import android.support.v7.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aaq implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public aaq(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        this.a.h = this.a.b.animate().translationY(-this.a.b.getHeight()).setListener(this.a.i);
    }
}
