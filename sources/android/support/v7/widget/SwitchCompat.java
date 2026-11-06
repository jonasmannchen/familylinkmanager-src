package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import flm.adn;
import flm.agy;
import flm.ahe;
import flm.aic;
import flm.bbx;
import flm.qc;
import flm.ti;
import flm.vc;
import flm.xl;
import flm.ye;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    private ObjectAnimator L;
    private final Rect M;
    public float a;
    private Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;
    private Drawable h;
    private ColorStateList i;
    private PorterDuff.Mode j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    private int z;
    private static final Property b = new agy(Float.class, "thumbPos");
    private static final int[] N = {R.attr.state_checked};

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.chimeraresources.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.x = VelocityTracker.obtain();
        this.M = new Rect();
        this.G = new TextPaint(1);
        this.G.density = getResources().getDisplayMetrics().density;
        ahe aheVarA = ahe.a(context, attributeSet, xl.cr, i, 0);
        this.c = aheVarA.a(xl.cu);
        if (this.c != null) {
            this.c.setCallback(this);
        }
        this.h = aheVarA.a(xl.cD);
        if (this.h != null) {
            this.h.setCallback(this);
        }
        this.q = aheVarA.c(xl.ct);
        this.r = aheVarA.c(xl.cs);
        this.s = aheVarA.a(xl.cv, true);
        this.m = aheVarA.e(xl.cA, 0);
        this.n = aheVarA.e(xl.cx, 0);
        this.o = aheVarA.e(xl.cy, 0);
        this.p = aheVarA.a(xl.cw, false);
        ColorStateList colorStateListE = aheVarA.e(xl.cB);
        if (colorStateListE != null) {
            this.d = colorStateListE;
            this.f = true;
        }
        PorterDuff.Mode modeA = adn.a(aheVarA.a(xl.cC, -1), null);
        if (this.e != modeA) {
            this.e = modeA;
            this.g = true;
        }
        if ((this.f || this.g) && this.c != null && (this.f || this.g)) {
            this.c = this.c.mutate();
            if (this.f) {
                qc.a(this.c, this.d);
            }
            if (this.g) {
                qc.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListE2 = aheVarA.e(xl.cE);
        if (colorStateListE2 != null) {
            this.i = colorStateListE2;
            this.k = true;
        }
        PorterDuff.Mode modeA2 = adn.a(aheVarA.a(xl.cF, -1), null);
        if (this.j != modeA2) {
            this.j = modeA2;
            this.l = true;
        }
        if ((this.k || this.l) && this.h != null && (this.k || this.l)) {
            this.h = this.h.mutate();
            if (this.k) {
                qc.a(this.h, this.i);
            }
            if (this.l) {
                qc.a(this.h, this.j);
            }
            if (this.h.isStateful()) {
                this.h.setState(getDrawableState());
            }
        }
        int iG = aheVarA.g(xl.cz, 0);
        if (iG != 0) {
            ahe aheVarA2 = ahe.a(context, iG, xl.cG);
            ColorStateList colorStateListE3 = aheVarA2.e(xl.cI);
            if (colorStateListE3 != null) {
                this.H = colorStateListE3;
            } else {
                this.H = getTextColors();
            }
            int iE = aheVarA2.e(xl.cL, 0);
            if (iE != 0 && iE != this.G.getTextSize()) {
                this.G.setTextSize(iE);
                requestLayout();
            }
            int iA = aheVarA2.a(xl.cN, -1);
            int iA2 = aheVarA2.a(xl.cM, -1);
            switch (iA) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (iA2 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(iA2);
                } else {
                    typefaceCreate = Typeface.create(typeface, iA2);
                }
                a(typefaceCreate);
                int style = iA2 & ((typefaceCreate != null ? typefaceCreate.getStyle() : 0) ^ (-1));
                this.G.setFakeBoldText((style & 1) != 0);
                this.G.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                this.G.setFakeBoldText(false);
                this.G.setTextSkewX(0.0f);
                a(typeface);
            }
            if (aheVarA2.a(xl.cP, false)) {
                this.K = new ye(getContext());
            } else {
                this.K = null;
            }
            aheVarA2.b.recycle();
        }
        aheVarA.b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final void a(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicHeight;
        int intrinsicWidth;
        int intrinsicHeight2 = 0;
        if (this.s) {
            if (this.I == null) {
                this.I = a(this.q);
            }
            if (this.J == null) {
                this.J = a(this.r);
            }
        }
        Rect rect = this.M;
        if (this.c != null) {
            this.c.getPadding(rect);
            intrinsicWidth = (this.c.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.c.getIntrinsicHeight();
        } else {
            intrinsicHeight = 0;
            intrinsicWidth = 0;
        }
        this.B = Math.max(this.s ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.m << 1) : 0, intrinsicWidth);
        if (this.h != null) {
            this.h.getPadding(rect);
            intrinsicHeight2 = this.h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        if (this.c != null) {
            Rect rectA = adn.a(this.c);
            iMax = Math.max(iMax, rectA.left);
            iMax2 = Math.max(iMax2, rectA.right);
        }
        int iMax3 = Math.max(this.n, iMax2 + iMax + (this.B * 2));
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.z = iMax3;
        this.A = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private final Layout a(CharSequence charSequence) {
        CharSequence transformation = this.K != null ? this.K.getTransformation(charSequence, this) : charSequence;
        return new StaticLayout(transformation, this.G, transformation != null ? (int) Math.ceil(Layout.getDesiredWidth(transformation, this.G)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zA;
        float f;
        float f2 = 1.0f;
        boolean z = false;
        this.x.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    if (this.c != null) {
                        int iB = b();
                        this.c.getPadding(this.M);
                        int i = this.D - this.u;
                        int i2 = (iB + this.C) - this.u;
                        int i3 = this.B + i2 + this.M.left + this.M.right + this.u;
                        int i4 = this.F + this.u;
                        if (x > i2 && x < i3 && y > i && y < i4) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.t = 1;
                        this.v = x;
                        this.w = y;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.t == 2) {
                    this.t = 0;
                    boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z2) {
                        this.x.computeCurrentVelocity(1000);
                        float xVelocity = this.x.getXVelocity();
                        if (Math.abs(xVelocity) > this.y) {
                            zA = aic.a(this) ? xVelocity < 0.0f : xVelocity > 0.0f;
                        } else {
                            zA = a();
                        }
                    } else {
                        zA = zIsChecked;
                    }
                    if (zA != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zA);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.t = 0;
                this.x.clear();
                break;
                break;
            case 2:
                switch (this.t) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.v) > this.u || Math.abs(y2 - this.w) > this.u) {
                            this.t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.v = x2;
                            this.w = y2;
                            return true;
                        }
                        break;
                    case 2:
                        float x3 = motionEvent.getX();
                        int iC = c();
                        float f3 = x3 - this.v;
                        if (iC != 0) {
                            f = f3 / iC;
                        } else {
                            f = f3 > 0.0f ? 1.0f : -1.0f;
                        }
                        if (aic.a(this)) {
                            f = -f;
                        }
                        float f4 = f + this.a;
                        if (f4 < 0.0f) {
                            f2 = 0.0f;
                        } else if (f4 <= 1.0f) {
                            f2 = f4;
                        }
                        if (f2 == this.a) {
                            return true;
                        }
                        this.v = x3;
                        a(f2);
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private final boolean a() {
        return this.a > 0.5f;
    }

    public final void a(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null && ti.w(this)) {
            this.L = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) b, zIsChecked ? 1.0f : 0.0f);
            this.L.setDuration(250L);
            this.L.setAutoCancel(true);
            this.L.start();
            return;
        }
        if (this.L != null) {
            this.L.cancel();
        }
        a(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        int i6;
        int height;
        int paddingTop;
        int iMax2 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != null) {
            Rect rect = this.M;
            if (this.h != null) {
                this.h.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectA = adn.a(this.c);
            iMax = Math.max(0, rectA.left - rect.left);
            iMax2 = Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (aic.a(this)) {
            int paddingLeft = getPaddingLeft() + iMax;
            i6 = ((this.z + paddingLeft) - iMax) - iMax2;
            i5 = paddingLeft;
        } else {
            int width = (getWidth() - getPaddingRight()) - iMax2;
            i5 = iMax2 + iMax + (width - this.z);
            i6 = width;
        }
        switch (getGravity() & 112) {
            case 16:
                paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.A / 2);
                height = this.A + paddingTop;
                break;
            case 80:
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.A;
                break;
            default:
                paddingTop = getPaddingTop();
                height = this.A + paddingTop;
                break;
        }
        this.C = i5;
        this.D = paddingTop;
        this.F = height;
        this.E = i6;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rectA;
        int i;
        int i2;
        int i3;
        Rect rect = this.M;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        int iB = i4 + b();
        if (this.c != null) {
            rectA = adn.a(this.c);
        } else {
            rectA = adn.a;
        }
        if (this.h != null) {
            this.h.getPadding(rect);
            int i8 = rect.left + iB;
            if (rectA != null) {
                if (rectA.left > rect.left) {
                    i4 += rectA.left - rect.left;
                }
                i3 = rectA.top > rect.top ? (rectA.top - rect.top) + i5 : i5;
                if (rectA.right > rect.right) {
                    i6 -= rectA.right - rect.right;
                }
                i2 = rectA.bottom > rect.bottom ? i7 - (rectA.bottom - rect.bottom) : i7;
            } else {
                i2 = i7;
                i3 = i5;
            }
            this.h.setBounds(i4, i3, i6, i2);
            i = i8;
        } else {
            i = iB;
        }
        if (this.c != null) {
            this.c.getPadding(rect);
            int i9 = i - rect.left;
            int i10 = i + this.B + rect.right;
            this.c.setBounds(i9, i5, i10, i7);
            Drawable background = getBackground();
            if (background != null) {
                qc.a(background, i9, i5, i10, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.M;
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D;
        int i2 = this.F;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.c;
        if (drawable != null) {
            if (this.p && drawable2 != null) {
                Rect rectA = adn.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = a() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.H != null) {
                this.G.setColor(this.H.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.right + bounds.left;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!aic.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.o;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (aic.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.o;
        }
        return compoundPaddingRight;
    }

    private final int b() {
        float f;
        if (aic.a(this)) {
            f = 1.0f - this.a;
        } else {
            f = this.a;
        }
        return (int) ((f * c()) + 0.5f);
    }

    private final int c() {
        Rect rectA;
        if (this.h != null) {
            Rect rect = this.M;
            this.h.getPadding(rect);
            if (this.c != null) {
                rectA = adn.a(this.c);
            } else {
                rectA = adn.a;
            }
            return ((((this.z - this.B) - rect.left) - rect.right) - rectA.left) - rectA.right;
        }
        return 0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean state = false;
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState) | false;
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.c != null) {
            qc.a(this.c, f, f2);
        }
        if (this.h != null) {
            qc.a(this.h, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c || drawable == this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.c != null) {
            this.c.jumpToCurrentState();
        }
        if (this.h != null) {
            this.h.jumpToCurrentState();
        }
        if (this.L != null && this.L.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text).append(' ').append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vc.a(this, callback));
    }
}
