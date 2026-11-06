package flm;

import java.net.Socket;
import java.net.URI;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class giq implements Runnable {
    private final /* synthetic */ gin a;

    giq(gin ginVar) {
        this.a = ginVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        gue gueVarA;
        Socket socket;
        SSLSession session;
        if (this.a.b == null) {
            Runnable runnable = this.a.D;
            gin ginVar = this.a;
            gin ginVar2 = this.a;
            gin ginVar3 = this.a;
            ginVar.l = new gis(ginVar2, null);
            this.a.j.execute(this.a.l);
            synchronized (this.a.h) {
                this.a.s = Integer.MAX_VALUE;
                this.a.c();
            }
            gho ghoVar = this.a.f;
            gin ginVar4 = this.a;
            ghoVar.a((gjy) null, this.a.r);
            this.a.E.a((Object) null);
            return;
        }
        gir girVar = new gir();
        gue gueVarA2 = gug.a(girVar);
        gkd gkdVar = new gkd();
        try {
            try {
                try {
                    Socket socket2 = this.a.C == null ? new Socket(this.a.b.getAddress(), this.a.b.getPort()) : this.a.a(this.a.b, this.a.C.a, this.a.C.b, this.a.C.c);
                    if (this.a.p != null) {
                        SSLSocketFactory sSLSocketFactory = this.a.p;
                        HostnameVerifier hostnameVerifier = this.a.q;
                        gin ginVar5 = this.a;
                        URI uriB = gbh.b(ginVar5.c);
                        String host = uriB.getHost() != null ? uriB.getHost() : ginVar5.c;
                        gin ginVar6 = this.a;
                        URI uriB2 = gbh.b(ginVar6.c);
                        SSLSocket sSLSocketA = giw.a(sSLSocketFactory, hostnameVerifier, socket2, host, uriB2.getPort() != -1 ? uriB2.getPort() : ginVar6.b.getPort(), this.a.u);
                        socket = sSLSocketA;
                        session = sSLSocketA.getSession();
                    } else {
                        socket = socket2;
                        session = null;
                    }
                    socket.setTcpNoDelay(true);
                    gueVarA = gug.a(gug.b(socket));
                    try {
                        gud gudVarA = gug.a(gug.a(socket));
                        this.a.m = frd.a().a(fsy.a, socket.getRemoteSocketAddress()).a(fsy.b, socket.getLocalSocketAddress()).a(fsy.c, session).a(gbg.c, session == null ? fuw.NONE : fuw.PRIVACY_AND_INTEGRITY).a();
                        this.a.l = new gis(this.a, gkdVar.a(gueVarA, true));
                        this.a.j.execute(this.a.l);
                        synchronized (this.a.h) {
                            this.a.r = (Socket) dvl.a(socket, "socket");
                            this.a.s = Integer.MAX_VALUE;
                            this.a.c();
                            if (session != null) {
                                gin ginVar7 = this.a;
                                new ftd(new fte(session));
                            }
                        }
                        gjy gjyVarA = gkdVar.a(gudVarA, true);
                        this.a.f.a(gjyVarA, this.a.r);
                        try {
                            gjyVarA.a();
                            gjyVarA.b(new gkk());
                        } catch (Exception e) {
                            this.a.a(e);
                        }
                    } catch (fvg e2) {
                        e = e2;
                        this.a.a(0, gjv.INTERNAL_ERROR, e.a);
                        this.a.l = new gis(this.a, gkdVar.a(gueVarA, true));
                        this.a.j.execute(this.a.l);
                    } catch (Exception e3) {
                        e = e3;
                        gueVarA2 = gueVarA;
                        this.a.a(e);
                        this.a.l = new gis(this.a, gkdVar.a(gueVarA2, true));
                        this.a.j.execute(this.a.l);
                    }
                } catch (fvg e4) {
                    e = e4;
                    gueVarA = gueVarA2;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th) {
                th = th;
                gueVarA2 = girVar;
                this.a.l = new gis(this.a, gkdVar.a(gueVarA2, true));
                this.a.j.execute(this.a.l);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
