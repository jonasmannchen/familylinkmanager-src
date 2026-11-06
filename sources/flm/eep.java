package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class eep implements eet {
    eep() {
    }

    @Override // flm.eet
    public eet a(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }

    public final eet a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // flm.eet
    public eet a(byte[] bArr, int i, int i2) {
        dvl.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            a(bArr[i + i3]);
        }
        return this;
    }
}
