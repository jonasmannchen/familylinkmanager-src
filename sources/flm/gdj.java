package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdj implements ged {
    private final /* synthetic */ gda a;

    gdj(gda gdaVar) {
        this.a = gdaVar;
    }

    @Override // flm.ged
    public final void a(fvc fvcVar) {
        dvl.b(this.a.C.get(), "Channel must have been shut down");
    }

    @Override // flm.ged
    public final void a() {
    }

    @Override // flm.ged
    public final void a(boolean z) {
        this.a.R.a(this.a.A, z);
    }

    @Override // flm.ged
    public final void b() {
        dvl.b(this.a.C.get(), "Channel must have been shut down");
        this.a.D = true;
        this.a.a(false);
        gda gdaVar = this.a;
        gda gdaVar2 = this.a;
        if (!gdaVar2.E && gdaVar2.C.get() && gdaVar2.y.isEmpty() && gdaVar2.z.isEmpty()) {
            gda.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", gdaVar2.d);
            fsz.b(gdaVar2.J.c, gdaVar2);
            gdaVar2.E = true;
            gdaVar2.F.countDown();
            gdaVar2.g.a(gdaVar2.f);
            gdaVar2.h.a();
            gdaVar2.e.close();
        }
    }
}
