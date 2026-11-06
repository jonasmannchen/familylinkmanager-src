package flm;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bef extends SSLSocketFactory {
    private static final TrustManager[] b = {new beg()};
    private final Context i;
    private final int j;
    private SSLSocketFactory c = null;
    private SSLSocketFactory d = null;
    private TrustManager[] e = null;
    private KeyManager[] f = null;
    private byte[] g = null;
    public byte[] a = null;
    private PrivateKey h = null;
    private final boolean k = true;
    private final boolean l = true;
    private final String m = null;

    public bef(Context context, int i, boolean z, boolean z2, String str) {
        this.i = context.getApplicationContext();
        this.j = i;
    }

    private static void a(Socket socket, String str) throws IOException {
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Attempt to verify non-SSL socket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        sSLSocket.startHandshake();
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            throw new SSLException("Cannot verify SSL socket without session");
        }
        if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
            String strValueOf = String.valueOf(str);
            throw new SSLPeerUnverifiedException(strValueOf.length() != 0 ? "Cannot verify hostname: ".concat(strValueOf) : new String("Cannot verify hostname: "));
        }
    }

    private final synchronized SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory;
        if (!this.l) {
            if (this.c == null) {
                Log.w("SSLCertificateSocketFactory", "Bypassing SSL security checks at caller's request");
                this.c = beh.a().a(this.i, (KeyManager[]) null, b, this.k);
            }
            sSLSocketFactory = this.c;
        } else {
            if (this.m != null) {
                if (this.d == null) {
                    this.d = beh.a().a(this.i, (KeyManager[]) null, (TrustManager[]) null, this.m);
                }
            } else if (this.d == null) {
                this.d = beh.a().a(this.i, (KeyManager[]) null, (TrustManager[]) null, this.k);
            }
            sSLSocketFactory = this.d;
        }
        return sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = a().createSocket(socket, str, i, z);
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        if (this.l) {
            a(socketCreateSocket, str);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket socketCreateSocket = a().createSocket();
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketCreateSocket = a().createSocket(inetAddress, i, inetAddress2, i2);
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketCreateSocket = a().createSocket(inetAddress, i);
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = a().createSocket(str, i, inetAddress, i2);
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        if (this.l) {
            a(socketCreateSocket, str);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = a().createSocket(str, i);
        a(socketCreateSocket, (byte[]) null);
        b(socketCreateSocket, this.a);
        a(socketCreateSocket, this.j);
        a(socketCreateSocket, (PrivateKey) null);
        if (this.l) {
            a(socketCreateSocket, str);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return a().getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return a().getSupportedCipherSuites();
    }

    private static void a(Socket socket, byte[] bArr) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setNpnProtocols", byte[].class).invoke(socket, bArr);
            } catch (IllegalAccessException e) {
                e = e;
                String strValueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 35).append(strValueOf).append(" does not implement setNpnProtocols").toString(), e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                String strValueOf2 = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 35).append(strValueOf2).append(" does not implement setNpnProtocols").toString(), e);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String strValueOf3 = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf3).length() + 36).append("Failed to invoke setNpnProtocols on ").append(strValueOf3).toString(), e3);
            }
        }
    }

    private static void b(Socket socket, byte[] bArr) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setAlpnProtocols", byte[].class).invoke(socket, bArr);
            } catch (IllegalAccessException e) {
                e = e;
                String strValueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 36).append(strValueOf).append(" does not implement setAlpnProtocols").toString(), e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                String strValueOf2 = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 36).append(strValueOf2).append(" does not implement setAlpnProtocols").toString(), e);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String strValueOf3 = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf3).length() + 37).append("Failed to invoke setAlpnProtocols on ").append(strValueOf3).toString(), e3);
            }
        }
    }

    private static void a(Socket socket, int i) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setHandshakeTimeout", Integer.TYPE).invoke(socket, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e = e;
                String strValueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 45).append(strValueOf).append(" does not implement setSocketHandshakeTimeout").toString(), e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                String strValueOf2 = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 45).append(strValueOf2).append(" does not implement setSocketHandshakeTimeout").toString(), e);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String strValueOf3 = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf3).length() + 46).append("Failed to invoke setSocketHandshakeTimeout on ").append(strValueOf3).toString(), e3);
            }
        }
    }

    private static void a(Socket socket, PrivateKey privateKey) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setChannelIdPrivateKey", PrivateKey.class).invoke(socket, privateKey);
            } catch (IllegalAccessException e) {
                e = e;
                String strValueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 42).append(strValueOf).append(" does not implement setChannelIdPrivateKey").toString(), e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                String strValueOf2 = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 42).append(strValueOf2).append(" does not implement setChannelIdPrivateKey").toString(), e);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String strValueOf3 = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf3).length() + 43).append("Failed to invoke setChannelIdPrivateKey on ").append(strValueOf3).toString(), e3);
            }
        }
    }
}
