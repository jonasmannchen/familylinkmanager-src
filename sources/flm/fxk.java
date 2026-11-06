package flm;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxk extends ftm {
    private final fto a;
    private ftm b;
    private ftn c = fus.a;
    private fym d;
    private final ghh e;

    fxk(fto ftoVar, fym fymVar, ghh ghhVar) {
        this.a = ftoVar;
        this.b = this.c.a(ftoVar);
        this.d = fymVar;
        this.e = ghhVar;
        if (fymVar != null) {
            dvl.a(ghhVar, "timeProvider");
        }
    }

    @Override // flm.ftm
    public final void a(List list, frd frdVar) {
        try {
            ftn ftnVarA = a(list, (Map) frdVar.a(gbg.a));
            if (ftnVarA != null && ftnVarA != this.c) {
                this.a.a(fsa.CONNECTING, new fxl());
                this.b.a();
                this.c = ftnVarA;
                ftm ftmVar = this.b;
                this.b = this.c.a(this.a);
                if (this.d != null) {
                    fym fymVar = this.d;
                    ftb ftbVar = new ftb();
                    String strValueOf = String.valueOf(ftmVar);
                    String strValueOf2 = String.valueOf(this.b);
                    ftbVar.a = new StringBuilder(String.valueOf(strValueOf).length() + 31 + String.valueOf(strValueOf2).length()).append("Load balancer changed from ").append(strValueOf).append(" to ").append(strValueOf2).toString();
                    ftbVar.b = ftc.CT_INFO;
                    fymVar.a(ftbVar.a(this.e.a()).a());
                }
            }
            this.b.a(list, frdVar);
        } catch (RuntimeException e) {
            this.a.a(fsa.TRANSIENT_FAILURE, new fxm(fvc.i.a("Failed to pick a load balancer from service config").b(e)));
            this.b.a();
            this.c = null;
            this.b = new fxn();
        }
    }

    @Override // flm.ftm
    public final void a(fvc fvcVar) {
        this.b.a(fvcVar);
    }

    @Override // flm.ftm
    public final void a(ftr ftrVar, fsb fsbVar) {
        this.b.a(ftrVar, fsbVar);
    }

    @Override // flm.ftm
    public final void a() {
        this.b.a();
        this.b = null;
    }

    private static ftn a(List list, Map map) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((fss) it.next()).b.a(gbg.b) != null) {
                z = true;
                break;
            }
        }
        if (z) {
            try {
                return (ftn) Class.forName("io.grpc.grpclb.GrpclbLoadBalancerFactory").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException("Can't get GRPCLB, but balancer addresses were present", e2);
            }
        }
        String strT = map != null ? ggv.t(map) : null;
        if (strT != null) {
            if (strT.toUpperCase(Locale.ROOT).equals("ROUND_ROBIN")) {
                try {
                    return (ftn) Class.forName("io.grpc.util.RoundRobinLoadBalancerFactory").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception e4) {
                    throw new RuntimeException("Can't get Round Robin LB", e4);
                }
            }
            String strValueOf = String.valueOf(strT);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown service config policy: ".concat(strValueOf) : new String("Unknown service config policy: "));
        }
        return fus.a;
    }
}
