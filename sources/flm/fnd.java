package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fnd {
    public final int a;
    public final byte[] b;

    fnd(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fnd)) {
            return false;
        }
        fnd fndVar = (fnd) obj;
        return this.a == fndVar.a && Arrays.equals(this.b, fndVar.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
