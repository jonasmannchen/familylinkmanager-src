package flm;

import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fte {
    public fte(SSLSession sSLSession) {
        sSLSession.getCipherSuite();
        sSLSession.getLocalCertificates();
        try {
            sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            fsz.a.logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
        }
    }
}
