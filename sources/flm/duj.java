package flm;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duj {
    private static final dsb c = new dsb("tiktok_systrace");
    private static final ThreadLocal d = new duk();
    public static final List a = new ArrayList();
    public static final Runnable b = new dul();

    public static dth a(String str) {
        return a(str, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS, dtp.d);
    }

    public static dth a(String str, duo duoVar, dtn dtnVar) {
        dtq dtqVarA;
        dvl.a(duoVar);
        dtq dtqVarB = b();
        if (dtqVarB == null) {
            a(true);
            dtqVarA = new dsy(str);
        } else {
            dtqVarA = dtqVarB.a(str, dtnVar);
        }
        a(dtqVarA);
        return new dth(dtqVarA);
    }

    public static void b(String str) {
        dtq dtqVarB = b();
        dvl.b(dtqVarB != null, "Tried to end [%s], but no trace was active. This is caused by mismatched or missing calls to beginSpan.", str);
        boolean zEquals = str.equals(dtqVarB.c());
        String strC = dtqVarB.c();
        if (!zEquals) {
            throw new IllegalStateException(dvy.a("Wrong trace, expected %s but got %s", str, strC));
        }
        a(dtqVarB.a());
    }

    public static void a(dth dthVar) {
        String str = dthVar.c;
        try {
            dthVar.a();
        } finally {
            b(str);
        }
    }

    public static void a() {
        a(false);
    }

    static void a(boolean z) {
        IllegalStateException illegalStateException;
        if (dtr.a()) {
            dtq dtqVarB = b();
            if (dtqVarB == null) {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            } else if (dtqVarB instanceof dst) {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((dst) dtqVarB).d());
            } else {
                illegalStateException = null;
            }
            if (illegalStateException != null) {
                if (z || dtr.a == dp.ae) {
                    Log.e("Tracer", "Missing trace", illegalStateException);
                    return;
                }
                throw illegalStateException;
            }
        }
    }

    static dtq b() {
        return ((dun) d.get()).b;
    }

    public static dte a(duo duoVar) {
        dvl.a(duoVar);
        return b();
    }

    static dtq c() {
        dtq dtqVarB = b();
        if (dtqVarB == null) {
            return new dsx();
        }
        return dtqVarB;
    }

    public static dte b(duo duoVar) {
        dvl.a(duoVar);
        return c();
    }

    static void a(dtq dtqVar) {
        if (b(dtqVar)) {
            a.add(dtqVar);
            dsg.a(b);
        }
    }

    public static void a(dte dteVar, duo duoVar) {
        dvl.a(duoVar);
        a((dtq) dteVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    static boolean b(dtq dtqVar) {
        dun dunVar = (dun) d.get();
        dtq dtqVar2 = dunVar.b;
        if (dtqVar2 == dtqVar) {
            return false;
        }
        if ("true".equals(dsf.a(c.b, "false"))) {
            if (dtqVar2 != null) {
                if (dtqVar != null) {
                    if (dtqVar2.a() == dtqVar) {
                        Trace.endSection();
                    } else if (dtqVar2 == dtqVar.a()) {
                        c(dtqVar.c());
                    }
                }
                e(dtqVar2);
                if (dtqVar != null) {
                    d(dtqVar);
                }
            } else if (dtqVar != null) {
                d(dtqVar);
            }
        }
        if ((dtqVar != null && dtqVar.e()) || (dtqVar2 != null && dtqVar2.e())) {
            int iCurrentThreadTimeMillis = (int) SystemClock.currentThreadTimeMillis();
            int i = iCurrentThreadTimeMillis - dunVar.c;
            if (i > 0 && dtqVar2 != null && dtqVar2.e()) {
                dtqVar2.a(i);
            }
            dunVar.c = iCurrentThreadTimeMillis;
        }
        dunVar.b = dtqVar;
        return dunVar.a;
    }

    public static boolean c(duo duoVar) {
        dvl.a(duoVar);
        return b() != null;
    }

    @TargetApi(18)
    private static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    @TargetApi(18)
    private static void d(dtq dtqVar) {
        if (dtqVar.a() != null) {
            d(dtqVar.a());
        }
        c(dtqVar.c());
    }

    @TargetApi(18)
    private static void e(dtq dtqVar) {
        while (true) {
            Trace.endSection();
            if (dtqVar.a() != null) {
                dtqVar = dtqVar.a();
            } else {
                return;
            }
        }
    }

    public static dtl a(dtm dtmVar) {
        dtl dtlVarA = dtl.a(dp.Z);
        for (dtq dtqVarB = b(); dtqVarB != null; dtqVarB = dtqVarB.a()) {
            dtlVarA = dtqVarB.a(dtmVar);
            dtlVarA.b = true;
            switch (dtlVarA.a - 1) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                case 1:
                    return dtlVarA;
                default:
                    break;
            }
        }
        return dtlVarA;
    }

    static String c(dtq dtqVar) {
        if (dtqVar.a() == null) {
            return dtqVar.c();
        }
        String strC = c(dtqVar.a());
        String strC2 = dtqVar.c();
        return new StringBuilder(String.valueOf(strC).length() + 4 + String.valueOf(strC2).length()).append(strC).append(" -> ").append(strC2).toString();
    }

    static void a(dtq dtqVar, String str) {
        if (dtqVar instanceof dst) {
            String strC = c(dtqVar);
            if (!"".equals(strC)) {
                String strValueOf = String.valueOf(strC);
                strC = strValueOf.length() != 0 ? ": ".concat(strValueOf) : new String(": ");
            }
            throw new dss(strC, str, "The place you're trying to create a root trace does not have a trace active, but it would have had all traces been properly created and propagated leading to this method being called. Look at the cause of this exception to see where, if a trace was created, it would have been propagated from.", ((dst) dtqVar).d());
        }
        throw new dss(c(dtqVar), str, "");
    }

    static {
        new dum();
    }
}
