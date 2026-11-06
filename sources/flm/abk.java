package flm;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abk {
    private final View a;
    private ahc d;
    private ahc e;
    private ahc f;
    private int c = -1;
    private final abo b = abo.a();

    public abk(View view) {
        this.a = view;
    }

    public final void a(AttributeSet attributeSet, int i) {
        ahe aheVarA = ahe.a(this.a.getContext(), attributeSet, xl.du, i, 0);
        try {
            if (aheVarA.f(xl.dv)) {
                this.c = aheVarA.g(xl.dv, -1);
                ColorStateList colorStateListB = this.b.b(this.a.getContext(), this.c);
                if (colorStateListB != null) {
                    b(colorStateListB);
                }
            }
            if (aheVarA.f(xl.dw)) {
                ti.a(this.a, aheVarA.e(xl.dw));
            }
            if (aheVarA.f(xl.dx)) {
                ti.a(this.a, adn.a(aheVarA.a(xl.dx, -1), null));
            }
        } finally {
            aheVarA.b.recycle();
        }
    }

    public final void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        d();
    }

    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new ahc();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        d();
    }

    public final ColorStateList b() {
        if (this.e != null) {
            return this.e.a;
        }
        return null;
    }

    public final void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new ahc();
        }
        this.e.b = mode;
        this.e.c = true;
        d();
    }

    public final PorterDuff.Mode c() {
        if (this.e != null) {
            return this.e.b;
        }
        return null;
    }

    public final void d() {
        boolean z;
        boolean z2 = false;
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 21) {
                z = this.d != null;
            } else {
                z = i == 21;
            }
            if (z) {
                if (this.f == null) {
                    this.f = new ahc();
                }
                ahc ahcVar = this.f;
                ahcVar.a();
                ColorStateList colorStateListS = ti.s(this.a);
                if (colorStateListS != null) {
                    ahcVar.d = true;
                    ahcVar.a = colorStateListS;
                }
                PorterDuff.Mode modeT = ti.t(this.a);
                if (modeT != null) {
                    ahcVar.c = true;
                    ahcVar.b = modeT;
                }
                if (ahcVar.d || ahcVar.c) {
                    abo.a(background, ahcVar, this.a.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            if (this.e != null) {
                abo.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                abo.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    private final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new ahc();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        d();
    }
}
