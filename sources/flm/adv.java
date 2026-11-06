package flm;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adv implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ adr a;

    adv(adr adrVar) {
        this.a = adrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(iFloatValue);
        this.a.c.setAlpha(iFloatValue);
        this.a.j.invalidate();
    }
}
