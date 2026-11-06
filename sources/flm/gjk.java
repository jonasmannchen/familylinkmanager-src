package flm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gjk {
    public final Provider c;
    public static final Logger a = Logger.getLogger(gjk.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final gjk b = b();

    public gjk(Provider provider) {
        this.c = provider;
    }

    public int a() {
        return dp.aX;
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public void a(SSLSocket sSLSocket) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    private static gjk b() {
        Provider providerE;
        Method method;
        Method method2;
        int i;
        if (!gbh.a) {
            Provider[] providers = Security.getProviders();
            int length = providers.length;
            int i2 = 0;
            loop0: while (true) {
                if (i2 < length) {
                    providerE = providers[i2];
                    for (String str : d) {
                        if (str.equals(providerE.getClass().getName())) {
                            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                            break loop0;
                        }
                    }
                    i2++;
                } else {
                    a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                    providerE = null;
                    break;
                }
            }
        } else {
            providerE = e();
        }
        if (providerE != null) {
            gjj gjjVar = new gjj(null, "setUseSessionTickets", Boolean.TYPE);
            gjj gjjVar2 = new gjj(null, "setHostname", String.class);
            gjj gjjVar3 = new gjj(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            gjj gjjVar4 = new gjj(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException e) {
                    method2 = null;
                } catch (NoSuchMethodException e2) {
                    method2 = null;
                }
            } catch (ClassNotFoundException e3) {
                method = null;
            } catch (NoSuchMethodException e4) {
                method = null;
            }
            if (gbh.a || providerE.getName().equals("GmsCore_OpenSSL") || providerE.getName().equals("Conscrypt") || providerE.getName().equals("Ssl_Guard") || c()) {
                i = dp.aV;
            } else if (d()) {
                i = dp.aW;
            } else {
                i = dp.aX;
            }
            return new gjo(gjjVar, gjjVar2, method, method2, gjjVar3, gjjVar4, providerE, i);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new gjl())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new gjp(provider, (Method) AccessController.doPrivileged(new gjm()), (Method) AccessController.doPrivileged(new gjn()));
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException e5) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new gjq(cls2.getMethod("put", SSLSocket.class, Class.forName(String.valueOf("org.eclipse.jetty.alpn.ALPN").concat("$Provider"))), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName(String.valueOf("org.eclipse.jetty.alpn.ALPN").concat("$ClientProvider")), Class.forName(String.valueOf("org.eclipse.jetty.alpn.ALPN").concat("$ServerProvider")), provider);
                } catch (ClassNotFoundException | NoSuchMethodException e6) {
                    return new gjk(provider);
                }
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static boolean c() {
        try {
            gjk.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
            return false;
        }
    }

    private static boolean d() {
        try {
            gjk.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e);
            return false;
        }
    }

    private static Provider e() {
        try {
            return (Provider) Class.forName("org.conscrypt.OpenSSLProvider").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException("Unable to load conscrypt security provider", th);
        }
    }

    public static byte[] a(List list) {
        guc gucVar = new guc();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gjs gjsVar = (gjs) list.get(i);
            if (gjsVar != gjs.HTTP_1_0) {
                int length = gjsVar.toString().length();
                gum gumVarA = gucVar.a(1);
                byte[] bArr = gumVarA.a;
                int i2 = gumVarA.c;
                gumVarA.c = i2 + 1;
                bArr[i2] = (byte) length;
                gucVar.c++;
                String string = gjsVar.toString();
                gucVar.a(string, 0, string.length());
            }
        }
        return gucVar.h();
    }
}
