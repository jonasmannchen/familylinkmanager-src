package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvw {
    public final dwf a = dwf.a;
    public boolean b;
    public long c;
    public long d;

    public final dvw a() {
        dvl.b(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public final dvw b() {
        this.c = 0L;
        this.b = false;
        return this;
    }

    private final long c() {
        return this.b ? (this.a.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(c(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jC = c();
        if (TimeUnit.DAYS.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(jC, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String strA = dvj.a(jC / TimeUnit.NANOSECONDS.convert(1L, timeUnit));
        switch (dvx.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return new StringBuilder(String.valueOf(strA).length() + 1 + String.valueOf(str).length()).append(strA).append(" ").append(str).toString();
    }
}
