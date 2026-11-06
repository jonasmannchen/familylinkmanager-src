package flm;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ef implements Runnable {
    private final CoordinatorLayout a;
    private final View b;
    private final /* synthetic */ ee c;

    ef(ee eeVar, CoordinatorLayout coordinatorLayout, View view) {
        this.c = eeVar;
        this.a = coordinatorLayout;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != null && this.c.b != null) {
            if (this.c.b.computeScrollOffset()) {
                this.c.a_(this.a, this.b, this.c.b.getCurrY());
                ti.a(this.b, this);
            } else {
                this.c.a(this.a, this.b);
            }
        }
    }
}
