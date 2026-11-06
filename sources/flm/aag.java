package flm;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aag implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ aaf a;

    aag(aaf aafVar) {
        this.a = aafVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.d() || this.a.a.r) {
            return;
        }
        View view = this.a.c;
        if (view == null || !view.isShown()) {
            this.a.c();
        } else {
            this.a.a.b();
        }
    }
}
