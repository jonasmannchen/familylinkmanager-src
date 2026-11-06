package flm;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esn {
    private static final Map a;

    public static Calendar a(Calendar calendar, ffa ffaVar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, ffaVar.b);
        calendar2.set(12, ffaVar.c);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static boolean a(ffi ffiVar) {
        ffa ffaVar;
        ffa ffaVar2;
        if (ffiVar.f == null) {
            ffaVar = ffa.d;
        } else {
            ffaVar = ffiVar.f;
        }
        if (ffiVar.g == null) {
            ffaVar2 = ffa.d;
        } else {
            ffaVar2 = ffiVar.g;
        }
        return ffaVar.b > ffaVar2.b || (ffaVar.b == ffaVar2.b && ffaVar.c >= ffaVar2.c);
    }

    static Calendar b(Calendar calendar, ffa ffaVar) {
        Calendar calendarA = a(calendar, ffaVar);
        if (!calendarA.after(calendar)) {
            return b(calendarA, 1);
        }
        return calendarA;
    }

    static Calendar c(Calendar calendar, ffa ffaVar) {
        return b(b(calendar, ffaVar), -1);
    }

    public static int a(exf exfVar, exf exfVar2) {
        int i = exfVar2.i - exfVar.i;
        if (i < 0) {
            return i + 7;
        }
        return i;
    }

    public static exf a(Calendar calendar) {
        return (exf) a.get(Integer.valueOf(calendar.get(7)));
    }

    static Calendar a(long j, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return calendar;
    }

    static Calendar a(Calendar calendar, long j) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() + j);
        return calendar2;
    }

    static Calendar a(Calendar calendar, int i) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(12, calendar2.get(12) + i);
        return calendar2;
    }

    static Calendar b(Calendar calendar, int i) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(6, calendar2.get(6) + i);
        return calendar2;
    }

    static {
        HashMap map = new HashMap();
        map.put(1, exf.SUNDAY);
        map.put(2, exf.MONDAY);
        map.put(3, exf.TUESDAY);
        map.put(4, exf.WEDNESDAY);
        map.put(5, exf.THURSDAY);
        map.put(6, exf.FRIDAY);
        map.put(7, exf.SATURDAY);
        a = Collections.unmodifiableMap(map);
    }
}
