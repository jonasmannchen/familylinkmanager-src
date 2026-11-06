package android.support.design.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.design.internal.CheckableImageButton;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.abo;
import flm.acp;
import flm.adn;
import flm.ahe;
import flm.bbx;
import flm.dz;
import flm.fj;
import flm.fl;
import flm.fp;
import flm.fq;
import flm.hd;
import flm.he;
import flm.hg;
import flm.hh;
import flm.hi;
import flm.hj;
import flm.hk;
import flm.hl;
import flm.oo;
import flm.qc;
import flm.ti;
import flm.vc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int h = R.style.Widget_Design_TextInputLayout;
    private final int A;
    private final int B;
    private int C;
    private int D;
    private Drawable E;
    private final Rect F;
    private final Rect G;
    private final RectF H;
    private boolean I;
    private Drawable J;
    private CharSequence K;
    private CheckableImageButton L;
    private boolean M;
    private Drawable N;
    private Drawable O;
    private ColorStateList P;
    private boolean Q;
    private PorterDuff.Mode R;
    private boolean S;
    private ColorStateList T;
    private ColorStateList U;
    private final int V;
    private final int W;
    public EditText a;
    private int aa;
    private final int ab;
    private boolean ac;
    private boolean ad;
    private ValueAnimator ae;
    private boolean af;
    public boolean b;
    public boolean c;
    public TextView d;
    public boolean e;
    public final fj f;
    public boolean g;
    private final FrameLayout i;
    private CharSequence j;
    private final he k;
    private int l;
    private final int m;
    private final int n;
    private boolean o;
    private CharSequence p;
    private GradientDrawable q;
    private final int r;
    private final int s;
    private int t;
    private final int u;
    private float v;
    private float w;
    private float x;
    private float y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(fp.a(context, attributeSet, i, h), attributeSet, i);
        this.k = new he(this);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.f = new fj(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.i = new FrameLayout(context2);
        this.i.setAddStatesFromChildren(true);
        addView(this.i);
        fj fjVar = this.f;
        fjVar.z = dz.a;
        fjVar.d();
        fj fjVar2 = this.f;
        fjVar2.y = dz.a;
        fjVar2.d();
        this.f.a(8388659);
        ahe aheVarB = fp.b(context2, attributeSet, hg.a, i, h, new int[0]);
        this.o = aheVarB.a(hg.v, true);
        a(aheVarB.c(hg.b));
        this.ad = aheVarB.a(hg.u, true);
        this.r = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_bottom_offset);
        this.s = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.u = aheVarB.d(hg.f, 0);
        this.v = aheVarB.a(hg.j, 0.0f);
        this.w = aheVarB.a(hg.i, 0.0f);
        this.x = aheVarB.a(hg.g, 0.0f);
        this.y = aheVarB.a(hg.h, 0.0f);
        this.D = aheVarB.b(hg.d, 0);
        this.aa = aheVarB.b(hg.k, 0);
        this.A = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default);
        this.B = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.z = this.A;
        int iA = aheVarB.a(hg.e, 0);
        if (iA != this.t) {
            this.t = iA;
            f();
        }
        if (aheVarB.f(hg.c)) {
            ColorStateList colorStateListE = aheVarB.e(hg.c);
            this.U = colorStateListE;
            this.T = colorStateListE;
        }
        this.V = oo.c(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.ab = oo.c(context2, R.color.mtrl_textinput_disabled_color);
        this.W = oo.c(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (aheVarB.g(hg.w, -1) != -1) {
            this.f.b(aheVarB.g(hg.w, 0));
            this.U = this.f.j;
            if (this.a != null) {
                a(false, false);
                g();
            }
        }
        int iG = aheVarB.g(hg.q, 0);
        boolean zA = aheVarB.a(hg.p, false);
        int iG2 = aheVarB.g(hg.t, 0);
        boolean zA2 = aheVarB.a(hg.s, false);
        CharSequence charSequenceC = aheVarB.c(hg.r);
        boolean zA3 = aheVarB.a(hg.l, false);
        a(aheVarB.a(hg.m, -1));
        this.n = aheVarB.g(hg.o, 0);
        this.m = aheVarB.g(hg.n, 0);
        this.I = aheVarB.a(hg.z, false);
        this.J = aheVarB.a(hg.y);
        this.K = aheVarB.c(hg.x);
        if (aheVarB.f(hg.A)) {
            this.Q = true;
            this.P = aheVarB.e(hg.A);
        }
        if (aheVarB.f(hg.B)) {
            this.S = true;
            this.R = fq.a(aheVarB.a(hg.B, -1), null);
        }
        aheVarB.b.recycle();
        d(zA2);
        if (TextUtils.isEmpty(charSequenceC)) {
            if (this.k.k) {
                d(false);
            }
        } else {
            if (!this.k.k) {
                d(true);
            }
            he heVar = this.k;
            heVar.b();
            heVar.j = charSequenceC;
            heVar.l.setText(charSequenceC);
            if (heVar.d != 2) {
                heVar.e = 2;
            }
            heVar.a(heVar.d, heVar.e, heVar.a(heVar.l, charSequenceC));
        }
        this.k.b(iG2);
        a(zA);
        this.k.a(iG);
        b(zA3);
        if (this.J != null && (this.Q || this.S)) {
            this.J = qc.e(this.J).mutate();
            if (this.Q) {
                qc.a(this.J, this.P);
            }
            if (this.S) {
                qc.a(this.J, this.R);
            }
            if (this.L != null && this.L.getDrawable() != this.J) {
                this.L.setImageDrawable(this.J);
            }
        }
        ti.b(this, 2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.i.addView(view, layoutParams2);
            this.i.setLayoutParams(layoutParams);
            g();
            EditText editText = (EditText) view;
            if (this.a != null) {
                throw new IllegalArgumentException("We already have an EditText, can only have one");
            }
            this.a = editText;
            f();
            hk hkVar = new hk(this);
            if (this.a != null) {
                ti.a(this.a, hkVar);
            }
            if (!l()) {
                fj fjVar = this.f;
                Typeface typeface = this.a.getTypeface();
                boolean zA = fjVar.a(typeface);
                if (fjVar.m != typeface) {
                    fjVar.m = typeface;
                    z = true;
                } else {
                    z = false;
                }
                if (zA || z) {
                    fjVar.d();
                }
            }
            fj fjVar2 = this.f;
            float textSize = this.a.getTextSize();
            if (fjVar2.g != textSize) {
                fjVar2.g = textSize;
                fjVar2.d();
            }
            int gravity = this.a.getGravity();
            this.f.a((gravity & (-113)) | 48);
            fj fjVar3 = this.f;
            if (fjVar3.f != gravity) {
                fjVar3.f = gravity;
                fjVar3.d();
            }
            this.a.addTextChangedListener(new hh(this));
            if (this.T == null) {
                this.T = this.a.getHintTextColors();
            }
            if (this.o) {
                if (TextUtils.isEmpty(this.p)) {
                    this.j = this.a.getHint();
                    a(this.j);
                    this.a.setHint((CharSequence) null);
                }
                this.e = true;
            }
            if (this.d != null) {
                b(this.a.getText().length());
            }
            this.k.c();
            k();
            a(false, true);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private final Drawable e() {
        if (this.t == 1 || this.t == 2) {
            return this.q;
        }
        throw new IllegalStateException();
    }

    private final void f() {
        if (this.t == 0) {
            this.q = null;
        } else if (this.t == 2 && this.o && !(this.q instanceof hd)) {
            this.q = new hd();
        } else if (this.q == null) {
            this.q = new GradientDrawable();
        }
        if (this.t != 0) {
            g();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.j == null || this.a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.e;
        this.e = false;
        CharSequence hint = this.a.getHint();
        this.a.setHint(this.j);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.a.setHint(hint);
            this.e = z;
        }
    }

    private final void g() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        int i = i();
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.i.requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        return this.a != null ? this.a.getBaseline() + getPaddingTop() + i() : super.getBaseline();
    }

    public final void a(boolean z, boolean z2) {
        boolean zIsEnabled = isEnabled();
        boolean z3 = (this.a == null || TextUtils.isEmpty(this.a.getText())) ? false : true;
        boolean z4 = this.a != null && this.a.hasFocus();
        boolean zD = this.k.d();
        if (this.T != null) {
            this.f.a(this.T);
            this.f.b(this.T);
        }
        if (!zIsEnabled) {
            this.f.a(ColorStateList.valueOf(this.ab));
            this.f.b(ColorStateList.valueOf(this.ab));
        } else if (zD) {
            fj fjVar = this.f;
            he heVar = this.k;
            fjVar.a(heVar.h != null ? heVar.h.getTextColors() : null);
        } else if (this.c && this.d != null) {
            this.f.a(this.d.getTextColors());
        } else if (z4 && this.U != null) {
            this.f.a(this.U);
        }
        if (z3 || (isEnabled() && (z4 || zD))) {
            if (z2 || this.ac) {
                if (this.ae != null && this.ae.isRunning()) {
                    this.ae.cancel();
                }
                if (z && this.ad) {
                    a(1.0f);
                } else {
                    this.f.a(1.0f);
                }
                this.ac = false;
                if (m()) {
                    n();
                    return;
                }
                return;
            }
            return;
        }
        if (z2 || !this.ac) {
            if (this.ae != null && this.ae.isRunning()) {
                this.ae.cancel();
            }
            if (z && this.ad) {
                a(0.0f);
            } else {
                this.f.a(0.0f);
            }
            if (m()) {
                if ((((hd) this.q).a.isEmpty() ? false : true) && m()) {
                    ((hd) this.q).a(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.ac = true;
        }
    }

    public void a(CharSequence charSequence) {
        if (this.o) {
            if (!TextUtils.equals(charSequence, this.p)) {
                this.p = charSequence;
                fj fjVar = this.f;
                if (charSequence == null || !TextUtils.equals(fjVar.o, charSequence)) {
                    fjVar.o = charSequence;
                    fjVar.p = null;
                    fjVar.e();
                    fjVar.d();
                }
                if (!this.ac) {
                    n();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final CharSequence a() {
        if (this.o) {
            return this.p;
        }
        return null;
    }

    public void a(boolean z) {
        he heVar = this.k;
        if (heVar.g != z) {
            heVar.b();
            if (z) {
                heVar.h = new acp(heVar.a);
                heVar.h.setId(R.id.textinput_error);
                heVar.a(heVar.i);
                heVar.h.setVisibility(4);
                ti.c(heVar.h, 1);
                heVar.a(heVar.h, 0);
            } else {
                heVar.a();
                heVar.b(heVar.h, 0);
                heVar.h = null;
                heVar.b.b();
                heVar.b.d();
            }
            heVar.g = z;
        }
    }

    private final void d(boolean z) {
        he heVar = this.k;
        if (heVar.k != z) {
            heVar.b();
            if (z) {
                heVar.l = new acp(heVar.a);
                heVar.l.setId(R.id.textinput_helper_text);
                heVar.l.setVisibility(4);
                ti.c(heVar.l, 1);
                heVar.b(heVar.m);
                heVar.a(heVar.l, 1);
            } else {
                heVar.b();
                if (heVar.d == 2) {
                    heVar.e = 0;
                }
                heVar.a(heVar.d, heVar.e, heVar.a(heVar.l, (CharSequence) null));
                heVar.b(heVar.l, 1);
                heVar.l = null;
                heVar.b.b();
                heVar.b.d();
            }
            heVar.k = z;
        }
    }

    public void b(CharSequence charSequence) {
        if (!this.k.g) {
            if (!TextUtils.isEmpty(charSequence)) {
                a(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            he heVar = this.k;
            heVar.b();
            heVar.f = charSequence;
            heVar.h.setText(charSequence);
            if (heVar.d != 1) {
                heVar.e = 1;
            }
            heVar.a(heVar.d, heVar.e, heVar.a(heVar.h, charSequence));
            return;
        }
        this.k.a();
    }

    public void b(boolean z) {
        if (this.b != z) {
            if (z) {
                this.d = new acp(getContext());
                this.d.setId(R.id.textinput_counter);
                this.d.setMaxLines(1);
                a(this.d, this.n);
                this.k.a(this.d, 2);
                if (this.a == null) {
                    b(0);
                } else {
                    b(this.a.getText().length());
                }
            } else {
                this.k.b(this.d, 2);
                this.d = null;
            }
            this.b = z;
        }
    }

    public void a(int i) {
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (this.b) {
                b(this.a == null ? 0 : this.a.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        a(this, z);
        super.setEnabled(z);
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    public final void b(int i) {
        int i2;
        boolean z = this.c;
        if (this.l == -1) {
            this.d.setText(String.valueOf(i));
            this.d.setContentDescription(null);
            this.c = false;
        } else {
            if (ti.g(this.d) == 1) {
                ti.c(this.d, 0);
            }
            this.c = i > this.l;
            if (z != this.c) {
                a(this.d, this.c ? this.m : this.n);
                TextView textView = this.d;
                Context context = getContext();
                if (this.c) {
                    i2 = R.string.character_counter_overflowed_content_description;
                } else {
                    i2 = R.string.character_counter_content_description;
                }
                textView.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(this.l)));
                if (this.c) {
                    ti.c(this.d, 1);
                }
            }
            this.d.setText(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        if (this.a != null && z != this.c) {
            a(false, false);
            d();
            b();
        }
    }

    public final void a(TextView textView, int i) {
        boolean z = true;
        try {
            vc.a(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception e) {
        }
        if (z) {
            vc.a(textView, R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(oo.c(getContext(), R.color.design_error));
        }
    }

    private final void h() {
        int i;
        int i2;
        int i3;
        Drawable background;
        int top = 0;
        if (this.t != 0 && this.q != null && this.a != null && getRight() != 0) {
            int left = this.a.getLeft();
            if (this.a != null) {
                switch (this.t) {
                    case 1:
                        top = this.a.getTop();
                        break;
                    case 2:
                        top = this.a.getTop() + i();
                        break;
                }
            }
            int right = this.a.getRight();
            int bottom = this.a.getBottom() + this.r;
            if (this.t == 2) {
                int i4 = (this.B / 2) + left;
                int i5 = top - (this.B / 2);
                int i6 = right - (this.B / 2);
                i3 = (this.B / 2) + bottom;
                i = i6;
                i2 = i5;
                left = i4;
            } else {
                i = right;
                i2 = top;
                i3 = bottom;
            }
            this.q.setBounds(left, i2, i, i3);
            j();
            if (this.a != null && (background = this.a.getBackground()) != null) {
                if (adn.c(background)) {
                    background = background.mutate();
                }
                fl.a(this, this.a, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, (rect.right << 1) + bounds.right, this.a.getBottom());
                }
            }
        }
    }

    private final int i() {
        if (!this.o) {
            return 0;
        }
        switch (this.t) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
                return (int) this.f.b();
            case 2:
                return (int) (this.f.b() / 2.0f);
            default:
                return 0;
        }
    }

    private final void j() {
        float[] fArr;
        if (this.q != null) {
            switch (this.t) {
                case 1:
                    this.z = 0;
                    break;
                case 2:
                    if (this.aa == 0) {
                        this.aa = this.U.getColorForState(getDrawableState(), this.U.getDefaultColor());
                    }
                    break;
            }
            if (this.a != null && this.t == 2) {
                if (this.a.getBackground() != null) {
                    this.E = this.a.getBackground();
                }
                ti.a(this.a, (Drawable) null);
            }
            if (this.a != null && this.t == 1 && this.E != null) {
                ti.a(this.a, this.E);
            }
            if (this.z >= 0 && this.C != 0) {
                this.q.setStroke(this.z, this.C);
            }
            GradientDrawable gradientDrawable = this.q;
            if (!(ti.f(this) == 1)) {
                fArr = new float[]{this.v, this.v, this.w, this.w, this.x, this.x, this.y, this.y};
            } else {
                fArr = new float[]{this.w, this.w, this.v, this.v, this.y, this.y, this.x, this.x};
            }
            gradientDrawable.setCornerRadii(fArr);
            this.q.setColor(this.D);
            invalidate();
        }
    }

    public final void b() {
        Drawable background;
        if (this.a != null && (background = this.a.getBackground()) != null) {
            if (adn.c(background)) {
                background = background.mutate();
            }
            if (this.k.d()) {
                background.setColorFilter(abo.a(this.k.e(), PorterDuff.Mode.SRC_IN));
            } else if (this.c && this.d != null) {
                background.setColorFilter(abo.a(this.d.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                qc.d(background);
                this.a.refreshDrawableState();
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        hl hlVar = new hl(super.onSaveInstanceState());
        if (this.k.d()) {
            hlVar.a = c();
        }
        hlVar.b = this.M;
        return hlVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hl hlVar = (hl) parcelable;
        super.onRestoreInstanceState(hlVar.e);
        b(hlVar.a);
        if (hlVar.b) {
            c(true);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.g = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.g = false;
    }

    public final CharSequence c() {
        if (this.k.g) {
            return this.k.f;
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float f;
        if (this.q != null) {
            this.q.draw(canvas);
        }
        super.draw(canvas);
        if (this.o) {
            fj fjVar = this.f;
            int iSave = canvas.save();
            if (fjVar.p != null && fjVar.b) {
                float f2 = fjVar.k;
                float f3 = fjVar.l;
                boolean z = fjVar.q && fjVar.r != null;
                if (z) {
                    f = fjVar.t * fjVar.u;
                } else {
                    fjVar.x.ascent();
                    f = 0.0f;
                    fjVar.x.descent();
                }
                if (z) {
                    f3 += f;
                }
                if (fjVar.u != 1.0f) {
                    canvas.scale(fjVar.u, fjVar.u, f2, f3);
                }
                if (z) {
                    canvas.drawBitmap(fjVar.r, f2, f3, fjVar.s);
                } else {
                    canvas.drawText(fjVar.p, 0, fjVar.p.length(), f2, f3, fjVar.x);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    private final void k() {
        if (this.a != null) {
            if (this.I && (l() || this.M)) {
                if (this.L == null) {
                    this.L = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_password_icon, (ViewGroup) this.i, false);
                    this.L.setImageDrawable(this.J);
                    this.L.setContentDescription(this.K);
                    this.i.addView(this.L);
                    this.L.setOnClickListener(new hi(this));
                }
                if (this.a != null && ti.k(this.a) <= 0) {
                    this.a.setMinimumHeight(ti.k(this.L));
                }
                this.L.setVisibility(0);
                this.L.setChecked(this.M);
                if (this.N == null) {
                    this.N = new ColorDrawable();
                }
                this.N.setBounds(0, 0, this.L.getMeasuredWidth(), 1);
                Drawable[] drawableArrA = vc.a(this.a);
                if (drawableArrA[2] != this.N) {
                    this.O = drawableArrA[2];
                }
                vc.a(this.a, drawableArrA[0], drawableArrA[1], this.N, drawableArrA[3]);
                this.L.setPadding(this.a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
                return;
            }
            if (this.L != null && this.L.getVisibility() == 0) {
                this.L.setVisibility(8);
            }
            if (this.N != null) {
                Drawable[] drawableArrA2 = vc.a(this.a);
                if (drawableArrA2[2] == this.N) {
                    vc.a(this.a, drawableArrA2[0], drawableArrA2[1], this.O, drawableArrA2[3]);
                    this.N = null;
                }
            }
        }
    }

    public final void c(boolean z) {
        if (this.I) {
            int selectionEnd = this.a.getSelectionEnd();
            if (l()) {
                this.a.setTransformationMethod(null);
                this.M = true;
            } else {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.M = false;
            }
            this.L.setChecked(this.M);
            if (z) {
                this.L.jumpDrawablesToCurrentState();
            }
            this.a.setSelection(selectionEnd);
        }
    }

    private final boolean l() {
        return this.a != null && (this.a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.q != null) {
            h();
        }
        if (this.o && this.a != null) {
            Rect rect = this.F;
            fl.a(this, this.a, rect);
            fj fjVar = this.f;
            if (this.a == null) {
                throw new IllegalStateException();
            }
            Rect rect2 = this.G;
            rect2.left = rect.left + this.a.getCompoundPaddingLeft();
            rect2.top = rect.top + this.a.getCompoundPaddingTop();
            rect2.right = rect.right - this.a.getCompoundPaddingRight();
            rect2.bottom = rect.bottom - this.a.getCompoundPaddingBottom();
            int i5 = rect2.left;
            int i6 = rect2.top;
            int i7 = rect2.right;
            int i8 = rect2.bottom;
            if (!fj.a(fjVar.d, i5, i6, i7, i8)) {
                fjVar.d.set(i5, i6, i7, i8);
                fjVar.w = true;
                fjVar.c();
            }
            fj fjVar2 = this.f;
            if (this.a == null) {
                throw new IllegalStateException();
            }
            Rect rect3 = this.G;
            rect3.bottom = rect.bottom;
            switch (this.t) {
                case 1:
                    rect3.left = rect.left + this.a.getCompoundPaddingLeft();
                    rect3.top = e().getBounds().top + this.u;
                    rect3.right = rect.right - this.a.getCompoundPaddingRight();
                    break;
                case 2:
                    rect3.left = rect.left + this.a.getPaddingLeft();
                    rect3.top = e().getBounds().top - i();
                    rect3.right = rect.right - this.a.getPaddingRight();
                    break;
                default:
                    rect3.left = rect.left + this.a.getCompoundPaddingLeft();
                    rect3.top = getPaddingTop();
                    rect3.right = rect.right - this.a.getCompoundPaddingRight();
                    break;
            }
            int i9 = rect3.left;
            int i10 = rect3.top;
            int i11 = rect3.right;
            int i12 = rect3.bottom;
            if (!fj.a(fjVar2.e, i9, i10, i11, i12)) {
                fjVar2.e.set(i9, i10, i11, i12);
                fjVar2.w = true;
                fjVar2.c();
            }
            this.f.d();
            if (m() && !this.ac) {
                n();
            }
        }
    }

    private final boolean m() {
        return this.o && !TextUtils.isEmpty(this.p) && (this.q instanceof hd);
    }

    private final void n() {
        if (m()) {
            RectF rectF = this.H;
            fj fjVar = this.f;
            boolean zA = fjVar.a(fjVar.o);
            rectF.left = !zA ? fjVar.e.left : fjVar.e.right - fjVar.a();
            rectF.top = fjVar.e.top;
            rectF.right = !zA ? rectF.left + fjVar.a() : fjVar.e.right;
            rectF.bottom = fjVar.e.top + fjVar.b();
            rectF.left -= this.s;
            rectF.top -= this.s;
            rectF.right += this.s;
            rectF.bottom += this.s;
            ((hd) this.q).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        boolean z2 = true;
        if (!this.af) {
            this.af = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            a(ti.w(this) && isEnabled(), false);
            b();
            h();
            d();
            if (this.f != null) {
                fj fjVar = this.f;
                fjVar.v = drawableState;
                if ((fjVar.j != null && fjVar.j.isStateful()) || (fjVar.i != null && fjVar.i.isStateful())) {
                    fjVar.d();
                } else {
                    z2 = false;
                }
                z = z2 | false;
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
            this.af = false;
        }
    }

    public final void d() {
        if (this.q != null && this.t != 0) {
            boolean z = this.a != null && this.a.hasFocus();
            boolean z2 = this.a != null && this.a.isHovered();
            if (this.t == 2) {
                if (!isEnabled()) {
                    this.C = this.ab;
                } else if (this.k.d()) {
                    this.C = this.k.e();
                } else if (this.c && this.d != null) {
                    this.C = this.d.getCurrentTextColor();
                } else if (z) {
                    this.C = this.aa;
                } else if (z2) {
                    this.C = this.W;
                } else {
                    this.C = this.V;
                }
                if ((z2 || z) && isEnabled()) {
                    this.z = this.B;
                } else {
                    this.z = this.A;
                }
                j();
            }
        }
    }

    private final void a(float f) {
        if (this.f.c != f) {
            if (this.ae == null) {
                this.ae = new ValueAnimator();
                this.ae.setInterpolator(dz.b);
                this.ae.setDuration(167L);
                this.ae.addUpdateListener(new hj(this));
            }
            this.ae.setFloatValues(this.f.c, f);
            this.ae.start();
        }
    }
}
