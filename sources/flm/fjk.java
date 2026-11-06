package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fjk implements Map.Entry {
    public Map.Entry a;

    fjk(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((fjj) this.a.getValue()) == null) {
            return null;
        }
        return fjj.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof fke)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        fjj fjjVar = (fjj) this.a.getValue();
        fke fkeVar = fjjVar.b;
        fjjVar.a = null;
        fjjVar.c = null;
        fjjVar.b = (fke) obj;
        return fkeVar;
    }
}
