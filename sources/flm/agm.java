package flm;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class agm {
    private static final List p = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView o;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public agm h = null;
    public agm i = null;
    private List q = null;
    private List r = null;
    private int s = 0;
    public agf k = null;
    public boolean l = false;
    public int m = 0;
    public int n = -1;

    public agm(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((aga) this.a.getLayoutParams()).e = true;
        }
    }

    public final void a() {
        this.d = -1;
        this.g = -1;
    }

    public final boolean b() {
        return (this.j & 128) != 0;
    }

    public final int c() {
        return this.g == -1 ? this.c : this.g;
    }

    public final int d() {
        if (this.o == null) {
            return -1;
        }
        return this.o.c(this);
    }

    final boolean e() {
        return this.k != null;
    }

    final void f() {
        this.k.b(this);
    }

    final boolean g() {
        return (this.j & 32) != 0;
    }

    final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    final void a(agf agfVar, boolean z) {
        this.k = agfVar;
        this.l = z;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    final boolean k() {
        return (this.j & 2) != 0;
    }

    public final boolean l() {
        return (this.j & 1) != 0;
    }

    public final boolean m() {
        return (this.j & 8) != 0;
    }

    public final boolean a(int i) {
        return (this.j & i) != 0;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    public final void a(int i, int i2) {
        this.j = (this.j & (i2 ^ (-1))) | (i & i2);
    }

    public final void b(int i) {
        this.j |= i;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.j & 1024) == 0) {
            if (this.q == null) {
                this.q = new ArrayList();
                this.r = Collections.unmodifiableList(this.q);
            }
            this.q.add(obj);
        }
    }

    final void o() {
        if (this.q != null) {
            this.q.clear();
        }
        this.j &= -1025;
    }

    public final List p() {
        if ((this.j & 1024) == 0) {
            if (this.q == null || this.q.size() == 0) {
                return p;
            }
            return this.r;
        }
        return p;
    }

    final void q() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.s = 0;
        this.h = null;
        this.i = null;
        o();
        this.m = 0;
        this.n = -1;
        RecyclerView.b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (e()) {
            sb.append(" scrap ").append(this.l ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        if (k()) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (b()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.j & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a(boolean z) {
        this.s = z ? this.s - 1 : this.s + 1;
        if (this.s < 0) {
            this.s = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.s == 1) {
            this.j |= 16;
        } else if (z && this.s == 0) {
            this.j &= -17;
        }
    }

    public final boolean r() {
        return (this.j & 16) == 0 && !ti.c(this.a);
    }

    public final boolean s() {
        return (this.j & 2) != 0;
    }
}
