package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gq extends AnimatorListenerAdapter {
    private final /* synthetic */ BaseTransientBottomBar a;

    public gq(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }
}
