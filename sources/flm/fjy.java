package flm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjy extends LinkedHashMap {
    public static final fjy b;
    public boolean a;

    private fjy() {
        this.a = true;
    }

    private fjy(Map map) {
        super(map);
        this.a = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        fiv.a(obj);
        fiv.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            fiv.a(obj);
            fiv.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        boolean zEquals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!map.containsKey(entry.getKey())) {
                            z = false;
                            break;
                        }
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                            zEquals = Arrays.equals((byte[]) value, (byte[]) obj2);
                        } else {
                            zEquals = value.equals(obj2);
                        }
                        if (!zEquals) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return fiv.c((byte[]) obj);
        }
        if (obj instanceof fiy) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        Iterator it = entrySet().iterator();
        while (true) {
            int i = iA;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                iA = (a(entry.getValue()) ^ a(entry.getKey())) + i;
            } else {
                return i;
            }
        }
    }

    public final fjy a() {
        return isEmpty() ? new fjy() : new fjy(this);
    }

    final void b() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        fjy fjyVar = new fjy();
        b = fjyVar;
        fjyVar.a = false;
    }
}
