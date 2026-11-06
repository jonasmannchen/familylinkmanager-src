package flm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcn {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        dvl.a(inputStream);
        dvl.a(outputStream);
        byte[] bArr = new byte[16384];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }
}
