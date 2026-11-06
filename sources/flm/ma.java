package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ma extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ lg c;
    private final /* synthetic */ lw d;

    ma(lw lwVar, ViewGroup viewGroup, View view, lg lgVar) {
        this.d = lwVar;
        this.a = viewGroup;
        this.b = view;
        this.c = lgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animatorH = this.c.H();
        this.c.a((Animator) null);
        if (animatorH == null || this.a.indexOfChild(this.b) >= 0) {
            return;
        }
        this.d.a(this.c, this.c.I(), 0, 0, false);
    }
}
