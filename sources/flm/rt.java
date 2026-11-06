package flm;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class rt extends so implements Map {
    private sc c;

    public rt() {
    }

    public rt(int i) {
        super(i);
    }

    public rt(so soVar) {
        super(soVar);
    }

    private final sc a() {
        if (this.c == null) {
            this.c = new ru(this);
        }
        return this.c;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a(this.b + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        sc scVarA = a();
        if (scVarA.a == null) {
            scVarA.a = new se(scVarA);
        }
        return scVarA.a;
    }

    @Override // java.util.Map
    public Set keySet() {
        return a().d();
    }

    @Override // java.util.Map
    public Collection values() {
        sc scVarA = a();
        if (scVarA.b == null) {
            scVarA.b = new sh(scVarA);
        }
        return scVarA.b;
    }
}
