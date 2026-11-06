package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqj extends aqi {
    private final byte[] a;

    public aqj(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // flm.aqi
    final byte[] a() {
        return this.a;
    }
}
