package flm;

import android.os.Build;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mc extends me {
    public View a;

    mc(View view, Animation.AnimationListener animationListener) {
        super(animationListener);
        this.a = view;
    }

    @Override // flm.me, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (ti.z(this.a) || Build.VERSION.SDK_INT >= 24) {
            this.a.post(new md(this));
        } else {
            this.a.setLayerType(0, null);
        }
        super.onAnimationEnd(animation);
    }
}
