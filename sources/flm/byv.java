package flm;

import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byv {
    private static final long a = TimeUnit.HOURS.toMillis(24);

    public static synchronized etw a(SupervisionDatabase supervisionDatabase, fee feeVar) {
        return b(supervisionDatabase, feeVar).a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x031a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0301  */
    public static synchronized byx b(SupervisionDatabase supervisionDatabase, fee feeVar) {
        long jB;
        fee feeVar2;
        boolean z;
        etw etwVarA;
        euc eucVarA;
        Long lValueOf;
        boolean z2;
        long jA;
        final euc eucVarA2;
        jB = btj.b();
        long jC = btj.c();
        TimeZone timeZone = TimeZone.getDefault();
        btv.b("TimeLimit", "currentTime: %s, elapsedTime:%s, timeZone: %s", a(jB), b(jC), timeZone);
        final bwj bwjVarP = supervisionDatabase.p();
        List listA = bwjVarP.a();
        if (listA.isEmpty()) {
            btv.b("TimeLimit", "No local override data", new Object[0]);
            feeVar2 = feeVar;
        } else {
            fio fioVar = (fio) feeVar.a(dp.au, (Object) null);
            fioVar.a((fin) feeVar);
            fef fefVar = (fef) fioVar;
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                fei feiVarA = ((bws) it.next()).a();
                fefVar.c();
                fee feeVar3 = (fee) fefVar.a;
                if (feiVarA == null) {
                    throw new NullPointerException();
                }
                if (!feeVar3.e.a()) {
                    feeVar3.e = fin.a(feeVar3.e);
                }
                feeVar3.e.add(feiVarA);
            }
            feeVar2 = (fee) ((fin) fefVar.h());
        }
        btv.b("TimeLimit", "%s", new byw("timeLimit", feeVar2));
        bzb bzbVar = new bzb();
        long jC2 = bwjVarP.c("last_usage_reset_epoch_time");
        if (jC2 > jB) {
            btt.a("TimeLimit", "", "Last reset time (%s) is in the future; current time is %s. Resetting last reset time.", Long.valueOf(jC2), Long.valueOf(jB));
            bzbVar.b(jB);
            jC2 = jB;
        }
        boolean z3 = jC2 < epr.a(feeVar2, timeZone, jB);
        if (z3) {
            z = z3;
        } else {
            long jA2 = bzbVar.a(jC);
            if (jA2 > a) {
                btt.a("TimeLimit", "", "%.3f hours of usage somehow accumulated. Resetting usage.", Double.valueOf(jA2 / TimeUnit.HOURS.toMillis(1L)));
                z = true;
            } else {
                z = z3;
            }
        }
        if (z) {
            btv.a("TimeLimit", "reset usage", new Object[0]);
            synchronized (bzb.class) {
                bzbVar.a.p().b(jB);
                if (bzbVar.b()) {
                    bzbVar.a.p().a(jC, 1);
                }
            }
        }
        long jA3 = bzbVar.a(jC);
        btv.b("TimeLimit", "currentUsage: %s", b(jA3));
        etwVarA = epr.a(feeVar2, jA3, jB, timeZone, jB);
        btv.b("TimeLimit", "currentState: %s", etwVarA);
        if (!etwVarA.b) {
            esu esuVarA = esu.a(etwVarA.f);
            if (esuVarA == null) {
                esuVarA = esu.NO_ACTIVE_POLICY;
            }
            if (esuVarA == esu.OVERRIDE && etwVarA.e - jB > 1000) {
                btt.a("TimeLimit", "", "Override scheduled for %.3f seconds in the future.", Double.valueOf((etwVarA.e - jB) / 1000.0d));
            }
        }
        eucVarA = euc.a((int) bwjVarP.c("notification_phase"));
        boolean zD = bwjVarP.d("is_device_locked");
        btv.b("TimeLimit", "prevPhase: %s, prevIsLocked: %s", Integer.valueOf(eucVarA.e), Boolean.valueOf(zD));
        if (bzbVar.b() && (etwVarA.a & 1024) == 1024) {
            long j = etwVarA.l;
            long jLongValue = ((Long) buw.c.b()).longValue();
            long jLongValue2 = ((Long) buw.d.b()).longValue();
            if (0 >= j || j >= jLongValue) {
                jLongValue2 = jLongValue;
            }
            lValueOf = Long.valueOf(jLongValue2);
        } else {
            lValueOf = null;
        }
        long jA4 = a(jB, bwjVarP.c("last_reported_usage_ms"), jA3, lValueOf);
        if (zD || !etwVarA.b) {
            z2 = false;
        } else {
            esu esuVarA2 = esu.a(etwVarA.c);
            if (esuVarA2 == null) {
                esuVarA2 = esu.NO_ACTIVE_POLICY;
            }
            if (esuVarA2 == esu.USAGE_LIMIT) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z || z2 || jA4 <= jB) {
            boolean z4 = z || z2;
            btv.a("TimeLimit", "Uploading usage time now.", new Object[0]);
            supervisionDatabase.m().a(11, jB);
            if (z4) {
                cav.a(euz.USAGE_TIME_CHANGED);
            } else {
                caw.a(euz.USAGE_TIME_CHANGED);
            }
            supervisionDatabase.p().a("last_reported_usage_ms", jA3);
            jA = a(jB, bwjVarP.c("last_reported_usage_ms"), jA3, lValueOf);
        } else {
            jA = jA4;
        }
        btv.b("TimeLimit", "Upload usage in %s", b(jA - jB));
        eucVarA2 = euc.a((etwVarA.w == null ? eua.f : etwVarA.w).c);
        if (eucVarA2 == null) {
            eucVarA2 = euc.NO_NOTIFICATION;
        }
        final boolean z5 = etwVarA.b;
        bwjVarP.a.a(new Runnable(bwjVarP, eucVarA2, z5) { // from class: flm.bwm
            private final bwj a;
            private final euc b;
            private final boolean c;

            {
                this.a = bwjVarP;
                this.b = eucVarA2;
                this.c = z5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwj bwjVar = this.a;
                euc eucVar = this.b;
                boolean z6 = this.c;
                bwjVar.a("notification_phase", eucVar.e);
                bwjVar.a("is_device_locked", z6);
            }
        });
        bzbVar.a();
        btt.a(jB, feeVar2, eucVarA, zD, etwVarA, etwVarA.d, bwjVarP.c("last_usage_reset_epoch_time"));
        return new byx(etwVarA, eucVarA2 != eucVarA, jA, jB);
    }

    private static long a(long j, long j2, long j3, Long l) {
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return ((l.longValue() + j2) - j3) + j;
    }

    static StringBuilder a(ffa ffaVar) {
        return new StringBuilder().append(String.format("%2s", Integer.valueOf(ffaVar.b)).replace(' ', '0')).append(":").append(String.format("%2s", Integer.valueOf(ffaVar.c)).replace(' ', '0'));
    }

    static StringBuilder a(long j) {
        return j == 0 ? new StringBuilder() : new StringBuilder().append(j).append(" = ").append(new Date(j));
    }

    private static String b(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        return new StringBuilder(62).append(j3 / 60).append(":").append(j3 % 60).append(":").append(j2 % 60).toString();
    }
}
