package flm;

import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class giu extends git {
    private static final gjj d = new gjj(null, "setUseSessionTickets", Boolean.TYPE);
    private static final gjj e = new gjj(null, "setHostname", String.class);
    private static final gjj f = new gjj(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final gjj g = new gjj(null, "setAlpnProtocols", byte[].class);
    private static final gjj h = new gjj(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final gjj i = new gjj(null, "setNpnProtocols", byte[].class);

    giu(gjk gjkVar) {
        super(gjkVar);
    }

    @Override // flm.git
    public final String a(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        if (strA == null) {
            return super.a(sSLSocket, str, list);
        }
        return strA;
    }

    @Override // flm.git
    protected final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            d.a(sSLSocket, true);
            e.a(sSLSocket, str);
        }
        Object[] objArr = {gjk.a(list)};
        if (this.c.a() == dp.aV) {
            g.b(sSLSocket, objArr);
        }
        if (this.c.a() != dp.aX) {
            i.b(sSLSocket, objArr);
            return;
        }
        throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }

    @Override // flm.git
    public final String a(SSLSocket sSLSocket) {
        if (this.c.a() == dp.aV) {
            try {
                byte[] bArr = (byte[]) f.b(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, gju.b);
                }
            } catch (Exception e2) {
                git.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e2);
            }
        }
        if (this.c.a() != dp.aX) {
            try {
                byte[] bArr2 = (byte[]) h.b(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, gju.b);
                }
            } catch (Exception e3) {
                git.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e3);
            }
        }
        return null;
    }
}
