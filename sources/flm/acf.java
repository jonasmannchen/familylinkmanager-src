package flm;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acf extends acb {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    acf(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    @Override // flm.acb
    final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        ahe aheVarA = ahe.a(this.b.getContext(), attributeSet, xl.af, i, 0);
        Drawable drawableB = aheVarA.b(xl.ag);
        if (drawableB != null) {
            this.b.setThumb(drawableB);
        }
        Drawable drawableA = aheVarA.a(xl.ah);
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = drawableA;
        if (drawableA != null) {
            drawableA.setCallback(this.b);
            qc.b(drawableA, ti.f(this.b));
            if (drawableA.isStateful()) {
                drawableA.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (aheVarA.f(xl.aj)) {
            this.e = adn.a(aheVarA.a(xl.aj, -1), this.e);
            this.g = true;
        }
        if (aheVarA.f(xl.ai)) {
            this.d = aheVarA.e(xl.ai);
            this.f = true;
        }
        aheVarA.b.recycle();
        a();
    }

    private final void a() {
        if (this.c != null) {
            if (this.f || this.g) {
                this.c = qc.e(this.c.mutate());
                if (this.f) {
                    qc.a(this.c, this.d);
                }
                if (this.g) {
                    qc.a(this.c, this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }
}
