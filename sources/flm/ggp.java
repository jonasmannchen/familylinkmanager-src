package flm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggp implements fro {
    public static final Logger a = Logger.getLogger(ggp.class.getName());
    public static final frk h = frk.a("internal-retry-policy");
    public static final frk i = frk.a("internal-hedging-policy");
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final boolean d;
    public final int e;
    public final int f;
    public volatile boolean g;

    ggp(boolean z, int i2, int i3) {
        this.d = z;
        this.e = i2;
        this.f = i3;
    }

    static gbt a(Map map, int i2) {
        int iIntValue = ((Integer) dvl.a(ggv.g(map), "maxAttempts cannot be empty")).intValue();
        dvl.a(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
        int iMin = Math.min(iIntValue, i2);
        long jLongValue = ((Long) dvl.a(ggv.h(map), "hedgingDelay cannot be empty")).longValue();
        dvl.a(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
        List<String> listI = ggv.i(map);
        dvl.a(listI, "rawCodes must be present");
        dvl.a(!listI.isEmpty(), "rawCodes can't be empty");
        EnumSet enumSetNoneOf = EnumSet.noneOf(fvd.class);
        for (String str : listI) {
            dwh.a(!"OK".equals(str), "rawCode can not be \"OK\"", new Object[0]);
            enumSetNoneOf.add(fvd.a(str));
        }
        return new gbt(iMin, jLongValue, Collections.unmodifiableSet(enumSetNoneOf));
    }

    @Override // flm.fro
    public final frm a(fuf fufVar, frj frjVar, frl frlVar) {
        frj frjVarB;
        if (this.d) {
            if (this.g) {
                ggi ggiVarA = a(fufVar);
                ggu gguVarB = b(fufVar);
                gbt gbtVar = gguVarB == null ? gbt.a : gguVarB.f;
                dwh.a(ggiVarA.equals(ggi.f) || gbtVar.equals(gbt.a), "Can not apply both retry and hedging policy for the method '%s'", fufVar);
                frjVar = frjVar.a(h, new ggt(ggiVarA)).a(i, new ggs(gbtVar));
            } else {
                frjVar = frjVar.a(h, new ggr(this, fufVar)).a(i, new ggq(this, fufVar));
            }
        }
        ggu gguVarB2 = b(fufVar);
        if (gguVarB2 == null) {
            return frlVar.a(fufVar, frjVar);
        }
        if (gguVarB2.a != null) {
            fsl fslVarA = fsl.a(gguVarB2.a.longValue(), TimeUnit.NANOSECONDS);
            fsl fslVar = frjVar.b;
            if (fslVar == null || fslVarA.compareTo(fslVar) < 0) {
                frjVar = frjVar.a(fslVarA);
            }
        }
        if (gguVarB2.b == null) {
            frjVarB = frjVar;
        } else if (gguVarB2.b.booleanValue()) {
            frjVarB = new frj(frjVar);
            frjVarB.h = true;
        } else {
            frjVarB = new frj(frjVar);
            frjVarB.h = false;
        }
        if (gguVarB2.c != null) {
            Integer num = frjVarB.i;
            if (num != null) {
                frjVarB = frjVarB.a(Math.min(num.intValue(), gguVarB2.c.intValue()));
            } else {
                frjVarB = frjVarB.a(gguVarB2.c.intValue());
            }
        }
        if (gguVarB2.d != null) {
            Integer num2 = frjVarB.j;
            if (num2 != null) {
                frjVarB = frjVarB.b(Math.min(num2.intValue(), gguVarB2.d.intValue()));
            } else {
                frjVarB = frjVarB.b(gguVarB2.d.intValue());
            }
        }
        return frlVar.a(fufVar, frjVarB);
    }

    private final ggu b(fuf fufVar) {
        Map map;
        Map map2 = (Map) this.b.get();
        ggu gguVar = map2 != null ? (ggu) map2.get(fufVar.b) : null;
        if (gguVar != null || (map = (Map) this.c.get()) == null) {
            return gguVar;
        }
        String str = fufVar.b;
        int iLastIndexOf = ((String) dvl.a(str, "fullMethodName")).lastIndexOf(47);
        return (ggu) map.get(iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf));
    }

    final ggi a(fuf fufVar) {
        ggu gguVarB = b(fufVar);
        return gguVarB == null ? ggi.f : gguVarB.e;
    }
}
