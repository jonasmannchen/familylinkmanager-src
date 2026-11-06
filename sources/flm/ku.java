package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ku extends AnimatorListenerAdapter {
    private final /* synthetic */ kj a;
    private final /* synthetic */ View b;

    ku(kt ktVar, kj kjVar, View view) {
        this.a = kjVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }
}
