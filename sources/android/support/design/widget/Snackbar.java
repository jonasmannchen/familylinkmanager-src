package android.support.design.widget;

import android.content.Context;
import android.support.design.snackbar.SnackbarContentLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;
import flm.fp;
import flm.gx;
import flm.hn;
import flm.hp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class Snackbar extends hn {
    private Snackbar(ViewGroup viewGroup, View view, gx gxVar) {
        super(viewGroup, view, gxVar);
    }

    /* JADX INFO: compiled from: PG */
    public final class SnackbarLayout extends hp {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:32:0x003e A[SYNTHETIC] */
    public static Snackbar a(View view, int i, int i2) {
        int i3;
        Object parent;
        CharSequence text = view.getResources().getText(i);
        ViewGroup viewGroup = null;
        View view2 = view;
        do {
            if (view2 instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view2;
                break;
            }
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    viewGroup = (ViewGroup) view2;
                    break;
                }
                viewGroup = (ViewGroup) view2;
                if (view2 != null) {
                    parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                }
            } else if (view2 != null) {
                parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
            }
        } while (view2 != null);
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (fp.b(viewGroup.getContext())) {
            i3 = R.layout.mtrl_layout_snackbar_include;
        } else {
            i3 = R.layout.design_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i3, viewGroup, false);
        Snackbar snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.c.getChildAt(0)).a.setText(text);
        snackbar.e = -1;
        return snackbar;
    }
}
