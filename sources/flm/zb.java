package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zb implements View.OnAttachStateChangeListener {
    private final /* synthetic */ yz a;

    zb(yz yzVar) {
        this.a = yzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.e != null) {
            if (!this.a.e.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            this.a.e.removeGlobalOnLayoutListener(this.a.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
