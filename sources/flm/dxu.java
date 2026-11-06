package flm;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dxu implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    dxu(dxs dxsVar) {
        this.a = new Object[dxsVar.size()];
        this.b = new Object[dxsVar.size()];
        int i = 0;
        eau eauVar = (eau) ((dxx) dxsVar.entrySet()).iterator();
        while (true) {
            int i2 = i;
            if (!eauVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eauVar.next();
            this.a[i2] = entry.getKey();
            this.b[i2] = entry.getValue();
            i = i2 + 1;
        }
    }

    Object readResolve() {
        return a(new dxt(this.a.length));
    }

    final Object a(dxt dxtVar) {
        for (int i = 0; i < this.a.length; i++) {
            dxtVar.a(this.a[i], this.b[i]);
        }
        return dxtVar.a();
    }
}
