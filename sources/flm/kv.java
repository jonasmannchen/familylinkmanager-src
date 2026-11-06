package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kv extends AnimatorListenerAdapter implements jw {
    private final View a;
    private final int b;
    private final ViewGroup c;
    private boolean e;
    private boolean f = false;
    private final boolean d = true;

    kv(View view, int i, boolean z) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f) {
            km.a(this.a, this.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f) {
            km.a(this.a, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d();
    }

    @Override // flm.jw
    public final void c() {
    }

    @Override // flm.jw
    public final void a(jq jqVar) {
        d();
        jqVar.b(this);
    }

    @Override // flm.jw
    public final void a() {
        a(false);
    }

    @Override // flm.jw
    public final void b() {
        a(true);
    }

    private final void d() {
        if (!this.f) {
            km.a(this.a, this.b);
            if (this.c != null) {
                this.c.invalidate();
            }
        }
        a(false);
    }

    private final void a(boolean z) {
        if (this.d && this.e != z && this.c != null) {
            this.e = z;
            kk.a(this.c, z);
        }
    }
}
