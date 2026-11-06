package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import flm.ahe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityChooserView extends ViewGroup {

    /* JADX INFO: compiled from: PG */
    public class InnerLayout extends LinearLayout {
        private static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            ahe aheVarA = ahe.a(context, attributeSet, a);
            setBackgroundDrawable(aheVarA.a(0));
            aheVarA.b.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }
}
