package flm;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbh {
    public static final boolean a;
    public static final fuc b;
    public static final fuc c;
    public static final fuc d;
    public static final fuc e;
    public static final fuc f;
    public static final fuc g;
    public static final fuc h;
    public static final fuc i;
    public static final long j;
    public static final ges k;
    public static final ges l;
    public static final gha m;
    public static final gha n;
    public static final dvz o;
    private static final Logger p = Logger.getLogger(gbh.class.getName());
    private static final frk q;

    public static boolean a(frj frjVar) {
        return !Boolean.TRUE.equals(frjVar.a(q));
    }

    public static fvc a(int i2) {
        fvd fvdVar;
        if (i2 >= 100 && i2 < 200) {
            fvdVar = fvd.INTERNAL;
        } else {
            switch (i2) {
                case 400:
                case 431:
                    fvdVar = fvd.INTERNAL;
                    break;
                case 401:
                    fvdVar = fvd.UNAUTHENTICATED;
                    break;
                case 403:
                    fvdVar = fvd.PERMISSION_DENIED;
                    break;
                case 404:
                    fvdVar = fvd.UNIMPLEMENTED;
                    break;
                case 429:
                case 502:
                case 503:
                case 504:
                    fvdVar = fvd.UNAVAILABLE;
                    break;
                default:
                    fvdVar = fvd.UNKNOWN;
                    break;
            }
        }
        return fvdVar.a().a(new StringBuilder(28).append("HTTP status code ").append(i2).toString());
    }

    public static boolean a(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char cCharAt = lowerCase.charAt(16);
        return cCharAt == '+' || cCharAt == ';';
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.17.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI b(String str) {
        dvl.a(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid authority: ".concat(strValueOf) : new String("Invalid authority: "), e2);
        }
    }

    public static String a(String str, int i2) {
        try {
            return new URI(null, null, str, i2, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 34).append("Invalid host or port: ").append(str).append(" ").append(i2).toString(), e2);
        }
    }

    public static ThreadFactory a(String str, boolean z) {
        if (a) {
            return eha.a();
        }
        ehc ehcVar = new ehc();
        ehcVar.b = true;
        ehc.a(str, 0);
        ehcVar.a = str;
        String str2 = ehcVar.a;
        return new ehd(Executors.defaultThreadFactory(), str2, str2 != null ? new AtomicLong(0L) : null, ehcVar.b, null, null);
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            return inetSocketAddress.getHostName();
        }
    }

    static fzb a(ftp ftpVar, boolean z) {
        ftr ftrVar = ftpVar.b;
        fzb fzbVarC = ftrVar != null ? ((fwv) ftrVar).c() : null;
        if (fzbVarC != null) {
            fru fruVar = ftpVar.c;
            if (fruVar != null) {
                return new gbm(fzbVarC, fruVar);
            }
            return fzbVarC;
        }
        if (!ftpVar.d.a()) {
            if (ftpVar.e) {
                return new gaz(ftpVar.d, dp.aM);
            }
            if (!z) {
                return new gaz(ftpVar.d, dp.aK);
            }
        }
        return null;
    }

    static void a(ghg ghgVar) {
        while (true) {
            InputStream inputStreamA = ghgVar.a();
            if (inputStreamA != null) {
                a(inputStreamA);
            } else {
                return;
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                p.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
            }
        }
    }

    private gbh() {
    }

    static {
        Charset.forName("US-ASCII");
        a = System.getProperty("com.google.appengine.runtime.environment") != null && "1.7".equals(System.getProperty("java.specification.version"));
        b = fuc.a("grpc-timeout", new gbp());
        c = fuc.a("grpc-encoding", ftv.a);
        d = fth.a("grpc-accept-encoding", new gbn());
        e = fuc.a("content-encoding", ftv.a);
        f = fth.a("accept-encoding", new gbn());
        g = fuc.a("content-type", ftv.a);
        h = fuc.a("te", ftv.a);
        i = fuc.a("user-agent", ftv.a);
        dvo.a(',').b();
        TimeUnit.MINUTES.toNanos(1L);
        j = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        k = new get();
        l = new gbi();
        q = frk.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        m = new gbj();
        n = new gbk();
        o = new gbl();
    }
}
