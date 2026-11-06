package flm;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class get implements ges {
    public static final Logger a = Logger.getLogger(get.class.getName());
    private static final gew b = new geu();
    private static final dvz c = new gev();
    private final dvz d;
    private final gew e;
    private final gex f;

    public get() {
        this(c, b, System.getenv("GRPC_PROXY_EXP"));
    }

    private get(dvz dvzVar, gew gewVar, String str) {
        InetSocketAddress inetSocketAddress;
        this.d = (dvz) dvl.a(dvzVar);
        this.e = (gew) dvl.a(gewVar);
        if (str != null) {
            if (str == null) {
                inetSocketAddress = null;
            } else {
                String[] strArrSplit = str.split(":", 2);
                int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
                inetSocketAddress = new InetSocketAddress(strArrSplit[0], i);
            }
            this.f = new gex(inetSocketAddress, null, null);
            return;
        }
        this.f = null;
    }

    @Override // flm.ges
    public final gex a(SocketAddress socketAddress) {
        if (this.f != null) {
            return this.f;
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        return a((InetSocketAddress) socketAddress);
    }

    private final gex a(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, gbh.a(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.d.a();
                if (proxySelector == null) {
                    a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationA = this.e.a(gbh.a(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                if (passwordAuthenticationA == null) {
                    return new gex(inetSocketAddress2, null, null);
                }
                return new gex(inetSocketAddress2, passwordAuthenticationA.getUserName(), new String(passwordAuthenticationA.getPassword()));
            } catch (URISyntaxException e) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
