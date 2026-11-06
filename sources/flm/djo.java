package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djo extends djl {
    private volatile dpz a;
    private volatile dvi b;
    private volatile dvi c;
    private volatile dvi d;
    private volatile dvi e;
    private volatile dvi f;
    private volatile dvi g;
    private volatile dvi h;
    private volatile dvi i;
    private volatile dvi j;
    private volatile dvi k;
    private volatile dvi l;
    private volatile dvi m;
    private volatile dvi n;
    private volatile dvi o;
    private volatile dvi p;
    private final Object q = new Object();
    private final djl r;

    djo(djl djlVar) {
        this.r = djlVar;
    }

    @Override // flm.djl
    public final dpz a() {
        if (this.a == null) {
            synchronized (this.q) {
                if (this.a == null) {
                    dpz dpzVarA = this.r.a();
                    if (dpzVarA == null) {
                        dpzVarA = dpz.a;
                    }
                    this.a = dpzVarA;
                }
            }
        }
        return this.a;
    }

    @Override // flm.djl
    public final dvi c() {
        if (this.c == null) {
            synchronized (this.q) {
                if (this.c == null) {
                    this.c = this.r.c();
                }
            }
        }
        return this.c;
    }

    @Override // flm.djl
    public final dvi b() {
        if (this.b == null) {
            synchronized (this.q) {
                if (this.b == null) {
                    this.b = this.r.b();
                }
            }
        }
        return this.b;
    }

    @Override // flm.djl
    public final dvi d() {
        if (this.d == null) {
            synchronized (this.q) {
                if (this.d == null) {
                    dvi dviVarD = this.r.d();
                    this.d = (!dviVarD.a() || ((dln) dviVarD.b()).c <= 0) ? dur.a : dviVarD;
                }
            }
        }
        return this.d;
    }

    @Override // flm.djl
    public final dvi e() {
        if (this.e == null) {
            synchronized (this.q) {
                if (this.e == null) {
                    this.e = this.r.e();
                }
            }
        }
        return this.e;
    }

    @Override // flm.djl
    public final dvi f() {
        if (this.f == null) {
            synchronized (this.q) {
                if (this.f == null) {
                    this.f = this.r.f();
                }
            }
        }
        return this.f;
    }

    @Override // flm.djl
    public final dvi g() {
        if (this.g == null) {
            synchronized (this.q) {
                if (this.g == null) {
                    this.g = this.r.g();
                }
            }
        }
        return this.g;
    }

    @Override // flm.djl
    public final dvi h() {
        if (this.h == null) {
            synchronized (this.q) {
                if (this.h == null) {
                    this.h = this.r.h();
                }
            }
        }
        return this.h;
    }

    @Override // flm.djl
    public final dvi i() {
        if (this.i == null) {
            synchronized (this.q) {
                if (this.i == null) {
                    this.i = this.r.i();
                }
            }
        }
        return this.i;
    }

    @Override // flm.djl
    public final dvi j() {
        if (this.j == null) {
            synchronized (this.q) {
                if (this.j == null) {
                    this.j = this.r.j();
                }
            }
        }
        return this.j;
    }

    @Override // flm.djl
    public final dvi k() {
        if (this.k == null) {
            synchronized (this.q) {
                if (this.k == null) {
                    this.k = this.r.k();
                }
            }
        }
        return this.k;
    }

    @Override // flm.djl
    public final dvi l() {
        if (this.l == null) {
            synchronized (this.q) {
                if (this.l == null) {
                    this.l = this.r.l();
                }
            }
        }
        return this.l;
    }

    @Override // flm.djl
    public final dvi m() {
        if (this.m == null) {
            synchronized (this.q) {
                if (this.m == null) {
                    this.m = this.r.m();
                }
            }
        }
        return this.m;
    }

    @Override // flm.djl
    public final dvi n() {
        if (this.n == null) {
            synchronized (this.q) {
                if (this.n == null) {
                    dvi dviVarN = this.r.n();
                    if (dviVarN.a()) {
                        dviVarN.b();
                        throw new NoSuchMethodError();
                    }
                    this.n = dur.a;
                }
            }
        }
        return this.n;
    }

    @Override // flm.djl
    public final dvi o() {
        if (this.o == null) {
            synchronized (this.q) {
                if (this.o == null) {
                    this.o = this.r.o();
                }
            }
        }
        return this.o;
    }

    @Override // flm.djl
    public final dvi p() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = this.r.p();
                }
            }
        }
        return this.p;
    }
}
