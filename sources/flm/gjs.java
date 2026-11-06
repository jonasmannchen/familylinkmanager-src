package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gjs {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    GRPC_EXP("grpc-exp");

    private final String f;

    gjs(String str) {
        this.f = str;
    }

    public static gjs a(String str) throws IOException {
        if (str.equals(HTTP_1_0.f)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f)) {
            return HTTP_2;
        }
        if (str.equals(GRPC_EXP.f)) {
            return GRPC_EXP;
        }
        if (str.equals(SPDY_3.f)) {
            return SPDY_3;
        }
        String strValueOf = String.valueOf(str);
        throw new IOException(strValueOf.length() != 0 ? "Unexpected protocol: ".concat(strValueOf) : new String("Unexpected protocol: "));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
