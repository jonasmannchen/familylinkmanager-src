package flm;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.health.SystemHealthManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgi extends dfm implements dgb, dgc, dkz {
    public final dnc c;
    private volatile boolean d;
    private final Object e;
    private final AtomicBoolean f;
    private final dmq g;
    private final boolean h;
    private final List i;

    dgi(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences, dmq dmqVar, boolean z) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.J);
        this.d = false;
        this.e = new Object();
        this.f = new AtomicBoolean();
        new ConcurrentHashMap();
        this.c = new dnc(sharedPreferences);
        this.g = dmqVar;
        this.h = z;
        this.i = z ? new ArrayList() : null;
    }

    @Override // flm.dkz
    public final void e() {
    }

    @Override // flm.dkz
    public final void f() {
        if (!this.f.get()) {
            if (this.f.getAndSet(true)) {
                dkm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new Object[0]);
            } else {
                gok gokVar = gok.BACKGROUND_TO_FOREGROUND;
                if (this.h) {
                    b(gokVar, null, true);
                } else {
                    c().submit(new dgn(this, gokVar, null, true));
                }
            }
        }
        synchronized (this.e) {
            if (!this.d) {
                dge.a(this.a).a(this);
                this.d = true;
            }
        }
    }

    @Override // flm.dgc
    public final void a() {
        if (this.f.getAndSet(true)) {
            dkm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new Object[0]);
            return;
        }
        gok gokVar = gok.BACKGROUND_TO_FOREGROUND;
        if (this.h) {
            b(gokVar, null, true);
        } else {
            c().submit(new dgn(this, gokVar, null, true));
        }
    }

    @Override // flm.dgb
    public final void b() {
        if (!this.f.getAndSet(false)) {
            dkm.a(5, "BatteryMetricService", "unexpected state onAppToBackground", new Object[0]);
            return;
        }
        gok gokVar = gok.FOREGROUND_TO_BACKGROUND;
        if (this.h) {
            b(gokVar, null, true);
        } else {
            c().submit(new dgn(this, gokVar, null, true));
        }
    }

    @Override // flm.dfm
    final void d() {
        synchronized (this.e) {
            if (this.d) {
                dge.a(this.a).b(this);
                this.d = false;
            }
        }
        synchronized (this.c) {
            this.c.a.a.edit().remove("primes.battery.snapshot").commit();
        }
    }

    final dnd g() {
        gok gokVarA;
        dnd dndVar;
        gpa gpaVar;
        gpr gprVar;
        dsg.b();
        synchronized (this.c) {
            dqo dqoVar = (dqo) this.c.a.a("primes.battery.snapshot", (fko) dqo.k.a(dp.aw, (Object) null));
            if (dqoVar == null) {
                dndVar = null;
            } else {
                if ((dqoVar.a & 32) == 32) {
                    gokVarA = gok.a(dqoVar.g);
                    if (gokVarA == null) {
                        gokVarA = gok.UNKNOWN;
                    }
                } else {
                    gokVarA = null;
                }
                if (dqoVar.b == null) {
                    gpaVar = gpa.ao;
                } else {
                    gpaVar = dqoVar.b;
                }
                Long lValueOf = (dqoVar.a & 2) == 2 ? Long.valueOf(dqoVar.c) : null;
                Long lValueOf2 = (dqoVar.a & 4) == 4 ? Long.valueOf(dqoVar.d) : null;
                Long lValueOf3 = (dqoVar.a & 8) == 8 ? Long.valueOf(dqoVar.e) : null;
                Long lValueOf4 = (dqoVar.a & 16) == 16 ? Long.valueOf(dqoVar.f) : null;
                String str = (dqoVar.a & 64) == 64 ? dqoVar.h : null;
                Boolean boolValueOf = (dqoVar.a & 128) == 128 ? Boolean.valueOf(dqoVar.i) : null;
                if ((dqoVar.a & 256) != 256) {
                    gprVar = null;
                } else if (dqoVar.j == null) {
                    gprVar = gpr.c;
                } else {
                    gprVar = dqoVar.j;
                }
                dndVar = new dnd(gpaVar, lValueOf, lValueOf2, lValueOf3, lValueOf4, gokVarA, str, boolValueOf, gprVar);
            }
        }
        return dndVar;
    }

    final boolean a(dnd dndVar) {
        boolean zA;
        dsg.b();
        synchronized (this.c) {
            dnc dncVar = this.c;
            dqp dqpVar = (dqp) ((fio) dqo.k.a(dp.au, (Object) null));
            if (dndVar.a != null) {
                gpa gpaVar = dndVar.a;
                dqpVar.c();
                dqo dqoVar = (dqo) dqpVar.a;
                if (gpaVar == null) {
                    throw new NullPointerException();
                }
                dqoVar.b = gpaVar;
                dqoVar.a |= 1;
            }
            if (dndVar.b != null) {
                long jLongValue = dndVar.b.longValue();
                dqpVar.c();
                dqo dqoVar2 = (dqo) dqpVar.a;
                dqoVar2.a |= 2;
                dqoVar2.c = jLongValue;
            }
            if (dndVar.c != null) {
                long jLongValue2 = dndVar.c.longValue();
                dqpVar.c();
                dqo dqoVar3 = (dqo) dqpVar.a;
                dqoVar3.a |= 4;
                dqoVar3.d = jLongValue2;
            }
            if (dndVar.d != null) {
                long jLongValue3 = dndVar.d.longValue();
                dqpVar.c();
                dqo dqoVar4 = (dqo) dqpVar.a;
                dqoVar4.a |= 8;
                dqoVar4.e = jLongValue3;
            }
            if (dndVar.e != null) {
                long jLongValue4 = dndVar.e.longValue();
                dqpVar.c();
                dqo dqoVar5 = (dqo) dqpVar.a;
                dqoVar5.a |= 16;
                dqoVar5.f = jLongValue4;
            }
            if (dndVar.f != null) {
                int i = dndVar.f.d;
                dqpVar.c();
                dqo dqoVar6 = (dqo) dqpVar.a;
                dqoVar6.a |= 32;
                dqoVar6.g = i;
            }
            if (dndVar.g != null) {
                String str = dndVar.g;
                dqpVar.c();
                dqo dqoVar7 = (dqo) dqpVar.a;
                if (str == null) {
                    throw new NullPointerException();
                }
                dqoVar7.a |= 64;
                dqoVar7.h = str;
            }
            if (dndVar.h != null) {
                boolean zBooleanValue = dndVar.h.booleanValue();
                dqpVar.c();
                dqo dqoVar8 = (dqo) dqpVar.a;
                dqoVar8.a |= 128;
                dqoVar8.i = zBooleanValue;
            }
            if (dndVar.i != null) {
                gpr gprVar = dndVar.i;
                dqpVar.c();
                dqo dqoVar9 = (dqo) dqpVar.a;
                if (gprVar == null) {
                    throw new NullPointerException();
                }
                dqoVar9.j = gprVar;
                dqoVar9.a |= 256;
            }
            zA = dncVar.a.a("primes.battery.snapshot", (dqo) ((fin) dqpVar.h()));
        }
        return zA;
    }

    final dmr a(gok gokVar, String str, boolean z) {
        dmq dmqVar = this.g;
        Long lValueOf = Long.valueOf(dmqVar.d.a());
        Long lValueOf2 = Long.valueOf(dmqVar.c.a());
        SystemHealthManager systemHealthManager = (SystemHealthManager) dmqVar.a.a.getSystemService("systemhealth");
        return new dmr(dmqVar, lValueOf, lValueOf2, systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null, gokVar, str, Boolean.valueOf(z), dmqVar.b.a());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    final void a(dnd dndVar, dnd dndVar2) {
        boolean z;
        goy goyVar;
        goy goyVar2;
        goy goyVar3;
        goy goyVar4;
        goy goyVar5;
        goy goyVar6;
        goy goyVar7;
        goy goyVar8;
        goy goyVar9;
        goy goyVar10;
        goy goyVar11;
        goy goyVar12;
        goy goyVar13;
        goy goyVar14;
        goy goyVar15;
        goy goyVar16;
        goy goyVar17;
        goy goyVar18;
        goy goyVar19;
        goy goyVar20;
        goy goyVar21;
        goy goyVar22;
        goy goyVar23;
        goy goyVar24;
        goy goyVar25;
        goy goyVar26;
        goy goyVar27;
        goy goyVar28;
        goy goyVar29;
        goy goyVar30;
        goy goyVar31;
        goy goyVar32;
        gpa gpaVar;
        gtr gtrVar;
        boolean z2;
        dkm.a(2, "BatteryMetricService", "log start: %s\nend: %s", dndVar, dndVar2);
        dmq dmqVar = this.g;
        if (dndVar != null && dndVar2 != null) {
            if (Objects.equals(dndVar.d, dndVar2.d) && Objects.equals(dndVar.e, dndVar2.e)) {
                if (dndVar.b == null || dndVar.c == null || dndVar2.b == null || dndVar2.c == null) {
                    z2 = false;
                } else {
                    long jLongValue = dndVar2.b.longValue() - dndVar.b.longValue();
                    long jLongValue2 = dndVar2.c.longValue() - dndVar.c.longValue();
                    if (jLongValue2 <= 0) {
                        z2 = false;
                    } else {
                        long jAbs = Math.abs(jLongValue - jLongValue2);
                        z2 = jAbs < 25 || ((double) jAbs) / ((double) jLongValue2) <= 3.472222222222222E-5d;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            dkm.a(3, "BatteryCapture", "inconsistent stats", new Object[0]);
            gtrVar = null;
        } else {
            dne dneVar = dmqVar.a;
            gpa gpaVar2 = dndVar2.a;
            gpa gpaVar3 = dndVar.a;
            dse.a(gpaVar2);
            if (gpaVar3 == null) {
                gpaVar = gpaVar2;
            } else {
                gpb gpbVar = (gpb) ((fio) gpa.ao.a(dp.au, (Object) null));
                Long lA = dmv.a((gpaVar2.a & 1) == 1 ? Long.valueOf(gpaVar2.c) : null, (gpaVar3.a & 1) == 1 ? Long.valueOf(gpaVar3.c) : null);
                if (lA != null) {
                    gpbVar.a(lA.longValue());
                }
                Long lA2 = dmv.a((gpaVar2.a & 4) == 4 ? Long.valueOf(gpaVar2.d) : null, (gpaVar3.a & 4) == 4 ? Long.valueOf(gpaVar3.d) : null);
                if (lA2 != null) {
                    gpbVar.b(lA2.longValue());
                }
                gpbVar.a(dmv.a(gpaVar2.e, gpaVar3.e)).b(dmv.a(gpaVar2.f, gpaVar3.f)).c(dmv.a(gpaVar2.g, gpaVar3.g)).d(dmv.a(gpaVar2.h, gpaVar3.h)).e(dmv.a(gpaVar2.i, gpaVar3.i)).f(dmv.a(gpaVar2.j, gpaVar3.j));
                if ((gpaVar2.a & 16) == 16) {
                    if (gpaVar2.k == null) {
                        goyVar = goy.e;
                    } else {
                        goyVar = gpaVar2.k;
                    }
                } else {
                    goyVar = null;
                }
                if ((gpaVar3.a & 16) == 16) {
                    if (gpaVar3.k == null) {
                        goyVar2 = goy.e;
                    } else {
                        goyVar2 = gpaVar3.k;
                    }
                } else {
                    goyVar2 = null;
                }
                goy goyVarA = dmv.a(goyVar, goyVar2);
                if (goyVarA != null) {
                    gpbVar.a(goyVarA);
                }
                gpbVar.g(dmv.a(gpaVar2.l, gpaVar3.l)).h(dmy.a.a(gpaVar2.m, gpaVar3.m)).i(dmx.a.a(gpaVar2.n, gpaVar3.n));
                Long lA3 = dmv.a((gpaVar2.a & 32) == 32 ? Long.valueOf(gpaVar2.o) : null, (gpaVar3.a & 32) == 32 ? Long.valueOf(gpaVar3.o) : null);
                if (lA3 != null) {
                    gpbVar.c(lA3.longValue());
                }
                Long lA4 = dmv.a((gpaVar2.a & 64) == 64 ? Long.valueOf(gpaVar2.p) : null, (gpaVar3.a & 64) == 64 ? Long.valueOf(gpaVar3.p) : null);
                if (lA4 != null) {
                    gpbVar.d(lA4.longValue());
                }
                Long lA5 = dmv.a((gpaVar2.a & 128) == 128 ? Long.valueOf(gpaVar2.q) : null, (gpaVar3.a & 128) == 128 ? Long.valueOf(gpaVar3.q) : null);
                if (lA5 != null) {
                    gpbVar.e(lA5.longValue());
                }
                Long lA6 = dmv.a((gpaVar2.a & 256) == 256 ? Long.valueOf(gpaVar2.r) : null, (gpaVar3.a & 256) == 256 ? Long.valueOf(gpaVar3.r) : null);
                if (lA6 != null) {
                    gpbVar.f(lA6.longValue());
                }
                Long lA7 = dmv.a((gpaVar2.a & 512) == 512 ? Long.valueOf(gpaVar2.s) : null, (gpaVar3.a & 512) == 512 ? Long.valueOf(gpaVar3.s) : null);
                if (lA7 != null) {
                    gpbVar.g(lA7.longValue());
                }
                Long lA8 = dmv.a((gpaVar2.a & 1024) == 1024 ? Long.valueOf(gpaVar2.t) : null, (gpaVar3.a & 1024) == 1024 ? Long.valueOf(gpaVar3.t) : null);
                if (lA8 != null) {
                    gpbVar.h(lA8.longValue());
                }
                Long lA9 = dmv.a((gpaVar2.a & 2048) == 2048 ? Long.valueOf(gpaVar2.u) : null, (gpaVar3.a & 2048) == 2048 ? Long.valueOf(gpaVar3.u) : null);
                if (lA9 != null) {
                    gpbVar.i(lA9.longValue());
                }
                Long lA10 = dmv.a((gpaVar2.a & 4096) == 4096 ? Long.valueOf(gpaVar2.v) : null, (gpaVar3.a & 4096) == 4096 ? Long.valueOf(gpaVar3.v) : null);
                if (lA10 != null) {
                    gpbVar.j(lA10.longValue());
                }
                Long lA11 = dmv.a((gpaVar2.a & 8192) == 8192 ? Long.valueOf(gpaVar2.w) : null, (gpaVar3.a & 8192) == 8192 ? Long.valueOf(gpaVar3.w) : null);
                if (lA11 != null) {
                    gpbVar.k(lA11.longValue());
                }
                Long lA12 = dmv.a((gpaVar2.a & 16384) == 16384 ? Long.valueOf(gpaVar2.x) : null, (gpaVar3.a & 16384) == 16384 ? Long.valueOf(gpaVar3.x) : null);
                if (lA12 != null) {
                    gpbVar.l(lA12.longValue());
                }
                Long lA13 = dmv.a((gpaVar2.a & 32768) == 32768 ? Long.valueOf(gpaVar2.y) : null, (gpaVar3.a & 32768) == 32768 ? Long.valueOf(gpaVar3.y) : null);
                if (lA13 != null) {
                    gpbVar.m(lA13.longValue());
                }
                Long lA14 = dmv.a((gpaVar2.a & 65536) == 65536 ? Long.valueOf(gpaVar2.z) : null, (gpaVar3.a & 65536) == 65536 ? Long.valueOf(gpaVar3.z) : null);
                if (lA14 != null) {
                    gpbVar.n(lA14.longValue());
                }
                Long lA15 = dmv.a((gpaVar2.a & 131072) == 131072 ? Long.valueOf(gpaVar2.A) : null, (gpaVar3.a & 131072) == 131072 ? Long.valueOf(gpaVar3.A) : null);
                if (lA15 != null) {
                    gpbVar.o(lA15.longValue());
                }
                Long lA16 = dmv.a((gpaVar2.a & 262144) == 262144 ? Long.valueOf(gpaVar2.B) : null, (gpaVar3.a & 262144) == 262144 ? Long.valueOf(gpaVar3.B) : null);
                if (lA16 != null) {
                    gpbVar.p(lA16.longValue());
                }
                if ((gpaVar2.a & 524288) == 524288) {
                    if (gpaVar2.C == null) {
                        goyVar3 = goy.e;
                    } else {
                        goyVar3 = gpaVar2.C;
                    }
                } else {
                    goyVar3 = null;
                }
                if ((gpaVar3.a & 524288) == 524288) {
                    if (gpaVar3.C == null) {
                        goyVar4 = goy.e;
                    } else {
                        goyVar4 = gpaVar3.C;
                    }
                } else {
                    goyVar4 = null;
                }
                goy goyVarA2 = dmv.a(goyVar3, goyVar4);
                if (goyVarA2 != null) {
                    gpbVar.b(goyVarA2);
                }
                Long lA17 = dmv.a((gpaVar2.a & 1048576) == 1048576 ? Long.valueOf(gpaVar2.H) : null, (gpaVar3.a & 1048576) == 1048576 ? Long.valueOf(gpaVar3.H) : null);
                if (lA17 != null) {
                    gpbVar.q(lA17.longValue());
                }
                if ((gpaVar2.a & 2097152) == 2097152) {
                    if (gpaVar2.I == null) {
                        goyVar5 = goy.e;
                    } else {
                        goyVar5 = gpaVar2.I;
                    }
                } else {
                    goyVar5 = null;
                }
                if ((gpaVar3.a & 2097152) == 2097152) {
                    if (gpaVar3.I == null) {
                        goyVar6 = goy.e;
                    } else {
                        goyVar6 = gpaVar3.I;
                    }
                } else {
                    goyVar6 = null;
                }
                goy goyVarA3 = dmv.a(goyVar5, goyVar6);
                if (goyVarA3 != null) {
                    gpbVar.c(goyVarA3);
                }
                if ((gpaVar2.a & 4194304) == 4194304) {
                    if (gpaVar2.J == null) {
                        goyVar7 = goy.e;
                    } else {
                        goyVar7 = gpaVar2.J;
                    }
                } else {
                    goyVar7 = null;
                }
                if ((gpaVar3.a & 4194304) == 4194304) {
                    if (gpaVar3.J == null) {
                        goyVar8 = goy.e;
                    } else {
                        goyVar8 = gpaVar3.J;
                    }
                } else {
                    goyVar8 = null;
                }
                goy goyVarA4 = dmv.a(goyVar7, goyVar8);
                if (goyVarA4 != null) {
                    gpbVar.d(goyVarA4);
                }
                if ((gpaVar2.a & 8388608) == 8388608) {
                    if (gpaVar2.K == null) {
                        goyVar9 = goy.e;
                    } else {
                        goyVar9 = gpaVar2.K;
                    }
                } else {
                    goyVar9 = null;
                }
                if ((gpaVar3.a & 8388608) == 8388608) {
                    if (gpaVar3.K == null) {
                        goyVar10 = goy.e;
                    } else {
                        goyVar10 = gpaVar3.K;
                    }
                } else {
                    goyVar10 = null;
                }
                goy goyVarA5 = dmv.a(goyVar9, goyVar10);
                if (goyVarA5 != null) {
                    gpbVar.e(goyVarA5);
                }
                if ((gpaVar2.a & 16777216) == 16777216) {
                    if (gpaVar2.L == null) {
                        goyVar11 = goy.e;
                    } else {
                        goyVar11 = gpaVar2.L;
                    }
                } else {
                    goyVar11 = null;
                }
                if ((gpaVar3.a & 16777216) == 16777216) {
                    if (gpaVar3.L == null) {
                        goyVar12 = goy.e;
                    } else {
                        goyVar12 = gpaVar3.L;
                    }
                } else {
                    goyVar12 = null;
                }
                goy goyVarA6 = dmv.a(goyVar11, goyVar12);
                if (goyVarA6 != null) {
                    gpbVar.f(goyVarA6);
                }
                if ((gpaVar2.a & 33554432) == 33554432) {
                    if (gpaVar2.M == null) {
                        goyVar13 = goy.e;
                    } else {
                        goyVar13 = gpaVar2.M;
                    }
                } else {
                    goyVar13 = null;
                }
                if ((gpaVar3.a & 33554432) == 33554432) {
                    if (gpaVar3.M == null) {
                        goyVar14 = goy.e;
                    } else {
                        goyVar14 = gpaVar3.M;
                    }
                } else {
                    goyVar14 = null;
                }
                goy goyVarA7 = dmv.a(goyVar13, goyVar14);
                if (goyVarA7 != null) {
                    gpbVar.g(goyVarA7);
                }
                if ((gpaVar2.a & 67108864) == 67108864) {
                    if (gpaVar2.N == null) {
                        goyVar15 = goy.e;
                    } else {
                        goyVar15 = gpaVar2.N;
                    }
                } else {
                    goyVar15 = null;
                }
                if ((gpaVar3.a & 67108864) == 67108864) {
                    if (gpaVar3.N == null) {
                        goyVar16 = goy.e;
                    } else {
                        goyVar16 = gpaVar3.N;
                    }
                } else {
                    goyVar16 = null;
                }
                goy goyVarA8 = dmv.a(goyVar15, goyVar16);
                if (goyVarA8 != null) {
                    gpbVar.h(goyVarA8);
                }
                if ((gpaVar2.a & 134217728) == 134217728) {
                    if (gpaVar2.O == null) {
                        goyVar17 = goy.e;
                    } else {
                        goyVar17 = gpaVar2.O;
                    }
                } else {
                    goyVar17 = null;
                }
                if ((gpaVar3.a & 134217728) == 134217728) {
                    if (gpaVar3.O == null) {
                        goyVar18 = goy.e;
                    } else {
                        goyVar18 = gpaVar3.O;
                    }
                } else {
                    goyVar18 = null;
                }
                goy goyVarA9 = dmv.a(goyVar17, goyVar18);
                if (goyVarA9 != null) {
                    gpbVar.i(goyVarA9);
                }
                if ((gpaVar2.a & 268435456) == 268435456) {
                    if (gpaVar2.P == null) {
                        goyVar19 = goy.e;
                    } else {
                        goyVar19 = gpaVar2.P;
                    }
                } else {
                    goyVar19 = null;
                }
                if ((gpaVar3.a & 268435456) == 268435456) {
                    if (gpaVar3.P == null) {
                        goyVar20 = goy.e;
                    } else {
                        goyVar20 = gpaVar3.P;
                    }
                } else {
                    goyVar20 = null;
                }
                goy goyVarA10 = dmv.a(goyVar19, goyVar20);
                if (goyVarA10 != null) {
                    gpbVar.j(goyVarA10);
                }
                if ((gpaVar2.a & 536870912) == 536870912) {
                    if (gpaVar2.Q == null) {
                        goyVar21 = goy.e;
                    } else {
                        goyVar21 = gpaVar2.Q;
                    }
                } else {
                    goyVar21 = null;
                }
                if ((gpaVar3.a & 536870912) == 536870912) {
                    if (gpaVar3.Q == null) {
                        goyVar22 = goy.e;
                    } else {
                        goyVar22 = gpaVar3.Q;
                    }
                } else {
                    goyVar22 = null;
                }
                goy goyVarA11 = dmv.a(goyVar21, goyVar22);
                if (goyVarA11 != null) {
                    gpbVar.k(goyVarA11);
                }
                if ((gpaVar2.a & 1073741824) == 1073741824) {
                    if (gpaVar2.R == null) {
                        goyVar23 = goy.e;
                    } else {
                        goyVar23 = gpaVar2.R;
                    }
                } else {
                    goyVar23 = null;
                }
                if ((gpaVar3.a & 1073741824) == 1073741824) {
                    if (gpaVar3.R == null) {
                        goyVar24 = goy.e;
                    } else {
                        goyVar24 = gpaVar3.R;
                    }
                } else {
                    goyVar24 = null;
                }
                goy goyVarA12 = dmv.a(goyVar23, goyVar24);
                if (goyVarA12 != null) {
                    gpbVar.l(goyVarA12);
                }
                if ((gpaVar2.a & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    if (gpaVar2.S == null) {
                        goyVar25 = goy.e;
                    } else {
                        goyVar25 = gpaVar2.S;
                    }
                } else {
                    goyVar25 = null;
                }
                if ((gpaVar3.a & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    if (gpaVar3.S == null) {
                        goyVar26 = goy.e;
                    } else {
                        goyVar26 = gpaVar3.S;
                    }
                } else {
                    goyVar26 = null;
                }
                goy goyVarA13 = dmv.a(goyVar25, goyVar26);
                if (goyVarA13 != null) {
                    gpbVar.m(goyVarA13);
                }
                if ((gpaVar2.b & 1) == 1) {
                    if (gpaVar2.T == null) {
                        goyVar27 = goy.e;
                    } else {
                        goyVar27 = gpaVar2.T;
                    }
                } else {
                    goyVar27 = null;
                }
                if ((gpaVar3.b & 1) == 1) {
                    if (gpaVar3.T == null) {
                        goyVar28 = goy.e;
                    } else {
                        goyVar28 = gpaVar3.T;
                    }
                } else {
                    goyVar28 = null;
                }
                goy goyVarA14 = dmv.a(goyVar27, goyVar28);
                if (goyVarA14 != null) {
                    gpbVar.n(goyVarA14);
                }
                if ((gpaVar2.b & 2) == 2) {
                    if (gpaVar2.U == null) {
                        goyVar29 = goy.e;
                    } else {
                        goyVar29 = gpaVar2.U;
                    }
                } else {
                    goyVar29 = null;
                }
                if ((gpaVar3.b & 2) == 2) {
                    if (gpaVar3.U == null) {
                        goyVar30 = goy.e;
                    } else {
                        goyVar30 = gpaVar3.U;
                    }
                } else {
                    goyVar30 = null;
                }
                goy goyVarA15 = dmv.a(goyVar29, goyVar30);
                if (goyVarA15 != null) {
                    gpbVar.o(goyVarA15);
                }
                Long lA18 = dmv.a((gpaVar2.b & 4) == 4 ? Long.valueOf(gpaVar2.V) : null, (gpaVar3.b & 4) == 4 ? Long.valueOf(gpaVar3.V) : null);
                if (lA18 != null) {
                    gpbVar.r(lA18.longValue());
                }
                Long lA19 = dmv.a((gpaVar2.b & 8) == 8 ? Long.valueOf(gpaVar2.W) : null, (gpaVar3.b & 8) == 8 ? Long.valueOf(gpaVar3.W) : null);
                if (lA19 != null) {
                    gpbVar.s(lA19.longValue());
                }
                Long lA20 = dmv.a((gpaVar2.b & 16) == 16 ? Long.valueOf(gpaVar2.X) : null, (gpaVar3.b & 16) == 16 ? Long.valueOf(gpaVar3.X) : null);
                if (lA20 != null) {
                    gpbVar.t(lA20.longValue());
                }
                Long lA21 = dmv.a((gpaVar2.b & 32) == 32 ? Long.valueOf(gpaVar2.Y) : null, (gpaVar3.b & 32) == 32 ? Long.valueOf(gpaVar3.Y) : null);
                if (lA21 != null) {
                    gpbVar.u(lA21.longValue());
                }
                Long lA22 = dmv.a((gpaVar2.b & 64) == 64 ? Long.valueOf(gpaVar2.Z) : null, (gpaVar3.b & 64) == 64 ? Long.valueOf(gpaVar3.Z) : null);
                if (lA22 != null) {
                    gpbVar.v(lA22.longValue());
                }
                Long lA23 = dmv.a((gpaVar2.b & 128) == 128 ? Long.valueOf(gpaVar2.aa) : null, (gpaVar3.b & 128) == 128 ? Long.valueOf(gpaVar3.aa) : null);
                if (lA23 != null) {
                    gpbVar.w(lA23.longValue());
                }
                Long lA24 = dmv.a((gpaVar2.b & 256) == 256 ? Long.valueOf(gpaVar2.ab) : null, (gpaVar3.b & 256) == 256 ? Long.valueOf(gpaVar3.ab) : null);
                if (lA24 != null) {
                    gpbVar.x(lA24.longValue());
                }
                Long lA25 = dmv.a((gpaVar2.b & 512) == 512 ? Long.valueOf(gpaVar2.ac) : null, (gpaVar3.b & 512) == 512 ? Long.valueOf(gpaVar3.ac) : null);
                if (lA25 != null) {
                    gpbVar.y(lA25.longValue());
                }
                Long lA26 = dmv.a((gpaVar2.b & 1024) == 1024 ? Long.valueOf(gpaVar2.ad) : null, (gpaVar3.b & 1024) == 1024 ? Long.valueOf(gpaVar3.ad) : null);
                if (lA26 != null) {
                    gpbVar.z(lA26.longValue());
                }
                Long lA27 = dmv.a((gpaVar2.b & 2048) == 2048 ? Long.valueOf(gpaVar2.ae) : null, (gpaVar3.b & 2048) == 2048 ? Long.valueOf(gpaVar3.ae) : null);
                if (lA27 != null) {
                    gpbVar.A(lA27.longValue());
                }
                Long lA28 = dmv.a((gpaVar2.b & 4096) == 4096 ? Long.valueOf(gpaVar2.af) : null, (gpaVar3.b & 4096) == 4096 ? Long.valueOf(gpaVar3.af) : null);
                if (lA28 != null) {
                    gpbVar.B(lA28.longValue());
                }
                Long lA29 = dmv.a((gpaVar2.b & 8192) == 8192 ? Long.valueOf(gpaVar2.ag) : null, (gpaVar3.b & 8192) == 8192 ? Long.valueOf(gpaVar3.ag) : null);
                if (lA29 != null) {
                    gpbVar.C(lA29.longValue());
                }
                Long lA30 = dmv.a((gpaVar2.b & 16384) == 16384 ? Long.valueOf(gpaVar2.ah) : null, (gpaVar3.b & 16384) == 16384 ? Long.valueOf(gpaVar3.ah) : null);
                if (lA30 != null) {
                    gpbVar.D(lA30.longValue());
                }
                Long lA31 = dmv.a((gpaVar2.b & 32768) == 32768 ? Long.valueOf(gpaVar2.ai) : null, (gpaVar3.b & 32768) == 32768 ? Long.valueOf(gpaVar3.ai) : null);
                if (lA31 != null) {
                    gpbVar.E(lA31.longValue());
                }
                Long lA32 = dmv.a((gpaVar2.b & 65536) == 65536 ? Long.valueOf(gpaVar2.aj) : null, (gpaVar3.b & 65536) == 65536 ? Long.valueOf(gpaVar3.aj) : null);
                if (lA32 != null) {
                    gpbVar.F(lA32.longValue());
                }
                if ((gpaVar2.b & 131072) == 131072) {
                    if (gpaVar2.ak == null) {
                        goyVar31 = goy.e;
                    } else {
                        goyVar31 = gpaVar2.ak;
                    }
                } else {
                    goyVar31 = null;
                }
                if ((gpaVar3.b & 131072) == 131072) {
                    if (gpaVar3.ak == null) {
                        goyVar32 = goy.e;
                    } else {
                        goyVar32 = gpaVar3.ak;
                    }
                } else {
                    goyVar32 = null;
                }
                goy goyVarA16 = dmv.a(goyVar31, goyVar32);
                if (goyVarA16 != null) {
                    gpbVar.p(goyVarA16);
                }
                Long lA33 = dmv.a((gpaVar2.b & 262144) == 262144 ? Long.valueOf(gpaVar2.al) : null, (gpaVar3.b & 262144) == 262144 ? Long.valueOf(gpaVar3.al) : null);
                if (lA33 != null) {
                    gpbVar.G(lA33.longValue());
                }
                Long lA34 = dmv.a((gpaVar2.b & 524288) == 524288 ? Long.valueOf(gpaVar2.am) : null, (gpaVar3.b & 524288) == 524288 ? Long.valueOf(gpaVar3.am) : null);
                if (lA34 != null) {
                    gpbVar.H(lA34.longValue());
                }
                Long lA35 = dmv.a((gpaVar2.b & 1048576) == 1048576 ? Long.valueOf(gpaVar2.an) : null, (gpaVar3.b & 1048576) == 1048576 ? Long.valueOf(gpaVar3.an) : null);
                if (lA35 != null) {
                    gpbVar.I(lA35.longValue());
                }
                gpaVar = (gpa) ((fin) gpbVar.h());
            }
            fio fioVar = (fio) gpaVar.a(dp.au, (Object) null);
            fioVar.a((fin) gpaVar);
            gpb gpbVar2 = (gpb) fioVar;
            dmt dmtVar = dneVar.b;
            gpbVar2.i().a(dmtVar.a(gpbVar2.a()));
            gpbVar2.k().b(dmtVar.a(gpbVar2.j()));
            gpbVar2.n().c(dmtVar.a(gpbVar2.l()));
            gpbVar2.p().d(dmtVar.a(gpbVar2.o()));
            gpbVar2.r().e(dmtVar.a(gpbVar2.q()));
            gpbVar2.t().f(dmtVar.a(gpbVar2.s()));
            gpbVar2.v().g(dmtVar.a(gpbVar2.u()));
            gpa gpaVar4 = (gpa) ((fin) gpbVar2.h());
            if ((gpaVar4.a & 1) != 1 || gpaVar4.c <= 0) {
                dkm.a(3, "BatteryCapture", "invalid realtime", new Object[0]);
                gtrVar = null;
            } else {
                goj gojVar = (goj) ((fio) goi.k.a(dp.au, (Object) null));
                long jLongValue3 = dndVar2.b.longValue() - dndVar.b.longValue();
                gojVar.c();
                goi goiVar = (goi) gojVar.a;
                goiVar.a |= 64;
                goiVar.h = jLongValue3;
                if (dndVar.f != null) {
                    gok gokVar = dndVar.f;
                    gojVar.c();
                    goi goiVar2 = (goi) gojVar.a;
                    if (gokVar == null) {
                        throw new NullPointerException();
                    }
                    goiVar2.a |= 1;
                    goiVar2.b = gokVar.d;
                }
                if (dndVar.g != null) {
                    if (dndVar.h.booleanValue()) {
                        String str = dndVar.g;
                        gojVar.c();
                        goi goiVar3 = (goi) gojVar.a;
                        if (str == null) {
                            throw new NullPointerException();
                        }
                        goiVar3.a |= 8;
                        goiVar3.e = str;
                    } else {
                        gojVar.a(dndVar.g);
                    }
                }
                if (dndVar.i != null) {
                    gpr gprVar = dndVar.i;
                    gojVar.c();
                    goi goiVar4 = (goi) gojVar.a;
                    if (gprVar == null) {
                        throw new NullPointerException();
                    }
                    goiVar4.f = gprVar;
                    goiVar4.a |= 16;
                }
                if (dndVar2.f != null) {
                    gok gokVar2 = dndVar2.f;
                    gojVar.c();
                    goi goiVar5 = (goi) gojVar.a;
                    if (gokVar2 == null) {
                        throw new NullPointerException();
                    }
                    goiVar5.a |= 32;
                    goiVar5.g = gokVar2.d;
                }
                if (dndVar2.b != null) {
                    gojVar.a(dndVar2.b.longValue());
                }
                gojVar.a(gpaVar4);
                gtrVar = (gtr) ((fin) gtr.n().a(gom.n().a(gojVar)).h());
            }
        }
        if (gtrVar != null) {
            a(dndVar2.a(), dndVar2.b().booleanValue(), gtrVar, dndVar2.c());
        }
    }

    private final Future b(final gok gokVar, final String str, final boolean z) {
        Future futureSubmit = c().submit(new Callable(this, gokVar, str, z) { // from class: flm.dgl
            private final dgi a;
            private final gok b;
            private final String c;
            private final boolean d;

            {
                this.a = this;
                this.b = gokVar;
                this.c = str;
                this.d = z;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a(this.b, this.c, this.d);
            }
        });
        dkm.a(3, "BatteryMetricService", "adding future BatteryCapture", new Object[0]);
        synchronized (this.i) {
            this.i.add(futureSubmit);
            if (!this.f.get()) {
                futureSubmit = h();
            }
        }
        return futureSubmit;
    }

    private final Future h() {
        final ArrayList arrayList;
        synchronized (this.i) {
            arrayList = new ArrayList(this.i);
            this.i.clear();
        }
        dkm.a(4, "BatteryMetricService", "Logging captures: %d", Integer.valueOf(arrayList.size()));
        return c().submit(new Runnable(this, arrayList) { // from class: flm.dgm
            private final dgi a;
            private final List b;

            {
                this.a = this;
                this.b = arrayList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Exception e;
                dgi dgiVar = this.a;
                List list = this.b;
                dnd dndVarG = dgiVar.g();
                Iterator it = list.iterator();
                while (true) {
                    dnd dndVar = dndVarG;
                    if (!it.hasNext()) {
                        dgiVar.a(dndVar);
                        return;
                    }
                    try {
                        dndVarG = ((dmr) ((Future) it.next()).get()).a();
                        if (dndVar != null) {
                            try {
                                dgiVar.a(dndVar, dndVarG);
                            } catch (Exception e2) {
                                e = e2;
                                dkm.c("BatteryMetricService", "unpexpected failure", e, new Object[0]);
                            }
                        }
                    } catch (Exception e3) {
                        dndVarG = dndVar;
                        e = e3;
                    }
                }
            }
        });
    }
}
