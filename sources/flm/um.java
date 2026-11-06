package flm;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class um implements Runnable {
    private final /* synthetic */ uk a;

    um(uk ukVar) {
        this.a = ukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e) {
            if (this.a.c) {
                this.a.c = false;
                ul ulVar = this.a.a;
                ulVar.e = AnimationUtils.currentAnimationTimeMillis();
                ulVar.i = -1L;
                ulVar.f = ulVar.e;
                ulVar.j = 0.5f;
                ulVar.g = 0;
                ulVar.h = 0;
            }
            ul ulVar2 = this.a.a;
            if ((ulVar2.i > 0 && AnimationUtils.currentAnimationTimeMillis() > ulVar2.i + ((long) ulVar2.k)) || !this.a.a()) {
                this.a.e = false;
                return;
            }
            if (this.a.d) {
                this.a.d = false;
                uk ukVar = this.a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ukVar.b.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            if (ulVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fA = ulVar2.a(jCurrentAnimationTimeMillis);
            float f = (fA * 4.0f) + ((-4.0f) * fA * fA);
            long j = jCurrentAnimationTimeMillis - ulVar2.f;
            ulVar2.f = jCurrentAnimationTimeMillis;
            ulVar2.g = (int) (j * f * ulVar2.c);
            ulVar2.h = (int) (j * f * ulVar2.d);
            this.a.a(ulVar2.h);
            ti.a(this.a.b, this);
        }
    }
}
