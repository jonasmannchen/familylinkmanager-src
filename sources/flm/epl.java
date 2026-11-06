package flm;

import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epl {
    public final Calendar a;
    private final Calendar b;

    epl(Calendar calendar, Calendar calendar2) {
        this.b = calendar;
        this.a = calendar2;
    }

    public final Calendar a() {
        return (Calendar) this.b.clone();
    }

    public final Calendar b() {
        return (Calendar) this.a.clone();
    }

    public final boolean a(long j) {
        return this.b.getTimeInMillis() <= j && j < this.a.getTimeInMillis();
    }
}
