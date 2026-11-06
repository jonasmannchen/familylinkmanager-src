package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdp extends gck {
    private final /* synthetic */ gdx a;
    private final /* synthetic */ gdn b;

    gdp(gdn gdnVar, gdx gdxVar) {
        this.b = gdnVar;
        this.a = gdxVar;
    }

    @Override // flm.gck
    final void a(gcb gcbVar) {
        this.b.c.y.remove(gcbVar);
        fsz.b(this.b.c.J.d, gcbVar);
        gda gdaVar = this.b.c;
        if (!gdaVar.E && gdaVar.C.get() && gdaVar.y.isEmpty() && gdaVar.z.isEmpty()) {
            gda.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", gdaVar.d);
            fsz.b(gdaVar.J.c, gdaVar);
            gdaVar.E = true;
            gdaVar.F.countDown();
            gdaVar.g.a(gdaVar.f);
            gdaVar.h.a();
            gdaVar.e.close();
        }
    }

    @Override // flm.gck
    final void a(fsb fsbVar) {
        gdn gdnVar = this.b;
        if (fsbVar.a == fsa.TRANSIENT_FAILURE || fsbVar.a == fsa.IDLE) {
            gdnVar.b.c();
        }
        if (this.b == this.b.c.v) {
            this.b.a.a(this.a, fsbVar);
        }
    }

    @Override // flm.gck
    final void b(gcb gcbVar) {
        this.b.c.R.a(gcbVar, true);
    }

    @Override // flm.gck
    final void c(gcb gcbVar) {
        this.b.c.R.a(gcbVar, false);
    }
}
