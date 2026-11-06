package flm;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fj {
    private static final boolean E = false;
    private static final Paint F = null;
    public float A;
    public float B;
    public float C;
    public ColorStateList D;
    private float I;
    private float J;
    private float K;
    private float L;
    private Typeface M;
    private Typeface N;
    private boolean O;
    private float P;
    private float Q;
    public final View a;
    public boolean b;
    public float c;
    public ColorStateList i;
    public ColorStateList j;
    public float k;
    public float l;
    public Typeface m;
    public fu n;
    public CharSequence o;
    public CharSequence p;
    public boolean q;
    public Bitmap r;
    public Paint s;
    public float t;
    public float u;
    public int[] v;
    public boolean w;
    public TimeInterpolator y;
    public TimeInterpolator z;
    public int f = 16;
    private int H = 16;
    public float g = 15.0f;
    public float h = 15.0f;
    public final TextPaint x = new TextPaint(bbv.DEFAULT_BIND_FLAGS);
    private final TextPaint R = new TextPaint(this.x);
    public final Rect e = new Rect();
    public final Rect d = new Rect();
    private final RectF G = new RectF();

    public fj(View view) {
        this.a = view;
    }

    public final void a(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            d();
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            d();
        }
    }

    public final float a() {
        if (this.o == null) {
            return 0.0f;
        }
        a(this.R);
        return this.R.measureText(this.o, 0, this.o.length());
    }

    public final float b() {
        a(this.R);
        return -this.R.ascent();
    }

    private final void a(TextPaint textPaint) {
        textPaint.setTextSize(this.h);
        textPaint.setTypeface(this.M);
    }

    public final void c() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public final void a(int i) {
        if (this.H != i) {
            this.H = i;
            d();
        }
    }

    public final void b(int i) {
        fy fyVar = new fy(this.a.getContext(), i);
        if (fyVar.b != null) {
            this.j = fyVar.b;
        }
        if (fyVar.a != 0.0f) {
            this.h = fyVar.a;
        }
        if (fyVar.e != null) {
            this.D = fyVar.e;
        }
        this.B = fyVar.f;
        this.C = fyVar.g;
        this.A = fyVar.h;
        if (this.n != null) {
            this.n.a = true;
        }
        fk fkVar = new fk(this);
        fyVar.a();
        this.n = new fu(fkVar, fyVar.k);
        Context context = this.a.getContext();
        fu fuVar = this.n;
        fyVar.a();
        if (fyVar.i == 0) {
            fyVar.j = true;
        }
        if (fyVar.j) {
            fuVar.a(fyVar.k);
        } else {
            try {
                int i2 = fyVar.i;
                fz fzVar = new fz(fyVar, fuVar);
                sn.a(fzVar);
                if (context.isRestricted()) {
                    fzVar.a(-4, (Handler) null);
                } else {
                    pj.a(context, i2, new TypedValue(), 0, fzVar, null, false);
                }
            } catch (Resources.NotFoundException e) {
                fyVar.j = true;
                fuVar.a();
            } catch (Exception e2) {
                String strValueOf = String.valueOf(fyVar.d);
                if (strValueOf.length() != 0) {
                    "Error loading font ".concat(strValueOf);
                } else {
                    new String("Error loading font ");
                }
                fyVar.j = true;
                fuVar.a();
            }
        }
        d();
    }

    public final boolean a(Typeface typeface) {
        if (this.n != null) {
            this.n.a = true;
        }
        if (this.M == typeface) {
            return false;
        }
        this.M = typeface;
        return true;
    }

    public final void a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            f();
        }
    }

    private final void f() {
        b(this.c);
    }

    private final void b(float f) {
        this.G.left = a(this.d.left, this.e.left, f, this.y);
        this.G.top = a(this.I, this.J, f, this.y);
        this.G.right = a(this.d.right, this.e.right, f, this.y);
        this.G.bottom = a(this.d.bottom, this.e.bottom, f, this.y);
        this.k = a(this.K, this.L, f, this.y);
        this.l = a(this.I, this.J, f, this.y);
        c(a(this.g, this.h, f, this.z));
        if (this.j != this.i) {
            this.x.setColor(a(c(this.i), g(), f));
        } else {
            this.x.setColor(g());
        }
        this.x.setShadowLayer(a(0.0f, this.A, f, null), a(0.0f, this.B, f, null), a(0.0f, this.C, f, null), a(c((ColorStateList) null), c(this.D), f));
        ti.d(this.a);
    }

    private final int g() {
        return c(this.j);
    }

    private final int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        if (this.v != null) {
            return colorStateList.getColorForState(this.v, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final boolean a(CharSequence charSequence) {
        rl rlVar;
        if (ti.f(this.a) == 1) {
            rlVar = rm.d;
        } else {
            rlVar = rm.c;
        }
        return rlVar.a(charSequence, 0, charSequence.length());
    }

    private final void c(float f) {
        d(f);
        this.q = false;
        if (this.q && this.r == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.p)) {
            b(0.0f);
            this.t = this.x.ascent();
            this.P = this.x.descent();
            int iRound = Math.round(this.x.measureText(this.p, 0, this.p.length()));
            int iRound2 = Math.round(this.P - this.t);
            if (iRound > 0 && iRound2 > 0) {
                this.r = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
                new Canvas(this.r).drawText(this.p, 0, this.p.length(), 0.0f, iRound2 - this.x.descent(), this.x);
                if (this.s == null) {
                    this.s = new Paint(3);
                }
            }
        }
        ti.d(this.a);
    }

    private final void d(float f) {
        float f2;
        boolean z;
        if (this.o != null) {
            float fWidth = this.e.width();
            float fWidth2 = this.d.width();
            if (a(f, this.h)) {
                f2 = this.h;
                this.u = 1.0f;
                if (this.N != this.M) {
                    this.N = this.M;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                f2 = this.g;
                if (this.N != this.m) {
                    this.N = this.m;
                    z = true;
                } else {
                    z = false;
                }
                if (a(f, this.g)) {
                    this.u = 1.0f;
                } else {
                    this.u = f / this.g;
                }
                float f3 = this.h / this.g;
                fWidth = fWidth2 * f3 > fWidth ? Math.min(fWidth / f3, fWidth2) : fWidth2;
            }
            if (fWidth > 0.0f) {
                z = this.Q != f2 || this.w || z;
                this.Q = f2;
                this.w = false;
            }
            if (this.p == null || z) {
                this.x.setTextSize(this.Q);
                this.x.setTypeface(this.N);
                this.x.setLinearText(this.u != 1.0f);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.o, this.x, fWidth, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(charSequenceEllipsize, this.p)) {
                    this.p = charSequenceEllipsize;
                    this.O = a(this.p);
                }
            }
        }
    }

    public final void d() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            float f = this.Q;
            d(this.h);
            float fMeasureText = this.p != null ? this.x.measureText(this.p, 0, this.p.length()) : 0.0f;
            int iA = sz.a(this.H, this.O ? 1 : 0);
            switch (iA & 112) {
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.J = this.e.top - this.x.ascent();
                    break;
                case 80:
                    this.J = this.e.bottom;
                    break;
                default:
                    this.J = (((this.x.descent() - this.x.ascent()) / 2.0f) - this.x.descent()) + this.e.centerY();
                    break;
            }
            switch (iA & 8388615) {
                case 1:
                    this.L = this.e.centerX() - (fMeasureText / 2.0f);
                    break;
                case 5:
                    this.L = this.e.right - fMeasureText;
                    break;
                default:
                    this.L = this.e.left;
                    break;
            }
            d(this.g);
            float fMeasureText2 = this.p != null ? this.x.measureText(this.p, 0, this.p.length()) : 0.0f;
            int iA2 = sz.a(this.f, this.O ? 1 : 0);
            switch (iA2 & 112) {
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.I = this.d.top - this.x.ascent();
                    break;
                case 80:
                    this.I = this.d.bottom;
                    break;
                default:
                    this.I = (((this.x.descent() - this.x.ascent()) / 2.0f) - this.x.descent()) + this.d.centerY();
                    break;
            }
            switch (iA2 & 8388615) {
                case 1:
                    this.K = this.d.centerX() - (fMeasureText2 / 2.0f);
                    break;
                case 5:
                    this.K = this.d.right - fMeasureText2;
                    break;
                default:
                    this.K = this.d.left;
                    break;
            }
            e();
            c(f);
            f();
        }
    }

    public final void e() {
        if (this.r != null) {
            this.r.recycle();
            this.r = null;
        }
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((f2 * Color.blue(i)) + (Color.blue(i2) * f)));
    }

    private static float a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return dz.a(f, f2, f3);
    }

    public static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
