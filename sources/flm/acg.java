package flm;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acg extends Spinner {
    private static final int[] d = {R.attr.spinnerMode};
    public acj a;
    public int b;
    public final Rect c;
    private final abk e;
    private final Context f;
    private adx g;
    private SpinnerAdapter h;
    private final boolean i;

    public acg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.chimeraresources.R.attr.spinnerStyle);
    }

    public acg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private acg(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private acg(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        this.c = new Rect();
        ahe aheVarA = ahe.a(context, attributeSet, xl.cc, i, 0);
        this.e = new abk(this);
        int iG = aheVarA.g(xl.ch, 0);
        if (iG != 0) {
            this.f = new yj(context, iG);
        } else {
            this.f = Build.VERSION.SDK_INT < 23 ? context : null;
        }
        if (this.f != null) {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, 0);
                    try {
                        i2 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : i2;
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                    } catch (Exception e) {
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                    } catch (Throwable th) {
                        typedArray = typedArrayObtainStyledAttributes;
                        th = th;
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (i2 == 1) {
                acj acjVar = new acj(this, this.f, attributeSet, i);
                ahe aheVarA2 = ahe.a(this.f, attributeSet, xl.cc, i, 0);
                this.b = aheVarA2.f(xl.cd, -2);
                acjVar.a(aheVarA2.a(xl.cf));
                acjVar.a = aheVarA.d(xl.cg);
                aheVarA2.b.recycle();
                this.a = acjVar;
                this.g = new ach(this, this, acjVar);
            }
        }
        CharSequence[] textArray = aheVarA.b.getTextArray(xl.ce);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.google.android.chimeraresources.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        aheVarA.b.recycle();
        this.i = true;
        if (this.h != null) {
            setAdapter(this.h);
            this.h = null;
        }
        this.e.a(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        if (this.a != null) {
            return this.f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.a != null) {
            this.a.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(xn.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        return this.a != null ? this.a.s.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        if (this.a != null) {
            this.a.a(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        return this.a != null ? this.a.f() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        if (this.a != null) {
            this.a.g = i;
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        return this.a != null ? this.a.g : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.a != null) {
            this.b = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.a != null ? this.b : super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.a != null) {
            this.a.a(new aci(spinnerAdapter, (this.f == null ? getContext() : this.f).getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null && this.a.s.isShowing()) {
            this.a.c();
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        if (this.a == null) {
            return super.performClick();
        }
        if (!this.a.s.isShowing()) {
            this.a.b();
        }
        return true;
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        if (this.a != null) {
            this.a.a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        return this.a != null ? this.a.a : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.e != null) {
            this.e.a(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.e != null) {
            this.e.d();
        }
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view2 = null;
        int iMax3 = 0;
        int i = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
            } else {
                itemViewType = i;
                view = view2;
            }
            view2 = spinnerAdapter.getView(iMax2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view2.getMeasuredWidth());
            iMax2++;
            i = itemViewType;
        }
        if (drawable == null) {
            return iMax3;
        }
        drawable.getPadding(this.c);
        return this.c.left + this.c.right + iMax3;
    }
}
