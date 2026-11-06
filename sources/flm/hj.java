package flm;

import android.animation.ValueAnimator;
import android.support.design.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hj implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ TextInputLayout a;

    public hj(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
