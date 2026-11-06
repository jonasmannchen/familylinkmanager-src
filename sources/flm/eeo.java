package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class eeo implements ees {
    eeo() {
    }

    @Override // flm.ees
    public eeq a(CharSequence charSequence, Charset charset) {
        return a().a(charSequence, charset).a();
    }

    public final eeq a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public eeq a(byte[] bArr, int i, int i2) {
        dvl.a(0, i2 + 0, bArr.length);
        dvl.a(i2 >= 0, "expectedInputSize must be >= 0 but was %s", i2);
        return a().a(bArr, 0, i2).a();
    }
}
