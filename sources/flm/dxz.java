package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxz implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    dxz(Object[] objArr) {
        this.a = objArr;
    }

    final Object readResolve() {
        return dxx.a(this.a);
    }
}
