package flm;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eg extends ei {
    public final Rect a;
    public int b;
    public int c;
    private final Rect d;

    public eg() {
        this.a = new Rect();
        this.d = new Rect();
        this.b = 0;
    }

    public abstract View a(List list);

    public eg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.d = new Rect();
        this.b = 0;
    }

    @Override // flm.hs
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewA;
        int i5;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (viewA = a(coordinatorLayout.a(view))) != null) {
            if (ti.p(viewA) && !ti.p(view)) {
                ti.b(view, true);
                if (ti.p(view)) {
                    view.requestLayout();
                    return true;
                }
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            int iC = (size + c(viewA)) - viewA.getMeasuredHeight();
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(iC, i5), i4);
            return true;
        }
        return false;
    }

    @Override // flm.ei
    protected final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewA = a(coordinatorLayout.a(view));
        if (viewA != null) {
            hv hvVar = (hv) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + hvVar.leftMargin, viewA.getBottom() + hvVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - hvVar.rightMargin, ((coordinatorLayout.getHeight() + viewA.getBottom()) - coordinatorLayout.getPaddingBottom()) - hvVar.bottomMargin);
            tz tzVar = coordinatorLayout.c;
            if (tzVar != null && ti.p(coordinatorLayout) && !ti.p(view)) {
                rect.left += tzVar.a();
                rect.right -= tzVar.c();
            }
            Rect rect2 = this.d;
            int i2 = hvVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            sz.a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int iD = d(viewA);
            view.layout(rect2.left, rect2.top - iD, rect2.right, rect2.bottom - iD);
            this.b = rect2.top - viewA.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.b = 0;
    }

    public float b(View view) {
        return 1.0f;
    }

    public final int d(View view) {
        if (this.c == 0) {
            return 0;
        }
        return ql.a((int) (b(view) * this.c), 0, this.c);
    }

    public int c(View view) {
        return view.getMeasuredHeight();
    }
}
