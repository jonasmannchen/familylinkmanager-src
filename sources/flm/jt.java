package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jt extends AnimatorListenerAdapter {
    private final /* synthetic */ jq a;

    jt(jq jqVar) {
        this.a = jqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e();
        animator.removeListener(this);
    }
}
