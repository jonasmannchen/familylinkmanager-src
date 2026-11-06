package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aax extends aby implements abb {
    public final /* synthetic */ aat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aax(aat aatVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = aatVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ahq.a(this, getContentDescription());
        setOnTouchListener(new aay(this, this, aatVar));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.b();
        }
        return true;
    }

    @Override // flm.abb
    public final boolean d() {
        return false;
    }

    @Override // flm.abb
    public final boolean e() {
        return false;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            qc.a(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
