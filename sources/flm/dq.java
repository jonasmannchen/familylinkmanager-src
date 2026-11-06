package flm;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dq {
    public final dr a;
    public final int b;
    public dq c;
    public C0000do h;
    public int d = 0;
    private int j = -1;
    public int e = dp.h;
    public int f = dp.e;
    public int g = 0;
    public int i = Integer.MAX_VALUE;

    public dq(dr drVar, int i) {
        this.a = drVar;
        this.b = i;
    }

    public final void a() {
        if (this.h == null) {
            this.h = new C0000do(dp.a);
        } else {
            this.h.a();
        }
    }

    public final int b() {
        if (this.a.J == 8) {
            return 0;
        }
        if (this.j >= 0 && this.c != null && this.c.a.J == 8) {
            return this.j;
        }
        return this.d;
    }

    public final void c() {
        this.c = null;
        this.d = 0;
        this.j = -1;
        this.e = dp.i;
        this.g = 0;
        this.f = dp.e;
    }

    public final boolean a(dq dqVar, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        if (dqVar == null) {
            this.c = null;
            this.d = 0;
            this.j = -1;
            this.e = dp.h;
            this.g = 2;
            return true;
        }
        if (!z) {
            if (dqVar != null) {
                int i5 = dqVar.b;
                if (i5 == this.b) {
                    if (this.b == dp.r) {
                        z2 = false;
                    } else {
                        z2 = this.b != dp.q || (dqVar.a.k() && this.a.k());
                    }
                } else {
                    switch (this.b - 1) {
                        case 1:
                        case 3:
                            z2 = i5 == dp.m || i5 == dp.o;
                            if (dqVar.a instanceof dt) {
                                z2 = z2 || i5 == dp.s;
                            }
                            break;
                        case 2:
                        case 4:
                            z2 = i5 == dp.n || i5 == dp.p;
                            if (dqVar.a instanceof dt) {
                                z2 = z2 || i5 == dp.t;
                            }
                            break;
                        case 5:
                        default:
                            z2 = false;
                            break;
                        case 6:
                            z2 = i5 != dp.q && i5 != dp.s && i5 != dp.t;
                            break;
                    }
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        this.c = dqVar;
        if (i > 0) {
            this.d = i;
        } else {
            this.d = 0;
        }
        this.j = i2;
        this.e = i3;
        this.g = i4;
        return true;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        dr drVar = this.a;
        return sb.append((String) null).append(":").append(dp.v[this.b - 1]).append(this.c != null ? " connected to " + this.c.a(hashSet) : "").toString();
    }

    private final String a(HashSet hashSet) {
        if (hashSet.add(this)) {
            StringBuilder sb = new StringBuilder();
            dr drVar = this.a;
            return sb.append((String) null).append(":").append(dp.v[this.b - 1]).append(this.c != null ? " connected to " + this.c.a(hashSet) : "").toString();
        }
        return "<-";
    }
}
