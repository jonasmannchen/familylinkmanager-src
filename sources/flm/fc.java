package flm;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fc {
    public static final boolean a = true;
    public final fa b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public GradientDrawable n;
    public Drawable o;
    public GradientDrawable p;
    public Drawable q;
    public GradientDrawable r;
    public GradientDrawable s;
    public GradientDrawable t;
    public final Paint m = new Paint(1);
    private final Rect v = new Rect();
    private final RectF w = new RectF();
    public boolean u = false;

    public fc(fa faVar) {
        this.b = faVar;
    }

    final InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    final void a() {
        if (this.r != null) {
            qc.a(this.r, this.j);
            if (this.i != null) {
                qc.a(this.r, this.i);
            }
        }
    }
}
