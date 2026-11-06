package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ek extends AnimatorListenerAdapter {
    private final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public ek(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }
}
