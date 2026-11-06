package android.support.design.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import flm.fh;
import flm.fl;
import flm.fr;
import flm.hs;
import flm.ht;
import flm.hv;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ht(a = Behavior.class)
public class FloatingActionButton extends fr {
    @Override // android.widget.ImageView, android.view.View
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

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends hs {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fh.a);
            this.b = typedArrayObtainStyledAttributes.getBoolean(fh.b, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // flm.hs
        public void a(hv hvVar) {
            if (hvVar.h == 0) {
                hvVar.h = 80;
            }
        }

        @Override // flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (b(view)) {
                b(view, floatingActionButton);
                return false;
            }
            return false;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof hv) {
                return ((hv) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean a(View view, FloatingActionButton floatingActionButton) {
            hv hvVar = (hv) floatingActionButton.getLayoutParams();
            if (this.b && hvVar.f == view.getId()) {
                throw new NoSuchMethodError();
            }
            return false;
        }

        private final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            fl.a(coordinatorLayout, appBarLayout, rect);
            int i = rect.bottom;
            throw new NoSuchMethodError();
        }

        private final boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            hv hvVar = (hv) floatingActionButton.getLayoutParams();
            if (view.getTop() < hvVar.topMargin + (floatingActionButton.getHeight() / 2)) {
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }

        @Override // flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listA.get(i2);
                if (view instanceof AppBarLayout) {
                    if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (b(view) && b(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.a(floatingActionButton, i);
            return true;
        }

        @Override // flm.hs
        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = null;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        throw new NoSuchMethodError();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        throw new NoSuchMethodError();
    }
}
