package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class xz extends Drawable.ConstantState {
    public PorterDuff.Mode A;
    public boolean B;
    public boolean C;
    private Resources D;
    private int E;
    private SparseArray F;
    private boolean G;
    private boolean H;
    private boolean I;
    private final xw a;
    public int b;
    public int c;
    public Drawable[] d;
    public int e;
    public boolean f;
    public boolean g;
    public Rect h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public ColorFilter x;
    public boolean y;
    public ColorStateList z;

    xz(xz xzVar, xw xwVar, Resources resources) {
        this.E = 160;
        this.f = false;
        this.i = false;
        this.s = true;
        this.u = 0;
        this.v = 0;
        this.a = xwVar;
        this.D = resources != null ? resources : xzVar != null ? xzVar.D : null;
        this.E = xw.a(resources, xzVar != null ? xzVar.E : 0);
        if (xzVar == null) {
            this.d = new Drawable[10];
            this.e = 0;
            return;
        }
        this.b = xzVar.b;
        this.c = xzVar.c;
        this.G = true;
        this.H = true;
        this.f = xzVar.f;
        this.i = xzVar.i;
        this.s = xzVar.s;
        this.I = xzVar.I;
        this.t = xzVar.t;
        this.u = xzVar.u;
        this.v = xzVar.v;
        this.w = xzVar.w;
        this.x = xzVar.x;
        this.y = xzVar.y;
        this.z = xzVar.z;
        this.A = xzVar.A;
        this.B = xzVar.B;
        this.C = xzVar.C;
        if (xzVar.E == this.E) {
            if (xzVar.g) {
                this.h = new Rect(xzVar.h);
                this.g = true;
            }
            if (xzVar.j) {
                this.k = xzVar.k;
                this.l = xzVar.l;
                this.m = xzVar.m;
                this.n = xzVar.n;
                this.j = true;
            }
        }
        if (xzVar.o) {
            this.p = xzVar.p;
            this.o = true;
        }
        if (xzVar.q) {
            this.r = xzVar.r;
            this.q = true;
        }
        Drawable[] drawableArr = xzVar.d;
        this.d = new Drawable[drawableArr.length];
        this.e = xzVar.e;
        SparseArray sparseArray = xzVar.F;
        if (sparseArray != null) {
            this.F = sparseArray.clone();
        } else {
            this.F = new SparseArray(this.e);
        }
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2] != null) {
                Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                if (constantState != null) {
                    this.F.put(i2, constantState);
                } else {
                    this.d[i2] = drawableArr[i2];
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.b | this.c;
    }

    public final int a(Drawable drawable) {
        int i = this.e;
        if (i >= this.d.length) {
            b(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.d[i] = drawable;
        this.e++;
        this.c |= drawable.getChangingConfigurations();
        b();
        this.h = null;
        this.g = false;
        this.j = false;
        this.G = false;
        return i;
    }

    final void b() {
        this.o = false;
        this.q = false;
    }

    final void c() {
        if (this.F != null) {
            int size = this.F.size();
            for (int i = 0; i < size; i++) {
                this.d[this.F.keyAt(i)] = b(((Drawable.ConstantState) this.F.valueAt(i)).newDrawable(this.D));
            }
            this.F = null;
        }
    }

    private final Drawable b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.t);
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setCallback(this.a);
        return drawableMutate;
    }

    public final Drawable b(int i) {
        int iIndexOfKey;
        Drawable drawable = this.d[i];
        if (drawable == null) {
            if (this.F == null || (iIndexOfKey = this.F.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableB = b(((Drawable.ConstantState) this.F.valueAt(iIndexOfKey)).newDrawable(this.D));
            this.d[i] = drawableB;
            this.F.removeAt(iIndexOfKey);
            if (this.F.size() == 0) {
                this.F = null;
                return drawableB;
            }
            return drawableB;
        }
        return drawable;
    }

    final void a(Resources resources) {
        if (resources != null) {
            this.D = resources;
            int iA = xw.a(resources, this.E);
            int i = this.E;
            this.E = iA;
            if (i != iA) {
                this.j = false;
                this.g = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        int i = this.e;
        Drawable[] drawableArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.F.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    void a() {
        int i = this.e;
        Drawable[] drawableArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2] != null) {
                drawableArr[i2].mutate();
            }
        }
        this.I = true;
    }

    protected final void d() {
        this.j = true;
        c();
        int i = this.e;
        Drawable[] drawableArr = this.d;
        this.l = -1;
        this.k = -1;
        this.n = 0;
        this.m = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.k) {
                this.k = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.l) {
                this.l = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.m) {
                this.m = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.n) {
                this.n = minimumHeight;
            }
        }
    }

    public void b(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.d, 0, drawableArr, 0, i);
        this.d = drawableArr;
    }

    public final synchronized boolean e() {
        boolean z = false;
        synchronized (this) {
            if (this.G) {
                z = this.H;
            } else {
                c();
                this.G = true;
                int i = this.e;
                Drawable[] drawableArr = this.d;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        this.H = false;
                    }
                }
                this.H = true;
                z = true;
            }
        }
        return z;
    }
}
