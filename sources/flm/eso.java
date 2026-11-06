package flm;

import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eso {
    public ffe a;
    public epl b;

    eso(Calendar calendar, Calendar calendar2, ffe ffeVar) {
        this.b = new epl(calendar, calendar2);
        this.a = ffeVar;
    }

    public static eso a(Calendar calendar, ffe ffeVar, ffa ffaVar) {
        Calendar calendarC = esn.c(calendar, ffaVar);
        exf exfVarA = esn.a(calendarC);
        exf exfVarA2 = exf.a(ffeVar.c);
        if (exfVarA2 == null) {
            exfVarA2 = exf.UNSPECIFIED_EFFECTIVE_DAY;
        }
        Calendar calendarB = esn.b(calendarC, esn.a(exfVarA, exfVarA2));
        return new eso(calendarB, esn.b(calendarB, 1), ffeVar);
    }

    public final dzq a() {
        return dzq.a(this.b.a(), this.b.b());
    }

    public final boolean a(long j) {
        return this.b.a(j);
    }
}
