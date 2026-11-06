package flm;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class el extends vh {
    private int a;
    private int b = -1;
    private final /* synthetic */ SwipeDismissBehavior c;

    public el(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // flm.vh
    public final boolean a(View view, int i) {
        return this.b == -1 && this.c.b(view);
    }

    @Override // flm.vh
    public final void b(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // flm.vh
    public final void a(int i) {
        if (this.c.b != null) {
            this.c.b.a(i);
        }
    }

    @Override // flm.vh
    public final void a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.b = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            boolean z3 = ti.f(view) == 1;
            if (this.c.c == 2) {
                z = true;
            } else if (this.c.c == 0) {
                if (z3) {
                    z = f < 0.0f;
                } else {
                    z = f > 0.0f;
                }
            } else if (this.c.c != 1) {
                z = false;
            } else if (z3) {
                z = f > 0.0f;
            } else {
                z = f < 0.0f;
            }
        } else {
            z = Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * this.c.d);
        }
        if (z) {
            if (view.getLeft() < this.a) {
                i = this.a - width;
            } else {
                i = this.a + width;
            }
        } else {
            i = this.a;
            z2 = false;
        }
        if (this.c.a.a(i, view.getTop())) {
            ti.a(view, new en(this.c, view, z2));
        } else if (z2 && this.c.b != null) {
            this.c.b.a(view);
        }
    }

    @Override // flm.vh
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // flm.vh
    public final int c(View view, int i) {
        int width;
        int width2;
        boolean z = ti.f(view) == 1;
        if (this.c.c == 0) {
            if (z) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width2 = this.a + view.getWidth();
            }
        } else if (this.c.c == 1) {
            if (z) {
                width = this.a;
                width2 = this.a + view.getWidth();
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
        } else {
            width = this.a - view.getWidth();
            width2 = this.a + view.getWidth();
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // flm.vh
    public final int d(View view, int i) {
        return view.getTop();
    }

    @Override // flm.vh
    public final void a(View view, int i, int i2) {
        float width = this.a + (view.getWidth() * this.c.e);
        float width2 = this.a + (view.getWidth() * this.c.f);
        if (i <= width) {
            view.setAlpha(1.0f);
        } else if (i >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - ((i - width) / (width2 - width)), 1.0f));
        }
    }
}
