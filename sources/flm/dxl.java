package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxl extends dwl implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    dxl(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // flm.dwl, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // flm.dwl, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // flm.dwl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
