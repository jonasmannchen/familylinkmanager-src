package flm;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adz implements Runnable {
    private final /* synthetic */ adx a;

    adz(adx adxVar) {
        this.a = adxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adx adxVar = this.a;
        adxVar.d();
        View view = adxVar.a;
        if (view.isEnabled() && !view.isLongClickable() && adxVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            adxVar.b = true;
        }
    }
}
