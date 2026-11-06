package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eex {
    public static final eex a = new efa("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final eex b;

    eex() {
    }

    abstract int a(int i);

    abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract eex a();

    abstract void a(Appendable appendable, byte[] bArr, int i, int i2);

    abstract int b(int i);

    public final String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private final String a(byte[] bArr, int i, int i2) {
        dvl.a(0, i2 + 0, bArr.length);
        StringBuilder sb = new StringBuilder(a(i2));
        try {
            a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            CharSequence charSequenceB = b(charSequence);
            byte[] bArr = new byte[b(charSequenceB.length())];
            int iA = a(bArr, charSequenceB);
            if (iA != bArr.length) {
                byte[] bArr2 = new byte[iA];
                System.arraycopy(bArr, 0, bArr2, 0, iA);
                return bArr2;
            }
            return bArr;
        } catch (efb e) {
            throw new IllegalArgumentException(e);
        }
    }

    CharSequence b(CharSequence charSequence) {
        return (CharSequence) dvl.a(charSequence);
    }

    static {
        new efa("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new efc("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new efc("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        b = new eez("base16()", "0123456789ABCDEF");
    }
}
