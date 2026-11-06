package flm;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public HashMap a = new HashMap();

    @Override // flm.g
    protected final j a(Object obj) {
        return (j) this.a.get(obj);
    }

    @Override // flm.g
    public final Object a(Object obj, Object obj2) {
        j jVarA = a(obj);
        if (jVarA != null) {
            return jVarA.b;
        }
        this.a.put(obj, b(obj, obj2));
        return null;
    }

    @Override // flm.g
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
