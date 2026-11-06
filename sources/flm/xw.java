package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class xw extends Drawable implements Drawable.Callback {
    private xz b;
    private Rect c;
    private Drawable d;
    private Drawable e;
    private boolean g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private xy l;
    private int f = 255;
    public int a = -1;

    xw() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.d != null) {
            this.d.draw(canvas);
        }
        if (this.e != null) {
            this.e.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rect2 = null;
        xz xzVar = this.b;
        if (!xzVar.f) {
            if (xzVar.h != null || xzVar.g) {
                rect2 = xzVar.h;
            } else {
                xzVar.c();
                Rect rect3 = new Rect();
                int i = xzVar.e;
                Drawable[] drawableArr = xzVar.d;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect2.left) {
                            rect2.left = rect3.left;
                        }
                        if (rect3.top > rect2.top) {
                            rect2.top = rect3.top;
                        }
                        if (rect3.right > rect2.right) {
                            rect2.right = rect3.right;
                        }
                        if (rect3.bottom > rect2.bottom) {
                            rect2.bottom = rect3.bottom;
                        }
                    }
                }
                xzVar.g = true;
                xzVar.h = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (rect2.right | ((rect2.left | rect2.top) | rect2.bottom)) != 0;
        } else if (this.d != null) {
            padding = this.d.getPadding(rect);
        } else {
            padding = super.getPadding(rect);
        }
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.d != null) {
            this.d.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.g || this.f != i) {
            this.g = true;
            this.f = i;
            if (this.d != null) {
                if (this.j == 0) {
                    this.d.setAlpha(i);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.b.s != z) {
            this.b.s = z;
            if (this.d != null) {
                this.d.setDither(this.b.s);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.y = true;
        if (this.b.x != colorFilter) {
            this.b.x = colorFilter;
            if (this.d != null) {
                this.d.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.B = true;
        if (this.b.z != colorStateList) {
            this.b.z = colorStateList;
            qc.a(this.d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.b.C = true;
        if (this.b.A != mode) {
            this.b.A = mode;
            qc.a(this.d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.e != null) {
            this.e.setBounds(rect);
        }
        if (this.d != null) {
            this.d.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        boolean z = false;
        xz xzVar = this.b;
        if (xzVar.q) {
            return xzVar.r;
        }
        xzVar.c();
        int i = xzVar.e;
        Drawable[] drawableArr = xzVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            }
        }
        xzVar.r = z;
        xzVar.q = true;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.b.w != z) {
            this.b.w = z;
            if (this.d != null) {
                qc.a(this.d, this.b.w);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.b.w;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z = true;
        boolean z2 = false;
        if (this.e != null) {
            this.e.jumpToCurrentState();
            this.e = null;
            z2 = true;
        }
        if (this.d != null) {
            this.d.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z2 = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z = z2;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.d != null) {
            qc.a(this.d, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.c == null) {
            this.c = new Rect(i, i2, i3, i4);
        } else {
            this.c.set(i, i2, i3, i4);
        }
        if (this.d != null) {
            qc.a(this.d, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        if (this.c != null) {
            rect.set(this.c);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.e != null) {
            return this.e.setState(iArr);
        }
        if (this.d != null) {
            return this.d.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.e != null) {
            return this.e.setLevel(i);
        }
        if (this.d != null) {
            return this.d.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean layoutDirection;
        xz xzVar = this.b;
        int i2 = this.a;
        int i3 = xzVar.e;
        Drawable[] drawableArr = xzVar.d;
        int i4 = 0;
        boolean z = false;
        while (i4 < i3) {
            if (drawableArr[i4] == null) {
                layoutDirection = z;
            } else {
                layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 != i2) {
                    layoutDirection = z;
                }
            }
            i4++;
            z = layoutDirection;
        }
        xzVar.t = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (!this.b.i) {
            if (this.d != null) {
                return this.d.getIntrinsicWidth();
            }
            return -1;
        }
        xz xzVar = this.b;
        if (!xzVar.j) {
            xzVar.d();
        }
        return xzVar.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (!this.b.i) {
            if (this.d != null) {
                return this.d.getIntrinsicHeight();
            }
            return -1;
        }
        xz xzVar = this.b;
        if (!xzVar.j) {
            xzVar.d();
        }
        return xzVar.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (!this.b.i) {
            if (this.d != null) {
                return this.d.getMinimumWidth();
            }
            return 0;
        }
        xz xzVar = this.b;
        if (!xzVar.j) {
            xzVar.d();
        }
        return xzVar.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (!this.b.i) {
            if (this.d != null) {
                return this.d.getMinimumHeight();
            }
            return 0;
        }
        xz xzVar = this.b;
        if (!xzVar.j) {
            xzVar.d();
        }
        return xzVar.n;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.b != null) {
            this.b.b();
        }
        if (drawable == this.d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.e != null) {
            this.e.setVisible(z, z2);
        }
        if (this.d != null) {
            this.d.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.d == null || !this.d.isVisible()) {
            return -2;
        }
        xz xzVar = this.b;
        if (xzVar.o) {
            return xzVar.p;
        }
        xzVar.c();
        int i = xzVar.e;
        Drawable[] drawableArr = xzVar.d;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        int i2 = 1;
        while (i2 < i) {
            int iResolveOpacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            i2++;
            opacity = iResolveOpacity;
        }
        xzVar.p = opacity;
        xzVar.o = true;
        return opacity;
    }

    final boolean a(int i) {
        if (i == this.a) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.b.v > 0) {
            if (this.e != null) {
                this.e.setVisible(false, false);
            }
            if (this.d != null) {
                this.e = this.d;
                this.k = ((long) this.b.v) + jUptimeMillis;
            } else {
                this.e = null;
                this.k = 0L;
            }
        } else if (this.d != null) {
            this.d.setVisible(false, false);
        }
        if (i >= 0 && i < this.b.e) {
            Drawable drawableB = this.b.b(i);
            this.d = drawableB;
            this.a = i;
            if (drawableB != null) {
                if (this.b.u > 0) {
                    this.j = jUptimeMillis + ((long) this.b.u);
                }
                a(drawableB);
            }
        } else {
            this.d = null;
            this.a = -1;
        }
        if (this.j != 0 || this.k != 0) {
            if (this.i == null) {
                this.i = new xx(this);
            } else {
                unscheduleSelf(this.i);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    private final void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new xy();
        }
        xy xyVar = this.l;
        xyVar.a = drawable.getCallback();
        drawable.setCallback(xyVar);
        try {
            if (this.b.u <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            if (this.b.y) {
                drawable.setColorFilter(this.b.x);
            } else {
                if (this.b.B) {
                    qc.a(drawable, this.b.z);
                }
                if (this.b.C) {
                    qc.a(drawable, this.b.A);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.b.s);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.b.w);
            Rect rect = this.c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.l.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    final void a(boolean z) {
        boolean z2;
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.d == null) {
            this.j = 0L;
        } else {
            if (this.j != 0) {
                if (this.j <= jUptimeMillis) {
                    this.d.setAlpha(this.f);
                    this.j = 0L;
                    z2 = false;
                } else {
                    this.d.setAlpha(((255 - (((int) ((this.j - jUptimeMillis) * 255)) / this.b.u)) * this.f) / 255);
                    z2 = true;
                }
            }
            if (this.e != null) {
                this.k = 0L;
            } else if (this.k != 0) {
                if (this.k <= jUptimeMillis) {
                    this.e.setVisible(false, false);
                    this.e = null;
                    this.k = 0L;
                } else {
                    this.e.setAlpha(((((int) ((this.k - jUptimeMillis) * 255)) / this.b.v) * this.f) / 255);
                    z2 = true;
                }
            }
            if (!z && z2) {
                scheduleSelf(this.i, 16 + jUptimeMillis);
                return;
            }
        }
        z2 = false;
        if (this.e != null) {
            this.k = 0L;
        } else if (this.k != 0) {
            if (this.k <= jUptimeMillis) {
                this.e.setVisible(false, false);
                this.e = null;
                this.k = 0L;
            } else {
                this.e.setAlpha(((((int) ((this.k - jUptimeMillis) * 255)) / this.b.v) * this.f) / 255);
                z2 = true;
            }
        }
        if (!z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.d;
    }

    final void a(Resources resources) {
        this.b.a(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        xz xzVar = this.b;
        if (theme != null) {
            xzVar.c();
            int i = xzVar.e;
            Drawable[] drawableArr = xzVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    xzVar.c |= drawableArr[i2].getChangingConfigurations();
                }
            }
            xzVar.a(theme.getResources());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.b.e()) {
            return null;
        }
        this.b.b = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            xz xzVarB = b();
            xzVarB.a();
            a(xzVarB);
            this.h = true;
        }
        return this;
    }

    xz b() {
        return this.b;
    }

    protected void a(xz xzVar) {
        this.b = xzVar;
        if (this.a >= 0) {
            this.d = xzVar.b(this.a);
            if (this.d != null) {
                a(this.d);
            }
        }
        this.e = null;
    }

    static int a(Resources resources, int i) {
        int i2 = resources == null ? i : resources.getDisplayMetrics().densityDpi;
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }
}
