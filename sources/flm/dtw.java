package flm;

import android.annotation.TargetApi;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtw implements dtv {
    public static final eay a = eay.a("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final drr b;
    public final egz c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e = new AtomicLong(2100000);
    private final dsh f;
    private final goa g;
    private final dui h;
    private final duh i;
    private final dsw j;

    dtw(dsh dshVar, drr drrVar, egz egzVar, goa goaVar, dui duiVar, duh duhVar, dsw dswVar) {
        this.f = dshVar;
        this.b = drrVar;
        this.c = egzVar;
        this.g = goaVar;
        this.h = duiVar;
        this.i = duhVar;
        this.j = dswVar;
    }

    @Override // flm.dtv
    public final dtq a(final String str, dtn dtnVar, long j, final long j2) {
        dtq dtqVarB = duj.b();
        if (dtqVarB != null) {
            duj.a(dtqVarB, str);
        }
        dsw dswVar = this.j;
        final UUID uuid = new UUID(((-61441) & dswVar.a()) ^ dswVar.a.getMostSignificantBits(), dswVar.a.getLeastSignificantBits() ^ (dswVar.a() >>> 2));
        duh duhVar = this.i;
        boolean zA = duh.a(uuid.getLeastSignificantBits(), this.h.a);
        dug dugVar = (dug) ((fio) duf.g.a(dp.au, (Object) null));
        long leastSignificantBits = uuid.getLeastSignificantBits();
        dugVar.c();
        duf dufVar = (duf) dugVar.a;
        dufVar.a |= 2;
        dufVar.c = leastSignificantBits;
        long mostSignificantBits = uuid.getMostSignificantBits();
        dugVar.c();
        duf dufVar2 = (duf) dugVar.a;
        dufVar2.a |= 1;
        dufVar2.b = mostSignificantBits;
        dugVar.c();
        duf dufVar3 = (duf) dugVar.a;
        dufVar3.a |= 4;
        dufVar3.e = j;
        final dub dubVar = new dub((duf) ((fin) dugVar.h()), j2, zA);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        dtc dtcVar = new dtc(uuid, dubVar, this.b, str, j2, dtnVar, atomicInteger, zA);
        dubVar.a(((dtg) ((fio) dtf.i.a(dp.au, (Object) null))).a(str).a(-1).a(0L).b(0L), dtnVar, dtcVar.d);
        this.d.put(uuid, dubVar);
        duj.a(dtcVar);
        dsh dshVar = this.f;
        dvl.a(dtcVar);
        if (dshVar.d.compareAndSet(false, true)) {
            dshVar.c.execute(new dsi(dshVar));
        }
        dsk dskVar = new dsk(dtcVar, dshVar.b);
        dsh.a.put(dskVar, Boolean.TRUE);
        dvl.b(dubVar.c.a((egv) dskVar.a));
        final ehb ehbVar = dubVar.c;
        ehbVar.a(new Runnable(this, uuid, ehbVar, dubVar, atomicInteger, j2, str) { // from class: flm.dtx
            private final dtw a;
            private final UUID b;
            private final egv c;
            private final dub d;
            private final AtomicInteger e;
            private final long f;
            private final String g;

            {
                this.a = this;
                this.b = uuid;
                this.c = ehbVar;
                this.d = dubVar;
                this.e = atomicInteger;
                this.f = j2;
                this.g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                duf dufVarA;
                SparseArray sparseArray;
                long j3;
                duf dufVarA2;
                dtw dtwVar = this.a;
                UUID uuid2 = this.b;
                egv egvVar = this.c;
                dub dubVar2 = this.d;
                AtomicInteger atomicInteger2 = this.e;
                long j4 = this.f;
                String str2 = this.g;
                dtwVar.d.remove(uuid2);
                if (!egvVar.isCancelled()) {
                    try {
                        egs.a(egvVar);
                        synchronized (dubVar2) {
                            dufVarA = dubVar2.a();
                            sparseArray = dubVar2.b;
                        }
                        do {
                            j3 = dtwVar.e.get();
                            if (j4 > j3) {
                            }
                            dtwVar.a(dufVarA, sparseArray, str2);
                            return;
                        } while (!dtwVar.e.compareAndSet(j3, bbx.DEFAULT_BIND_TIMEOUT_MILLIS + j4));
                        long j5 = j4 - 2100000;
                        for (final dub dubVar3 : dtwVar.d.values()) {
                            if (dubVar3.a < j5) {
                                final egx egxVarSchedule = dtwVar.c.schedule(dty.a, 10L, TimeUnit.SECONDS);
                                dubVar3.c.a(new Runnable(egxVarSchedule) { // from class: flm.dtz
                                    private final egv a;

                                    {
                                        this.a = egxVarSchedule;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.cancel(true);
                                    }
                                }, egn.INSTANCE);
                                egxVarSchedule.a(new Runnable(dubVar3) { // from class: flm.dua
                                    private final dub a;

                                    {
                                        this.a = dubVar3;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.c.cancel(true);
                                    }
                                }, egn.INSTANCE);
                            }
                        }
                        dtwVar.a(dufVarA, sparseArray, str2);
                        return;
                    } catch (ExecutionException e) {
                        ((eaz) ((eaz) ((eaz) dtw.a.a(Level.SEVERE)).a(e.getCause())).a("com/google/apps/tiktok/tracing/TraceManagerImpl", "lambda$newRootTrace$0", 193, "TraceManagerImpl.java")).a("Trace %s failed collection", str2);
                        return;
                    }
                }
                synchronized (dubVar2) {
                    dufVarA2 = dubVar2.a();
                }
                dsm dsmVar = dufVarA2.f == null ? dsm.d : dufVarA2.f;
                int size = (atomicInteger2.get() - dufVarA2.d.size()) + 1;
                int i = (dsmVar.a & 1) == 1 ? size - (dsmVar.b == null ? dsq.c : dsmVar.b).b : size;
                long jB = dtwVar.b.b() - j4;
                fio fioVar = (fio) dufVarA2.a(dp.au, (Object) null);
                fioVar.a((fin) dufVarA2);
                dug dugVar2 = (dug) fioVar;
                fio fioVar2 = (fio) dsmVar.a(dp.au, (Object) null);
                fioVar2.a((fin) dsmVar);
                dsn dsnVar = (dsn) fioVar2;
                dsp dspVar = (dsp) ((fio) dso.d.a(dp.au, (Object) null));
                dspVar.c();
                dso dsoVar = (dso) dspVar.a;
                dsoVar.a |= 2;
                dsoVar.c = i;
                dspVar.c();
                dso dsoVar2 = (dso) dspVar.a;
                dsoVar2.a |= 1;
                dsoVar2.b = jB;
                dso dsoVar3 = (dso) ((fin) dspVar.h());
                dsnVar.c();
                dsm dsmVar2 = (dsm) dsnVar.a;
                if (dsoVar3 == null) {
                    throw new NullPointerException();
                }
                dsmVar2.c = dsoVar3;
                dsmVar2.a |= 2;
                duf dufVar4 = (duf) ((fin) dugVar2.a((dsm) ((fin) dsnVar.h())).h());
                ((eaz) ((eaz) dtw.a.a(Level.SEVERE)).a("com/google/apps/tiktok/tracing/TraceManagerImpl", "lambda$newRootTrace$0", 172, "TraceManagerImpl.java")).a("Trace %s timed out after %d ms. Complete trace: %s", str2, Long.valueOf(jB), dufVar4);
                dtwVar.a(dufVar4, new SparseArray(0), str2);
            }
        }, this.c);
        return dtcVar;
    }

    @TargetApi(19)
    final void a(duf dufVar, SparseArray sparseArray, String str) {
        dtq dtqVarB = duj.b();
        duj.a(dta.b(str, dtp.d));
        RuntimeException runtimeException = null;
        try {
            Iterator it = ((Set) this.g.a()).iterator();
            while (it.hasNext()) {
                try {
                    ((dsz) it.next()).a(dufVar, sparseArray);
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        ehh.a(runtimeException, e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
            duj.a(dtqVarB);
        } catch (Throwable th) {
            duj.a(dtqVarB);
            throw th;
        }
    }

    static final /* synthetic */ void a() {
    }
}
