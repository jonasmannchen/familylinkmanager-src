package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.aak;
import flm.aan;
import flm.aat;
import flm.ahe;
import flm.aic;
import flm.ti;
import flm.tt;
import flm.xl;
import flm.yg;
import flm.zi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends aak {
    public CharSequence f;
    public CharSequence g;
    public View h;
    public boolean i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private int p;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ahe aheVarA = ahe.a(context, attributeSet, xl.x, i, 0);
        ti.a(this, aheVarA.a(xl.y));
        this.n = aheVarA.g(xl.C, 0);
        this.o = aheVarA.g(xl.B, 0);
        this.d = aheVarA.f(xl.A, 0);
        this.p = aheVarA.g(xl.z, R.layout.abc_action_mode_close_item_material);
        aheVarA.b.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.c();
            this.c.e();
        }
    }

    @Override // flm.aak
    public final void a(int i) {
        this.d = i;
    }

    public final void a(View view) {
        if (this.j != null) {
            removeView(this.j);
        }
        this.j = view;
        if (view != null && this.k != null) {
            removeView(this.k);
            this.k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        c();
    }

    public final void b(CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    private final void c() {
        if (this.k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (TextView) this.k.findViewById(R.id.action_bar_title);
            this.m = (TextView) this.k.findViewById(R.id.action_bar_subtitle);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.f);
        this.m.setText(this.g);
        boolean z = !TextUtils.isEmpty(this.f);
        boolean z2 = TextUtils.isEmpty(this.g) ? false : true;
        this.m.setVisibility(z2 ? 0 : 8);
        this.k.setVisibility((z || z2) ? 0 : 8);
        if (this.k.getParent() == null) {
            addView(this.k);
        }
    }

    public final void a(yg ygVar) {
        if (this.h == null) {
            this.h = LayoutInflater.from(getContext()).inflate(this.p, (ViewGroup) this, false);
            addView(this.h);
        } else if (this.h.getParent() == null) {
            addView(this.h);
        }
        this.h.findViewById(R.id.action_mode_close_button).setOnClickListener(new aan(this, ygVar));
        zi ziVar = (zi) ygVar.b();
        if (this.c != null) {
            this.c.d();
        }
        this.c = new aat(getContext());
        this.c.b(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ziVar.a(this.c, this.a);
        this.b = (ActionMenuView) this.c.a(this);
        ti.a(this.b, (Drawable) null);
        addView(this.b, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.j = null;
        this.b = null;
    }

    @Override // flm.aak
    public final boolean a() {
        if (this.c != null) {
            return this.c.b();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.d > 0 ? this.d : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        if (this.h != null) {
            int iA = a(this.h, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            paddingLeft = iA - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
        }
        if (this.b != null && this.b.getParent() == this) {
            paddingLeft = a(this.b, paddingLeft, iMakeMeasureSpec, 0);
        }
        if (this.k != null && this.j == null) {
            if (this.i) {
                this.k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.k.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.k.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = a(this.k, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        if (this.j != null) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            this.j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i4) : i4, layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824));
        }
        if (this.d <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            while (i3 < childCount) {
                int measuredHeight = getChildAt(i3).getMeasuredHeight() + paddingTop;
                if (measuredHeight <= i6) {
                    measuredHeight = i6;
                }
                i3++;
                i6 = measuredHeight;
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = aic.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.h != null && this.h.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = a(paddingRight, i5, zA);
            paddingRight = a(iA + a(this.h, iA, paddingTop, paddingTop2, zA), i6, zA);
        }
        if (this.k != null && this.j == null && this.k.getVisibility() != 8) {
            paddingRight += a(this.k, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (this.j != null) {
            a(this.j, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.b != null) {
            a(this.b, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }

    @Override // flm.aak, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // flm.aak
    public final /* bridge */ /* synthetic */ tt a(int i, long j) {
        return super.a(i, j);
    }

    @Override // flm.aak, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // flm.aak, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
