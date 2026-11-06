package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eer extends eeq implements Serializable {
    public static final long serialVersionUID = 0;
    private final int a;

    eer(int i) {
        this.a = i;
    }

    @Override // flm.eeq
    public final int a() {
        return 32;
    }

    @Override // flm.eeq
    public final byte[] c() {
        return new byte[]{(byte) this.a, (byte) (this.a >> 8), (byte) (this.a >> 16), this.a >> 24};
    }

    @Override // flm.eeq
    public final int b() {
        return this.a;
    }

    @Override // flm.eeq
    final boolean a(eeq eeqVar) {
        return this.a == eeqVar.b();
    }
}
