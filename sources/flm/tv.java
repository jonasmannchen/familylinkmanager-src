package flm;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tv implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ ty a;
    private final /* synthetic */ View b;

    tv(tt ttVar, ty tyVar, View view) {
        this.a = tyVar;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
