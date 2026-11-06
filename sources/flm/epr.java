package flm;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epr {
    private static final long E = TimeUnit.MINUTES.toMillis(1);
    private static final long F = TimeUnit.MINUTES.toMillis(5);
    private static final long G = TimeUnit.MINUTES.toMillis(15);
    private final ffg H;
    public final Calendar a;
    public final long b;
    public final epk c;
    public final ffa d;
    public final ffc e;
    public final dwx f;
    public final dxm g;
    public final dxm h;
    public final boolean i;
    public final dvz j = dwa.a(new dvz(this) { // from class: flm.eps
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            final epr eprVar = this.a;
            return dxm.a(dwx.a(eprVar.g).a(new dvm(eprVar) { // from class: flm.eqy
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((esp) obj).a(this.a.a);
                }
            }).a(new dvm(eprVar) { // from class: flm.eqz
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return !this.a.a((esp) obj);
                }
            }).a());
        }
    });
    public final dvz k = dwa.a(new dvz(this) { // from class: flm.ept
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            final epr eprVar = this.a;
            return dxm.a(dwx.a(eprVar.g).a(new dvm(eprVar) { // from class: flm.erb
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((esp) obj).a(this.a.a);
                }
            }).a(new dvm(eprVar) { // from class: flm.erc
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return this.a.a((esp) obj);
                }
            }).a());
        }
    });
    public final dvz l = dwa.a(new dvz(this) { // from class: flm.eqe
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            final epr eprVar = this.a;
            return dxm.a(dwx.a(eprVar.g).a(new dvm(eprVar) { // from class: flm.ern
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return !this.a.a((esp) obj);
                }
            }).a());
        }
    });
    public final dvz m = dwa.a(new dvz(this) { // from class: flm.eqp
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            final epr eprVar = this.a;
            return (esp) dwx.a(eprVar.g).c(new dvm(eprVar) { // from class: flm.erd
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((esp) obj).b.a().after(this.a.a);
                }
            }).c();
        }
    });
    private final dvz I = dwa.a(new dvz(this) { // from class: flm.era
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (!((List) eprVar.j.a()).isEmpty()) {
                return new esl((esp) ((List) eprVar.j.a()).get(0), eue.ACTIVE);
            }
            if (!((List) eprVar.k.a()).isEmpty()) {
                return new esl((esp) ((List) eprVar.k.a()).get(0), eue.CANCELED);
            }
            final exf exfVarA = esn.a(eprVar.a);
            esp espVar = (esp) dwx.a(eprVar.g).c(new dvm(exfVarA) { // from class: flm.ere
                private final exf a;

                {
                    this.a = exfVarA;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return epr.a(this.a, (esp) obj);
                }
            }).c();
            if (espVar != null) {
                return new esl(espVar, espVar.b.a.before(eprVar.a) ? eue.ENDED : eue.NOT_STARTED);
            }
            return null;
        }
    });
    public final dvz n = dwa.a(new dvz(this) { // from class: flm.erl
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            return (eso) dwx.a(eprVar.h).c(new dvm(eprVar) { // from class: flm.erf
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((eso) obj).b.a(this.a.a.getTimeInMillis());
                }
            }).c();
        }
    });
    public final dvz o = dwa.a(new dvz(this) { // from class: flm.erw
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (eprVar.n.a() == null) {
                return null;
            }
            return (fei) eprVar.f.c(new dvm(eprVar) { // from class: flm.eqv
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    epr eprVar2 = this.a;
                    return eprVar2.a((eso) eprVar2.n.a(), (fei) obj);
                }
            }).c();
        }
    });
    public final dvz p = dwa.a(new dvz(this) { // from class: flm.esg
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            return dxm.a(dwx.a(eprVar.h).a(new dvm(eprVar) { // from class: flm.ero
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    epr eprVar2 = this.a;
                    return !eprVar2.f.b(new dvm(eprVar2, (eso) obj) { // from class: flm.equ
                        private final epr a;
                        private final eso b;

                        {
                            this.a = eprVar2;
                            this.b = esoVar;
                        }

                        @Override // flm.dvm
                        public final boolean a(Object obj2) {
                            return this.a.a(this.b, (fei) obj2);
                        }
                    });
                }
            }).a(erp.a).a());
        }
    });
    public final dvz q = dwa.a(new dvz(this) { // from class: flm.esh
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            return (eso) dwx.a(eprVar.h).c(new dvm(eprVar) { // from class: flm.erg
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((eso) obj).b.a().after(this.a.a);
                }
            }).c();
        }
    });
    public final dvz r = dwa.a(new dvz(this) { // from class: flm.esi
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            Calendar calendar = eprVar.a;
            ffc ffcVar = eprVar.e;
            long timeInMillis = esn.c(calendar, ffcVar.d == null ? ffa.d : ffcVar.d).getTimeInMillis();
            long j = eprVar.e.c;
            long j2 = eprVar.n.a() != null ? ((eso) eprVar.n.a()).a.e : 0L;
            if (!eprVar.i) {
                timeInMillis = efy.a(timeInMillis, j, j2);
            }
            return new esm(eprVar.b, eprVar.c.a, timeInMillis);
        }
    });
    public final dvz s = dwa.a(new dvz(this) { // from class: flm.epu
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (eprVar.n.a() == null) {
                return null;
            }
            return Long.valueOf(Math.max(TimeUnit.MINUTES.toMillis(((eso) eprVar.n.a()).a.f) - ((esm) eprVar.r.a()).a, 0L));
        }
    });
    public final dvz t = dwa.a(new dvz(this) { // from class: flm.epv
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            dxm dxmVarA = eprVar.f.a(erh.a).a(epr.a(eri.a));
            if (dxmVarA.size() > 0) {
                dvi dviVarA = epo.a((fei) dxmVarA.get(0), eprVar.a.getTimeZone(), eprVar.d, (List) eprVar.l.a());
                if (dviVarA.a()) {
                    if (((epo) dviVarA.b()).b.a(eprVar.a.getTimeInMillis())) {
                        return (epo) dviVarA.b();
                    }
                }
            }
            return null;
        }
    });
    public final dvz u = dwa.a(new dvz(this) { // from class: flm.epw
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            final epr eprVar = this.a;
            dxm dxmVarA = eprVar.f.a(erj.a).a(new dvm(eprVar) { // from class: flm.erk
                private final epr a;

                {
                    this.a = eprVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((fei) obj).d > this.a.a.getTimeInMillis();
                }
            }).a(epr.a(erm.a));
            if (dxmVarA.size() > 0) {
                dvi dviVarA = epo.a((fei) dxmVarA.get(0), eprVar.a.getTimeZone(), eprVar.d, (List) eprVar.l.a());
                if (dviVarA.a()) {
                    return (epo) dviVarA.b();
                }
            }
            return null;
        }
    });
    public final dvz v = dwa.a(new dvz(this) { // from class: flm.epx
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (eprVar.t.a() == null) {
                return null;
            }
            final long j = ((epo) eprVar.t.a()).a.d;
            return (fei) eprVar.f.a(epr.a(fej.UNLOCK_WINDOW_LIMIT, fej.UNLOCK_USAGE_LIMIT, fej.UNLOCK_LOCK_OVERRIDE)).c(new dvm(j) { // from class: flm.eqw
                private final long a;

                {
                    this.a = j;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return epr.a(this.a, (fei) obj);
                }
            }).c();
        }
    });
    public final dvz w = dwa.a(new dvz(this) { // from class: flm.epy
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            dxm dxmVarA = this.a.f.a(epr.a(fej.UNLOCK_WITH_DEADLINE)).a(epr.a(eqx.a));
            if (dxmVarA.isEmpty()) {
                return null;
            }
            return (fei) dxmVarA.get(0);
        }
    });
    public final dvz x = dwa.a(new dvz(this) { // from class: flm.epz
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            eal ealVarC = eal.c();
            eal ealVarC2 = eal.c();
            ealVarC.a(dwx.a((Iterable) eprVar.l.a()).a(erq.a));
            ealVarC2.a(dwx.a((Iterable) eprVar.p.a()).a(err.a));
            if (((Boolean) eprVar.z.a()).booleanValue()) {
                ealVarC2.a(dzq.a(eprVar.a, (Calendar) eprVar.A.a()));
            }
            boolean z = ((Boolean) eprVar.z.a()).booleanValue() || !((List) eprVar.j.a()).isEmpty() || (eprVar.t.a() != null && eprVar.v.a() == null);
            if (!z && eprVar.y.a() != null && eprVar.A.a() != null) {
                Calendar calendar = (Calendar) eprVar.y.a();
                Calendar calendar2 = (Calendar) eprVar.A.a();
                if (calendar.before(calendar2)) {
                    ealVarC2.a(dzq.a(calendar, calendar2));
                }
            }
            if (!z && eprVar.q.a() != null) {
                ealVarC2.a(dzq.a(esn.a(((eso) eprVar.q.a()).b.a(), ((eso) eprVar.q.a()).a.f), ((eso) eprVar.q.a()).b.b()));
            }
            eal ealVarC3 = eal.c();
            if (eprVar.t.a() != null && eprVar.v.a() == null) {
                ealVarC3.a(((epo) eprVar.t.a()).a());
            }
            if (eprVar.u.a() != null) {
                ealVarC3.a(((epo) eprVar.u.a()).a());
            }
            eal ealVarC4 = eal.c();
            Iterator it = ((List) eprVar.k.a()).iterator();
            while (it.hasNext()) {
                ealVarC4.a(((esp) it.next()).a());
            }
            if (eprVar.o.a() != null) {
                ealVarC4.a(((eso) eprVar.n.a()).a());
            }
            return new esk(ealVarC, ealVarC2, ealVarC3, ealVarC4);
        }
    });
    public final dvz y = dwa.a(new dvz(this) { // from class: flm.eqa
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (eprVar.n.a() != null && eprVar.o.a() == null) {
                long jLongValue = ((Long) eprVar.s.a()).longValue();
                if (jLongValue > 0) {
                    return esn.a(eprVar.a, jLongValue);
                }
            }
            return null;
        }
    });
    public final dvz z = dwa.a(new dvz(this) { // from class: flm.eqb
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            return Boolean.valueOf(eprVar.n.a() != null && eprVar.o.a() == null && ((Long) eprVar.s.a()).longValue() <= 0);
        }
    });
    private final dvz J = dwa.a(new dvz(this) { // from class: flm.eqc
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            return esn.c(eprVar.a, eprVar.d);
        }
    });
    public final dvz A = dwa.a(new dvz(this) { // from class: flm.eqd
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            if (eprVar.h.isEmpty()) {
                return null;
            }
            return esn.b(eprVar.a, eprVar.d);
        }
    });
    private final dvz K = dwa.a(new dvz(this) { // from class: flm.eqf
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            PriorityQueue priorityQueue = new PriorityQueue();
            Iterator it = ((List) eprVar.j.a()).iterator();
            while (it.hasNext()) {
                priorityQueue.add(((esp) it.next()).b.b());
            }
            Iterator it2 = ((List) eprVar.k.a()).iterator();
            while (it2.hasNext()) {
                priorityQueue.add(((esp) it2.next()).b.b());
            }
            if (eprVar.y.a() != null && !((Boolean) eprVar.B.a()).booleanValue()) {
                priorityQueue.add((Calendar) eprVar.y.a());
            }
            if (eprVar.t.a() != null && eprVar.v.a() == null) {
                priorityQueue.add(((epo) eprVar.t.a()).b.b());
            }
            if (eprVar.u.a() != null) {
                priorityQueue.add(((epo) eprVar.u.a()).b.a());
            }
            if (eprVar.m.a() != null) {
                priorityQueue.add(((esp) eprVar.m.a()).b.a());
            }
            priorityQueue.add(esn.b(eprVar.a, eprVar.d));
            if (priorityQueue.isEmpty()) {
                return null;
            }
            return Long.valueOf(((Calendar) priorityQueue.peek()).getTimeInMillis());
        }
    });
    public final dvz B = dwa.a(new dvz(this) { // from class: flm.eqg
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            esk eskVar = (esk) eprVar.x.a();
            return Boolean.valueOf(eskVar.e.a(eprVar.a));
        }
    });
    private final dvz L = dwa.a(new dvz(this) { // from class: flm.eqh
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            esk eskVar = (esk) eprVar.x.a();
            Calendar calendar = eprVar.a;
            if (eskVar.a.a(calendar)) {
                return esu.FIXED_LIMIT;
            }
            if (eskVar.c.a(calendar)) {
                return esu.OVERRIDE;
            }
            if (eskVar.b.a(calendar)) {
                return esu.USAGE_LIMIT;
            }
            return eskVar.d.a(calendar) ? esu.OVERRIDE : esu.NO_ACTIVE_POLICY;
        }
    });
    public final dvz C = dwa.a(new dvz(this) { // from class: flm.eqi
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            Calendar calendar;
            esu esuVar;
            Calendar calendar2;
            epr eprVar = this.a;
            dzs dzsVar = ((esk) eprVar.x.a()).e;
            if (dzsVar.a(eprVar.a)) {
                dzq dzqVarB = dzsVar.b(eprVar.a);
                if (dzqVarB.b()) {
                    calendar2 = (Calendar) dzqVarB.c.c();
                    if (calendar2.after(esn.b(eprVar.a, 7))) {
                        calendar2 = null;
                    }
                } else {
                    calendar2 = null;
                }
                calendar = calendar2;
            } else {
                dzq dzqVarB2 = dzsVar.b().b(eprVar.a);
                calendar = dzqVarB2.b() ? (Calendar) dzqVarB2.c.c() : null;
            }
            if (calendar == null) {
                return null;
            }
            esk eskVar = (esk) eprVar.x.a();
            if (eskVar.a.a(calendar)) {
                esuVar = esu.FIXED_LIMIT;
            } else if (eskVar.c.a(calendar)) {
                esuVar = esu.OVERRIDE;
            } else if (eskVar.b.a(calendar)) {
                esuVar = esu.USAGE_LIMIT;
            } else {
                esuVar = eskVar.d.a(calendar) ? esu.OVERRIDE : esu.NO_ACTIVE_POLICY;
            }
            return new esj(calendar, esuVar);
        }
    });
    public final dvz D = dwa.a(new dvz(this) { // from class: flm.eqj
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            Calendar calendar;
            esu esuVar;
            epr eprVar = this.a;
            dzs dzsVar = ((esk) eprVar.x.a()).e;
            Calendar calendarA = esn.a(epr.a((fei) eprVar.w.a()), eprVar.a.getTimeZone());
            if (dzsVar.a(calendarA)) {
                calendar = calendarA;
            } else {
                dzq dzqVarB = dzsVar.b().b(calendarA);
                calendar = dzqVarB.b() ? (Calendar) dzqVarB.c.c() : null;
            }
            if (calendar == null) {
                return null;
            }
            esk eskVar = (esk) eprVar.x.a();
            if (eskVar.a.a(calendar)) {
                esuVar = esu.FIXED_LIMIT;
            } else if (eskVar.c.a(calendar)) {
                esuVar = esu.OVERRIDE;
            } else if (eskVar.b.a(calendar)) {
                esuVar = esu.USAGE_LIMIT;
            } else {
                esuVar = eskVar.d.a(calendar) ? esu.OVERRIDE : esu.NO_ACTIVE_POLICY;
            }
            return new esj(calendar, esuVar);
        }
    });
    private final dvz M = dwa.a(new dvz(this) { // from class: flm.eqk
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            esj esjVar = (esj) eprVar.C.a();
            if (eprVar.w.a() != null) {
                esjVar = (esj) eprVar.D.a();
            }
            if (esjVar == null) {
                return null;
            }
            return Long.valueOf(esjVar.a.getTimeInMillis());
        }
    });
    private final dvz N = dwa.a(new dvz(this) { // from class: flm.eql
        private final epr a;

        {
            this.a = this;
        }

        @Override // flm.dvz
        public final Object a() {
            epr eprVar = this.a;
            esj esjVar = (esj) eprVar.C.a();
            if (eprVar.w.a() != null) {
                esjVar = (esj) eprVar.D.a();
            }
            if (esjVar == null) {
                return null;
            }
            return esjVar.b;
        }
    });

    public static etw a(fee feeVar, long j, long j2, TimeZone timeZone, long j3) {
        euc eucVar;
        eub eubVarA;
        final epr eprVar = new epr(feeVar, j, epk.a(j2), esn.a(j3, timeZone), false);
        etx etxVar = (etx) ((fio) etw.x.a(dp.au, (Object) null));
        if (!((List) eprVar.j.a()).isEmpty()) {
            ffi ffiVar = ((esp) ((List) eprVar.j.a()).get(0)).a;
            etxVar.c();
            etw etwVar = (etw) etxVar.a;
            if (ffiVar == null) {
                throw new NullPointerException();
            }
            etwVar.p = ffiVar;
            etwVar.a |= 16384;
        } else if (((List) eprVar.k.a()).isEmpty()) {
            etxVar.b(ety.DEFAULT);
        } else {
            etxVar.b(ety.CANCELLED_BY_OVERRIDE);
        }
        if (eprVar.m.a() != null) {
            ffi ffiVar2 = ((esp) eprVar.m.a()).a;
            etxVar.c();
            etw etwVar2 = (etw) etxVar.a;
            if (ffiVar2 == null) {
                throw new NullPointerException();
            }
            etwVar2.r = ffiVar2;
            etwVar2.a |= 65536;
            long timeInMillis = ((esp) eprVar.m.a()).b.a().getTimeInMillis();
            etxVar.c();
            etw etwVar3 = (etw) etxVar.a;
            etwVar3.a |= 131072;
            etwVar3.s = timeInMillis;
        }
        if (eprVar.I.a() != null) {
            ffi ffiVar3 = ((esl) eprVar.I.a()).a.a;
            etxVar.c();
            etw etwVar4 = (etw) etxVar.a;
            if (ffiVar3 == null) {
                throw new NullPointerException();
            }
            etwVar4.t = ffiVar3;
            etwVar4.a |= 262144;
            eue eueVar = ((esl) eprVar.I.a()).b;
            etxVar.c();
            etw etwVar5 = (etw) etxVar.a;
            if (eueVar == null) {
                throw new NullPointerException();
            }
            etwVar5.a |= 524288;
            etwVar5.u = eueVar.e;
        }
        if (eprVar.n.a() == null) {
            etxVar.a(ety.DEFAULT);
        } else if (eprVar.o.a() != null) {
            etxVar.a(ety.CANCELLED_BY_OVERRIDE);
        } else {
            ffe ffeVar = ((eso) eprVar.n.a()).a;
            etxVar.c();
            etw etwVar6 = (etw) etxVar.a;
            if (ffeVar == null) {
                throw new NullPointerException();
            }
            etwVar6.g = ffeVar;
            etwVar6.a |= 32;
            if (eprVar.s.a() != null) {
                int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(((Long) eprVar.s.a()).longValue());
                etxVar.c();
                etw etwVar7 = (etw) etxVar.a;
                etwVar7.a |= 512;
                etwVar7.k = minutes;
                long jLongValue = ((Long) eprVar.s.a()).longValue();
                etxVar.c();
                etw etwVar8 = (etw) etxVar.a;
                etwVar8.a |= 1024;
                etwVar8.l = jLongValue;
            }
        }
        long j4 = ((esm) eprVar.r.a()).a;
        etxVar.c();
        etw etwVar9 = (etw) etxVar.a;
        etwVar9.a |= 2048;
        etwVar9.m = j4;
        long j5 = ((esm) eprVar.r.a()).b;
        etxVar.c();
        etw etwVar10 = (etw) etxVar.a;
        etwVar10.a |= 4096;
        etwVar10.n = j5;
        if (eprVar.q.a() != null) {
            ffe ffeVar2 = ((eso) eprVar.q.a()).a;
            etxVar.c();
            etw etwVar11 = (etw) etxVar.a;
            if (ffeVar2 == null) {
                throw new NullPointerException();
            }
            etwVar11.i = ffeVar2;
            etwVar11.a |= 128;
            long timeInMillis2 = ((eso) eprVar.q.a()).b.a().getTimeInMillis();
            etxVar.c();
            etw etwVar12 = (etw) etxVar.a;
            etwVar12.a |= 256;
            etwVar12.j = timeInMillis2;
        }
        if (eprVar.t.a() != null && eprVar.v.a() == null && eprVar.L.a() == esu.OVERRIDE) {
            etxVar.a(((epo) eprVar.t.a()).a);
        } else if (!((List) eprVar.k.a()).isEmpty()) {
            final esp espVar = (esp) ((List) eprVar.k.a()).get(0);
            etxVar.a((fei) eprVar.f.c(new dvm(eprVar, espVar) { // from class: flm.eqs
                private final epr a;
                private final esp b;

                {
                    this.a = eprVar;
                    this.b = espVar;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return this.a.a(this.b, (fei) obj);
                }
            }).c());
        } else if (eprVar.o.a() != null) {
            etxVar.a((fei) eprVar.o.a());
        }
        if (eprVar.K.a() != null) {
            etxVar.a(((Long) eprVar.K.a()).longValue());
        }
        if (eprVar.M.a() != null) {
            long jLongValue2 = ((Long) eprVar.M.a()).longValue();
            etxVar.c();
            etw etwVar13 = (etw) etxVar.a;
            etwVar13.a |= 8;
            etwVar13.e = jLongValue2;
        }
        if (eprVar.N.a() != null) {
            esu esuVar = (esu) eprVar.N.a();
            etxVar.c();
            etw etwVar14 = (etw) etxVar.a;
            if (esuVar == null) {
                throw new NullPointerException();
            }
            etwVar14.a |= 16;
            etwVar14.f = esuVar.e;
        }
        long timeInMillis3 = ((Calendar) eprVar.J.a()).getTimeInMillis();
        etxVar.c();
        etw etwVar15 = (etw) etxVar.a;
        etwVar15.a |= 8192;
        etwVar15.o = timeInMillis3;
        if (eprVar.w.a() != null) {
            long jA = a((fei) eprVar.w.a());
            if (eprVar.K.a() != null) {
                jA = Math.min(jA, ((Long) eprVar.K.a()).longValue());
            }
            etxVar.a((fei) eprVar.w.a()).a(jA).a(false).a(esu.OVERRIDE);
        } else {
            etxVar.a(((Boolean) eprVar.B.a()).booleanValue()).a((esu) eprVar.L.a());
        }
        if ((((Boolean) eprVar.B.a()).booleanValue() && eprVar.w.a() == null) || eprVar.M.a() == null) {
            eubVarA = ((eub) ((fio) eua.f.a(dp.au, (Object) null))).a(false).a(euc.NO_NOTIFICATION);
        } else {
            long jLongValue3 = ((Long) eprVar.M.a()).longValue() - eprVar.a.getTimeInMillis();
            dvl.b(jLongValue3 > 0, "timeToLockMs should always be positive, otherwise it's locked!");
            esu esuVar2 = (esu) eprVar.N.a();
            dvl.b(jLongValue3 > 0, "timeToLockMs should be positive, or it's locked!");
            dvl.b(esuVar2 != esu.NO_ACTIVE_POLICY, "No next active policy means no notification!");
            boolean z = esuVar2 != esu.OVERRIDE;
            if (jLongValue3 <= E) {
                eucVar = euc.ONE_MINUTE;
            } else if (!z || jLongValue3 > F) {
                eucVar = (!z || jLongValue3 > G) ? euc.NO_NOTIFICATION : euc.FIFTEEN_MINUTES;
            } else {
                eucVar = euc.FIVE_MINUTES;
            }
            eub eubVarA2 = ((eub) ((fio) eua.f.a(dp.au, (Object) null))).a(eucVar);
            if (eucVar == euc.NO_NOTIFICATION) {
                eubVarA2.a(false);
            } else {
                int iCeil = (int) Math.ceil((jLongValue3 / 1000.0d) / 60.0d);
                long millis = jLongValue3 - TimeUnit.MINUTES.toMillis(iCeil - 1);
                eub eubVarA3 = eubVarA2.a(true);
                eubVarA3.c();
                eua euaVar = (eua) eubVarA3.a;
                euaVar.a |= 4;
                euaVar.d = iCeil;
                eubVarA3.c();
                eua euaVar2 = (eua) eubVarA3.a;
                euaVar2.a |= 8;
                euaVar2.e = millis;
            }
            eubVarA = eubVarA2;
        }
        etxVar.c();
        etw etwVar16 = (etw) etxVar.a;
        etwVar16.w = (eua) ((fin) eubVarA.h());
        etwVar16.a |= 4194304;
        return (etw) ((fin) etxVar.h());
    }

    public static long a(fee feeVar, TimeZone timeZone, long j) {
        epr eprVar = new epr(feeVar, 0L, epk.a(j), esn.a(j, timeZone), false);
        long timeInMillis = ((Calendar) eprVar.J.a()).getTimeInMillis();
        feu feuVarA = feu.a(eprVar.e.b);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        if (feuVarA == feu.TIME_LIMIT_ON) {
            timeInMillis = Math.max(timeInMillis, eprVar.e.c);
        }
        eso esoVar = (eso) eprVar.n.a();
        if (esoVar != null) {
            return Math.max(timeInMillis, esoVar.a.e);
        }
        return timeInMillis;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02b5  */
    private epr(fee feeVar, long j, epk epkVar, Calendar calendar, boolean z) {
        ffc ffcVar;
        ffa ffaVar;
        ffc ffcVar2;
        ffg ffgVar;
        ffg ffgVar2;
        ffc ffcVar3;
        boolean z2;
        this.a = calendar;
        this.b = j;
        if (feeVar.c == null) {
            ffcVar = ffc.g;
        } else {
            ffcVar = feeVar.c;
        }
        if (ffcVar.d == null) {
            ffaVar = ffa.d;
        } else {
            ffaVar = ffcVar.d;
        }
        this.d = ffaVar;
        this.c = epkVar;
        if (feeVar.c == null) {
            ffcVar2 = ffc.g;
        } else {
            ffcVar2 = feeVar.c;
        }
        this.e = ffcVar2;
        if (feeVar.b == null) {
            ffgVar = ffg.f;
        } else {
            ffgVar = feeVar.b;
        }
        this.H = ffgVar;
        this.i = z;
        if (feeVar.b == null) {
            ffgVar2 = ffg.f;
        } else {
            ffgVar2 = feeVar.b;
        }
        feu feuVarA = feu.a(ffgVar2.b);
        if ((feuVarA == null ? feu.UNSPECIFIED_TIME_LIMIT_STATE : feuVarA) == feu.TIME_LIMIT_ON) {
            this.g = dwx.a(this.H.d).a(ers.a).a(new dvc(this) { // from class: flm.ert
                private final epr a;

                {
                    this.a = this;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    return esp.a(this.a.a, (ffi) obj);
                }
            }).b(dwx.a(this.H.d).a(eru.a).a(new dvc(this) { // from class: flm.erv
                private final epr a;

                {
                    this.a = this;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    esp espVarA = esp.a(this.a.a, (ffi) obj);
                    return new esp(esn.b(espVarA.b.a(), 7), esn.b(espVarA.b.b(), 7), espVarA.a);
                }
            })).a(b(erx.a));
        } else {
            this.g = dxm.g();
        }
        if (feeVar.c == null) {
            ffcVar3 = ffc.g;
        } else {
            ffcVar3 = feeVar.c;
        }
        feu feuVarA2 = feu.a(ffcVar3.b);
        if ((feuVarA2 == null ? feu.UNSPECIFIED_TIME_LIMIT_STATE : feuVarA2) == feu.TIME_LIMIT_ON) {
            this.h = dwx.a(this.e.e).a(ery.a).a(new dvc(this) { // from class: flm.erz
                private final epr a;

                {
                    this.a = this;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    epr eprVar = this.a;
                    return eso.a(eprVar.a, (ffe) obj, eprVar.d);
                }
            }).b(dwx.a(this.e.e).a(esa.a).a(new dvc(this) { // from class: flm.esb
                private final epr a;

                {
                    this.a = this;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    epr eprVar = this.a;
                    eso esoVarA = eso.a(eprVar.a, (ffe) obj, eprVar.d);
                    return new eso(esn.b(esoVarA.b.a(), 7), esn.b(esoVarA.b.b(), 7), esoVarA.a);
                }
            })).a(b(esc.a));
        } else {
            this.h = dxm.g();
        }
        dxm dxmVarA = dwx.a(feeVar.e).a(b(eqm.a));
        final HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < dxmVarA.size()) {
                fei feiVar = (fei) dxmVarA.get(i2);
                fej fejVarA = fej.a(feiVar.e);
                if ((fejVarA == null ? fej.UNSPECIFIED_ACTION : fejVarA) == fej.LOCK) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        final fei feiVar2 = (fei) dxmVarA.get(i3);
                        if (!hashSet.contains(feiVar2)) {
                            fej fejVarA2 = fej.a(feiVar2.e);
                            if ((fejVarA2 == null ? fej.UNSPECIFIED_ACTION : fejVarA2) == fej.UNLOCK_WINDOW_LIMIT) {
                                esp espVar = (esp) dwx.a(this.g).c(new dvm(this, feiVar2) { // from class: flm.eqr
                                    private final epr a;
                                    private final fei b;

                                    {
                                        this.a = this;
                                        this.b = feiVar2;
                                    }

                                    @Override // flm.dvm
                                    public final boolean a(Object obj) {
                                        return this.a.a((esp) obj, this.b);
                                    }
                                }).c();
                                z2 = espVar != null && espVar.a(feiVar.d);
                            } else {
                                fej fejVarA3 = fej.a(feiVar2.e);
                                if ((fejVarA3 == null ? fej.UNSPECIFIED_ACTION : fejVarA3) == fej.UNLOCK_USAGE_LIMIT) {
                                    z2 = feiVar.d < esn.b(esn.a(feiVar2.d, this.a.getTimeZone()), this.d).getTimeInMillis();
                                } else {
                                    fej fejVarA4 = fej.a(feiVar2.e);
                                    if ((fejVarA4 == null ? fej.UNSPECIFIED_ACTION : fejVarA4) == fej.UNLOCK_WITH_DEADLINE) {
                                        long j2 = feiVar.d;
                                        z2 = j2 >= feiVar2.d && j2 < a(feiVar2);
                                    } else {
                                        z2 = false;
                                    }
                                }
                            }
                            if (z2) {
                                hashSet.add(feiVar2);
                                fej fejVarA5 = fej.a(feiVar2.e);
                                if ((fejVarA5 == null ? fej.UNSPECIFIED_ACTION : fejVarA5) == fej.UNLOCK_WITH_DEADLINE) {
                                    if (!a(feiVar2.d) || a(feiVar.d)) {
                                        Calendar calendarB = esn.b(esn.a(feiVar2.d, this.a.getTimeZone()), this.d);
                                        if (a(feiVar.d) || feiVar.d <= calendarB.getTimeInMillis()) {
                                            hashSet.add(feiVar);
                                        }
                                    }
                                } else {
                                    hashSet.add(feiVar);
                                }
                            }
                        }
                    }
                }
                i = i2 + 1;
            } else {
                this.f = dwx.a(dxm.a(dwx.a(dxmVarA).a(new dvm(hashSet) { // from class: flm.eqn
                    private final Set a;

                    {
                        this.a = hashSet;
                    }

                    @Override // flm.dvm
                    public final boolean a(Object obj) {
                        return epr.a(this.a, (fei) obj);
                    }
                }).a(new dvm(this) { // from class: flm.eqo
                    private final epr a;

                    {
                        this.a = this;
                    }

                    @Override // flm.dvm
                    public final boolean a(Object obj) {
                        epr eprVar = this.a;
                        fei feiVar3 = (fei) obj;
                        fej fejVarA6 = fej.a(feiVar3.e);
                        if (fejVarA6 == null) {
                            fejVarA6 = fej.UNSPECIFIED_ACTION;
                        }
                        return fejVarA6 != fej.UNLOCK_WITH_DEADLINE || epr.a(feiVar3) > eprVar.a.getTimeInMillis();
                    }
                }).a()));
                return;
            }
        }
    }

    private final boolean a(final long j) {
        return dwx.a(this.g).b(new dvm(j) { // from class: flm.eqq
            private final long a;

            {
                this.a = j;
            }

            @Override // flm.dvm
            public final boolean a(Object obj) {
                return ((esp) obj).a(this.a);
            }
        });
    }

    final boolean a(esp espVar, fei feiVar) {
        feq feqVar;
        feq feqVar2;
        ffi ffiVar = espVar.a;
        long jA = efy.a(this.H.c, ffiVar.e, ffiVar.h);
        if (feiVar.b == 7) {
            fej fejVarA = fej.a(feiVar.e);
            if (fejVarA == null) {
                fejVarA = fej.UNSPECIFIED_ACTION;
            }
            if (fejVarA == fej.UNLOCK_WINDOW_LIMIT) {
                if (feiVar.b == 7) {
                    feqVar = (feq) feiVar.c;
                } else {
                    feqVar = feq.d;
                }
                if (feqVar.c.equals(espVar.a.b)) {
                    if (feiVar.b == 7) {
                        feqVar2 = (feq) feiVar.c;
                    } else {
                        feqVar2 = feq.d;
                    }
                    if (feqVar2.b == jA && espVar.a(feiVar.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
        fej fejVarA2 = fej.a(feiVar.e);
        if (fejVarA2 == null) {
            fejVarA2 = fej.UNSPECIFIED_ACTION;
        }
        return fejVarA2 == fej.UNLOCK_WINDOW_LIMIT && feiVar.d >= jA && espVar.a(feiVar.d);
    }

    final boolean a(final esp espVar) {
        return this.f.b(new dvm(this, espVar) { // from class: flm.eqt
            private final epr a;
            private final esp b;

            {
                this.a = this;
                this.b = espVar;
            }

            @Override // flm.dvm
            public final boolean a(Object obj) {
                return this.a.a(this.b, (fei) obj);
            }
        });
    }

    final boolean a(eso esoVar, fei feiVar) {
        feo feoVar;
        feo feoVar2;
        ffe ffeVar = esoVar.a;
        long jA = efy.a(this.e.c, ffeVar.e, ffeVar.g);
        if (feiVar.b == 8) {
            fej fejVarA = fej.a(feiVar.e);
            if (fejVarA == null) {
                fejVarA = fej.UNSPECIFIED_ACTION;
            }
            if (fejVarA == fej.UNLOCK_USAGE_LIMIT) {
                if (feiVar.b == 8) {
                    feoVar = (feo) feiVar.c;
                } else {
                    feoVar = feo.d;
                }
                if (feoVar.c.equals(esoVar.a.b)) {
                    if (feiVar.b == 8) {
                        feoVar2 = (feo) feiVar.c;
                    } else {
                        feoVar2 = feo.d;
                    }
                    if (feoVar2.b == jA && esoVar.a(feiVar.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
        fej fejVarA2 = fej.a(feiVar.e);
        if (fejVarA2 == null) {
            fejVarA2 = fej.UNSPECIFIED_ACTION;
        }
        return fejVarA2 == fej.UNLOCK_USAGE_LIMIT && feiVar.d >= jA && esoVar.a(feiVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(fei feiVar) {
        fes fesVar;
        long j = feiVar.d;
        if (feiVar.b == 10) {
            fesVar = (fes) feiVar.c;
        } else {
            fesVar = fes.c;
        }
        return fesVar.b + j;
    }

    static Comparator a(final dvc dvcVar) {
        return new Comparator(dvcVar) { // from class: flm.esd
            private final dvc a;

            {
                this.a = dvcVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                dvc dvcVar2 = this.a;
                return ((Comparable) dvcVar2.a(obj2)).compareTo((Comparable) dvcVar2.a(obj));
            }
        };
    }

    private static Comparator b(final dvc dvcVar) {
        return new Comparator(dvcVar) { // from class: flm.ese
            private final dvc a;

            {
                this.a = dvcVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                dvc dvcVar2 = this.a;
                return ((Comparable) dvcVar2.a(obj)).compareTo((Comparable) dvcVar2.a(obj2));
            }
        };
    }

    static dvm a(final fej... fejVarArr) {
        return new dvm(fejVarArr) { // from class: flm.esf
            private final fej[] a;

            {
                this.a = fejVarArr;
            }

            @Override // flm.dvm
            public final boolean a(Object obj) {
                return epr.a(this.a, (fei) obj);
            }
        };
    }

    static final /* synthetic */ boolean a(fej[] fejVarArr, fei feiVar) {
        List listAsList = Arrays.asList(fejVarArr);
        fej fejVarA = fej.a(feiVar.e);
        if (fejVarA == null) {
            fejVarA = fej.UNSPECIFIED_ACTION;
        }
        return listAsList.contains(fejVarA);
    }

    static final /* synthetic */ boolean a(ffe ffeVar) {
        feu feuVarA = feu.a(ffeVar.d);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        return feuVarA == feu.TIME_LIMIT_ON;
    }

    static final /* synthetic */ boolean b(ffe ffeVar) {
        feu feuVarA = feu.a(ffeVar.d);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        return feuVarA == feu.TIME_LIMIT_ON;
    }

    static final /* synthetic */ boolean a(ffi ffiVar) {
        feu feuVarA = feu.a(ffiVar.d);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        return feuVarA == feu.TIME_LIMIT_ON;
    }

    static final /* synthetic */ boolean b(ffi ffiVar) {
        feu feuVarA = feu.a(ffiVar.d);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        return feuVarA == feu.TIME_LIMIT_ON;
    }

    static final /* synthetic */ boolean a(eso esoVar) {
        return esoVar.a.f == 0;
    }

    static final /* synthetic */ boolean b(fei feiVar) {
        fej fejVarA = fej.a(feiVar.e);
        if (fejVarA == null) {
            fejVarA = fej.UNSPECIFIED_ACTION;
        }
        return fejVarA == fej.LOCK;
    }

    static final /* synthetic */ boolean c(fei feiVar) {
        fej fejVarA = fej.a(feiVar.e);
        if (fejVarA == null) {
            fejVarA = fej.UNSPECIFIED_ACTION;
        }
        return fejVarA == fej.LOCK;
    }

    static final /* synthetic */ boolean a(exf exfVar, esp espVar) {
        exf exfVarA = exf.a(espVar.a.c);
        if (exfVarA == null) {
            exfVarA = exf.UNSPECIFIED_EFFECTIVE_DAY;
        }
        return exfVarA == exfVar;
    }

    static final /* synthetic */ boolean a(long j, fei feiVar) {
        return feiVar.d >= j;
    }

    static final /* synthetic */ boolean a(Set set, fei feiVar) {
        return !set.contains(feiVar);
    }
}
