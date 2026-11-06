package flm;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class wb extends wa implements LayoutInflater.Factory2, zj {
    private static final boolean q = false;
    private static final int[] r = {R.attr.windowBackground};
    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private wq[] K;
    private boolean L;
    private boolean N;
    private wn O;
    private boolean Q;
    private Rect R;
    private Rect S;
    private wu T;
    public final Context b;
    public final Window c;
    public final vz d;
    public ada e;
    public yg f;
    public ActionBarContextView g;
    public PopupWindow h;
    public Runnable i;
    public boolean l;
    public wq m;
    public boolean n;
    public boolean o;
    public int p;
    private final Window.Callback s;
    private final Window.Callback t;
    private vj u;
    private MenuInflater v;
    private CharSequence w;
    private wj x;
    private wr y;
    private boolean z;
    public tt j = null;
    public boolean k = true;
    private int M = -100;
    private final Runnable P = new wc(this);

    public wb(Context context, Window window, vz vzVar) {
        this.b = context;
        this.c = window;
        this.d = vzVar;
        this.s = this.c.getCallback();
        if (this.s instanceof wm) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.t = new wm(this, this.s);
        this.c.setCallback(this.t);
        ahe aheVarA = ahe.a(context, (AttributeSet) null, r);
        Drawable drawableB = aheVarA.b(0);
        if (drawableB != null) {
            this.c.setBackgroundDrawable(drawableB);
        }
        aheVarA.b.recycle();
    }

    @Override // flm.wa
    public final void a(Bundle bundle) {
        String strB;
        if (this.s instanceof Activity) {
            try {
                strB = np.b((Activity) this.s);
            } catch (IllegalArgumentException e) {
                strB = null;
            }
            if (strB != null) {
                vj vjVar = this.u;
                if (vjVar == null) {
                    this.Q = true;
                } else {
                    vjVar.e(true);
                }
            }
        }
        if (bundle != null && this.M == -100) {
            this.M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // flm.wa
    public final void c() {
        p();
    }

    @Override // flm.wa
    public final vj a() {
        n();
        return this.u;
    }

    private final void n() {
        p();
        if (this.l && this.u == null) {
            if (this.s instanceof Activity) {
                this.u = new xg((Activity) this.s, this.F);
            } else if (this.s instanceof Dialog) {
                this.u = new xg((Dialog) this.s);
            }
            if (this.u != null) {
                this.u.e(this.Q);
            }
        }
    }

    @Override // flm.wa
    public final void a(Toolbar toolbar) {
        if (this.s instanceof Activity) {
            vj vjVarA = a();
            if (vjVarA instanceof xg) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.v = null;
            if (vjVarA != null) {
                vjVarA.g();
            }
            if (toolbar != null) {
                wx wxVar = new wx(toolbar, ((Activity) this.s).getTitle(), this.t);
                this.u = wxVar;
                this.c.setCallback(wxVar.c);
            } else {
                this.u = null;
                this.c.setCallback(this.t);
            }
            g();
        }
    }

    private final Context o() {
        Context contextB = null;
        vj vjVarA = a();
        if (vjVarA != null) {
            contextB = vjVarA.b();
        }
        if (contextB == null) {
            return this.b;
        }
        return contextB;
    }

    @Override // flm.wa
    public final MenuInflater b() {
        if (this.v == null) {
            n();
            this.v = new yn(this.u != null ? this.u.b() : this.b);
        }
        return this.v;
    }

    @Override // flm.wa
    public final View a(int i) {
        p();
        return this.c.findViewById(i);
    }

    @Override // flm.wa
    public final void a(Configuration configuration) {
        vj vjVarA;
        if (this.l && this.z && (vjVarA = a()) != null) {
            vjVarA.a(configuration);
        }
        abo.a().a(this.b);
        k();
    }

    @Override // flm.wa
    public final void d() {
        k();
    }

    @Override // flm.wa
    public final void e() {
        vj vjVarA = a();
        if (vjVarA != null) {
            vjVarA.f(false);
        }
        if (this.O != null) {
            this.O.a();
        }
    }

    @Override // flm.wa
    public final void f() {
        vj vjVarA = a();
        if (vjVarA != null) {
            vjVarA.f(true);
        }
    }

    @Override // flm.wa
    public final void a(View view) {
        p();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.s.onContentChanged();
    }

    @Override // flm.wa
    public final void b(int i) {
        p();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.s.onContentChanged();
    }

    @Override // flm.wa
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.s.onContentChanged();
    }

    @Override // flm.wa
    public final void b(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        ((ViewGroup) this.A.findViewById(R.id.content)).addView(view, layoutParams);
        this.s.onContentChanged();
    }

    @Override // flm.wa
    public final void b(Bundle bundle) {
        if (this.M != -100) {
            bundle.putInt("appcompat:local_night_mode", this.M);
        }
    }

    @Override // flm.wa
    public final void h() {
        if (this.o) {
            this.c.getDecorView().removeCallbacks(this.P);
        }
        this.n = true;
        if (this.u != null) {
            this.u.g();
        }
        if (this.O != null) {
            this.O.a();
        }
    }

    private final void p() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        CharSequence title;
        Context yjVar;
        if (!this.z) {
            TypedArray typedArrayObtainStyledAttributes = this.b.obtainStyledAttributes(xl.aB);
            if (!typedArrayObtainStyledAttributes.hasValue(xl.aG)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (typedArrayObtainStyledAttributes.getBoolean(xl.aP, false)) {
                c(1);
            } else if (typedArrayObtainStyledAttributes.getBoolean(xl.aG, false)) {
                c(108);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(xl.aH, false)) {
                c(109);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(xl.aI, false)) {
                c(10);
            }
            this.H = typedArrayObtainStyledAttributes.getBoolean(xl.aD, false);
            typedArrayObtainStyledAttributes.recycle();
            this.c.getDecorView();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
            if (!this.I) {
                if (this.H) {
                    ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.chimeraresources.R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.F = false;
                    this.l = false;
                    viewGroup2 = viewGroup3;
                } else if (this.l) {
                    TypedValue typedValue = new TypedValue();
                    this.b.getTheme().resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        yjVar = new yj(this.b, typedValue.resourceId);
                    } else {
                        yjVar = this.b;
                    }
                    ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(yjVar).inflate(com.google.android.chimeraresources.R.layout.abc_screen_toolbar, (ViewGroup) null);
                    this.e = (ada) viewGroup4.findViewById(com.google.android.chimeraresources.R.id.decor_content_parent);
                    this.e.a(this.c.getCallback());
                    if (this.F) {
                        this.e.a(109);
                    }
                    if (this.D) {
                        this.e.a(2);
                    }
                    if (this.E) {
                        this.e.a(5);
                    }
                    viewGroup2 = viewGroup4;
                } else {
                    viewGroup2 = null;
                }
            } else {
                if (this.G) {
                    viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.chimeraresources.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.chimeraresources.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                ti.a(viewGroup, new wd(this));
                viewGroup2 = viewGroup;
            }
            if (viewGroup2 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.l + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
            }
            if (this.e == null) {
                this.B = (TextView) viewGroup2.findViewById(com.google.android.chimeraresources.R.id.title);
            }
            aic.b(viewGroup2);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup2.findViewById(com.google.android.chimeraresources.R.id.action_bar_activity_content);
            ViewGroup viewGroup5 = (ViewGroup) this.c.findViewById(R.id.content);
            if (viewGroup5 != null) {
                while (viewGroup5.getChildCount() > 0) {
                    View childAt = viewGroup5.getChildAt(0);
                    viewGroup5.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup5.setId(-1);
                contentFrameLayout.setId(R.id.content);
                if (viewGroup5 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup5).setForeground(null);
                }
            }
            this.c.setContentView(viewGroup2);
            contentFrameLayout.h = new we(this);
            this.A = viewGroup2;
            if (this.s instanceof Activity) {
                title = ((Activity) this.s).getTitle();
            } else {
                title = this.w;
            }
            if (!TextUtils.isEmpty(title)) {
                if (this.e != null) {
                    this.e.a(title);
                } else if (this.u != null) {
                    this.u.b(title);
                } else if (this.B != null) {
                    this.B.setText(title);
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
            View decorView = this.c.getDecorView();
            contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (ti.w(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray typedArrayObtainStyledAttributes2 = this.b.obtainStyledAttributes(xl.aB);
            int i = xl.aN;
            if (contentFrameLayout2.a == null) {
                contentFrameLayout2.a = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(i, contentFrameLayout2.a);
            int i2 = xl.aO;
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(i2, contentFrameLayout2.b);
            if (typedArrayObtainStyledAttributes2.hasValue(xl.aL)) {
                int i3 = xl.aL;
                if (contentFrameLayout2.c == null) {
                    contentFrameLayout2.c = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(i3, contentFrameLayout2.c);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(xl.aM)) {
                int i4 = xl.aM;
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(i4, contentFrameLayout2.d);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(xl.aJ)) {
                int i5 = xl.aJ;
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(i5, contentFrameLayout2.e);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(xl.aK)) {
                int i6 = xl.aK;
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(i6, contentFrameLayout2.f);
            }
            typedArrayObtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.z = true;
            wq wqVarD = d(0);
            if (this.n) {
                return;
            }
            if (wqVarD == null || wqVarD.h == null) {
                g(108);
            }
        }
    }

    @Override // flm.wa
    public final boolean c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.I && i == 108) {
            return false;
        }
        if (this.l && i == 1) {
            this.l = false;
        }
        switch (i) {
            case 1:
                q();
                this.I = true;
                return true;
            case 2:
                q();
                this.D = true;
                return true;
            case 5:
                q();
                this.E = true;
                return true;
            case 10:
                q();
                this.G = true;
                return true;
            case 108:
                q();
                this.l = true;
                return true;
            case 109:
                q();
                this.F = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    @Override // flm.wa
    public final void a(CharSequence charSequence) {
        this.w = charSequence;
        if (this.e != null) {
            this.e.a(charSequence);
        } else if (this.u != null) {
            this.u.b(charSequence);
        } else if (this.B != null) {
            this.B.setText(charSequence);
        }
    }

    @Override // flm.zj
    public final boolean a(zi ziVar, MenuItem menuItem) {
        wq wqVarA;
        Window.Callback callback = this.c.getCallback();
        if (callback == null || this.n || (wqVarA = a((Menu) ziVar.l())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(wqVarA.a, menuItem);
    }

    @Override // flm.zj
    public final void a(zi ziVar) {
        if (this.e != null && this.e.c() && (!ViewConfiguration.get(this.b).hasPermanentMenuKey() || this.e.e())) {
            Window.Callback callback = this.c.getCallback();
            if (!this.e.d()) {
                if (callback != null && !this.n) {
                    if (this.o && (this.p & 1) != 0) {
                        this.c.getDecorView().removeCallbacks(this.P);
                        this.P.run();
                    }
                    wq wqVarD = d(0);
                    if (wqVarD.h != null && !wqVarD.p && callback.onPreparePanel(0, wqVarD.g, wqVarD.h)) {
                        callback.onMenuOpened(108, wqVarD.h);
                        this.e.f();
                        return;
                    }
                    return;
                }
                return;
            }
            this.e.g();
            if (!this.n) {
                callback.onPanelClosed(108, d(0).h);
                return;
            }
            return;
        }
        wq wqVarD2 = d(0);
        wqVarD2.o = true;
        a(wqVarD2, false);
        b(wqVarD2, (KeyEvent) null);
    }

    @Override // flm.wa
    public final yg a(yh yhVar) {
        if (yhVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f != null) {
            this.f.c();
        }
        wk wkVar = new wk(this, yhVar);
        vj vjVarA = a();
        if (vjVarA != null) {
            this.f = vjVarA.a(wkVar);
            if (this.f != null && this.d != null) {
                this.d.onSupportActionModeStarted(this.f);
            }
        }
        if (this.f == null) {
            this.f = b(wkVar);
        }
        return this.f;
    }

    @Override // flm.wa
    public final void g() {
        vj vjVarA = a();
        if (vjVarA == null || !vjVarA.e()) {
            g(0);
        }
    }

    private final yg b(yh yhVar) {
        yg ygVarOnWindowStartingSupportActionMode;
        Context yjVar;
        m();
        if (this.f != null) {
            this.f.c();
        }
        if (this.d == null || this.n) {
            ygVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                ygVarOnWindowStartingSupportActionMode = this.d.onWindowStartingSupportActionMode(yhVar);
            } catch (AbstractMethodError e) {
                ygVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (ygVarOnWindowStartingSupportActionMode != null) {
            this.f = ygVarOnWindowStartingSupportActionMode;
        } else {
            if (this.g == null) {
                if (this.H) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.b.getTheme();
                    theme.resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.b.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        yjVar = new yj(this.b, 0);
                        yjVar.getTheme().setTo(themeNewTheme);
                    } else {
                        yjVar = this.b;
                    }
                    this.g = new ActionBarContextView(yjVar);
                    this.h = new PopupWindow(yjVar, (AttributeSet) null, com.google.android.chimeraresources.R.attr.actionModePopupWindowStyle);
                    va.a(this.h, 2);
                    this.h.setContentView(this.g);
                    this.h.setWidth(-1);
                    yjVar.getTheme().resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarSize, typedValue, true);
                    this.g.d = TypedValue.complexToDimensionPixelSize(typedValue.data, yjVar.getResources().getDisplayMetrics());
                    this.h.setHeight(-2);
                    this.i = new wf(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.A.findViewById(com.google.android.chimeraresources.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(o());
                        this.g = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.g != null) {
                m();
                this.g.b();
                yk ykVar = new yk(this.g.getContext(), this.g, yhVar, this.h == null);
                if (yhVar.a(ykVar, ykVar.b())) {
                    ykVar.d();
                    this.g.a(ykVar);
                    this.f = ykVar;
                    if (l()) {
                        this.g.setAlpha(0.0f);
                        this.j = ti.l(this.g).a(1.0f);
                        this.j.a(new wh(this));
                    } else {
                        this.g.setAlpha(1.0f);
                        this.g.setVisibility(0);
                        this.g.sendAccessibilityEvent(32);
                        if (this.g.getParent() instanceof View) {
                            ti.o((View) this.g.getParent());
                        }
                    }
                    if (this.h != null) {
                        this.c.getDecorView().post(this.i);
                    }
                } else {
                    this.f = null;
                }
            }
        }
        if (this.f != null && this.d != null) {
            this.d.onSupportActionModeStarted(this.f);
        }
        return this.f;
    }

    final boolean l() {
        return this.z && this.A != null && ti.w(this.A);
    }

    final void m() {
        if (this.j != null) {
            this.j.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    final boolean a(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean zG;
        boolean zA;
        if (((this.s instanceof tb) || (this.s instanceof ws)) && (decorView = this.c.getDecorView()) != null && ti.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.s.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.L = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    wq wqVarD = d(0);
                    if (wqVarD.m) {
                        return true;
                    }
                    a(wqVarD, keyEvent);
                    return true;
            }
            return false;
        }
        switch (keyCode) {
            case 4:
                boolean z2 = this.L;
                this.L = false;
                wq wqVarD2 = d(0);
                if (wqVarD2 != null && wqVarD2.m) {
                    if (z2) {
                        return true;
                    }
                    a(wqVarD2, true);
                    return true;
                }
                if (this.f != null) {
                    this.f.c();
                    z = true;
                } else {
                    vj vjVarA = a();
                    z = vjVarA != null && vjVarA.f();
                }
                if (z) {
                    return true;
                }
                break;
            case 82:
                if (this.f != null) {
                    return true;
                }
                wq wqVarD3 = d(0);
                if (this.e != null && this.e.c() && !ViewConfiguration.get(this.b).hasPermanentMenuKey()) {
                    if (!this.e.d()) {
                        if (this.n || !a(wqVarD3, keyEvent)) {
                            zG = false;
                        } else {
                            zG = this.e.f();
                        }
                    } else {
                        zG = this.e.g();
                    }
                } else if (wqVarD3.m || wqVarD3.l) {
                    zG = wqVarD3.m;
                    a(wqVarD3, true);
                } else if (wqVarD3.k) {
                    if (wqVarD3.p) {
                        wqVarD3.k = false;
                        zA = a(wqVarD3, keyEvent);
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        b(wqVarD3, keyEvent);
                        zG = true;
                    } else {
                        zG = false;
                    }
                } else {
                    zG = false;
                }
                if (!zG) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    private final View a(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.T == null) {
            String string = this.b.obtainStyledAttributes(xl.aB).getString(xl.aF);
            if (string == null || wu.class.getName().equals(string)) {
                this.T = new wu();
            } else {
                try {
                    this.T = (wu) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    new StringBuilder("Failed to instantiate custom view inflater ").append(string).append(". Falling back to default.");
                    this.T = new wu();
                }
            }
        }
        return this.T.createView(view, str, context, attributeSet, false, false, true, ahv.a());
    }

    @Override // flm.wa
    public final void j() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        if (layoutInflaterFrom.getFactory() == null) {
            tc.a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private final void b(wq wqVar, KeyEvent keyEvent) {
        ExpandedMenuView expandedMenuView;
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (!wqVar.m && !this.n) {
            if (wqVar.a == 0) {
                if ((this.b.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback callback = this.c.getCallback();
            if (callback != null && !callback.onMenuOpened(wqVar.a, wqVar.h)) {
                a(wqVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
            if (windowManager != null && a(wqVar, keyEvent)) {
                if (wqVar.e == null || wqVar.o) {
                    if (wqVar.e == null) {
                        Context contextO = o();
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme themeNewTheme = contextO.getResources().newTheme();
                        themeNewTheme.setTo(contextO.getTheme());
                        themeNewTheme.resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarPopupTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        themeNewTheme.resolveAttribute(com.google.android.chimeraresources.R.attr.panelMenuListTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        } else {
                            themeNewTheme.applyStyle(com.google.android.chimeraresources.R.style.Theme_AppCompat_CompactMenu, true);
                        }
                        yj yjVar = new yj(contextO, 0);
                        yjVar.getTheme().setTo(themeNewTheme);
                        wqVar.j = yjVar;
                        TypedArray typedArrayObtainStyledAttributes = yjVar.obtainStyledAttributes(xl.aB);
                        wqVar.b = typedArrayObtainStyledAttributes.getResourceId(xl.aE, 0);
                        wqVar.d = typedArrayObtainStyledAttributes.getResourceId(xl.aC, 0);
                        typedArrayObtainStyledAttributes.recycle();
                        wqVar.e = new wp(this, wqVar.j);
                        wqVar.c = 81;
                        if (wqVar.e == null) {
                            return;
                        }
                    } else if (wqVar.o && wqVar.e.getChildCount() > 0) {
                        wqVar.e.removeAllViews();
                    }
                    if (wqVar.g != null) {
                        wqVar.f = wqVar.g;
                        z = true;
                    } else if (wqVar.h == null) {
                        z = false;
                    } else {
                        if (this.y == null) {
                            this.y = new wr(this);
                        }
                        wr wrVar = this.y;
                        if (wqVar.h == null) {
                            expandedMenuView = null;
                        } else {
                            if (wqVar.i == null) {
                                wqVar.i = new zf(wqVar.j, com.google.android.chimeraresources.R.layout.abc_list_menu_item_layout);
                                wqVar.i.e = wrVar;
                                wqVar.h.a(wqVar.i);
                            }
                            zf zfVar = wqVar.i;
                            ViewGroup viewGroup = wqVar.e;
                            if (zfVar.c == null) {
                                zfVar.c = (ExpandedMenuView) zfVar.a.inflate(com.google.android.chimeraresources.R.layout.abc_expanded_menu_layout, viewGroup, false);
                                if (zfVar.f == null) {
                                    zfVar.f = new zg(zfVar);
                                }
                                zfVar.c.setAdapter((ListAdapter) zfVar.f);
                                zfVar.c.setOnItemClickListener(zfVar);
                            }
                            expandedMenuView = zfVar.c;
                        }
                        wqVar.f = expandedMenuView;
                        z = wqVar.f != null;
                    }
                    if (z) {
                        if (wqVar.f == null) {
                            z2 = false;
                        } else {
                            z2 = wqVar.g != null || wqVar.i.b().getCount() > 0;
                        }
                        if (z2) {
                            ViewGroup.LayoutParams layoutParams2 = wqVar.f.getLayoutParams();
                            ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
                            wqVar.e.setBackgroundResource(wqVar.b);
                            ViewParent parent = wqVar.f.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(wqVar.f);
                            }
                            wqVar.e.addView(wqVar.f, layoutParams3);
                            if (!wqVar.f.hasFocus()) {
                                wqVar.f.requestFocus();
                            }
                            i = -2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (wqVar.g == null || (layoutParams = wqVar.g.getLayoutParams()) == null || layoutParams.width != -1) {
                    i = -2;
                }
                wqVar.l = false;
                WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams4.gravity = wqVar.c;
                layoutParams4.windowAnimations = wqVar.d;
                windowManager.addView(wqVar.e, layoutParams4);
                wqVar.m = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    final boolean a(wq wqVar, KeyEvent keyEvent) {
        Resources.Theme themeNewTheme;
        Context yjVar;
        if (this.n) {
            return false;
        }
        if (wqVar.k) {
            return true;
        }
        if (this.m != null && this.m != wqVar) {
            a(this.m, false);
        }
        Window.Callback callback = this.c.getCallback();
        if (callback != null) {
            wqVar.g = callback.onCreatePanelView(wqVar.a);
        }
        boolean z = wqVar.a == 0 || wqVar.a == 108;
        if (z && this.e != null) {
            this.e.h();
        }
        if (wqVar.g == null && (!z || !(this.u instanceof wx))) {
            if (wqVar.h == null || wqVar.p) {
                if (wqVar.h == null) {
                    Context context = this.b;
                    if ((wqVar.a == 0 || wqVar.a == 108) && this.e != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.chimeraresources.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        Resources.Theme theme2 = themeNewTheme;
                        if (theme2 != null) {
                            yjVar = new yj(context, 0);
                            yjVar.getTheme().setTo(theme2);
                        } else {
                            yjVar = context;
                        }
                    } else {
                        yjVar = context;
                    }
                    zi ziVar = new zi(yjVar);
                    ziVar.a(this);
                    wqVar.a(ziVar);
                    if (wqVar.h == null) {
                        return false;
                    }
                }
                if (z && this.e != null) {
                    if (this.x == null) {
                        this.x = new wj(this);
                    }
                    this.e.a(wqVar.h, this.x);
                }
                wqVar.h.e();
                if (!callback.onCreatePanelMenu(wqVar.a, wqVar.h)) {
                    wqVar.a(null);
                    if (!z || this.e == null) {
                        return false;
                    }
                    this.e.a(null, this.x);
                    return false;
                }
                wqVar.p = false;
            }
            wqVar.h.e();
            if (wqVar.q != null) {
                wqVar.h.b(wqVar.q);
                wqVar.q = null;
            }
            if (!callback.onPreparePanel(0, wqVar.g, wqVar.h)) {
                if (z && this.e != null) {
                    this.e.a(null, this.x);
                }
                wqVar.h.f();
                return false;
            }
            wqVar.n = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            wqVar.h.setQwertyMode(wqVar.n);
            wqVar.h.f();
        }
        wqVar.k = true;
        wqVar.l = false;
        this.m = wqVar;
        return true;
    }

    final void b(zi ziVar) {
        if (!this.J) {
            this.J = true;
            this.e.i();
            Window.Callback callback = this.c.getCallback();
            if (callback != null && !this.n) {
                callback.onPanelClosed(108, ziVar);
            }
            this.J = false;
        }
    }

    final void a(wq wqVar, boolean z) {
        if (z && wqVar.a == 0 && this.e != null && this.e.d()) {
            b(wqVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (windowManager != null && wqVar.m && wqVar.e != null) {
            windowManager.removeView(wqVar.e);
            if (z) {
                a(wqVar.a, wqVar, null);
            }
        }
        wqVar.k = false;
        wqVar.l = false;
        wqVar.m = false;
        wqVar.f = null;
        wqVar.o = true;
        if (this.m == wqVar) {
            this.m = null;
        }
    }

    final void a(int i, wq wqVar, Menu menu) {
        if (menu == null) {
            if (wqVar == null && i >= 0 && i < this.K.length) {
                wqVar = this.K[i];
            }
            if (wqVar != null) {
                menu = wqVar.h;
            }
        }
        if ((wqVar == null || wqVar.m) && !this.n) {
            this.s.onPanelClosed(i, menu);
        }
    }

    final wq a(Menu menu) {
        wq[] wqVarArr = this.K;
        int length = wqVarArr != null ? wqVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            wq wqVar = wqVarArr[i];
            if (wqVar != null && wqVar.h == menu) {
                return wqVar;
            }
        }
        return null;
    }

    protected final wq d(int i) {
        wq[] wqVarArr = this.K;
        if (wqVarArr == null || wqVarArr.length <= i) {
            wq[] wqVarArr2 = new wq[i + 1];
            if (wqVarArr != null) {
                System.arraycopy(wqVarArr, 0, wqVarArr2, 0, wqVarArr.length);
            }
            this.K = wqVarArr2;
            wqVarArr = wqVarArr2;
        }
        wq wqVar = wqVarArr[i];
        if (wqVar != null) {
            return wqVar;
        }
        wq wqVar2 = new wq(i);
        wqVarArr[i] = wqVar2;
        return wqVar2;
    }

    final boolean a(wq wqVar, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wqVar.k || a(wqVar, keyEvent)) && wqVar.h != null) {
            return wqVar.h.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private final void g(int i) {
        this.p |= 1 << i;
        if (!this.o) {
            ti.a(this.c.getDecorView(), this.P);
            this.o = true;
        }
    }

    final void e(int i) {
        wq wqVarD;
        wq wqVarD2 = d(i);
        if (wqVarD2.h != null) {
            Bundle bundle = new Bundle();
            wqVarD2.h.a(bundle);
            if (bundle.size() > 0) {
                wqVarD2.q = bundle;
            }
            wqVarD2.h.e();
            wqVarD2.h.clear();
        }
        wqVarD2.p = true;
        wqVarD2.o = true;
        if ((i == 108 || i == 0) && this.e != null && (wqVarD = d(0)) != null) {
            wqVarD.k = false;
            a(wqVarD, (KeyEvent) null);
        }
    }

    final int f(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.g == null || !(this.g.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            if (this.g.isShown()) {
                if (this.R == null) {
                    this.R = new Rect();
                    this.S = new Rect();
                }
                Rect rect = this.R;
                Rect rect2 = this.S;
                rect.set(0, i, 0, 0);
                aic.a(this.A, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.C == null) {
                        this.C = new View(this.b);
                        this.C.setBackgroundColor(this.b.getResources().getColor(com.google.android.chimeraresources.R.color.abc_input_method_navigation_guard));
                        this.A.addView(this.C, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.C.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                z4 = this.C != null;
                if (!this.G && z4) {
                    i = 0;
                }
                boolean z5 = z3;
                z2 = z4;
                z4 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z4 = false;
                z2 = false;
            }
            if (z4) {
                this.g.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.C != null) {
            this.C.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private final void q() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // flm.wa
    public final boolean k() throws IllegalAccessException {
        int i;
        boolean z;
        int i2 = this.M != -100 ? this.M : wa.a;
        switch (i2) {
            case -100:
                i = -1;
                break;
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.b.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    i = -1;
                } else {
                    r();
                    wn wnVar = this.O;
                    wnVar.b = wnVar.a.a();
                    i = !wnVar.b ? 1 : 2;
                }
                break;
            default:
                i = i2;
                break;
        }
        if (i != -1) {
            Resources resources = this.b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i3 = configuration.uiMode & 48;
            int i4 = i == 2 ? 32 : 16;
            if (i3 != i4) {
                if (s()) {
                    ((Activity) this.b).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT < 28) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            ww.c(resources);
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            ww.b(resources);
                        } else {
                            ww.a(resources);
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i2 == 0) {
            r();
            wn wnVar2 = this.O;
            wnVar2.a();
            if (wnVar2.c == null) {
                wnVar2.c = new wo(wnVar2);
            }
            if (wnVar2.d == null) {
                wnVar2.d = new IntentFilter();
                wnVar2.d.addAction("android.intent.action.TIME_SET");
                wnVar2.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                wnVar2.d.addAction("android.intent.action.TIME_TICK");
            }
            wnVar2.e.b.registerReceiver(wnVar2.c, wnVar2.d);
        }
        this.N = true;
        return z;
    }

    private final void r() {
        if (this.O == null) {
            Context context = this.b;
            if (xe.a == null) {
                Context applicationContext = context.getApplicationContext();
                xe.a = new xe(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.O = new wn(this, xe.a);
        }
    }

    private final boolean s() {
        if (!this.N || !(this.b instanceof Activity)) {
            return false;
        }
        try {
            return (this.b.getPackageManager().getActivityInfo(new ComponentName(this.b, this.b.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }

    @Override // flm.wa
    public final vm i() {
        return new wi(this);
    }
}
