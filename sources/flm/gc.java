package flm;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gc implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.c.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.c.getLayoutParams();
                    if (layoutParams instanceof hv) {
                        hv hvVar = (hv) layoutParams;
                        SwipeDismissBehavior swipeDismissBehaviorG = baseTransientBottomBar.g();
                        if (swipeDismissBehaviorG instanceof BaseTransientBottomBar.Behavior) {
                            ((BaseTransientBottomBar.Behavior) swipeDismissBehaviorG).g.a(baseTransientBottomBar);
                        }
                        swipeDismissBehaviorG.b = new gm(baseTransientBottomBar);
                        hvVar.a(swipeDismissBehaviorG);
                        hvVar.g = 80;
                    }
                    baseTransientBottomBar.g = 0;
                    baseTransientBottomBar.a();
                    baseTransientBottomBar.b.addView(baseTransientBottomBar.c);
                }
                baseTransientBottomBar.c.b = new gn(baseTransientBottomBar);
                if (!ti.w(baseTransientBottomBar.c)) {
                    baseTransientBottomBar.c.a = new gp(baseTransientBottomBar);
                } else if (baseTransientBottomBar.k()) {
                    baseTransientBottomBar.h();
                } else {
                    baseTransientBottomBar.j();
                }
                return true;
            case 1:
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i = message.arg1;
                if (!baseTransientBottomBar2.k() || baseTransientBottomBar2.c.getVisibility() != 0) {
                    baseTransientBottomBar2.b(i);
                } else if (baseTransientBottomBar2.c.c == 1) {
                    ValueAnimator valueAnimatorA = baseTransientBottomBar2.a(1.0f, 0.0f);
                    valueAnimatorA.setDuration(75L);
                    valueAnimatorA.addListener(new gr(baseTransientBottomBar2, i));
                    valueAnimatorA.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar2.i());
                    valueAnimator.setInterpolator(dz.b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new gh(baseTransientBottomBar2, i));
                    valueAnimator.addUpdateListener(new gi(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            default:
                return false;
        }
    }
}
