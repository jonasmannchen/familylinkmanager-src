package flm;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfa {
    public static gez a(byte[] bArr, int i, int i2) {
        return new gfc(bArr, i, i2);
    }

    public static gez a(ByteBuffer byteBuffer) {
        return new gfd(byteBuffer);
    }

    public static String a(gez gezVar, Charset charset) {
        dvl.a(charset, "charset");
        dvl.a(gezVar, "buffer");
        int iA = gezVar.a();
        byte[] bArr = new byte[iA];
        gezVar.a(bArr, 0, iA);
        return new String(bArr, charset);
    }

    public static InputStream a(gez gezVar, boolean z) {
        return new gfb(gezVar);
    }

    static {
        new gfc(new byte[0]);
    }
}
