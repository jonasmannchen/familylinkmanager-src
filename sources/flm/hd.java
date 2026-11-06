package flm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends GradientDrawable {
    public final RectF a;
    private final Paint b = new Paint(1);
    private int c;

    public hd() {
        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.b.setColor(-1);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f != this.a.left || f2 != this.a.top || f3 != this.a.right || f4 != this.a.bottom) {
            this.a.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, null);
        } else {
            this.c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.a, this.b);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.c);
        }
    }
}
