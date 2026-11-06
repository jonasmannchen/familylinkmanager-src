package flm;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqp extends aqk {
    private final String a;

    aqp(String str) {
        super(b(str));
        this.a = str;
    }

    private static byte[] b(String str) {
        try {
            return str.substring(0, 25).getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // flm.aqk
    protected final byte[] b() {
        return aqi.a(this.a);
    }
}
