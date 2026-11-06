package flm;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xt extends xv {
    private final ObjectAnimator a;
    private final boolean b;

    xt(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        xu xuVar = new xu(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(xuVar.a);
        objectAnimatorOfInt.setInterpolator(xuVar);
        this.b = z2;
        this.a = objectAnimatorOfInt;
    }

    @Override // flm.xv
    public final boolean c() {
        return this.b;
    }

    @Override // flm.xv
    public final void a() {
        this.a.start();
    }

    @Override // flm.xv
    public final void d() {
        this.a.reverse();
    }

    @Override // flm.xv
    public final void b() {
        this.a.cancel();
    }
}
