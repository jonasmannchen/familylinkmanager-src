package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fth {
    public static final Charset a = Charset.forName("US-ASCII");

    public static fuc a(String str, fti ftiVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return fuc.a(str, z, ftiVar);
    }

    public static ftv a(byte[]... bArr) {
        return new ftv(bArr);
    }

    public static byte[][] a(ftv ftvVar) {
        if ((ftvVar.c << 1) == ftvVar.a()) {
            return ftvVar.b;
        }
        byte[][] bArr = new byte[ftvVar.c << 1][];
        System.arraycopy(ftvVar.b, 0, bArr, 0, ftvVar.c << 1);
        return bArr;
    }

    public static int b(ftv ftvVar) {
        return ftvVar.c;
    }
}
