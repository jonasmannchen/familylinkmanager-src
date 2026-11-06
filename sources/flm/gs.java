package flm;

import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gs {
    private hb a;

    public gs(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.e = SwipeDismissBehavior.a(0.0f, 0.1f, 1.0f);
        swipeDismissBehavior.f = SwipeDismissBehavior.a(0.0f, 0.6f, 1.0f);
        swipeDismissBehavior.c = 0;
    }

    public final void a(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar.h;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    gz.a().a(this.a);
                }
                break;
            case 1:
            case 3:
                gz.a().b(this.a);
                break;
        }
    }
}
