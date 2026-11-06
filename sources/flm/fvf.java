package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvf implements fue {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    fvf() {
    }

    private static boolean a(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    private static String b(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] == 37 && i + 2 < bArr.length) {
                try {
                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, dva.a), 16));
                    i += 3;
                } catch (NumberFormatException e) {
                    byteBufferAllocate.put(bArr[i]);
                    i++;
                }
            }
            byteBufferAllocate.put(bArr[i]);
            i++;
        }
        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), dva.b);
    }

    @Override // flm.fue
    public final /* synthetic */ Object a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                return b(bArr);
            }
        }
        return new String(bArr, 0);
    }

    @Override // flm.fue
    public final /* synthetic */ byte[] a(Object obj) {
        byte[] bytes = ((String) obj).getBytes(dva.b);
        int i = 0;
        while (i < bytes.length) {
            if (a(bytes[i])) {
                byte[] bArr = new byte[((bytes.length - i) * 3) + i];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                for (int i2 = i; i2 < bytes.length; i2++) {
                    byte b = bytes[i2];
                    if (a(b)) {
                        bArr[i] = 37;
                        bArr[i + 1] = a[(b >> 4) & 15];
                        bArr[i + 2] = a[b & 15];
                        i += 3;
                    } else {
                        bArr[i] = b;
                        i++;
                    }
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                return bArr2;
            }
            i++;
        }
        return bytes;
    }
}
