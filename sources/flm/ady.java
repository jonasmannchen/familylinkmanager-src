package flm;

import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ady implements Runnable {
    private final /* synthetic */ adx a;

    ady(adx adxVar) {
        this.a = adxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
