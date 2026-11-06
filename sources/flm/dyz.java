package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyz {
    public static Map.Entry a(Object obj, Object obj2) {
        return new dxl(obj, obj2);
    }

    static Object a(Map map, Object obj) {
        dvl.a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    static String a(Map map) {
        int size = map.size();
        dwq.a(size, "size");
        StringBuilder sbAppend = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L)).append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbAppend.append(", ");
            }
            z = false;
            sbAppend.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return sbAppend.append('}').toString();
    }

    static Object a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
}
