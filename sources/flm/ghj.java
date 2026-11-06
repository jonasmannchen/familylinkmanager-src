package flm;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghj {
    private static final Logger a = Logger.getLogger(ghj.class.getName());
    private static final byte[] b = "-bin".getBytes(dva.a);

    public static byte[][] a(ftv ftvVar) {
        boolean z;
        byte[][] bArrA = fth.a(ftvVar);
        if (bArrA == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < bArrA.length; i2 += 2) {
            byte[] bArr = bArrA[i2];
            byte[] bArr2 = bArrA[i2 + 1];
            if (a(bArr, b)) {
                bArrA[i] = bArr;
                bArrA[i + 1] = eex.a.a(bArr2).getBytes(dva.a);
                i += 2;
            } else {
                int length = bArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = true;
                        break;
                    }
                    byte b2 = bArr2[i3];
                    if (b2 < 32 || b2 > 126) {
                        z = false;
                        break;
                    }
                    i3++;
                }
                if (z) {
                    bArrA[i] = bArr;
                    bArrA[i + 1] = bArr2;
                    i += 2;
                } else {
                    String str = new String(bArr, dva.a);
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String string = Arrays.toString(bArr2);
                    logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(string).length()).append("Metadata key=").append(str).append(", value=").append(string).append(" contains invalid ASCII characters").toString());
                }
            }
        }
        return i == bArrA.length ? bArrA : (byte[][]) Arrays.copyOfRange(bArrA, 0, i);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            bArr[i] = bArr2;
            if (a(bArr2, b)) {
                bArr[i + 1] = eex.a.a(new String(bArr3, dva.a));
            }
        }
        return bArr;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private ghj() {
    }
}
