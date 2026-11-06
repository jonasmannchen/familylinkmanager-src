package flm;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdr implements fuk {
    public final gdn a;
    public final /* synthetic */ gda b;

    gdr(gda gdaVar, gdn gdnVar) {
        this.b = gdaVar;
        this.a = gdnVar;
    }

    @Override // flm.fuk
    public final void a(List list, frd frdVar) {
        if (list.isEmpty()) {
            fvc fvcVar = fvc.j;
            String strValueOf = String.valueOf(this.a.b);
            a(fvcVar.a(new StringBuilder(String.valueOf(strValueOf).length() + 37).append("Name resolver ").append(strValueOf).append(" returned an empty list").toString()));
            return;
        }
        if (gda.a.isLoggable(Level.FINE)) {
            gda.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onAddresses", "[{0}] resolved address: {1}, config={2}", new Object[]{this.b.d, list, frdVar});
        }
        if (this.b.I != null && (this.b.K == null || !this.b.K.booleanValue())) {
            fym fymVar = this.b.I;
            ftb ftbVar = new ftb();
            String strValueOf2 = String.valueOf(list);
            ftbVar.a = new StringBuilder(String.valueOf(strValueOf2).length() + 18).append("Address resolved: ").append(strValueOf2).toString();
            ftbVar.b = ftc.CT_INFO;
            fymVar.a(ftbVar.a(this.b.i.a()).a());
            this.b.K = true;
        }
        Map map = (Map) frdVar.a(gbg.a);
        if (this.b.I != null && map != null && !map.equals(this.b.L)) {
            fym fymVar2 = this.b.I;
            ftb ftbVar2 = new ftb();
            ftbVar2.a = "Service config changed";
            ftbVar2.b = ftc.CT_INFO;
            fymVar2.a(ftbVar2.a(this.b.i.a()).a());
            this.b.L = map;
        }
        this.a.a(new gdt(this, map, frdVar, list));
    }

    @Override // flm.fuk
    public final void a(fvc fvcVar) {
        dvl.a(!fvcVar.a(), "the error status must not be OK");
        gda.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onError", "[{0}] Failed to resolve name. status={1}", new Object[]{this.b.d, fvcVar});
        if (this.b.I != null && (this.b.K == null || this.b.K.booleanValue())) {
            fym fymVar = this.b.I;
            ftb ftbVar = new ftb();
            ftbVar.a = "Failed to resolve name";
            ftbVar.b = ftc.CT_WARNING;
            fymVar.a(ftbVar.a(this.b.i.a()).a());
            this.b.K = false;
        }
        this.b.k.a(new gds(this, fvcVar)).a();
    }
}
