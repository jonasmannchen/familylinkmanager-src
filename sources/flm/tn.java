package flm;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
final class tn implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private WeakHashMap a = new WeakHashMap();

    tn() {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        for (Map.Entry entry : this.a.entrySet()) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = view.getVisibility() == 0;
            if (zBooleanValue != z) {
                if (z) {
                    ti.f(view, 16);
                }
                this.a.put(view, Boolean.valueOf(z));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
