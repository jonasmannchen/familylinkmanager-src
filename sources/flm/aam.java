package flm;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aam extends Drawable {
    private final ActionBarContainer a;

    public aam(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a.e) {
            if (this.a.d != null) {
                this.a.d.draw(canvas);
            }
        } else {
            if (this.a.b != null) {
                this.a.b.draw(canvas);
            }
            if (this.a.c != null && this.a.f) {
                this.a.c.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.a.e) {
            if (this.a.d != null) {
                this.a.d.getOutline(outline);
            }
        } else if (this.a.b != null) {
            this.a.b.getOutline(outline);
        }
    }
}
