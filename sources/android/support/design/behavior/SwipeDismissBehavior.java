package android.support.design.behavior;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import flm.bbx;
import flm.el;
import flm.em;
import flm.hs;
import flm.ve;
import flm.vh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior extends hs {
    public ve a;
    public em b;
    private boolean g;
    private float h = 0.0f;
    public int c = 2;
    public float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private final vh i = new el(this);

    @Override // flm.hs
    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        switch (motionEvent.getActionMasked()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.g = coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.g;
                break;
            case 1:
            case 3:
                this.g = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = ve.a(coordinatorLayout, this.i);
        }
        return this.a.a(motionEvent);
    }

    @Override // flm.hs
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        this.a.b(motionEvent);
        return true;
    }

    public boolean b(View view) {
        return true;
    }

    public static float a(float f, float f2, float f3) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }
}
