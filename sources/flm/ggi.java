package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggi {
    public static final ggi f = new ggi(1, 0, 0, 1.0d, Collections.emptySet());
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final Set e;

    ggi(int i, long j, long j2, double d, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = dxx.a((Collection) set);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ggi)) {
            return false;
        }
        ggi ggiVar = (ggi) obj;
        return this.a == ggiVar.a && this.b == ggiVar.b && this.c == ggiVar.c && Double.compare(this.d, ggiVar.d) == 0 && dvh.a(this.e, ggiVar.e);
    }

    public final String toString() {
        return dve.a(this).a("maxAttempts", this.a).a("initialBackoffNanos", this.b).a("maxBackoffNanos", this.c).a("backoffMultiplier", String.valueOf(this.d)).a("retryableStatusCodes", this.e).toString();
    }
}
