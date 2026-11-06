package flm;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhn {
    public final Application a;
    public final dmb b;
    public final dmb c;
    public final djl d;
    public final djz e;
    public final SharedPreferences f;
    public final dlw g;
    private volatile dgp h;
    private volatile dgr i;
    private volatile dhu j;
    private volatile dig k;
    private volatile dhe l;
    private volatile dgx m;
    private volatile dmj n;
    private volatile dhw o;
    private volatile dgi p;
    private volatile dpz q;
    private volatile dly r;
    private volatile dmb s;
    private final dmb t;

    dhn(Application application, dmb dmbVar, dmb dmbVar2, djl djlVar, djz djzVar, SharedPreferences sharedPreferences, dlw dlwVar, dvi dviVar) {
        this.a = application;
        this.c = dmbVar;
        new dmc(dmbVar2);
        this.d = djlVar;
        this.e = djzVar;
        this.f = sharedPreferences;
        this.g = dlwVar;
        this.b = new dmc(new dhp(application, djlVar));
        this.s = new dmc(new dhq(this, djlVar, application, dmbVar));
        this.t = new dmc(new dhr(this, djlVar, application, dmbVar, dviVar));
    }

    final dlx a(dlx dlxVar) {
        if (!this.g.a(dlxVar)) {
            dlxVar.g_();
        }
        return dlxVar;
    }

    final dpz a() {
        dpz dpzVarA;
        if (this.q == null) {
            synchronized (dpz.class) {
                if (this.q == null) {
                    if (this.e.g) {
                        final djl djlVar = this.d;
                        djlVar.getClass();
                        dpzVarA = new dki(new dmb(djlVar) { // from class: flm.dho
                            private final djl a;

                            {
                                this.a = djlVar;
                            }

                            @Override // flm.dmb
                            public final Object a() {
                                return this.a.a();
                            }
                        });
                    } else {
                        dpzVarA = this.d.a();
                    }
                    this.q = dpzVarA;
                }
            }
        }
        return this.q;
    }

    final dgp b() {
        if (this.h == null) {
            synchronized (dgp.class) {
                if (this.h == null) {
                    a();
                    Application application = this.a;
                    dmb dmbVar = this.b;
                    dmb dmbVar2 = this.c;
                    throw new NoSuchMethodError();
                }
            }
        }
        return this.h;
    }

    final dgr c() {
        if (this.i == null) {
            synchronized (dgr.class) {
                if (this.i == null) {
                    dpz dpzVarA = a();
                    Application application = this.a;
                    dmb dmbVar = this.b;
                    dmb dmbVar2 = this.c;
                    dkt dktVar = (dkt) ((djy) this.d.m().b()).a.b();
                    this.i = (dgr) a(new dgr(dpzVarA, application, dmbVar, dmbVar2, dktVar.b, dktVar.e, dktVar.c, dktVar.d, dktVar.f, new dfi()));
                }
            }
        }
        return this.i;
    }

    final dhu d() {
        if (this.j == null) {
            synchronized (dhu.class) {
                if (this.j == null) {
                    this.j = (dhu) a(new dhu(a(), this.a, this.b, this.c));
                }
            }
        }
        return this.j;
    }

    final dig e() {
        if (this.k == null) {
            synchronized (dig.class) {
                if (this.k == null) {
                    this.k = (dig) a(dig.a(a(), this.a, this.b, this.c, this.f, 0.95d));
                }
            }
        }
        return this.k;
    }

    final dhe f() {
        if (this.l == null) {
            synchronized (dhe.class) {
                if (this.l == null) {
                    dor dorVar = new dor();
                    dpz dpzVarA = a();
                    Application application = this.a;
                    dmb dmbVar = this.b;
                    dmb dmbVar2 = this.c;
                    dse.b(Build.VERSION.SDK_INT >= 24);
                    this.l = (dhe) a(new dhe(dpzVarA, application, dmbVar, dmbVar2, dkk.b(), dkk.d(), dorVar, dkk.e()));
                }
            }
        }
        return this.l;
    }

    final dgx g() {
        if (this.m == null) {
            synchronized (dgx.class) {
                if (this.m == null) {
                    djr djrVar = (djr) this.d.e().b();
                    boolean z = djrVar.f && dpl.d(this.a);
                    this.m = (dgx) a(new dgx(a(), djrVar.e, djrVar.d, djrVar.c, this.b, this.c, this.a, djrVar.b, z, this.e.d));
                }
            }
        }
        return this.m;
    }

    final boolean h() {
        return this.d.i().a() && ((dll) this.d.i().b()).a;
    }

    final dmj i() {
        dmj dmjVarB;
        if (this.n == null) {
            synchronized (dmj.class) {
                if (this.n == null) {
                    if (h()) {
                        dmjVarB = dmj.a(a(), this.a, this.b, this.c, this.d.i());
                    } else {
                        dmjVarB = dmj.b(a(), this.a, this.b, this.c, this.d.j());
                    }
                    this.n = (dmj) a(dmjVarB);
                }
            }
        }
        return this.n;
    }

    final boolean j() {
        return ((dvi) this.t.a()).a();
    }

    final dmf k() {
        return (dmf) ((dvi) this.t.a()).b();
    }

    final dhw l() {
        if (this.o == null) {
            synchronized (dhw.class) {
                if (this.o == null) {
                    dpz dpzVarA = a();
                    Application application = this.a;
                    boolean z = this.e.b;
                    dmb dmbVar = this.b;
                    dmb dmbVar2 = this.c;
                    dvi dviVarL = this.d.l();
                    dge dgeVarA = dge.a(this.a);
                    dkp dkpVar = (dkp) dviVarL.a(new dkp(false));
                    this.o = (dhw) a(new dhw(application, z, dkpVar.b, dgeVarA, dmbVar, dmbVar2, new dox(dkpVar.c), dpzVarA));
                }
            }
        }
        return this.o;
    }

    final dgi m() {
        if (this.p == null) {
            synchronized (dgi.class) {
                if (this.p == null) {
                    dpz dpzVarA = a();
                    Application application = this.a;
                    dmb dmbVar = this.b;
                    dmb dmbVar2 = this.c;
                    SharedPreferences sharedPreferences = this.f;
                    dvi dviVarK = this.d.k();
                    djk djkVarA = dji.a();
                    if (djkVarA.a == null) {
                        djkVarA.a = dji.a;
                    }
                    dji djiVar = (dji) dviVarK.a(new dji(false, false, djkVarA.a));
                    this.p = (dgi) a(new dgi(dpzVarA, application, dmbVar, dmbVar2, sharedPreferences, new dmq(dmbVar, new dne(application), dgj.a, dgk.a, djiVar.d), djiVar.c));
                }
            }
        }
        return this.p;
    }

    final dly n() {
        if (this.r == null) {
            synchronized (dly.class) {
                if (this.r == null) {
                    this.r = (dly) a(new dly(a(), this.a, this.b, this.c));
                }
            }
        }
        return this.r;
    }
}
