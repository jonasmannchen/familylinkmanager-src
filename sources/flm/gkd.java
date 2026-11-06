package flm;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkd implements gkl {
    public static final Logger a = Logger.getLogger(gkf.class.getName());
    public static final guf b = guf.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    @Override // flm.gkl
    public final gjw a(gue gueVar, boolean z) {
        return new gkg(gueVar, 4096, true);
    }

    @Override // flm.gkl
    public final gjy a(gud gudVar, boolean z) {
        return new gkh(gudVar, true);
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s > i) {
            throw b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        }
        return (short) (i - s);
    }

    static int a(gue gueVar) {
        return ((gueVar.c() & 255) << 16) | ((gueVar.c() & 255) << 8) | (gueVar.c() & 255);
    }

    static void a(gud gudVar, int i) {
        gudVar.d((i >>> 16) & 255);
        gudVar.d((i >>> 8) & 255);
        gudVar.d(i & 255);
    }
}
