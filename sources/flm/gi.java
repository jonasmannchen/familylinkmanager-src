package flm;

import android.animation.ValueAnimator;
import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gi implements ValueAnimator.AnimatorUpdateListener {
    private int a = 0;
    private final /* synthetic */ BaseTransientBottomBar b;

    gi(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.b.c.setTranslationY(iIntValue);
        this.a = iIntValue;
    }
}
