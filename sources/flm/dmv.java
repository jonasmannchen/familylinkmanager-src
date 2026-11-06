package flm;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmv {
    private static boolean a(Number number) {
        return number == null || number.longValue() <= 0;
    }

    static boolean a(goo gooVar) {
        if (gooVar != null) {
            if (!a((gooVar.a & 1) == 1 ? Integer.valueOf(gooVar.b) : null)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(goy goyVar) {
        return goyVar.b == 0 && goyVar.c == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (a((java.lang.Number) ((r6.a & 32) == 32 ? java.lang.Long.valueOf(r6.g) : null)) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean a(flm.gou r6) {
        /*
            r2 = 1
            r1 = 0
            if (r6 == 0) goto L78
            int r0 = r6.a
            r0 = r0 & 1
            if (r0 != r2) goto L7a
            long r4 = r6.b
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L10:
            boolean r0 = a(r0)
            if (r0 == 0) goto L84
            int r0 = r6.a
            r0 = r0 & 2
            r3 = 2
            if (r0 != r3) goto L7c
            long r4 = r6.c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L23:
            boolean r0 = a(r0)
            if (r0 == 0) goto L84
            int r0 = r6.a
            r0 = r0 & 16
            r3 = 16
            if (r0 != r3) goto L7e
            long r4 = r6.f
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L37:
            boolean r0 = a(r0)
            if (r0 == 0) goto L84
            int r0 = r6.a
            r0 = r0 & 8
            r3 = 8
            if (r0 != r3) goto L80
            long r4 = r6.e
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L4b:
            boolean r0 = a(r0)
            if (r0 == 0) goto L84
            int r0 = r6.a
            r0 = r0 & 4
            r3 = 4
            if (r0 != r3) goto L82
            long r4 = r6.d
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L5e:
            boolean r0 = a(r0)
            if (r0 == 0) goto L84
            int r0 = r6.a
            r0 = r0 & 32
            r3 = 32
            if (r0 != r3) goto L72
            long r0 = r6.g
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L72:
            boolean r0 = a(r1)
            if (r0 == 0) goto L84
        L78:
            r0 = r2
        L79:
            return r0
        L7a:
            r0 = r1
            goto L10
        L7c:
            r0 = r1
            goto L23
        L7e:
            r0 = r1
            goto L37
        L80:
            r0 = r1
            goto L4b
        L82:
            r0 = r1
            goto L5e
        L84:
            r0 = 0
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.dmv.a(flm.gou):boolean");
    }

    static boolean a(gos gosVar) {
        return gosVar == null || gosVar.c.size() == 0;
    }

    static boolean a(gow gowVar) {
        return gowVar == null || (a(Integer.valueOf(gowVar.b)) && a(Integer.valueOf(gowVar.c)));
    }

    public static Long a(Long l, Long l2) {
        if (l != null && l2 != null) {
            long jLongValue = l.longValue() - l2.longValue();
            if (jLongValue == 0) {
                return null;
            }
            return Long.valueOf(jLongValue);
        }
        return l;
    }

    static Integer a(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            int iIntValue = num.intValue() - num2.intValue();
            if (iIntValue == 0) {
                return null;
            }
            return Integer.valueOf(iIntValue);
        }
        return num;
    }

    static goq a(String str) {
        if (str == null) {
            return null;
        }
        gor gorVar = (gor) ((fio) goq.d.a(dp.au, (Object) null));
        gorVar.c();
        goq goqVar = (goq) gorVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        goqVar.a |= 2;
        goqVar.c = str;
        return (goq) ((fin) gorVar.h());
    }

    static goy a(String str, TimerStat timerStat) {
        goz gozVarA = ((goz) ((fio) goy.e.a(dp.au, (Object) null))).a(timerStat.getCount());
        if (((goy) gozVarA.a).b < 0) {
            gozVarA.a(0);
        }
        goq goqVarA = a(str);
        if (goqVarA != null) {
            gozVarA.a(goqVarA);
        }
        goy goyVar = (goy) ((fin) gozVarA.a(timerStat.getTime()).h());
        if (a(goyVar)) {
            return null;
        }
        return goyVar;
    }

    public static goy a(goy goyVar, goy goyVar2) {
        goq goqVar;
        if (goyVar == null || goyVar2 == null) {
            return goyVar;
        }
        goz gozVar = (goz) ((fio) goy.e.a(dp.au, (Object) null));
        if (goyVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = goyVar.d;
        }
        goy goyVar3 = (goy) ((fin) gozVar.a(goqVar).a(goyVar.b - goyVar2.b).a(goyVar.c - goyVar2.c).h());
        if (a(goyVar3)) {
            return null;
        }
        return goyVar3;
    }

    static Integer a(Long l) {
        if (l == null) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }

    public static List a(List list, List list2) {
        return dnb.a.a(list, list2);
    }

    static Long a(HealthStats healthStats, int i) {
        Long lValueOf = (healthStats == null || !healthStats.hasMeasurement(i)) ? null : Long.valueOf(healthStats.getMeasurement(i));
        if (a((Number) lValueOf)) {
            return null;
        }
        return lValueOf;
    }

    static goy b(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return a((String) null, healthStats.getTimer(i));
    }

    static List c(HealthStats healthStats, int i) {
        if (healthStats != null && healthStats.hasTimers(i)) {
            return dnb.a.a(healthStats.getTimers(i));
        }
        return Collections.emptyList();
    }

    static Map d(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasStats(i)) {
            return null;
        }
        return healthStats.getStats(i);
    }
}
