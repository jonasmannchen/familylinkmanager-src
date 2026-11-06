package flm;

import android.animation.ValueAnimator;
import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ge implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ BaseTransientBottomBar a;

    public ge(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setScaleX(fFloatValue);
        this.a.c.setScaleY(fFloatValue);
    }
}
