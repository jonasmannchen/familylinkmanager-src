package android.support.design.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import flm.eb;
import flm.ed;
import flm.ee;
import flm.eg;
import flm.eh;
import flm.hs;
import flm.ht;
import flm.hv;
import flm.ql;
import flm.ti;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ht(a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* JADX INFO: compiled from: PG */
    public class ScrollingViewBehavior extends eg {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eh.b);
            ((eg) this).c = typedArrayObtainStyledAttributes.getDimensionPixelSize(eh.c, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // flm.hs
        public final boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // flm.hs
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            hs hsVar = ((hv) view2.getLayoutParams()).a;
            if (hsVar instanceof BaseBehavior) {
                ti.d(view, ((((BaseBehavior) hsVar).a + (view2.getBottom() - view.getTop())) + ((eg) this).b) - d(view2));
            }
            if (view2 instanceof AppBarLayout) {
                throw new NoSuchMethodError();
            }
            return false;
        }

        @Override // flm.hs
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            if (b(coordinatorLayout.a(view)) != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    throw new NoSuchMethodError();
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.eg
        public final float b(View view) {
            if (view instanceof AppBarLayout) {
                throw new NoSuchMethodError();
            }
            return 0.0f;
        }

        private static AppBarLayout b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.eg
        public final int c(View view) {
            if (view instanceof AppBarLayout) {
                throw new NoSuchMethodError();
            }
            return super.c(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.eg
        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        @Override // flm.eg, flm.hs
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends ee {
        public int a;
        private int c;
        private ValueAnimator d;
        private int e;
        private boolean f;
        private float g;
        private WeakReference h;

        public BaseBehavior() {
            this.e = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
        }

        @Override // flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            if ((i & 2) != 0) {
                throw new NoSuchMethodError();
            }
            this.h = null;
            this.c = i2;
            return false;
        }

        @Override // flm.hs
        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if (i2 != 0) {
                if (i2 < 0) {
                    throw new NoSuchMethodError();
                }
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }

        @Override // flm.hs
        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                throw new NoSuchMethodError();
            }
        }

        @Override // flm.hs
        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.c == 0 || i == 1) {
                b(coordinatorLayout, appBarLayout);
                throw new NoSuchMethodError();
            }
            this.h = new WeakReference(view);
        }

        private final void b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i;
            int iK;
            int i2;
            int i3;
            int iA = a();
            int i4 = 0;
            int childCount = appBarLayout.getChildCount();
            while (true) {
                if (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    ed edVar = (ed) childAt.getLayoutParams();
                    if (a(edVar.a, 32)) {
                        int i5 = top - edVar.topMargin;
                        i2 = edVar.bottomMargin + bottom;
                        i3 = i5;
                    } else {
                        i2 = bottom;
                        i3 = top;
                    }
                    if (i3 <= (-iA) && i2 >= (-iA)) {
                        i = i4;
                        break;
                    }
                    i4++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ed edVar2 = (ed) childAt2.getLayoutParams();
                int i6 = edVar2.a;
                if ((i6 & 17) == 17) {
                    int i7 = -childAt2.getTop();
                    int iK2 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        throw new NoSuchMethodError();
                    }
                    if (a(i6, 2)) {
                        iK2 += ti.k(childAt2);
                        iK = i7;
                    } else if (a(i6, 5)) {
                        iK = ti.k(childAt2) + iK2;
                        if (iA >= iK) {
                            iK2 = iK;
                            iK = i7;
                        }
                    } else {
                        iK = i7;
                    }
                    if (a(i6, 32)) {
                        iK += edVar2.topMargin;
                        iK2 -= edVar2.bottomMargin;
                    }
                    if (iA < (iK2 + iK) / 2) {
                    }
                    throw new NoSuchMethodError();
                }
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((hv) appBarLayout.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.a(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // flm.ei, flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            super.a(coordinatorLayout, (View) appBarLayout, i);
            throw new NoSuchMethodError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final int a() {
            return b() + this.a;
        }

        @Override // flm.hs
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Parcelable b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableB = super.b(coordinatorLayout, (View) appBarLayout);
            int iB = b();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iB;
                if (childAt.getTop() + iB <= 0 && bottom >= 0) {
                    new eb(parcelableB).a = i;
                    ti.k(childAt);
                    throw new NoSuchMethodError();
                }
            }
            return parcelableB;
        }

        @Override // flm.hs
        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof eb) {
                eb ebVar = (eb) parcelable;
                super.a(coordinatorLayout, (View) appBarLayout, ebVar.e);
                this.e = ebVar.a;
                this.g = ebVar.b;
                this.f = ebVar.c;
                return;
            }
            super.a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.e = -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final /* synthetic */ int a(View view) {
            throw new NoSuchMethodError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final /* synthetic */ int b(View view) {
            throw new NoSuchMethodError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final /* synthetic */ boolean c(View view) {
            View view2;
            return this.h == null || !((view2 = (View) this.h.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view) {
            b(coordinatorLayout, (AppBarLayout) view);
            throw new NoSuchMethodError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // flm.ee
        public final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int iA = a();
            if (i2 != 0 && iA >= i2 && iA <= i3) {
                if (iA != ql.a(i, i2, i3)) {
                    throw new NoSuchMethodError();
                }
            } else {
                this.a = 0;
            }
            return 0;
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        throw new NoSuchMethodError();
    }
}
