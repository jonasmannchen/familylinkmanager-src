package flm;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aew implements View.OnTouchListener {
    private final /* synthetic */ aeq a;

    aew(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.a.s != null && this.a.s.isShowing() && x >= 0 && x < this.a.s.getWidth() && y >= 0 && y < this.a.s.getHeight()) {
            this.a.p.postDelayed(this.a.o, 250L);
            return false;
        }
        if (action == 1) {
            this.a.p.removeCallbacks(this.a.o);
            return false;
        }
        return false;
    }
}
