package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbt {
    public static final gbt a = new gbt(1, 0, Collections.emptySet());
    private final int b;
    private final long c;
    private final Set d;

    gbt(int i, long j, Set set) {
        this.b = i;
        this.c = j;
        this.d = dxx.a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gbt gbtVar = (gbt) obj;
        return this.b == gbtVar.b && this.c == gbtVar.c && dvh.a(this.d, gbtVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.c), this.d});
    }

    public final String toString() {
        return dve.a(this).a("maxAttempts", this.b).a("hedgingDelayNanos", this.c).a("nonFatalStatusCodes", this.d).toString();
    }
}
