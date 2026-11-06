package flm;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ep extends vh {
    private final /* synthetic */ BottomSheetBehavior a;

    public ep(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // flm.vh
    public final boolean a(View view, int i) {
        if (this.a.f != 1 && !this.a.m) {
            if (this.a.f == 3 && this.a.l == i) {
                View view2 = this.a.j != null ? (View) this.a.j.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return this.a.i != null && this.a.i.get() == view;
        }
        return false;
    }

    @Override // flm.vh
    public final void a(View view, int i, int i2) {
        this.a.c(i2);
    }

    @Override // flm.vh
    public final void a(int i) {
        if (i == 1) {
            this.a.b(1);
        }
    }

    @Override // flm.vh
    public final void a(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            if (this.a.a) {
                i = this.a.b;
            } else if (view.getTop() > this.a.c) {
                i = this.a.c;
                i2 = 6;
            } else {
                i = 0;
            }
        } else if (this.a.e && this.a.a(view, f2) && (view.getTop() > this.a.d || Math.abs(f) < Math.abs(f2))) {
            i = this.a.h;
            i2 = 5;
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top = view.getTop();
            if (this.a.a) {
                if (Math.abs(top - this.a.b) < Math.abs(top - this.a.d)) {
                    i = this.a.b;
                } else {
                    i = this.a.d;
                    i2 = 4;
                }
            } else if (top < this.a.c) {
                if (top < Math.abs(top - this.a.d)) {
                    i = 0;
                } else {
                    i = this.a.c;
                    i2 = 6;
                }
            } else if (Math.abs(top - this.a.c) < Math.abs(top - this.a.d)) {
                i = this.a.c;
                i2 = 6;
            } else {
                i = this.a.d;
                i2 = 4;
            }
        } else {
            i = this.a.d;
            i2 = 4;
        }
        if (this.a.g.a(view.getLeft(), i)) {
            this.a.b(2);
            ti.a(view, new et(this.a, view, i2));
        } else {
            this.a.b(i2);
        }
    }

    @Override // flm.vh
    public final int d(View view, int i) {
        return ql.a(i, this.a.a(), this.a.e ? this.a.h : this.a.d);
    }

    @Override // flm.vh
    public final int c(View view, int i) {
        return view.getLeft();
    }

    @Override // flm.vh
    public final int a() {
        return this.a.e ? this.a.h : this.a.d;
    }
}
