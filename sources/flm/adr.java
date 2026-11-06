package flm;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adr extends afv implements agb {
    private static final int[] p = {R.attr.state_pressed};
    private static final int[] q = new int[0];
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public RecyclerView j;
    private final int r;
    private final int s;
    private final int t;
    private final StateListDrawable u;
    private final Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;
    public int h = 0;
    public int i = 0;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    public final ValueAnimator n = ValueAnimator.ofFloat(0.0f, 1.0f);
    public int o = 0;
    private final Runnable D = new ads(this);
    private final agc E = new adt(this);

    public adr(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.t = Math.max(i, drawable.getIntrinsicWidth());
        this.w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.x = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.r = i3;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new adu(this));
        this.n.addUpdateListener(new adv(this));
        if (this.j != recyclerView) {
            if (this.j != null) {
                RecyclerView recyclerView2 = this.j;
                if (recyclerView2.k != null) {
                    recyclerView2.k.a("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.m.remove(this);
                if (recyclerView2.m.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.m();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.j;
                recyclerView3.n.remove(this);
                if (recyclerView3.o == this) {
                    recyclerView3.o = null;
                }
                RecyclerView recyclerView4 = this.j;
                agc agcVar = this.E;
                if (recyclerView4.D != null) {
                    recyclerView4.D.remove(agcVar);
                }
                d();
            }
            this.j = recyclerView;
            if (this.j != null) {
                RecyclerView recyclerView5 = this.j;
                if (recyclerView5.k != null) {
                    recyclerView5.k.a("Cannot add item decoration during a scroll  or layout");
                }
                if (recyclerView5.m.isEmpty()) {
                    recyclerView5.setWillNotDraw(false);
                }
                recyclerView5.m.add(this);
                recyclerView5.m();
                recyclerView5.requestLayout();
                this.j.n.add(this);
                RecyclerView recyclerView6 = this.j;
                agc agcVar2 = this.E;
                if (recyclerView6.D == null) {
                    recyclerView6.D = new ArrayList();
                }
                recyclerView6.D.add(agcVar2);
            }
        }
    }

    final void a(int i) {
        if (i == 2 && this.m != 2) {
            this.b.setState(p);
            d();
        }
        if (i == 0) {
            this.j.invalidate();
        } else {
            c();
        }
        if (this.m == 2 && i != 2) {
            this.b.setState(q);
            b(1200);
        } else if (i == 1) {
            b(1500);
        }
        this.m = i;
    }

    private final boolean b() {
        return ti.f(this.j) == 1;
    }

    private final void c() {
        switch (this.o) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            case 2:
            default:
                return;
            case 3:
                this.n.cancel();
                break;
        }
        this.o = 1;
        this.n.setFloatValues(((Float) this.n.getAnimatedValue()).floatValue(), 1.0f);
        this.n.setDuration(500L);
        this.n.setStartDelay(0L);
        this.n.start();
    }

    private final void d() {
        this.j.removeCallbacks(this.D);
    }

    private final void b(int i) {
        d();
        this.j.postDelayed(this.D, i);
    }

    @Override // flm.afv
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.h != this.j.getWidth() || this.i != this.j.getHeight()) {
            this.h = this.j.getWidth();
            this.i = this.j.getHeight();
            a(0);
            return;
        }
        if (this.o != 0) {
            if (this.k) {
                int i = this.h - this.s;
                int i2 = this.e - (this.d / 2);
                this.b.setBounds(0, 0, this.s, this.d);
                this.c.setBounds(0, 0, this.t, this.i);
                if (b()) {
                    this.c.draw(canvas);
                    canvas.translate(this.s, i2);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-this.s, -i2);
                } else {
                    canvas.translate(i, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, i2);
                    this.b.draw(canvas);
                    canvas.translate(-i, -i2);
                }
            }
            if (this.l) {
                int i3 = this.i - this.w;
                int i4 = this.g - (this.f / 2);
                this.u.setBounds(0, 0, this.f, this.w);
                this.v.setBounds(0, 0, this.h, this.x);
                canvas.translate(0.0f, i3);
                this.v.draw(canvas);
                canvas.translate(i4, 0.0f);
                this.u.draw(canvas);
                canvas.translate(-i4, -i3);
            }
        }
    }

    @Override // flm.agb
    public final boolean a(MotionEvent motionEvent) {
        if (this.m != 1) {
            return this.m == 2;
        }
        boolean zA = a(motionEvent.getX(), motionEvent.getY());
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zA && !zB)) {
            return false;
        }
        if (zB) {
            this.A = 1;
            this.z = (int) motionEvent.getX();
        } else if (zA) {
            this.A = 2;
            this.y = (int) motionEvent.getY();
        }
        a(2);
        return true;
    }

    @Override // flm.agb
    public final void b(MotionEvent motionEvent) {
        if (this.m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zA = a(motionEvent.getX(), motionEvent.getY());
                boolean zB = b(motionEvent.getX(), motionEvent.getY());
                if (zA || zB) {
                    if (zB) {
                        this.A = 1;
                        this.z = (int) motionEvent.getX();
                    } else if (zA) {
                        this.A = 2;
                        this.y = (int) motionEvent.getY();
                    }
                    a(2);
                    return;
                }
                return;
            }
            if (motionEvent.getAction() == 1 && this.m == 2) {
                this.y = 0.0f;
                this.z = 0.0f;
                a(1);
                this.A = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.m == 2) {
                c();
                if (this.A == 1) {
                    float x = motionEvent.getX();
                    this.C[0] = this.r;
                    this.C[1] = this.h - this.r;
                    int[] iArr = this.C;
                    float fMax = Math.max(iArr[0], Math.min(iArr[1], x));
                    if (Math.abs(this.g - fMax) >= 2.0f) {
                        int iA = a(this.z, fMax, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                        if (iA != 0) {
                            this.j.scrollBy(iA, 0);
                        }
                        this.z = fMax;
                    }
                }
                if (this.A == 2) {
                    float y = motionEvent.getY();
                    this.B[0] = this.r;
                    this.B[1] = this.i - this.r;
                    int[] iArr2 = this.B;
                    float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                    if (Math.abs(this.e - fMax2) >= 2.0f) {
                        int iA2 = a(this.y, fMax2, iArr2, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                        if (iA2 != 0) {
                            this.j.scrollBy(0, iA2);
                        }
                        this.y = fMax2;
                    }
                }
            }
        }
    }

    @Override // flm.agb
    public final void a() {
    }

    private static int a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private final boolean a(float f, float f2) {
        if (!b() ? f >= this.h - this.s : f <= this.s / 2) {
            if (f2 >= this.e - (this.d / 2) && f2 <= this.e + (this.d / 2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(float f, float f2) {
        return f2 >= ((float) (this.i - this.w)) && f >= ((float) (this.g - (this.f / 2))) && f <= ((float) (this.g + (this.f / 2)));
    }
}
