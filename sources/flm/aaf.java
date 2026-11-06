package flm;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aaf extends zv implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, zy {
    private static final int e = R.layout.abc_popup_menu_item_layout;
    public final aez a;
    public View c;
    public ViewTreeObserver d;
    private final Context f;
    private final zi h;
    private final zh i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private PopupWindow.OnDismissListener o;
    private View p;
    private zz q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new aag(this);
    private final View.OnAttachStateChangeListener n = new aah(this);
    private int u = 0;

    public aaf(Context context, zi ziVar, View view, int i, int i2, boolean z) {
        this.f = context;
        this.h = ziVar;
        this.j = z;
        this.i = new zh(ziVar, LayoutInflater.from(context), this.j, e);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.p = view;
        this.a = new aez(this.f, null, this.l, this.m);
        ziVar.a(this, context);
    }

    @Override // flm.zv
    public final void b(boolean z) {
        this.i.b = z;
    }

    @Override // flm.zv
    public final void a(int i) {
        this.u = i;
    }

    @Override // flm.aae
    public final void b() {
        boolean z = true;
        if (!d()) {
            if (this.r || this.p == null) {
                z = false;
            } else {
                this.c = this.p;
                this.a.a(this);
                this.a.n = this;
                this.a.a(true);
                View view = this.c;
                boolean z2 = this.d == null;
                this.d = view.getViewTreeObserver();
                if (z2) {
                    this.d.addOnGlobalLayoutListener(this.b);
                }
                view.addOnAttachStateChangeListener(this.n);
                this.a.m = view;
                this.a.j = this.u;
                if (!this.s) {
                    this.t = a(this.i, null, this.f, this.k);
                    this.s = true;
                }
                this.a.b(this.t);
                this.a.c(2);
                this.a.q = this.g;
                this.a.b();
                ado adoVar = this.a.e;
                adoVar.setOnKeyListener(this);
                if (this.v && this.h.f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) adoVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(this.h.f);
                    }
                    frameLayout.setEnabled(false);
                    adoVar.addHeaderView(frameLayout, null, false);
                }
                this.a.a(this.i);
                this.a.b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // flm.aae
    public final void c() {
        if (d()) {
            this.a.c();
        }
    }

    @Override // flm.zv
    public final void a(zi ziVar) {
    }

    @Override // flm.aae
    public final boolean d() {
        return !this.r && this.a.s.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.r = true;
        this.h.close();
        if (this.d != null) {
            if (!this.d.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.n);
        if (this.o != null) {
            this.o.onDismiss();
        }
    }

    @Override // flm.zy
    public final void a(boolean z) {
        this.s = false;
        if (this.i != null) {
            this.i.notifyDataSetChanged();
        }
    }

    @Override // flm.zy
    public final void a(zz zzVar) {
        this.q = zzVar;
    }

    @Override // flm.zy
    public final boolean a(aai aaiVar) {
        boolean z;
        if (aaiVar.hasVisibleItems()) {
            zw zwVar = new zw(this.f, aaiVar, this.c, this.j, this.l, this.m);
            zwVar.a(this.q);
            zwVar.a(zv.b(aaiVar));
            zwVar.c = this.o;
            this.o = null;
            this.h.a(false);
            int width = this.a.g;
            int iF = this.a.f();
            if ((Gravity.getAbsoluteGravity(this.u, ti.f(this.p)) & 7) == 5) {
                width += this.p.getWidth();
            }
            if (zwVar.e()) {
                z = true;
            } else if (zwVar.a == null) {
                z = false;
            } else {
                zwVar.a(width, iF, true, true);
                z = true;
            }
            if (z) {
                if (this.q != null) {
                    this.q.a(aaiVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // flm.zy
    public final void a(zi ziVar, boolean z) {
        if (ziVar == this.h) {
            c();
            if (this.q != null) {
                this.q.a(ziVar, z);
            }
        }
    }

    @Override // flm.zy
    public final boolean a() {
        return false;
    }

    @Override // flm.zv
    public final void a(View view) {
        this.p = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    @Override // flm.zv
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    @Override // flm.aae
    public final ListView e() {
        return this.a.e;
    }

    @Override // flm.zv
    public final void b(int i) {
        this.a.g = i;
    }

    @Override // flm.zv
    public final void c(int i) {
        this.a.a(i);
    }

    @Override // flm.zv
    public final void c(boolean z) {
        this.v = z;
    }
}
