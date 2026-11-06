package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ael {
    public afd a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    ael() {
        a();
    }

    final void a() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    final void b() {
        int iB;
        if (this.d) {
            iB = this.a.c();
        } else {
            iB = this.a.b();
        }
        this.c = iB;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }

    public final void a(View view, int i) {
        int iA = this.a.a();
        if (iA >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int iC = (this.a.c() - iA) - this.a.b(view);
            this.c = this.a.c() - iC;
            if (iC > 0) {
                int iE = this.c - this.a.e(view);
                int iB = this.a.b();
                int iMin = iE - (iB + Math.min(this.a.a(view) - iB, 0));
                if (iMin < 0) {
                    this.c = Math.min(iC, -iMin) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int iA2 = this.a.a(view);
        int iB2 = iA2 - this.a.b();
        this.c = iA2;
        if (iB2 > 0) {
            int iC2 = (this.a.c() - Math.min(0, (this.a.c() - iA) - this.a.b(view))) - (iA2 + this.a.e(view));
            if (iC2 < 0) {
                this.c -= Math.min(iB2, -iC2);
            }
        }
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.c = this.a.b(view) + this.a.a();
        } else {
            this.c = this.a.a(view);
        }
        this.b = i;
    }
}
