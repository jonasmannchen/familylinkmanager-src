package flm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyc {
    public static final Logger a = Logger.getLogger(fyc.class.getName());
    public static final AtomicIntegerFieldUpdater b;
    private static final AtomicIntegerFieldUpdater f;
    public final gnj c;
    public final fuc d;
    public final fyi e = new fyi(this);

    fyc(gnj gnjVar, gnu gnuVar) {
        new fyh(this);
        this.c = (gnj) dvl.a(gnjVar, "censusTracer");
        dvl.a(gnuVar, "censusPropagationBinaryFormat");
        this.d = fuc.a("grpc-trace-bin", new fyd(gnuVar));
    }

    static gmp a(fvc fvcVar, boolean z) {
        gnd gndVar;
        gmq gmqVarC = gmp.c();
        switch (fvcVar.m.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                gndVar = gnd.b;
                break;
            case 1:
                gndVar = gnd.c;
                break;
            case 2:
                gndVar = gnd.d;
                break;
            case 3:
                gndVar = gnd.e;
                break;
            case 4:
                gndVar = gnd.f;
                break;
            case 5:
                gndVar = gnd.g;
                break;
            case 6:
                gndVar = gnd.h;
                break;
            case 7:
                gndVar = gnd.i;
                break;
            case 8:
                gndVar = gnd.k;
                break;
            case 9:
                gndVar = gnd.l;
                break;
            case 10:
                gndVar = gnd.m;
                break;
            case 11:
                gndVar = gnd.n;
                break;
            case 12:
                gndVar = gnd.o;
                break;
            case 13:
                gndVar = gnd.p;
                break;
            case 14:
                gndVar = gnd.q;
                break;
            case 15:
                gndVar = gnd.r;
                break;
            case 16:
                gndVar = gnd.j;
                break;
            default:
                String strValueOf = String.valueOf(fvcVar.m);
                throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Unhandled status code ").append(strValueOf).toString());
        }
        if (fvcVar.n != null) {
            String str = fvcVar.n;
            if (!gkx.a((Object) gndVar.t, (Object) str)) {
                gndVar = new gnd(gndVar.s, str);
            }
        }
        return gmqVarC.a(gndVar).a(z).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(gmx gmxVar, gmt gmtVar, int i, long j, long j2) {
        gms gmsVarA = gmr.a(gmtVar, i);
        if (j2 != -1) {
            gmsVarA.b(j2);
        }
        if (j != -1) {
            gmsVarA.c(j);
        }
        gmxVar.a(gmsVarA.a());
    }

    static String a(boolean z, String str) {
        String strReplace = str.replace('/', '.');
        return new StringBuilder(String.valueOf("Sent").length() + 1 + String.valueOf(strReplace).length()).append("Sent").append(".").append(strReplace).toString();
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdaterNewUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = null;
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdaterNewUpdater2 = AtomicIntegerFieldUpdater.newUpdater(fye.class, "a");
            atomicIntegerFieldUpdaterNewUpdater = AtomicIntegerFieldUpdater.newUpdater(fyg.class, "a");
            atomicIntegerFieldUpdater = atomicIntegerFieldUpdaterNewUpdater2;
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.CensusTracingModule", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdaterNewUpdater = null;
        }
        b = atomicIntegerFieldUpdater;
        f = atomicIntegerFieldUpdaterNewUpdater;
    }
}
