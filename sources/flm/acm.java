package flm;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acm implements PopupWindow.OnDismissListener {
    private final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    private final /* synthetic */ acj b;

    acm(acj acjVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = acjVar;
        this.a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
