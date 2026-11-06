package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbp implements ftz {
    gbp() {
    }

    @Override // flm.ftz
    public final /* synthetic */ Object a(String str) {
        dvl.a(str.length() > 0, "empty timeout");
        dvl.a(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        switch (cCharAt) {
            case 'H':
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            case 'M':
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            case 'S':
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            case 'm':
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            case 'n':
                return Long.valueOf(j);
            case 'u':
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            default:
                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }
    }

    @Override // flm.ftz
    public final /* synthetic */ String a(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l.longValue() < 100000000) {
            String strValueOf = String.valueOf(l);
            return new StringBuilder(String.valueOf(strValueOf).length() + 1).append(strValueOf).append("n").toString();
        }
        if (l.longValue() < 100000000000L) {
            return new StringBuilder(21).append(timeUnit.toMicros(l.longValue())).append("u").toString();
        }
        if (l.longValue() < 100000000000000L) {
            return new StringBuilder(21).append(timeUnit.toMillis(l.longValue())).append("m").toString();
        }
        if (l.longValue() < 100000000000000000L) {
            return new StringBuilder(21).append(timeUnit.toSeconds(l.longValue())).append("S").toString();
        }
        if (l.longValue() < 6000000000000000000L) {
            return new StringBuilder(21).append(timeUnit.toMinutes(l.longValue())).append("M").toString();
        }
        return new StringBuilder(21).append(timeUnit.toHours(l.longValue())).append("H").toString();
    }
}
