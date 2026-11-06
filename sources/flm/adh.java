package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adh extends AnimatorListenerAdapter {
    private final /* synthetic */ agm a;
    private final /* synthetic */ View b;
    private final /* synthetic */ ViewPropertyAnimator c;
    private final /* synthetic */ adc d;

    adh(adc adcVar, agm agmVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = adcVar;
        this.a = agmVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.f(this.a);
        this.d.d.remove(this.a);
        this.d.c();
    }
}
