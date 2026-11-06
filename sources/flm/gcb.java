package flm;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcb implements ftf {
    public static final Logger a = Logger.getLogger(gcb.class.getName());
    public final fxp c;
    public final gck d;
    public final ScheduledExecutorService e;
    public final fsz f;
    public final fyl h;
    public gcl i;
    public fxo j;
    public final dvw k;
    public ScheduledFuture l;
    public boolean m;
    public fzj p;
    public volatile gec q;
    public fvc s;
    private final String t;
    private final String u;
    private final fzd v;
    private final fxs w;
    private final fym x;
    private final ghh y;
    public final ftg b = ftg.a(getClass().getName());
    public final Object g = new Object();
    public final Collection n = new ArrayList();
    public final gca o = new gcc(this);
    public fsb r = fsb.a(fsa.IDLE);

    gcb(List list, String str, String str2, fxp fxpVar, fzd fzdVar, ScheduledExecutorService scheduledExecutorService, dvz dvzVar, fyl fylVar, gck gckVar, fsz fszVar, fxs fxsVar, fym fymVar, ghh ghhVar) {
        dvl.a(list, "addressGroups");
        dvl.a(!list.isEmpty(), "addressGroups is empty");
        a(list, "addressGroups contains null entry");
        this.i = new gcl(Collections.unmodifiableList(new ArrayList(list)));
        this.t = str;
        this.u = str2;
        this.c = fxpVar;
        this.v = fzdVar;
        this.e = scheduledExecutorService;
        this.k = (dvw) dvzVar.a();
        this.h = fylVar;
        this.d = gckVar;
        this.f = fszVar;
        this.w = fxsVar;
        this.x = fymVar;
        this.y = ghhVar;
    }

    final fzb a() {
        gec gecVar = this.q;
        if (gecVar == null) {
            try {
                synchronized (this.g) {
                    gec gecVar2 = this.q;
                    if (gecVar2 != null) {
                        this.h.a();
                        return gecVar2;
                    }
                    if (this.r.a == fsa.IDLE) {
                        a(fsa.CONNECTING);
                        c();
                    }
                    this.h.a();
                    return null;
                }
            } catch (Throwable th) {
                this.h.a();
                throw th;
            }
        }
        return gecVar;
    }

    final void c() {
        SocketAddress socketAddress;
        gex gexVar;
        dvl.b(this.l == null, "Should have no reconnectTask scheduled");
        gcl gclVar = this.i;
        if (gclVar.b == 0 && gclVar.c == 0) {
            this.k.b().a();
        }
        SocketAddress socketAddressB = this.i.b();
        if (!(socketAddressB instanceof gey)) {
            socketAddress = socketAddressB;
            gexVar = null;
        } else {
            gex gexVar2 = ((gey) socketAddressB).b;
            socketAddress = ((gey) socketAddressB).a;
            gexVar = gexVar2;
        }
        fze fzeVar = new fze();
        fzeVar.a = (String) dvl.a(this.t, "authority");
        gcl gclVar2 = this.i;
        frd frdVar = ((fss) gclVar2.a.get(gclVar2.b)).b;
        dvl.a(frdVar, "eagAttributes");
        fzeVar.b = frdVar;
        fzeVar.c = this.u;
        fzeVar.d = gexVar;
        gch gchVar = new gch(this.v.a(socketAddress, fzeVar), this.w);
        fsz.a(this.f.e, gchVar);
        if (a.isLoggable(Level.FINE)) {
            a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel", "startNewTransport", "[{0}] Created {1} for {2}", new Object[]{this.b, gchVar.b(), socketAddress});
        }
        this.p = gchVar;
        this.n.add(gchVar);
        Runnable runnableA = gchVar.a(new gcm(this, gchVar, socketAddress));
        if (runnableA != null) {
            this.h.a(runnableA);
        }
    }

    final void a(fsa fsaVar) {
        a(fsb.a(fsaVar));
    }

    final void a(fsb fsbVar) {
        if (this.r.a != fsbVar.a) {
            boolean z = this.r.a != fsa.SHUTDOWN;
            String strValueOf = String.valueOf(fsbVar);
            dvl.b(z, new StringBuilder(String.valueOf(strValueOf).length() + 37).append("Cannot transition out of SHUTDOWN to ").append(strValueOf).toString());
            this.r = fsbVar;
            if (this.x != null) {
                fym fymVar = this.x;
                ftb ftbVar = new ftb();
                String strValueOf2 = String.valueOf(this.r);
                ftbVar.a = new StringBuilder(String.valueOf(strValueOf2).length() + 15).append("Entering ").append(strValueOf2).append(" state").toString();
                ftbVar.b = ftc.CT_INFO;
                fymVar.a(ftbVar.a(this.y.a()).a());
            }
            this.h.a(new gce(this, fsbVar));
        }
    }

    public final void a(fvc fvcVar) {
        try {
            synchronized (this.g) {
                if (this.r.a == fsa.SHUTDOWN) {
                    this.h.a();
                    return;
                }
                this.s = fvcVar;
                a(fsa.SHUTDOWN);
                gec gecVar = this.q;
                fzj fzjVar = this.p;
                this.q = null;
                this.p = null;
                this.i.a();
                if (this.n.isEmpty()) {
                    d();
                    if (a.isLoggable(Level.FINE)) {
                        a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel", "shutdown", "[{0}] Terminated in shutdown()", this.b);
                    }
                }
                e();
                this.h.a();
                if (gecVar != null) {
                    gecVar.a(fvcVar);
                }
                if (fzjVar != null) {
                    fzjVar.a(fvcVar);
                }
            }
        } catch (Throwable th) {
            this.h.a();
            throw th;
        }
    }

    public final String toString() {
        List list;
        synchronized (this.g) {
            list = this.i.a;
        }
        return dve.a(this).a("logId", this.b.a).a("addressGroups", list).toString();
    }

    final void d() {
        this.h.a(new gcf(this));
    }

    final void a(fzj fzjVar, boolean z) {
        this.h.a(new gcg(this, fzjVar, z)).a();
    }

    final void e() {
        if (this.l != null) {
            this.l.cancel(false);
            this.m = true;
            this.l = null;
            this.j = null;
        }
    }

    @Override // flm.ftk
    public final ftg b() {
        return this.b;
    }

    static void a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dvl.a(it.next(), str);
        }
    }
}
