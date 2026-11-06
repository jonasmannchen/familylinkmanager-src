package flm;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gie extends fwp {
    public static final gha a;
    private static final gjf b;
    private gjf A;
    private gig B;
    private long C;
    private long D;
    private int E;
    private int F;
    private Executor c;
    private ScheduledExecutorService d;
    private SSLSocketFactory z;

    public static gie a(String str, int i) {
        return new gie(str, i);
    }

    public static gie forTarget(String str) {
        return new gie(str);
    }

    private gie(String str, int i) {
        this(gbh.a(str, i));
    }

    private gie(String str) {
        super(str);
        this.A = b;
        this.B = gig.TLS;
        this.C = Long.MAX_VALUE;
        this.D = gbh.j;
        this.E = 65535;
        this.F = Integer.MAX_VALUE;
    }

    public final gie transportExecutor(Executor executor) {
        this.c = executor;
        return this;
    }

    public final gie sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.z = sSLSocketFactory;
        this.B = gig.TLS;
        return this;
    }

    public final gie scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.d = (ScheduledExecutorService) dvl.a(scheduledExecutorService, "scheduledExecutorService");
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwp
    public final fzd a() {
        return new gih(this.c, this.d, e(), null, this.A, this.x, this.C != Long.MAX_VALUE, this.C, this.D, this.E, false, this.F, this.w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwp
    public final frd d() {
        int i;
        switch (this.B.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                i = 443;
                break;
            case 1:
                i = 80;
                break;
            default:
                String strValueOf = String.valueOf(this.B);
                throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 12).append(strValueOf).append(" not handled").toString());
        }
        return frd.a().a(fuj.a, Integer.valueOf(i)).a();
    }

    private final SSLSocketFactory e() {
        SSLContext sSLContext;
        switch (this.B.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                try {
                    if (this.z == null) {
                        if (gbh.a) {
                            sSLContext = SSLContext.getInstance("TLS", gjk.b.c);
                            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            trustManagerFactory.init((KeyStore) null);
                            sSLContext.init(null, trustManagerFactory.getTrustManagers(), SecureRandom.getInstance("SHA1PRNG", gjk.b.c));
                        } else {
                            sSLContext = SSLContext.getInstance("Default", gjk.b.c);
                        }
                        this.z = sSLContext.getSocketFactory();
                    }
                    return this.z;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            case 1:
                return null;
            default:
                String strValueOf = String.valueOf(this.B);
                throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf).length() + 26).append("Unknown negotiation type: ").append(strValueOf).toString());
        }
    }

    @Override // flm.ftu
    public final /* synthetic */ ftu c() {
        this.B = gig.PLAINTEXT;
        return this;
    }

    @Override // flm.ftu
    @Deprecated
    public final /* synthetic */ ftu a(boolean z) {
        if (z) {
            gid gidVar = gid.PLAINTEXT;
            dvl.a(gidVar, "type");
            switch (gidVar.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    this.B = gig.TLS;
                    return this;
                case 1:
                    this.B = gig.PLAINTEXT;
                    return this;
                default:
                    String strValueOf = String.valueOf(gidVar);
                    throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 26).append("Unknown negotiation type: ").append(strValueOf).toString());
            }
        }
        throw new IllegalArgumentException("Plaintext negotiation not currently supported");
    }

    static {
        new fnz(fny.a).a(fnx.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fnx.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fnx.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fnx.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fnx.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, fnx.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, fnx.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, fnx.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).a(foi.TLS_1_2).a(true).a();
        b = new gjg(gjf.a).a(gje.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, gje.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, gje.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, gje.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, gje.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, gje.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, gje.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, gje.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).a(gjt.TLS_1_2).a(true).a();
        TimeUnit.DAYS.toNanos(1000L);
        a = new gif();
    }
}
