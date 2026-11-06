package flm;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class adx implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final View a;
    public boolean b;
    private final float c;
    private final int d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public adx(View view) {
        this.a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.d = ViewConfiguration.getTapTimeout();
        this.e = (this.d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract aae a();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        ado adoVar;
        boolean z4 = this.b;
        if (z4) {
            View view2 = this.a;
            aae aaeVarA = a();
            if (aaeVarA == null || !aaeVarA.d() || (adoVar = (ado) aaeVarA.e()) == null || !adoVar.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.i;
                adoVar.getLocationOnScreen(iArr2);
                motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean zA = adoVar.a(motionEventObtainNoHistory, this.h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                z3 = zA && (actionMasked != 1 && actionMasked != 3);
            }
            z2 = z3 || !c();
        } else {
            View view3 = this.a;
            if (view3.isEnabled()) {
                switch (motionEvent.getActionMasked()) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        this.h = motionEvent.getPointerId(0);
                        if (this.f == null) {
                            this.f = new ady(this);
                        }
                        view3.postDelayed(this.f, this.d);
                        if (this.g == null) {
                            this.g = new adz(this);
                        }
                        view3.postDelayed(this.g, this.e);
                        z = false;
                        break;
                    case 1:
                    case 3:
                        d();
                        z = false;
                        break;
                    case 2:
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                        if (iFindPointerIndex < 0) {
                            z = false;
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            float y = motionEvent.getY(iFindPointerIndex);
                            float f = this.c;
                            if (!(x >= (-f) && y >= (-f) && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                                d();
                                view3.getParent().requestDisallowInterceptTouchEvent(true);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = false;
            }
            boolean z5 = z && b();
            if (z5) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.a.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            z2 = z5;
        }
        this.b = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.b = false;
        this.h = -1;
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }

    public boolean b() {
        aae aaeVarA = a();
        if (aaeVarA != null && !aaeVarA.d()) {
            aaeVarA.b();
            return true;
        }
        return true;
    }

    protected boolean c() {
        aae aaeVarA = a();
        if (aaeVarA != null && aaeVarA.d()) {
            aaeVarA.c();
            return true;
        }
        return true;
    }

    final void d() {
        if (this.g != null) {
            this.a.removeCallbacks(this.g);
        }
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }
}
