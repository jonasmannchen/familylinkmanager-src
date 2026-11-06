package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gjt {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String d;

    gjt(String str) {
        this.d = str;
    }

    public static gjt a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unexpected TLS version: ".concat(strValueOf) : new String("Unexpected TLS version: "));
    }
}
