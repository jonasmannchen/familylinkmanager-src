package flm;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class git {
    public final gjk c;
    public static final Logger a = Logger.getLogger(git.class.getName());
    private static final gjk d = gjk.b;
    public static git b = a(git.class.getClassLoader());

    git(gjk gjkVar) {
        this.c = (gjk) dvl.a(gjkVar, "platform");
    }

    private static git a(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
            z = true;
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
                z = true;
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                z = false;
            }
        }
        if (z) {
            return new giu(d);
        }
        return new git(d);
    }

    public String a(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strA = a(sSLSocket);
            if (strA == null) {
                String strValueOf = String.valueOf(list);
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf).length() + 44).append("TLS ALPN negotiation failed with protocols: ").append(strValueOf).toString());
            }
            this.c.a(sSLSocket);
            return strA;
        } catch (Throwable th) {
            this.c.a(sSLSocket);
            throw th;
        }
    }

    protected void b(SSLSocket sSLSocket, String str, List list) {
        this.c.a(sSLSocket, str, list);
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.b(sSLSocket);
    }
}
