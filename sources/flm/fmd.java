package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fmd {
    /* JADX INFO: Access modifiers changed from: private */
    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) throws fjg {
        if (a(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || a(b3)))) {
            throw fjg.j();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws fjg {
        if (a(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || a(b3) || a(b4)) {
            throw fjg.j();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) (55232 + (i2 >>> 10));
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    static boolean a(byte b) {
        return b > -65;
    }
}
