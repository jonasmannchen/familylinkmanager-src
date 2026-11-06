package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adu extends AnimatorListenerAdapter {
    private boolean a = false;
    private final /* synthetic */ adr b;

    adu(adr adrVar) {
        this.b = adrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
        } else if (((Float) this.b.n.getAnimatedValue()).floatValue() == 0.0f) {
            this.b.o = 0;
            this.b.a(0);
        } else {
            this.b.o = 2;
            this.b.j.invalidate();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }
}
