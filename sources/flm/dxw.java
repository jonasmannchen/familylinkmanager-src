package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxw implements Serializable {
    public static final long serialVersionUID = 0;
    private final dxs a;

    dxw(dxs dxsVar) {
        this.a = dxsVar;
    }

    final Object readResolve() {
        return (dxx) this.a.entrySet();
    }
}
