package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahn implements adb {
    public Toolbar a;
    public CharSequence b;
    public Window.Callback c;
    public boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private aat n;
    private int o;
    private int p;
    private Drawable q;

    public ahn(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description);
    }

    private ahn(Toolbar toolbar, boolean z, int i) {
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.n;
        this.l = toolbar.o;
        this.k = this.b != null;
        this.j = toolbar.f();
        ahe aheVarA = ahe.a(toolbar.getContext(), null, xl.a, R.attr.actionBarStyle, 0);
        this.q = aheVarA.a(xl.n);
        if (z) {
            CharSequence charSequenceC = aheVarA.c(xl.t);
            if (!TextUtils.isEmpty(charSequenceC)) {
                b(charSequenceC);
            }
            CharSequence charSequenceC2 = aheVarA.c(xl.r);
            if (!TextUtils.isEmpty(charSequenceC2)) {
                this.l = charSequenceC2;
                if ((this.e & 8) != 0) {
                    this.a.b(charSequenceC2);
                }
            }
            Drawable drawableA = aheVarA.a(xl.p);
            if (drawableA != null) {
                a(drawableA);
            }
            Drawable drawableA2 = aheVarA.a(xl.o);
            if (drawableA2 != null) {
                this.h = drawableA2;
                r();
            }
            if (this.j == null && this.q != null) {
                this.j = this.q;
                s();
            }
            a(aheVarA.a(xl.j, 0));
            int iG = aheVarA.g(xl.i, 0);
            if (iG != 0) {
                View viewInflate = LayoutInflater.from(this.a.getContext()).inflate(iG, (ViewGroup) this.a, false);
                if (this.g != null && (this.e & 16) != 0) {
                    this.a.removeView(this.g);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.e & 16) != 0) {
                    this.a.addView(this.g);
                }
                a(this.e | 16);
            }
            int iF = aheVarA.f(xl.l, 0);
            if (iF > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iF;
                this.a.setLayoutParams(layoutParams);
            }
            int iD = aheVarA.d(xl.h, -1);
            int iD2 = aheVarA.d(xl.g, -1);
            if (iD >= 0 || iD2 >= 0) {
                Toolbar toolbar2 = this.a;
                int iMax = Math.max(iD, 0);
                int iMax2 = Math.max(iD2, 0);
                toolbar2.j();
                toolbar2.m.a(iMax, iMax2);
            }
            int iG2 = aheVarA.g(xl.u, 0);
            if (iG2 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = this.a.getContext();
                toolbar3.j = iG2;
                if (toolbar3.b != null) {
                    toolbar3.b.setTextAppearance(context, iG2);
                }
            }
            int iG3 = aheVarA.g(xl.s, 0);
            if (iG3 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = this.a.getContext();
                toolbar4.k = iG3;
                if (toolbar4.c != null) {
                    toolbar4.c.setTextAppearance(context2, iG3);
                }
            }
            int iG4 = aheVarA.g(xl.q, 0);
            if (iG4 != 0) {
                this.a.a(iG4);
            }
        } else {
            int i2 = 11;
            if (this.a.f() != null) {
                i2 = 15;
                this.q = this.a.f();
            }
            this.e = i2;
        }
        aheVarA.b.recycle();
        if (i != this.p) {
            this.p = i;
            if (TextUtils.isEmpty(this.a.e())) {
                int i3 = this.p;
                this.m = i3 == 0 ? null : this.a.getContext().getString(i3);
                t();
            }
        }
        this.m = this.a.e();
        this.a.a(new aho(this));
    }

    @Override // flm.adb
    public final ViewGroup a() {
        return this.a;
    }

    @Override // flm.adb
    public final Context b() {
        return this.a.getContext();
    }

    @Override // flm.adb
    public final boolean c() {
        Toolbar toolbar = this.a;
        return (toolbar.s == null || toolbar.s.a == null) ? false : true;
    }

    @Override // flm.adb
    public final void d() {
        this.a.d();
    }

    @Override // flm.adb
    public final void a(Window.Callback callback) {
        this.c = callback;
    }

    @Override // flm.adb
    public final void a(CharSequence charSequence) {
        if (!this.k) {
            c(charSequence);
        }
    }

    @Override // flm.adb
    public final void b(CharSequence charSequence) {
        this.k = true;
        c(charSequence);
    }

    private final void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    @Override // flm.adb
    public final void e() {
    }

    @Override // flm.adb
    public final void f() {
    }

    @Override // flm.adb
    public final void a(Drawable drawable) {
        this.i = drawable;
        r();
    }

    private final void r() {
        Drawable drawable = null;
        if ((this.e & 2) != 0) {
            drawable = ((this.e & 1) == 0 || this.i == null) ? this.h : this.i;
        }
        this.a.a(drawable);
    }

    @Override // flm.adb
    public final boolean g() {
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    @Override // flm.adb
    public final boolean h() {
        return this.a.b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    @Override // flm.adb
    public final boolean i() {
        boolean z;
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c != null) {
                aat aatVar = actionMenuView.c;
                if (aatVar.k != null || aatVar.f()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // flm.adb
    public final boolean j() {
        return this.a.c();
    }

    @Override // flm.adb
    public final boolean k() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c != null && actionMenuView.c.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // flm.adb
    public final void l() {
        this.d = true;
    }

    @Override // flm.adb
    public final void a(Menu menu, zz zzVar) {
        if (this.n == null) {
            this.n = new aat(this.a.getContext());
        }
        this.n.d = zzVar;
        Toolbar toolbar = this.a;
        zi ziVar = (zi) menu;
        aat aatVar = this.n;
        if (ziVar != null || toolbar.a != null) {
            toolbar.g();
            zi ziVar2 = toolbar.a.a;
            if (ziVar2 != ziVar) {
                if (ziVar2 != null) {
                    ziVar2.b(toolbar.r);
                    ziVar2.b(toolbar.s);
                }
                if (toolbar.s == null) {
                    toolbar.s = new ahi(toolbar);
                }
                aatVar.h = true;
                if (ziVar != null) {
                    ziVar.a(aatVar, toolbar.h);
                    ziVar.a(toolbar.s, toolbar.h);
                } else {
                    aatVar.a(toolbar.h, (zi) null);
                    toolbar.s.a(toolbar.h, (zi) null);
                    aatVar.a(true);
                    toolbar.s.a(true);
                }
                toolbar.a.a(toolbar.i);
                toolbar.a.a(aatVar);
                toolbar.r = aatVar;
            }
        }
    }

    @Override // flm.adb
    public final void m() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            toolbar.a.c();
        }
    }

    @Override // flm.adb
    public final int n() {
        return this.e;
    }

    @Override // flm.adb
    public final void a(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    t();
                }
                s();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.a(this.b);
                    this.a.b(this.l);
                } else {
                    this.a.a((CharSequence) null);
                    this.a.b((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.g != null) {
                if ((i & 16) != 0) {
                    this.a.addView(this.g);
                } else {
                    this.a.removeView(this.g);
                }
            }
        }
    }

    @Override // flm.adb
    public final void a(agu aguVar) {
        if (this.f != null && this.f.getParent() == this.a) {
            this.a.removeView(this.f);
        }
        this.f = aguVar;
    }

    @Override // flm.adb
    public final void a(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.v = z;
        toolbar.requestLayout();
    }

    @Override // flm.adb
    public final void o() {
    }

    @Override // flm.adb
    public final int p() {
        return 0;
    }

    @Override // flm.adb
    public final tt a(int i, long j) {
        return ti.l(this.a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new ahp(this, i));
    }

    private final void s() {
        if ((this.e & 4) != 0) {
            this.a.b(this.j != null ? this.j : this.q);
        } else {
            this.a.b((Drawable) null);
        }
    }

    private final void t() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                Toolbar toolbar = this.a;
                int i = this.p;
                toolbar.c(i != 0 ? toolbar.getContext().getText(i) : null);
                return;
            }
            this.a.c(this.m);
        }
    }

    @Override // flm.adb
    public final void b(int i) {
        this.a.setVisibility(i);
    }

    @Override // flm.adb
    public final void a(zz zzVar, zj zjVar) {
        Toolbar toolbar = this.a;
        toolbar.t = zzVar;
        toolbar.u = zjVar;
        if (toolbar.a != null) {
            toolbar.a.a(zzVar, zjVar);
        }
    }

    @Override // flm.adb
    public final Menu q() {
        Toolbar toolbar = this.a;
        toolbar.g();
        if (toolbar.a.a == null) {
            zi ziVar = (zi) toolbar.a.b();
            if (toolbar.s == null) {
                toolbar.s = new ahi(toolbar);
            }
            toolbar.a.c.h = true;
            ziVar.a(toolbar.s, toolbar.h);
        }
        return toolbar.a.b();
    }
}
