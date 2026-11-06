package flm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftg {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;

    public static ftg a(String str) {
        return new ftg(str, b.incrementAndGet());
    }

    private ftg(String str, long j) {
        this.c = str;
        this.a = j;
    }

    public final String toString() {
        String str = this.c;
        return new StringBuilder(String.valueOf(str).length() + 21).append(str).append("-").append(this.a).toString();
    }
}
