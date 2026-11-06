package flm;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agl implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public final /* synthetic */ RecyclerView d;
    private Interpolator e = RecyclerView.L;
    private boolean f = false;
    private boolean g = false;

    public agl(RecyclerView recyclerView) {
        this.d = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.d.k == null) {
            b();
            return;
        }
        this.g = false;
        this.f = true;
        this.d.c();
        OverScroller overScroller = this.c;
        afw afwVar = this.d.k;
        if (overScroller.computeScrollOffset()) {
            int[] iArr = this.d.J;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.a;
            int i10 = currY - this.b;
            this.a = currX;
            this.b = currY;
            if (this.d.a(i9, i10, iArr, null, 1)) {
                int i11 = i9 - iArr[0];
                i = i10 - iArr[1];
                i2 = i11;
            } else {
                i = i10;
                i2 = i9;
            }
            if (this.d.j == null) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            } else {
                this.d.a(i2, i, this.d.K);
                i6 = this.d.K[0];
                i5 = this.d.K[1];
                i4 = i2 - i6;
                i3 = i - i5;
            }
            if (!this.d.m.isEmpty()) {
                this.d.invalidate();
            }
            if (this.d.getOverScrollMode() != 2) {
                this.d.b(i2, i);
            }
            if (!this.d.a(i6, i5, i4, i3, null, 1) && (i4 != 0 || i3 != 0)) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i4 == currX) {
                    i7 = 0;
                } else {
                    if (i4 < 0) {
                        i8 = -currVelocity;
                    } else {
                        i8 = i4 > 0 ? currVelocity : 0;
                    }
                    i7 = i8;
                }
                if (i3 == currY) {
                    currVelocity = 0;
                } else if (i3 < 0) {
                    currVelocity = -currVelocity;
                } else if (i3 <= 0) {
                    currVelocity = 0;
                }
                if (this.d.getOverScrollMode() != 2) {
                    RecyclerView recyclerView = this.d;
                    if (i7 < 0) {
                        recyclerView.e();
                        recyclerView.u.onAbsorb(-i7);
                    } else if (i7 > 0) {
                        recyclerView.f();
                        recyclerView.w.onAbsorb(i7);
                    }
                    if (currVelocity < 0) {
                        recyclerView.g();
                        recyclerView.v.onAbsorb(-currVelocity);
                    } else if (currVelocity > 0) {
                        recyclerView.h();
                        recyclerView.x.onAbsorb(currVelocity);
                    }
                    if (i7 != 0 || currVelocity != 0) {
                        ti.d(recyclerView);
                    }
                }
                if ((i7 != 0 || i4 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i3 == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (i6 != 0 || i5 != 0) {
                this.d.d(i6, i5);
            }
            if (!this.d.awakenScrollBars()) {
                this.d.invalidate();
            }
            boolean z = (i2 == 0 && i == 0) || (i2 != 0 && this.d.k.i() && i6 == i2) || (i != 0 && this.d.k.j() && i5 == i);
            if (overScroller.isFinished() || (!z && !this.d.p().a(1))) {
                this.d.a(0);
                if (RecyclerView.c) {
                    this.d.B.a();
                }
                this.d.b(1);
            } else {
                a();
                if (this.d.A != null) {
                    this.d.A.a(this.d, i2, i);
                }
            }
        }
        this.f = false;
        if (this.g) {
            a();
        }
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            this.d.removeCallbacks(this);
            ti.a(this.d, this);
        }
    }

    public final int a(int i, int i2, int i3, int i4) {
        int iRound;
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        boolean z = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
        int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
        int width = z ? this.d.getWidth() : this.d.getHeight();
        int i5 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / width) - 0.5f) * 0.47123894f)) * i5) + i5;
        if (iSqrt > 0) {
            iRound = Math.round(1000.0f * Math.abs(fSin / iSqrt)) * 4;
        } else {
            iRound = (int) ((((z ? iAbs : iAbs2) / width) + 1.0f) * 300.0f);
        }
        return Math.min(iRound, 2000);
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.e != interpolator) {
            this.e = interpolator;
            this.c = new OverScroller(this.d.getContext(), interpolator);
        }
        this.d.a(2);
        this.b = 0;
        this.a = 0;
        this.c.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    public final void b() {
        this.d.removeCallbacks(this);
        this.c.abortAnimation();
    }
}
