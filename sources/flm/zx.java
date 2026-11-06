package flm;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zx implements PopupWindow.OnDismissListener {
    private final /* synthetic */ zw a;

    zx(zw zwVar) {
        this.a = zwVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.d();
    }
}
