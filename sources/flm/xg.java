package flm;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class xg extends vj implements aar {
    private static final Interpolator o = new AccelerateInterpolator();
    private static final Interpolator p = new DecelerateInterpolator();
    private final tw A;
    private final ty B;
    public Context a;
    public ActionBarOverlayLayout b;
    public ActionBarContainer c;
    public adb d;
    public ActionBarContextView e;
    public View f;
    public xk g;
    public yg h;
    public yh i;
    public boolean j;
    public boolean k;
    public boolean l;
    public yq m;
    public boolean n;
    private Context q;
    private boolean r;
    private boolean s;
    private ArrayList t;
    private boolean u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final tw z;

    public xg(Activity activity, boolean z) {
        new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new xh(this);
        this.A = new xi(this);
        this.B = new xj(this);
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    public xg(Dialog dialog) {
        new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new xh(this);
        this.A = new xi(this);
        this.B = new xj(this);
        a(dialog.getWindow().getDecorView());
    }

    private final void a(View view) {
        adb adbVarI;
        this.b = (ActionBarOverlayLayout) view.findViewById(com.google.android.chimeraresources.R.id.decor_content_parent);
        if (this.b != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.g.a(actionBarOverlayLayout.a);
                if (actionBarOverlayLayout.f != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(actionBarOverlayLayout.f);
                    ti.o(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.google.android.chimeraresources.R.id.action_bar);
        if (callbackFindViewById instanceof adb) {
            adbVarI = (adb) callbackFindViewById;
        } else if (callbackFindViewById instanceof Toolbar) {
            adbVarI = ((Toolbar) callbackFindViewById).i();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of " + (callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
        }
        this.d = adbVarI;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.chimeraresources.R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(com.google.android.chimeraresources.R.id.action_bar_container);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.b();
        boolean z = (this.d.n() & 4) != 0;
        if (z) {
            this.r = true;
        }
        yf yfVarA = yf.a(this.a);
        c((yfVarA.a.getApplicationInfo().targetSdkVersion < 14) || z);
        j(yfVarA.b());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, xl.a, com.google.android.chimeraresources.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(xl.m, false)) {
            d(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(xl.k, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // flm.vj
    public final void a(float f) {
        ti.a(this.c, f);
    }

    @Override // flm.vj
    public final void a(Configuration configuration) {
        j(yf.a(this.a).b());
    }

    private final void j(boolean z) {
        this.u = z;
        if (!this.u) {
            this.d.a((agu) null);
            this.c.a((agu) null);
        } else {
            this.c.a((agu) null);
            this.d.a((agu) null);
        }
        boolean z2 = this.d.p() == 2;
        this.d.a(!this.u && z2);
        this.b.d = !this.u && z2;
    }

    @Override // flm.aar
    public final void a(int i) {
        this.v = i;
    }

    @Override // flm.vj
    public final void f(boolean z) {
        this.y = z;
        if (!z && this.m != null) {
            this.m.b();
        }
    }

    @Override // flm.vj
    public final void g(boolean z) {
        if (z != this.s) {
            this.s = z;
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                ((vl) this.t.get(i)).a();
            }
        }
    }

    @Override // flm.vj
    public final void a(boolean z) {
        a(2, 2);
    }

    @Override // flm.vj
    public final void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // flm.vj
    public final void c(boolean z) {
        this.d.o();
    }

    @Override // flm.vj
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override // flm.vj
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    private final void a(int i, int i2) {
        int iN = this.d.n();
        if ((i2 & 4) != 0) {
            this.r = true;
        }
        this.d.a((iN & (i2 ^ (-1))) | (i & i2));
    }

    @Override // flm.vj
    public final int a() {
        return this.d.n();
    }

    @Override // flm.vj
    public final yg a(yh yhVar) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.a(false);
        this.e.b();
        xk xkVar = new xk(this, this.e.getContext(), yhVar);
        if (!xkVar.e()) {
            return null;
        }
        this.g = xkVar;
        xkVar.d();
        this.e.a(xkVar);
        i(true);
        this.e.sendAccessibilityEvent(32);
        return xkVar;
    }

    @Override // flm.aar
    public final void h(boolean z) {
        this.j = z;
    }

    @Override // flm.aar
    public final void h() {
        if (this.l) {
            this.l = false;
            k(true);
        }
    }

    @Override // flm.aar
    public final void i() {
        if (!this.l) {
            this.l = true;
            k(true);
        }
    }

    @Override // flm.vj
    public final void d(boolean z) {
        if (!this.b.c) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.n = true;
        this.b.a(true);
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private final void k(boolean z) {
        if (a(false, this.l, this.w)) {
            if (!this.x) {
                this.x = true;
                if (this.m != null) {
                    this.m.b();
                }
                this.c.setVisibility(0);
                if (this.v == 0 && (this.y || z)) {
                    this.c.setTranslationY(0.0f);
                    float f = -this.c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    this.c.setTranslationY(f);
                    yq yqVar = new yq();
                    tt ttVarB = ti.l(this.c).b(0.0f);
                    ttVarB.a(this.B);
                    yqVar.a(ttVarB);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(f);
                        yqVar.a(ti.l(this.f).b(0.0f));
                    }
                    yqVar.a(p);
                    yqVar.a(250L);
                    yqVar.a(this.A);
                    this.m = yqVar;
                    yqVar.a();
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(0.0f);
                    }
                    this.A.b(null);
                }
                if (this.b != null) {
                    ti.o(this.b);
                    return;
                }
                return;
            }
            return;
        }
        if (this.x) {
            this.x = false;
            if (this.m != null) {
                this.m.b();
            }
            if (this.v == 0 && (this.y || z)) {
                this.c.setAlpha(1.0f);
                this.c.a(true);
                yq yqVar2 = new yq();
                float f2 = -this.c.getHeight();
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.c.getLocationInWindow(iArr2);
                    f2 -= iArr2[1];
                }
                tt ttVarB2 = ti.l(this.c).b(f2);
                ttVarB2.a(this.B);
                yqVar2.a(ttVarB2);
                if (this.j && this.f != null) {
                    yqVar2.a(ti.l(this.f).b(f2));
                }
                yqVar2.a(o);
                yqVar2.a(250L);
                yqVar2.a(this.z);
                this.m = yqVar2;
                yqVar2.a();
                return;
            }
            this.z.b(null);
        }
    }

    public final void i(boolean z) {
        tt ttVarA;
        tt ttVarA2;
        long duration;
        if (z) {
            if (!this.w) {
                this.w = true;
                if (this.b != null) {
                    ActionBarOverlayLayout.a();
                }
                k(false);
            }
        } else if (this.w) {
            this.w = false;
            if (this.b != null) {
                ActionBarOverlayLayout.a();
            }
            k(false);
        }
        if (ti.w(this.c)) {
            if (z) {
                ttVarA2 = this.d.a(4, 100L);
                ttVarA = this.e.a(0, 200L);
            } else {
                ttVarA = this.d.a(0, 200L);
                ttVarA2 = this.e.a(8, 100L);
            }
            yq yqVar = new yq();
            yqVar.a.add(ttVarA2);
            View view = (View) ttVarA2.a.get();
            if (view != null) {
                duration = view.animate().getDuration();
            } else {
                duration = 0;
            }
            View view2 = (View) ttVarA.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            yqVar.a.add(ttVarA);
            yqVar.a();
            return;
        }
        if (z) {
            this.d.b(4);
            this.e.setVisibility(0);
        } else {
            this.d.b(0);
            this.e.setVisibility(8);
        }
    }

    @Override // flm.vj
    public final Context b() {
        if (this.q == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.q = new ContextThemeWrapper(this.a, i);
            } else {
                this.q = this.a;
            }
        }
        return this.q;
    }

    @Override // flm.aar
    public final void j() {
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    @Override // flm.aar
    public final void k() {
    }

    @Override // flm.vj
    public final boolean f() {
        if (this.d == null || !this.d.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    @Override // flm.vj
    public final void a(Drawable drawable) {
        this.d.a((Drawable) null);
    }

    @Override // flm.vj
    public final void e(boolean z) {
        if (!this.r) {
            b(z);
        }
    }

    @Override // flm.vj
    public final boolean a(int i, KeyEvent keyEvent) {
        Menu menuB;
        if (this.g == null || (menuB = this.g.b()) == null) {
            return false;
        }
        menuB.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuB.performShortcut(i, keyEvent, 0);
    }
}
