package flm;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class ho extends SwipeDismissBehavior {
    private final gs g = new gs(this);

    public ho(hn hnVar) {
        this.g.a(hnVar);
    }

    @Override // android.support.design.behavior.SwipeDismissBehavior
    public final boolean b(View view) {
        return view instanceof gv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.design.behavior.SwipeDismissBehavior, flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, hp hpVar, MotionEvent motionEvent) {
        this.g.a(coordinatorLayout, hpVar, motionEvent);
        return super.a(coordinatorLayout, (View) hpVar, motionEvent);
    }
}
