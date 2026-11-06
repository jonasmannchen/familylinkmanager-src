package flm;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggu {
    public final Long a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final ggi e;
    public final gbt f;

    ggu(Map map, boolean z, int i, int i2) {
        ggi ggiVar;
        this.a = ggv.o(map);
        this.b = ggv.p(map);
        this.c = ggv.r(map);
        if (this.c != null) {
            dvl.a(this.c.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", this.c);
        }
        this.d = ggv.q(map);
        if (this.d != null) {
            dvl.a(this.d.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", this.d);
        }
        Map mapL = z ? ggv.l(map) : null;
        if (mapL == null) {
            ggiVar = ggi.f;
        } else {
            int iIntValue = ((Integer) dvl.a(ggv.b(mapL), "maxAttempts cannot be empty")).intValue();
            dvl.a(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) dvl.a(ggv.c(mapL), "initialBackoff cannot be empty")).longValue();
            dvl.a(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) dvl.a(ggv.d(mapL), "maxBackoff cannot be empty")).longValue();
            dvl.a(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            double dDoubleValue = ((Double) dvl.a(ggv.e(mapL), "backoffMultiplier cannot be empty")).doubleValue();
            dvl.a(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(dDoubleValue));
            List<String> listF = ggv.f(mapL);
            dvl.a(listF, "rawCodes must be present");
            dvl.a(!listF.isEmpty(), "rawCodes can't be empty");
            EnumSet enumSetNoneOf = EnumSet.noneOf(fvd.class);
            for (String str : listF) {
                dwh.a(!"OK".equals(str), "rawCode can not be \"OK\"", new Object[0]);
                enumSetNoneOf.add(fvd.a(str));
            }
            ggiVar = new ggi(iMin, jLongValue, jLongValue2, dDoubleValue, Collections.unmodifiableSet(enumSetNoneOf));
        }
        this.e = ggiVar;
        Map mapM = z ? ggv.m(map) : null;
        this.f = mapM == null ? gbt.a : ggp.a(mapM, i2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ggu)) {
            return false;
        }
        ggu gguVar = (ggu) obj;
        return dvh.a(this.a, gguVar.a) && dvh.a(this.b, gguVar.b) && dvh.a(this.c, gguVar.c) && dvh.a(this.d, gguVar.d) && dvh.a(this.e, gguVar.e);
    }

    public final String toString() {
        return dve.a(this).a("timeoutNanos", this.a).a("waitForReady", this.b).a("maxInboundMessageSize", this.c).a("maxOutboundMessageSize", this.d).a("retryPolicy", this.e).toString();
    }
}
