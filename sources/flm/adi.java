package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adi extends AnimatorListenerAdapter {
    private final /* synthetic */ agm a;
    private final /* synthetic */ int b;
    private final /* synthetic */ View c;
    private final /* synthetic */ int d;
    private final /* synthetic */ ViewPropertyAnimator e;
    private final /* synthetic */ adc f;

    adi(adc adcVar, agm agmVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = adcVar;
        this.a = agmVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.f(this.a);
        this.f.e.remove(this.a);
        this.f.c();
    }
}
