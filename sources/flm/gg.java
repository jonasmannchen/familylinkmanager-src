package flm;

import android.animation.ValueAnimator;
import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gg implements ValueAnimator.AnimatorUpdateListener {
    private int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ BaseTransientBottomBar c;

    public gg(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.c = baseTransientBottomBar;
        this.b = i;
        this.a = this.b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.c.c.setTranslationY(iIntValue);
        this.a = iIntValue;
    }
}
