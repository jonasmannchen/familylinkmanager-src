package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class js extends AnimatorListenerAdapter {
    private final /* synthetic */ rt a;
    private final /* synthetic */ jq b;

    js(jq jqVar, rt rtVar) {
        this.b = jqVar;
        this.a = rtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.m.add(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.m.remove(animator);
    }
}
