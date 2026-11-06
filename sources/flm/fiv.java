package flm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fiv {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public static Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    static Object a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
        return obj;
    }

    public static boolean a(byte[] bArr) {
        return fmc.a.a(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean a(fke fkeVar) {
        return false;
    }

    static Object a(Object obj, Object obj2) {
        return ((fke) obj).k().a((fke) obj2).g();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        fhk.a(b);
    }
}
