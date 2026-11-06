package flm;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acw {
    public final acy a;
    public final acx b = new acx();
    public final List c = new ArrayList();

    public acw(acy acyVar) {
        this.a = acyVar;
    }

    public final void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public final void a(View view, int i, boolean z) {
        int iA;
        if (i < 0) {
            iA = this.a.a();
        } else {
            iA = a(i);
        }
        this.b.a(iA, z);
        if (z) {
            a(view);
        }
        this.a.a(view, iA);
    }

    final int a(int i) {
        if (i < 0) {
            return -1;
        }
        int iA = this.a.a();
        int i2 = i;
        while (i2 < iA) {
            int iE = i - (i2 - this.b.e(i2));
            if (iE == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iE;
        }
        return -1;
    }

    public final View b(int i) {
        return this.a.b(a(i));
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iA;
        if (i < 0) {
            iA = this.a.a();
        } else {
            iA = a(i);
        }
        this.b.a(iA, z);
        if (z) {
            a(view);
        }
        this.a.a(view, iA, layoutParams);
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final int b() {
        return this.a.a();
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    final void d(int i) {
        int iA = a(i);
        this.b.d(iA);
        this.a.c(iA);
    }

    final int c(View view) {
        int iA = this.a.a(view);
        if (iA == -1 || this.b.c(iA)) {
            return -1;
        }
        return iA - this.b.e(iA);
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
