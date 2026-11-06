package flm;

import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esp {
    public ffi a;
    public epl b;

    esp(Calendar calendar, Calendar calendar2, ffi ffiVar) {
        this.b = new epl(calendar, calendar2);
        this.a = ffiVar;
    }

    public static esp a(Calendar calendar, ffi ffiVar) {
        ffa ffaVar;
        ffa ffaVar2;
        exf exfVarA = esn.a(esn.b(calendar, -1));
        exf exfVarA2 = exf.a(ffiVar.c);
        if (exfVarA2 == null) {
            exfVarA2 = exf.UNSPECIFIED_EFFECTIVE_DAY;
        }
        int iA = esn.a(exfVarA, exfVarA2) - 1;
        if (ffiVar.f == null) {
            ffaVar = ffa.d;
        } else {
            ffaVar = ffiVar.f;
        }
        Calendar calendarB = esn.b(esn.a(calendar, ffaVar), iA);
        if (ffiVar.g == null) {
            ffaVar2 = ffa.d;
        } else {
            ffaVar2 = ffiVar.g;
        }
        return new esp(calendarB, esn.b(esn.a(calendar, ffaVar2), (esn.a(ffiVar) ? 1 : 0) + iA), ffiVar);
    }

    public final dzq a() {
        return dzq.a(this.b.a(), this.b.b());
    }

    public final boolean a(Calendar calendar) {
        return this.b.a(calendar.getTimeInMillis());
    }

    public final boolean a(long j) {
        return this.b.a(j);
    }
}
