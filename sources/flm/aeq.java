package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aeq implements aae {
    private static Method a;
    private static Method b;
    private static Method c;
    private DataSetObserver A;
    private final aew B;
    private final aev C;
    private final aet D;
    private final Rect E;
    private Context d;
    public ado e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public View m;
    public AdapterView.OnItemClickListener n;
    public final aex o;
    public final Handler p;
    public Rect q;
    public boolean r;
    public PopupWindow s;
    private ListAdapter t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public aeq(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public aeq(Context context, AttributeSet attributeSet, int i, int i2) {
        this.u = -2;
        this.f = -2;
        this.w = 1002;
        this.j = 0;
        this.y = false;
        this.z = false;
        this.k = Integer.MAX_VALUE;
        this.l = 0;
        this.o = new aex(this);
        this.B = new aew(this);
        this.C = new aev(this);
        this.D = new aet(this);
        this.E = new Rect();
        this.d = context;
        this.p = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.bj, i, i2);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(xl.bk, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(xl.bl, 0);
        if (this.v != 0) {
            this.x = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.s = new aca(context, attributeSet, i, i2);
        this.s.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.A == null) {
            this.A = new aeu(this);
        } else if (this.t != null) {
            this.t.unregisterDataSetObserver(this.A);
        }
        this.t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A);
        }
        if (this.e != null) {
            this.e.setAdapter(this.t);
        }
    }

    public final void a(boolean z) {
        this.r = true;
        this.s.setFocusable(true);
    }

    public final void a(Drawable drawable) {
        this.s.setBackgroundDrawable(drawable);
    }

    public final int f() {
        if (this.x) {
            return this.v;
        }
        return 0;
    }

    public final void a(int i) {
        this.v = i;
        this.x = true;
    }

    public final void b(int i) {
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.getPadding(this.E);
            this.f = this.E.left + this.E.right + i;
        } else {
            this.f = i;
        }
    }

    @Override // flm.aae
    public void b() {
        int i;
        int iMakeMeasureSpec;
        int paddingTop;
        int width;
        int width2;
        int i2;
        if (this.e == null) {
            Context context = this.d;
            new aer(this);
            this.e = a(context, !this.r);
            this.e.setAdapter(this.t);
            this.e.setOnItemClickListener(this.n);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new aes(this));
            this.e.setOnScrollListener(this.C);
            this.s.setContentView(this.e);
        } else {
            this.s.getContentView();
        }
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.getPadding(this.E);
            int i3 = this.E.top + this.E.bottom;
            if (this.x) {
                i = i3;
            } else {
                this.v = -this.E.top;
                i = i3;
            }
        } else {
            this.E.setEmpty();
            i = 0;
        }
        int iA = a(this.m, this.v, this.s.getInputMethodMode() == 2);
        if (this.u == -1) {
            paddingTop = iA + i;
        } else {
            switch (this.f) {
                case -2:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.E.left + this.E.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.E.left + this.E.right), 1073741824);
                    break;
                default:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
                    break;
            }
            int iA2 = this.e.a(iMakeMeasureSpec, 0, -1, iA, -1);
            paddingTop = (iA2 > 0 ? this.e.getPaddingTop() + this.e.getPaddingBottom() + i + 0 : 0) + iA2;
        }
        boolean zH = h();
        va.a(this.s, this.w);
        if (this.s.isShowing()) {
            if (ti.z(this.m)) {
                if (this.f == -1) {
                    width2 = -1;
                } else if (this.f == -2) {
                    width2 = this.m.getWidth();
                } else {
                    width2 = this.f;
                }
                if (this.u == -1) {
                    int i4 = zH ? paddingTop : -1;
                    if (zH) {
                        this.s.setWidth(this.f == -1 ? -1 : 0);
                        this.s.setHeight(0);
                        i2 = i4;
                    } else {
                        this.s.setWidth(this.f == -1 ? -1 : 0);
                        this.s.setHeight(-1);
                        i2 = i4;
                    }
                } else {
                    i2 = this.u == -2 ? paddingTop : this.u;
                }
                this.s.setOutsideTouchable(true);
                PopupWindow popupWindow = this.s;
                View view = this.m;
                int i5 = this.g;
                int i6 = this.v;
                if (width2 < 0) {
                    width2 = -1;
                }
                if (i2 < 0) {
                    i2 = -1;
                }
                popupWindow.update(view, i5, i6, width2, i2);
                return;
            }
            return;
        }
        if (this.f == -1) {
            width = -1;
        } else if (this.f == -2) {
            width = this.m.getWidth();
        } else {
            width = this.f;
        }
        if (this.u == -1) {
            paddingTop = -1;
        } else if (this.u != -2) {
            paddingTop = this.u;
        }
        this.s.setWidth(width);
        this.s.setHeight(paddingTop);
        if (a != null) {
            try {
                a.invoke(this.s, true);
            } catch (Exception e) {
            }
        }
        this.s.setOutsideTouchable(true);
        this.s.setTouchInterceptor(this.B);
        if (this.i) {
            va.a(this.s, this.h);
        }
        if (c != null) {
            try {
                c.invoke(this.s, this.q);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        this.s.showAsDropDown(this.m, this.g, this.v, this.j);
        this.e.setSelection(-1);
        if (!this.r || this.e.isInTouchMode()) {
            g();
        }
        if (!this.r) {
            this.p.post(this.D);
        }
    }

    @Override // flm.aae
    public final void c() {
        this.s.dismiss();
        this.s.setContentView(null);
        this.e = null;
        this.p.removeCallbacks(this.o);
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.s.setOnDismissListener(onDismissListener);
    }

    public final void c(int i) {
        this.s.setInputMethodMode(2);
    }

    public final void g() {
        ado adoVar = this.e;
        if (adoVar != null) {
            adoVar.a = true;
            adoVar.requestLayout();
        }
    }

    @Override // flm.aae
    public final boolean d() {
        return this.s.isShowing();
    }

    public final boolean h() {
        return this.s.getInputMethodMode() == 2;
    }

    @Override // flm.aae
    public final ListView e() {
        return this.e;
    }

    ado a(Context context, boolean z) {
        return new ado(context, z);
    }

    private final int a(View view, int i, boolean z) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.s, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e) {
            }
        }
        return this.s.getMaxAvailableHeight(view, i);
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
        }
        try {
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException e3) {
        }
    }
}
