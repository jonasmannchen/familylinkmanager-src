package flm;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mf {
    public final Animation a;
    public final Animator b;

    mf(Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    mf(Animator animator) {
        this.a = null;
        this.b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
