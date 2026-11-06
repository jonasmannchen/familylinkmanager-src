package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aah implements View.OnAttachStateChangeListener {
    private final /* synthetic */ aaf a;

    aah(aaf aafVar) {
        this.a = aafVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d != null) {
            if (!this.a.d.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            this.a.d.removeGlobalOnLayoutListener(this.a.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
