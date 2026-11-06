package flm;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ly extends me {
    public final /* synthetic */ lg a;
    public final /* synthetic */ lw b;
    private final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ly(lw lwVar, Animation.AnimationListener animationListener, ViewGroup viewGroup, lg lgVar) {
        super(animationListener);
        this.b = lwVar;
        this.c = viewGroup;
        this.a = lgVar;
    }

    @Override // flm.me, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.c.post(new lz(this));
    }
}
