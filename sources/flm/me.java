package flm;

import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class me implements Animation.AnimationListener {
    private final Animation.AnimationListener a;

    me(Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationStart(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationRepeat(animation);
        }
    }
}
