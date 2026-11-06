package flm;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fny {
    public final boolean b;
    public final boolean c;
    public final String[] d;
    public final String[] e;
    private static final fnx[] f = {fnx.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fnx.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fnx.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, fnx.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, fnx.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, fnx.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, fnx.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, fnx.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, fnx.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, fnx.TLS_RSA_WITH_AES_128_GCM_SHA256, fnx.TLS_RSA_WITH_AES_128_CBC_SHA, fnx.TLS_RSA_WITH_AES_256_CBC_SHA, fnx.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public static final fny a = new fnz(true).a(f).a(foi.TLS_1_2, foi.TLS_1_1, foi.TLS_1_0).a(true).a();

    fny(fnz fnzVar) {
        this.b = fnzVar.a;
        this.d = fnzVar.b;
        this.e = fnzVar.c;
        this.c = fnzVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fny)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        fny fnyVar = (fny) obj;
        if (this.b == fnyVar.b) {
            return !this.b || (Arrays.equals(this.d, fnyVar.d) && Arrays.equals(this.e, fnyVar.e) && this.c == fnyVar.c);
        }
        return false;
    }

    public final int hashCode() {
        if (!this.b) {
            return 17;
        }
        return (this.c ? 0 : 1) + ((((Arrays.hashCode(this.d) + 527) * 31) + Arrays.hashCode(this.e)) * 31);
    }

    public final String toString() {
        String string;
        String string2;
        List listA;
        List listA2 = null;
        if (!this.b) {
            return "ConnectionSpec()";
        }
        if (this.d != null) {
            if (this.d == null) {
                listA = null;
            } else {
                fnx[] fnxVarArr = new fnx[this.d.length];
                for (int i = 0; i < this.d.length; i++) {
                    fnxVarArr[i] = fnx.a(this.d[i]);
                }
                listA = foj.a(fnxVarArr);
            }
            string = listA.toString();
        } else {
            string = "[all enabled]";
        }
        if (this.e != null) {
            if (this.e != null) {
                foi[] foiVarArr = new foi[this.e.length];
                for (int i2 = 0; i2 < this.e.length; i2++) {
                    foiVarArr[i2] = foi.a(this.e[i2]);
                }
                listA2 = foj.a(foiVarArr);
            }
            string2 = listA2.toString();
        } else {
            string2 = "[all enabled]";
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + string2 + ", supportsTlsExtensions=" + this.c + ")";
    }

    static {
        new fnz(a).a(foi.TLS_1_0).a(true).a();
        new fnz(false).a();
    }
}
