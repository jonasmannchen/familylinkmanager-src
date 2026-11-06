package flm;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epm {
    public static epn a(String str, long j, long j2, long j3, long j4, String str2) {
        Mac macA = a(str);
        long j5 = j / j4;
        long jMax = Math.max(j3, j2) / j4;
        long j6 = j2 / j4;
        long j7 = 0;
        while (j7 <= jMax) {
            long j8 = j5 - j7;
            if (a(macA, j8).equals(str2)) {
                long j9 = j8 * j4;
                return j7 < j6 ? epn.a(j9) : epn.b(j9);
            }
            long j10 = j5 + j7;
            if (a(macA, j10).equals(str2)) {
                long j11 = j10 * j4;
                return j7 < j6 ? epn.a(j11) : epn.b(j11);
            }
            j7++;
        }
        return new epj(false, false, -1L);
    }

    private static Mac a(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "RAW"));
            return mac;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("OneTimePasswordUtils failed to generate OTP.", e);
        }
    }

    private static String a(Mac mac, long j) {
        byte[] bArrDoFinal = mac.doFinal(ByteBuffer.allocate(8).putLong(j).array());
        int i = bArrDoFinal[bArrDoFinal.length - 1] & 15;
        return String.format(Locale.US, "%06d", Integer.valueOf(((bArrDoFinal[i + 3] & 255) | ((((bArrDoFinal[i] & 127) << 24) | ((bArrDoFinal[i + 1] & 255) << 16)) | ((bArrDoFinal[i + 2] & 255) << 8))) % 1000000));
    }
}
