package flm;

import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hw implements ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ CoordinatorLayout a;

    public hw(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a(0);
        return true;
    }
}
