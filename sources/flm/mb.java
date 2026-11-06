package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mb extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ lg c;

    mb(lw lwVar, ViewGroup viewGroup, View view, lg lgVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = lgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        if (this.c.K != null) {
            this.c.K.setVisibility(8);
        }
    }
}
