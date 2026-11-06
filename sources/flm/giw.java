package flm;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class giw {
    private static final List a = Collections.unmodifiableList(Arrays.asList(gjs.GRPC_EXP, gjs.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, gjf gjfVar) throws SSLPeerUnverifiedException {
        String[] strArr;
        dvl.a(sSLSocketFactory, "sslSocketFactory");
        dvl.a(socket, "socket");
        dvl.a(gjfVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        if (gjfVar.c != null) {
            strArr = (String[]) gju.a(String.class, gjfVar.c, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        gjf gjfVarA = new gjg(gjfVar).a(strArr).b((String[]) gju.a(String.class, gjfVar.d, sSLSocket.getEnabledProtocols())).a();
        sSLSocket.setEnabledProtocols(gjfVarA.d);
        String[] strArr2 = gjfVarA.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        String strA = git.b.a(sSLSocket, str, gjfVar.e ? a : null);
        boolean zContains = a.contains(gjs.a(strA));
        String strValueOf = String.valueOf(a);
        dvl.b(zContains, new StringBuilder(String.valueOf(strValueOf).length() + 50).append("Only ").append(strValueOf).append(" are supported, but negotiated protocol is %s").toString(), strA);
        if (hostnameVerifier == null) {
            hostnameVerifier = gji.a;
        }
        if (hostnameVerifier.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        String strValueOf2 = String.valueOf(str);
        throw new SSLPeerUnverifiedException(strValueOf2.length() != 0 ? "Cannot verify hostname: ".concat(strValueOf2) : new String("Cannot verify hostname: "));
    }
}
