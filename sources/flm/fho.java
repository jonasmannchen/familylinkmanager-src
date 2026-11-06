package flm;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fho implements fkt {
    private final fhk a;
    private int b;
    private int c;
    private int d = 0;

    public static fho a(fhk fhkVar) {
        return fhkVar.d != null ? fhkVar.d : new fho(fhkVar);
    }

    private fho(fhk fhkVar) {
        this.a = (fhk) fiv.a((Object) fhkVar, "input");
        this.a.d = this;
    }

    @Override // flm.fkt
    public final int a() {
        if (this.d != 0) {
            this.b = this.d;
            this.d = 0;
        } else {
            this.b = this.a.a();
        }
        if (this.b == 0 || this.b == this.c) {
            return Integer.MAX_VALUE;
        }
        return this.b >>> 3;
    }

    @Override // flm.fkt
    public final int b() {
        return this.b;
    }

    @Override // flm.fkt
    public final boolean c() {
        if (this.a.t() || this.b == this.c) {
            return false;
        }
        return this.a.b(this.b);
    }

    private final void a(int i) throws fjh {
        if ((this.b & 7) != i) {
            throw fjg.f();
        }
    }

    @Override // flm.fkt
    public final double d() throws fjh {
        a(1);
        return this.a.b();
    }

    @Override // flm.fkt
    public final float e() throws fjh {
        a(5);
        return this.a.c();
    }

    @Override // flm.fkt
    public final long f() throws fjh {
        a(0);
        return this.a.d();
    }

    @Override // flm.fkt
    public final long g() throws fjh {
        a(0);
        return this.a.e();
    }

    @Override // flm.fkt
    public final int h() throws fjh {
        a(0);
        return this.a.f();
    }

    @Override // flm.fkt
    public final long i() throws fjh {
        a(1);
        return this.a.g();
    }

    @Override // flm.fkt
    public final int j() throws fjh {
        a(5);
        return this.a.h();
    }

    @Override // flm.fkt
    public final boolean k() throws fjh {
        a(0);
        return this.a.i();
    }

    @Override // flm.fkt
    public final String l() throws fjh {
        a(2);
        return this.a.j();
    }

    @Override // flm.fkt
    public final String m() throws fjh {
        a(2);
        return this.a.k();
    }

    public final Object a(Class cls, fib fibVar) throws fjh {
        a(2);
        return c(fkq.a.a(cls), fibVar);
    }

    @Override // flm.fkt
    public final Object a(fky fkyVar, fib fibVar) throws fjh {
        a(2);
        return c(fkyVar, fibVar);
    }

    @Override // flm.fkt
    public final Object b(fky fkyVar, fib fibVar) throws fjh {
        a(3);
        return d(fkyVar, fibVar);
    }

    private final Object c(fky fkyVar, fib fibVar) throws fjg {
        int iM = this.a.m();
        if (this.a.a >= this.a.b) {
            throw fjg.g();
        }
        int iC = this.a.c(iM);
        Object objA = fkyVar.a();
        this.a.a++;
        fkyVar.a(objA, this, fibVar);
        fkyVar.c(objA);
        this.a.a(0);
        this.a.a--;
        this.a.d(iC);
        return objA;
    }

    private final Object d(fky fkyVar, fib fibVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objA = fkyVar.a();
            fkyVar.a(objA, this, fibVar);
            fkyVar.c(objA);
            if (this.b != this.c) {
                throw fjg.i();
            }
            this.c = i;
            return objA;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    @Override // flm.fkt
    public final fgy n() throws fjh {
        a(2);
        return this.a.l();
    }

    @Override // flm.fkt
    public final int o() throws fjh {
        a(0);
        return this.a.m();
    }

    @Override // flm.fkt
    public final int p() throws fjh {
        a(0);
        return this.a.n();
    }

    @Override // flm.fkt
    public final int q() throws fjh {
        a(5);
        return this.a.o();
    }

    @Override // flm.fkt
    public final long r() throws fjh {
        a(1);
        return this.a.p();
    }

    @Override // flm.fkt
    public final int s() throws fjh {
        a(0);
        return this.a.q();
    }

    @Override // flm.fkt
    public final long t() throws fjh {
        a(0);
        return this.a.r();
    }

    @Override // flm.fkt
    public final void a(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fhy) {
            fhy fhyVar = (fhy) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int iM = this.a.m();
                    b(iM);
                    int iU = iM + this.a.u();
                    do {
                        fhyVar.a(this.a.b());
                    } while (this.a.u() < iU);
                    return;
                default:
                    throw fjg.f();
            }
            do {
                fhyVar.a(this.a.b());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int iM2 = this.a.m();
                b(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.u() < iU2);
                return;
            default:
                throw fjg.f();
        }
        do {
            list.add(Double.valueOf(this.a.b()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void b(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fik) {
            fik fikVar = (fik) list;
            switch (this.b & 7) {
                case 2:
                    int iM = this.a.m();
                    c(iM);
                    int iU = iM + this.a.u();
                    do {
                        fikVar.a(this.a.c());
                    } while (this.a.u() < iU);
                    return;
                case 3:
                case 4:
                default:
                    throw fjg.f();
                case 5:
                    break;
            }
            do {
                fikVar.a(this.a.c());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int iM2 = this.a.m();
                c(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.u() < iU2);
                return;
            case 3:
            case 4:
            default:
                throw fjg.f();
            case 5:
                break;
        }
        do {
            list.add(Float.valueOf(this.a.c()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void c(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fjsVar.a(this.a.d());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fjsVar.a(this.a.d());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.d()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.d()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void d(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fjsVar.a(this.a.e());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fjsVar.a(this.a.e());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.e()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void e(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fiuVar.d(this.a.f());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fiuVar.d(this.a.f());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.f()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.f()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void f(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int iM = this.a.m();
                    b(iM);
                    int iU = iM + this.a.u();
                    do {
                        fjsVar.a(this.a.g());
                    } while (this.a.u() < iU);
                    return;
                default:
                    throw fjg.f();
            }
            do {
                fjsVar.a(this.a.g());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int iM2 = this.a.m();
                b(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.g()));
                } while (this.a.u() < iU2);
                return;
            default:
                throw fjg.f();
        }
        do {
            list.add(Long.valueOf(this.a.g()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void g(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case 2:
                    int iM = this.a.m();
                    c(iM);
                    int iU = iM + this.a.u();
                    do {
                        fiuVar.d(this.a.h());
                    } while (this.a.u() < iU);
                    return;
                case 3:
                case 4:
                default:
                    throw fjg.f();
                case 5:
                    break;
            }
            do {
                fiuVar.d(this.a.h());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int iM2 = this.a.m();
                c(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.u() < iU2);
                return;
            case 3:
            case 4:
            default:
                throw fjg.f();
            case 5:
                break;
        }
        do {
            list.add(Integer.valueOf(this.a.h()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void h(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fgw) {
            fgw fgwVar = (fgw) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fgwVar.a(this.a.i());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fgwVar.a(this.a.i());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Boolean.valueOf(this.a.i()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void i(List list) throws fjh {
        a(list, false);
    }

    @Override // flm.fkt
    public final void j(List list) throws fjh {
        a(list, true);
    }

    private final void a(List list, boolean z) throws fjh {
        int iA;
        int iA2;
        if ((this.b & 7) != 2) {
            throw fjg.f();
        }
        if ((list instanceof fjo) && !z) {
            fjo fjoVar = (fjo) list;
            do {
                fjoVar.a(n());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        do {
            list.add(z ? m() : l());
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void a(List list, fky fkyVar, fib fibVar) throws fjh {
        int iA;
        if ((this.b & 7) != 2) {
            throw fjg.f();
        }
        int i = this.b;
        do {
            list.add(c(fkyVar, fibVar));
            if (!this.a.t() && this.d == 0) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == i);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void b(List list, fky fkyVar, fib fibVar) throws fjh {
        int iA;
        if ((this.b & 7) != 3) {
            throw fjg.f();
        }
        int i = this.b;
        do {
            list.add(d(fkyVar, fibVar));
            if (!this.a.t() && this.d == 0) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == i);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void k(List list) throws fjh {
        int iA;
        if ((this.b & 7) != 2) {
            throw fjg.f();
        }
        do {
            list.add(n());
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void l(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fiuVar.d(this.a.m());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fiuVar.d(this.a.m());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.m()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void m(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fiuVar.d(this.a.n());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fiuVar.d(this.a.n());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.n()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void n(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case 2:
                    int iM = this.a.m();
                    c(iM);
                    int iU = iM + this.a.u();
                    do {
                        fiuVar.d(this.a.o());
                    } while (this.a.u() < iU);
                    return;
                case 3:
                case 4:
                default:
                    throw fjg.f();
                case 5:
                    break;
            }
            do {
                fiuVar.d(this.a.o());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int iM2 = this.a.m();
                c(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.u() < iU2);
                return;
            case 3:
            case 4:
            default:
                throw fjg.f();
            case 5:
                break;
        }
        do {
            list.add(Integer.valueOf(this.a.o()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void o(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int iM = this.a.m();
                    b(iM);
                    int iU = iM + this.a.u();
                    do {
                        fjsVar.a(this.a.p());
                    } while (this.a.u() < iU);
                    return;
                default:
                    throw fjg.f();
            }
            do {
                fjsVar.a(this.a.p());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int iM2 = this.a.m();
                b(iM2);
                int iU2 = iM2 + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.u() < iU2);
                return;
            default:
                throw fjg.f();
        }
        do {
            list.add(Long.valueOf(this.a.p()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void p(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fiuVar.d(this.a.q());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fiuVar.d(this.a.q());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.q()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    @Override // flm.fkt
    public final void q(List list) throws fjg {
        int iA;
        int iA2;
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            switch (this.b & 7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 1:
                default:
                    throw fjg.f();
                case 2:
                    int iM = this.a.m() + this.a.u();
                    do {
                        fjsVar.a(this.a.r());
                    } while (this.a.u() < iM);
                    d(iM);
                    return;
            }
            do {
                fjsVar.a(this.a.r());
                if (!this.a.t()) {
                    iA2 = this.a.a();
                } else {
                    return;
                }
            } while (iA2 == this.b);
            this.d = iA2;
            return;
        }
        switch (this.b & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                break;
            case 1:
            default:
                throw fjg.f();
            case 2:
                int iM2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.u() < iM2);
                d(iM2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.r()));
            if (!this.a.t()) {
                iA = this.a.a();
            } else {
                return;
            }
        } while (iA == this.b);
        this.d = iA;
    }

    private static void b(int i) throws fjg {
        if ((i & 7) != 0) {
            throw fjg.i();
        }
    }

    @Override // flm.fkt
    public final void a(Map map, fjx fjxVar, fib fibVar) throws fjh {
        a(2);
        int iC = this.a.c(this.a.m());
        Object objA = fjxVar.b;
        Object objA2 = fjxVar.d;
        while (true) {
            try {
                int iA = a();
                if (iA != Integer.MAX_VALUE && !this.a.t()) {
                    switch (iA) {
                        case 1:
                            objA = a(fjxVar.a, (Class) null, (fib) null);
                            continue;
                        case 2:
                            objA2 = a(fjxVar.c, fjxVar.d.getClass(), fibVar);
                            continue;
                        default:
                            try {
                                if (!c()) {
                                    throw new fjg("Unable to parse map entry.");
                                }
                                continue;
                            } catch (fjh e) {
                                if (!c()) {
                                    throw new fjg("Unable to parse map entry.");
                                }
                            }
                    }
                    this.a.d(iC);
                    throw th;
                }
            } catch (Throwable th) {
                this.a.d(iC);
                throw th;
            }
        }
        map.put(objA, objA2);
        this.a.d(iC);
    }

    private final Object a(fmj fmjVar, Class cls, fib fibVar) {
        switch (fmjVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return a(cls, fibVar);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(o());
            case 13:
                return Integer.valueOf(p());
            case 14:
                return Integer.valueOf(q());
            case 15:
                return Long.valueOf(r());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
        }
    }

    private static void c(int i) throws fjg {
        if ((i & 3) != 0) {
            throw fjg.i();
        }
    }

    private final void d(int i) throws fjg {
        if (this.a.u() != i) {
            throw fjg.a();
        }
    }
}
