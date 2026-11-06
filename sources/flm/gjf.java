package flm;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjf {
    public final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;
    private static final gje[] f = {gje.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, gje.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, gje.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, gje.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, gje.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, gje.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, gje.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, gje.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, gje.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, gje.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, gje.TLS_RSA_WITH_AES_128_GCM_SHA256, gje.TLS_RSA_WITH_AES_128_CBC_SHA, gje.TLS_RSA_WITH_AES_256_CBC_SHA, gje.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public static final gjf a = new gjg(true).a(f).a(gjt.TLS_1_2, gjt.TLS_1_1, gjt.TLS_1_0).a(true).a();

    gjf(gjg gjgVar) {
        this.b = gjgVar.a;
        this.c = gjgVar.b;
        this.d = gjgVar.c;
        this.e = gjgVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gjf)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        gjf gjfVar = (gjf) obj;
        if (this.b == gjfVar.b) {
            return !this.b || (Arrays.equals(this.c, gjfVar.c) && Arrays.equals(this.d, gjfVar.d) && this.e == gjfVar.e);
        }
        return false;
    }

    public final int hashCode() {
        if (!this.b) {
            return 17;
        }
        return (this.e ? 0 : 1) + ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31);
    }

    public final String toString() {
        List listA;
        if (!this.b) {
            return "ConnectionSpec()";
        }
        if (this.c == null) {
            listA = null;
        } else {
            gje[] gjeVarArr = new gje[this.c.length];
            for (int i = 0; i < this.c.length; i++) {
                gjeVarArr[i] = gje.a(this.c[i]);
            }
            listA = gju.a(gjeVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        gjt[] gjtVarArr = new gjt[this.d.length];
        for (int i2 = 0; i2 < this.d.length; i2++) {
            gjtVarArr[i2] = gjt.a(this.d[i2]);
        }
        String strValueOf = String.valueOf(gju.a(gjtVarArr));
        return new StringBuilder(String.valueOf(string).length() + 72 + String.valueOf(strValueOf).length()).append("ConnectionSpec(cipherSuites=").append(string).append(", tlsVersions=").append(strValueOf).append(", supportsTlsExtensions=").append(this.e).append(")").toString();
    }

    static {
        new gjg(a).a(gjt.TLS_1_0).a(true).a();
        new gjg(false).a();
    }
}
