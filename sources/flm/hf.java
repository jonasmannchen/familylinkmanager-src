package flm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hf extends AnimatorListenerAdapter {
    private final /* synthetic */ int a;
    private final /* synthetic */ TextView b;
    private final /* synthetic */ int c;
    private final /* synthetic */ TextView d;
    private final /* synthetic */ he e;

    hf(he heVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = heVar;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.d = this.a;
        this.e.c = null;
        if (this.b != null) {
            this.b.setVisibility(4);
            if (this.c != 1 || this.e.h == null) {
                return;
            }
            this.e.h.setText((CharSequence) null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.d != null) {
            this.d.setVisibility(0);
        }
    }
}
