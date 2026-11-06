package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;
import flm.aei;
import flm.aej;
import flm.sz;
import flm.ti;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends aei {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iCombineMeasuredStates;
        int i6;
        int i7;
        int iCombineMeasuredStates2;
        boolean z;
        int iMakeMeasureSpec;
        View view;
        View view2 = null;
        View view3 = null;
        int childCount = getChildCount();
        int i8 = 0;
        View view4 = null;
        while (true) {
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        View view5 = view3;
                        view = childAt;
                        childAt = view5;
                    } else if (id == R.id.buttonPanel) {
                        view = view2;
                    } else if (id == R.id.contentPanel || id == R.id.customPanel) {
                        if (view4 != null) {
                            z = false;
                            break;
                        } else {
                            view4 = childAt;
                            childAt = view3;
                            view = view2;
                        }
                    } else {
                        z = false;
                        break;
                    }
                } else {
                    childAt = view3;
                    view = view2;
                }
                i8++;
                view2 = view;
                view3 = childAt;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int iCombineMeasuredStates3 = 0;
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view2 != null) {
                    view2.measure(i, 0);
                    paddingBottom += view2.getMeasuredHeight();
                    iCombineMeasuredStates3 = View.combineMeasuredStates(0, view2.getMeasuredState());
                }
                int iA = 0;
                if (view3 == null) {
                    i3 = 0;
                } else {
                    view3.measure(i, 0);
                    iA = a(view3);
                    int measuredHeight = view3.getMeasuredHeight() - iA;
                    paddingBottom += iA;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view3.getMeasuredState());
                    i3 = measuredHeight;
                }
                if (view4 == null) {
                    i4 = 0;
                } else {
                    if (mode == 0) {
                        iMakeMeasureSpec = 0;
                    } else {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
                    }
                    view4.measure(i, iMakeMeasureSpec);
                    int measuredHeight2 = view4.getMeasuredHeight();
                    paddingBottom += measuredHeight2;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view4.getMeasuredState());
                    i4 = measuredHeight2;
                }
                int i9 = size - paddingBottom;
                if (view3 != null) {
                    int i10 = paddingBottom - iA;
                    int iMin = Math.min(i9, i3);
                    if (iMin > 0) {
                        i9 -= iMin;
                        iA += iMin;
                    }
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(iA, 1073741824));
                    int measuredHeight3 = view3.getMeasuredHeight() + i10;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates3, view3.getMeasuredState());
                    int i11 = i9;
                    i6 = measuredHeight3;
                    i5 = i11;
                } else {
                    i5 = i9;
                    iCombineMeasuredStates = iCombineMeasuredStates3;
                    i6 = paddingBottom;
                }
                if (view4 == null || i5 <= 0) {
                    i7 = i6;
                    iCombineMeasuredStates2 = iCombineMeasuredStates;
                } else {
                    view4.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + i4, mode));
                    int measuredHeight4 = (i6 - i4) + view4.getMeasuredHeight();
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, view4.getMeasuredState());
                    i7 = measuredHeight4;
                }
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        iMax = Math.max(iMax, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates2), View.resolveSizeAndState(i7, i2, 0));
                if (mode2 != 1073741824) {
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt3 = getChildAt(i13);
                        if (childAt3.getVisibility() != 8) {
                            aej aejVar = (aej) childAt3.getLayoutParams();
                            if (aejVar.width == -1) {
                                int i14 = aejVar.height;
                                aejVar.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, iMakeMeasureSpec2, 0, i2, 0);
                                aejVar.height = i14;
                            }
                        }
                    }
                }
                z = true;
                break;
            }
        }
        if (!z) {
            super.onMeasure(i, i2);
        }
    }

    private static int a(View view) {
        View childAt = view;
        while (true) {
            int iK = ti.k(childAt);
            if (iK > 0) {
                return iK;
            }
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() == 1) {
                    childAt = viewGroup.getChildAt(0);
                }
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i8 = this.g;
        int i9 = i8 & 8388615;
        switch (i8 & 112) {
            case 16:
                paddingTop = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        Drawable drawable = this.h;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        int i10 = 0;
        int i11 = paddingTop;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt == null || childAt.getVisibility() == 8) {
                i5 = i11;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                aej aejVar = (aej) childAt.getLayoutParams();
                int i12 = aejVar.h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (sz.a(i12, ti.f(this)) & 7) {
                    case 1:
                        i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aejVar.leftMargin) - aejVar.rightMargin;
                        break;
                    case 5:
                        i6 = (paddingRight - measuredWidth) - aejVar.rightMargin;
                        break;
                    default:
                        i6 = aejVar.leftMargin + paddingLeft;
                        break;
                }
                if (b(i10)) {
                    i11 += intrinsicHeight;
                }
                int i13 = i11 + aejVar.topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, i13 + measuredHeight2);
                i5 = aejVar.bottomMargin + measuredHeight2 + i13;
            }
            i10++;
            i11 = i5;
        }
    }
}
