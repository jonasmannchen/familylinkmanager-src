package flm;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epo {
    public final fei a;
    public final epl b;

    private epo(Calendar calendar, Calendar calendar2, fei feiVar) {
        this.b = new epl(calendar, calendar2);
        this.a = feiVar;
    }

    public static dvi a(fei feiVar, TimeZone timeZone, ffa ffaVar, List list) {
        dwx dwxVarA = dwx.a(list);
        final Calendar calendarA = esn.a(feiVar.d, timeZone);
        Calendar calendarB = esn.b(calendarA, ffaVar);
        fej fejVarA = fej.a(feiVar.e);
        if (fejVarA == null) {
            fejVarA = fej.UNSPECIFIED_ACTION;
        }
        if (fejVarA == fej.LOCK) {
            if (dwxVarA.b(new dvm(calendarA) { // from class: flm.epp
                private final Calendar a;

                {
                    this.a = calendarA;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((esp) obj).a(this.a);
                }
            })) {
                return dur.a;
            }
            dvi dviVarC = dwxVarA.c(new dvm(calendarA) { // from class: flm.epq
                private final Calendar a;

                {
                    this.a = calendarA;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return ((esp) obj).b.a().after(this.a);
                }
            });
            return dvi.b(new epo(calendarA, (dviVarC.a() && ((esp) dviVarC.b()).b.a().before(calendarB)) ? ((esp) dviVarC.b()).b.a() : calendarB, feiVar));
        }
        return dur.a;
    }

    public final dzq a() {
        return dzq.a(this.b.a(), this.b.b());
    }
}
