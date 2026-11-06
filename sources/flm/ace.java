package flm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ace extends SeekBar {
    private final acf a;

    public ace(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    private ace(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new acf(this);
        this.a.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int max;
        synchronized (this) {
            super.onDraw(canvas);
            acf acfVar = this.a;
            if (acfVar.c != null && (max = acfVar.b.getMax()) > 1) {
                int intrinsicWidth = acfVar.c.getIntrinsicWidth();
                int intrinsicHeight = acfVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                acfVar.c.setBounds(-i, -i2, i, i2);
                float width = ((acfVar.b.getWidth() - acfVar.b.getPaddingLeft()) - acfVar.b.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(acfVar.b.getPaddingLeft(), acfVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    acfVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        acf acfVar = this.a;
        Drawable drawable = acfVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(acfVar.b.getDrawableState())) {
            acfVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        acf acfVar = this.a;
        if (acfVar.c != null) {
            acfVar.c.jumpToCurrentState();
        }
    }
}
