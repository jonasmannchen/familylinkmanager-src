package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gh extends AnimatorListenerAdapter {
    private final /* synthetic */ int a;
    private final /* synthetic */ BaseTransientBottomBar b;

    gh(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.d.b(0, 180);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b(this.a);
    }
}
