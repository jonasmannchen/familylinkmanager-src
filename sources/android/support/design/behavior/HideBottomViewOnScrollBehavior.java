package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import flm.dz;
import flm.ek;
import flm.hs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends hs {
    public ViewPropertyAnimator a;
    private int b;
    private int c;

    public HideBottomViewOnScrollBehavior() {
        this.b = 0;
        this.c = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 2;
    }

    @Override // flm.hs
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight();
        return super.a(coordinatorLayout, view, i);
    }

    @Override // flm.hs
    public final boolean a(int i) {
        return i == 2;
    }

    @Override // flm.hs
    public final void a(View view, int i) {
        if (this.c != 1 && i > 0) {
            c(view);
        } else if (this.c != 2 && i < 0) {
            b(view);
        }
    }

    public void b(View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 2;
        a(view, 0, 225L, dz.d);
    }

    public void c(View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 1;
        a(view, this.b, 175L, dz.c);
    }

    private final void a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ek(this));
    }
}
