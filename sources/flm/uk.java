package flm;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class uk implements View.OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    private Runnable g;
    private int j;
    private int k;
    private boolean o;
    private boolean p;
    public final ul a = new ul();
    private final Interpolator f = new AccelerateInterpolator();
    private float[] h = {0.0f, 0.0f};
    private float[] i = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] l = {0.0f, 0.0f};
    private float[] m = {0.0f, 0.0f};
    private float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};

    public uk(View view) {
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        this.n[0] = i / 1000.0f;
        this.n[1] = i / 1000.0f;
        this.m[0] = i2 / 1000.0f;
        this.m[1] = i2 / 1000.0f;
        this.j = 1;
        this.i[0] = Float.MAX_VALUE;
        this.i[1] = Float.MAX_VALUE;
        this.h[0] = 0.2f;
        this.h[1] = 0.2f;
        this.l[0] = 0.001f;
        this.l[1] = 0.001f;
        this.k = q;
        this.a.a = 500;
        this.a.b = 500;
    }

    public abstract void a(int i);

    public abstract boolean b();

    public abstract boolean b(int i);

    public final uk a(boolean z) {
        if (this.p && !z) {
            c();
        }
        this.p = z;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.p) {
            switch (motionEvent.getActionMasked()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    this.d = true;
                    this.o = false;
                    float fA = a(0, motionEvent.getX(), view.getWidth(), this.b.getWidth());
                    float fA2 = a(1, motionEvent.getY(), view.getHeight(), this.b.getHeight());
                    ul ulVar = this.a;
                    ulVar.c = fA;
                    ulVar.d = fA2;
                    if (!this.e && a()) {
                        if (this.g == null) {
                            this.g = new um(this);
                        }
                        this.e = true;
                        this.c = true;
                        if (this.o && this.k > 0) {
                            ti.a(this.b, this.g, this.k);
                        } else {
                            this.g.run();
                        }
                        this.o = true;
                    }
                    break;
                case 1:
                case 3:
                    c();
                    break;
                case 2:
                    float fA3 = a(0, motionEvent.getX(), view.getWidth(), this.b.getWidth());
                    float fA4 = a(1, motionEvent.getY(), view.getHeight(), this.b.getHeight());
                    ul ulVar2 = this.a;
                    ulVar2.c = fA3;
                    ulVar2.d = fA4;
                    if (!this.e) {
                        if (this.g == null) {
                            this.g = new um(this);
                        }
                        this.e = true;
                        this.c = true;
                        if (this.o) {
                            this.g.run();
                        } else {
                            this.g.run();
                        }
                        this.o = true;
                    }
                    break;
            }
        }
        return false;
    }

    final boolean a() {
        ul ulVar = this.a;
        int iAbs = (int) (ulVar.d / Math.abs(ulVar.d));
        int iAbs2 = (int) (ulVar.c / Math.abs(ulVar.c));
        if (iAbs != 0 && b(iAbs)) {
            return true;
        }
        if (iAbs2 != 0) {
            b();
        }
        return false;
    }

    private final void c() {
        if (this.c) {
            this.e = false;
            return;
        }
        ul ulVar = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (jCurrentAnimationTimeMillis - ulVar.e);
        int i2 = ulVar.b;
        if (i <= i2) {
            i2 = i < 0 ? 0 : i;
        }
        ulVar.k = i2;
        ulVar.j = ulVar.a(jCurrentAnimationTimeMillis);
        ulVar.i = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    private final float a(int i, float f, float f2, float f3) {
        float fA;
        float interpolation;
        float f4;
        float f5;
        float f6;
        float fA2 = a(this.h[i] * f2, 0.0f, this.i[i]);
        float fA3 = a(f2 - f, fA2) - a(f, fA2);
        if (fA3 >= 0.0f) {
            if (fA3 > 0.0f) {
                interpolation = this.f.getInterpolation(fA3);
            } else {
                fA = 0.0f;
            }
            if (fA == 0.0f) {
                return 0.0f;
            }
            float f7 = this.l[i];
            f4 = this.m[i];
            f5 = this.n[i];
            f6 = f7 * f3;
            if (fA > 0.0f) {
                return a(fA * f6, f4, f5);
            }
            return -a((-fA) * f6, f4, f5);
        }
        interpolation = -this.f.getInterpolation(-fA3);
        fA = a(interpolation, -1.0f, 1.0f);
        if (fA == 0.0f) {
            return 0.0f;
        }
        float f8 = this.l[i];
        f4 = this.m[i];
        f5 = this.n[i];
        f6 = f8 * f3;
        if (fA > 0.0f) {
            return a(fA * f6, f4, f5);
        }
        return -a((-fA) * f6, f4, f5);
    }

    private final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.j) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (this.e && this.j == 1) ? 1.0f : 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }
}
