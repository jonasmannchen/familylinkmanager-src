package android.support.design.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.chimeraresources.R;
import flm.dz;
import flm.fg;
import flm.fp;
import flm.gc;
import flm.gd;
import flm.ge;
import flm.gf;
import flm.gg;
import flm.gj;
import flm.gk;
import flm.gl;
import flm.gq;
import flm.gs;
import flm.gv;
import flm.gx;
import flm.gz;
import flm.hb;
import flm.hc;
import flm.ti;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar {
    public final ViewGroup b;
    public final gv c;
    public final gx d;
    public int e;
    public int f;
    public int g;
    public final hb h = new gl(this);
    private final Context k;
    private final int l;
    private final AccessibilityManager m;
    private static final boolean i = false;
    private static final int[] j = {R.attr.snackbarStyle};
    public static final Handler a = new Handler(Looper.getMainLooper(), new gc());

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, gx gxVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (gxVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.b = viewGroup;
        this.d = gxVar;
        this.k = viewGroup.getContext();
        fp.a(this.k);
        this.c = (gv) LayoutInflater.from(this.k).inflate(b(), this.b, false);
        if (this.c.getBackground() == null) {
            gv gvVar = this.c;
            gv gvVar2 = this.c;
            int iA = fg.a(fg.a(gvVar2, R.attr.colorSurface), fg.a(gvVar2, R.attr.colorOnSurface), 0.8f);
            float dimension = this.c.getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(iA);
            gradientDrawable.setCornerRadius(dimension);
            ti.a(gvVar, gradientDrawable);
        }
        this.c.addView(view);
        this.l = ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).bottomMargin;
        ti.c(this.c, 1);
        ti.b(this.c, 1);
        ti.b((View) this.c, true);
        ti.a(this.c, new gj(this));
        ti.a(this.c, new gk(this));
        this.m = (AccessibilityManager) this.k.getSystemService("accessibility");
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends SwipeDismissBehavior {
        public final gs g = new gs(this);

        @Override // android.support.design.behavior.SwipeDismissBehavior
        public final boolean b(View view) {
            return view instanceof gv;
        }

        @Override // android.support.design.behavior.SwipeDismissBehavior, flm.hs
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.g.a(coordinatorLayout, view, motionEvent);
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    public final void a() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        marginLayoutParams.bottomMargin = this.l + this.f + this.g;
        this.c.setLayoutParams(marginLayoutParams);
    }

    public int b() {
        return c() ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar;
    }

    public final boolean c() {
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(j);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public int d() {
        return this.e;
    }

    public void e() {
        gz gzVarA = gz.a();
        int iD = d();
        hb hbVar = this.h;
        synchronized (gzVarA.a) {
            if (gzVarA.d(hbVar)) {
                gzVarA.c.b = iD;
                gzVarA.b.removeCallbacksAndMessages(gzVarA.c);
                gzVarA.a(gzVarA.c);
                return;
            }
            if (gzVarA.e(hbVar)) {
                gzVarA.d.b = iD;
            } else {
                gzVarA.d = new hc(iD, hbVar);
            }
            if (gzVarA.c == null || !gzVarA.a(gzVarA.c, 4)) {
                gzVarA.c = null;
                gzVarA.b();
            }
        }
    }

    public void f() {
        a(3);
    }

    public final void a(int i2) {
        gz gzVarA = gz.a();
        hb hbVar = this.h;
        synchronized (gzVarA.a) {
            if (gzVarA.d(hbVar)) {
                gzVarA.a(gzVarA.c, i2);
            } else if (gzVarA.e(hbVar)) {
                gzVarA.a(gzVarA.d, i2);
            }
        }
    }

    public SwipeDismissBehavior g() {
        return new Behavior();
    }

    public final void h() {
        if (this.c.c == 1) {
            ValueAnimator valueAnimatorA = a(0.0f, 1.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(dz.d);
            valueAnimatorOfFloat.addUpdateListener(new ge(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorA, valueAnimatorOfFloat);
            animatorSet.setDuration(150L);
            animatorSet.addListener(new gq(this));
            animatorSet.start();
            return;
        }
        int i2 = i();
        this.c.setTranslationY(i2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i2, 0);
        valueAnimator.setInterpolator(dz.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new gf(this));
        valueAnimator.addUpdateListener(new gg(this, i2));
        valueAnimator.start();
    }

    public final ValueAnimator a(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(dz.a);
        valueAnimatorOfFloat.addUpdateListener(new gd(this));
        return valueAnimatorOfFloat;
    }

    public final int i() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + height : height;
    }

    public final void j() {
        gz gzVarA = gz.a();
        hb hbVar = this.h;
        synchronized (gzVarA.a) {
            if (gzVarA.d(hbVar)) {
                gzVarA.a(gzVarA.c);
            }
        }
    }

    public final void b(int i2) {
        gz gzVarA = gz.a();
        hb hbVar = this.h;
        synchronized (gzVarA.a) {
            if (gzVarA.d(hbVar)) {
                gzVarA.c = null;
                if (gzVarA.d != null) {
                    gzVarA.b();
                }
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final boolean k() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.m.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }
}
