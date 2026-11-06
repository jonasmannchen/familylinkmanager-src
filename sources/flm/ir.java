package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ir extends Drawable.ConstantState {
    public int a;
    public iq b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public ir(ir irVar) {
        this.c = null;
        this.d = ik.a;
        if (irVar != null) {
            this.a = irVar.a;
            this.b = new iq(irVar.b);
            if (irVar.b.c != null) {
                this.b.c = new Paint(irVar.b.c);
            }
            if (irVar.b.b != null) {
                this.b.b = new Paint(irVar.b.b);
            }
            this.c = irVar.c;
            this.d = irVar.d;
            this.e = irVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        iq iqVar = this.b;
        iqVar.a(iqVar.d, iq.a, canvas, i, i2, null);
    }

    public ir() {
        this.c = null;
        this.d = ik.a;
        this.b = new iq();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ik(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new ik(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }
}
