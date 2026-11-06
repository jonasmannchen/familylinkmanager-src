package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bih {
    public static List a(int i, Object obj) {
        ArrayList arrayList = new ArrayList(Math.max(1, 1));
        arrayList.add(obj);
        return arrayList;
    }

    public static Set a(int i, boolean z) {
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            return new rv(i);
        }
        return new HashSet(i, f);
    }

    public static Map a(Object[] objArr, Object[] objArr2) {
        Map map;
        if (objArr.length != objArr2.length) {
            int length = objArr.length;
            throw new IllegalArgumentException(new StringBuilder(66).append("Key and values array lengths not equal: ").append(length).append(" != ").append(objArr2.length).toString());
        }
        switch (objArr.length) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return Collections.emptyMap();
            case 1:
                return Collections.singletonMap(objArr[0], objArr2[0]);
            default:
                int length2 = objArr.length;
                if (length2 <= 256) {
                    map = new rt(length2);
                } else {
                    map = new HashMap(length2, 1.0f);
                }
                for (int i = 0; i < objArr.length; i++) {
                    map.put(objArr[i], objArr2[i]);
                }
                return Collections.unmodifiableMap(map);
        }
    }
}
