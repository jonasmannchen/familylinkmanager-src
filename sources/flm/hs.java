package flm;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hs {
    public hs() {
    }

    public hs(Context context, AttributeSet attributeSet) {
    }

    public void a(hv hvVar) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean a_(View view) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    @Deprecated
    public boolean a(int i) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return a(i);
        }
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    @Deprecated
    public void a(View view, int i) {
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            a(view, i2);
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }
}
