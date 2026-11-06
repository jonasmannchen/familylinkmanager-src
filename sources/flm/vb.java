package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class vb extends View {
    @Deprecated
    private vb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @Deprecated
    private vb(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    @Deprecated
    public vb(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public final void draw(Canvas canvas) {
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            default:
                return i;
            case 1073741824:
                return size;
        }
    }

    @Override // android.view.View
    @Deprecated
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i), a(getSuggestedMinimumHeight(), i2));
    }
}
