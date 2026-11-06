package flm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fla {
    private static final Class d = a();
    public static final flq a = a(false);
    public static final flq b = a(true);
    public static final flq c = new fls();

    public static void a(Class cls) {
        if (!fin.class.isAssignableFrom(cls) && d != null && !d.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void a(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.g(i, list, z);
        }
    }

    public static void b(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.f(i, list, z);
        }
    }

    public static void c(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.c(i, list, z);
        }
    }

    public static void d(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.d(i, list, z);
        }
    }

    public static void e(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.n(i, list, z);
        }
    }

    public static void f(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.e(i, list, z);
        }
    }

    public static void g(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.l(i, list, z);
        }
    }

    public static void h(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.a(i, list, z);
        }
    }

    public static void i(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.j(i, list, z);
        }
    }

    public static void j(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.m(i, list, z);
        }
    }

    public static void k(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.b(i, list, z);
        }
    }

    public static void l(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.k(i, list, z);
        }
    }

    public static void m(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.h(i, list, z);
        }
    }

    public static void n(int i, List list, fmp fmpVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            fmpVar.i(i, list, z);
        }
    }

    public static void a(int i, List list, fmp fmpVar) {
        if (list != null && !list.isEmpty()) {
            fmpVar.a(i, list);
        }
    }

    public static void b(int i, List list, fmp fmpVar) {
        if (list != null && !list.isEmpty()) {
            fmpVar.b(i, list);
        }
    }

    public static void a(int i, List list, fmp fmpVar, fky fkyVar) {
        if (list != null && !list.isEmpty()) {
            fmpVar.a(i, list, fkyVar);
        }
    }

    public static void b(int i, List list, fmp fmpVar, fky fkyVar) {
        if (list != null && !list.isEmpty()) {
            fmpVar.b(i, list, fkyVar);
        }
    }

    static int a(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            int i2 = 0;
            while (i2 < size) {
                int iD = fhp.d(fjsVar.c(i2)) + i;
                i2++;
                i = iD;
            }
            return i;
        }
        int iD2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iD2 += fhp.d(((Long) list.get(i3)).longValue());
        }
        return iD2;
    }

    static int a(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * fhp.f(i));
    }

    static int b(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            int i2 = 0;
            while (i2 < size) {
                int iE = fhp.e(fjsVar.c(i2)) + i;
                i2++;
                i = iE;
            }
            return i;
        }
        int iE2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iE2 += fhp.e(((Long) list.get(i3)).longValue());
        }
        return iE2;
    }

    static int b(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + b(list);
    }

    static int c(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fjs) {
            fjs fjsVar = (fjs) list;
            int i2 = 0;
            while (i2 < size) {
                int iF = fhp.f(fjsVar.c(i2)) + i;
                i2++;
                i = iF;
            }
            return i;
        }
        int iF2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iF2 += fhp.f(((Long) list.get(i3)).longValue());
        }
        return iF2;
    }

    static int c(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + c(list);
    }

    static int d(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            int i2 = 0;
            while (i2 < size) {
                int iJ = fhp.j(fiuVar.c(i2)) + i;
                i2++;
                i = iJ;
            }
            return i;
        }
        int iJ2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iJ2 += fhp.j(((Integer) list.get(i3)).intValue());
        }
        return iJ2;
    }

    static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + d(list);
    }

    static int e(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            int i2 = 0;
            while (i2 < size) {
                int iG = fhp.g(fiuVar.c(i2)) + i;
                i2++;
                i = iG;
            }
            return i;
        }
        int iG2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iG2 += fhp.g(((Integer) list.get(i3)).intValue());
        }
        return iG2;
    }

    static int e(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + e(list);
    }

    static int f(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            int i2 = 0;
            while (i2 < size) {
                int iH = fhp.h(fiuVar.c(i2)) + i;
                i2++;
                i = iH;
            }
            return i;
        }
        int iH2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iH2 += fhp.h(((Integer) list.get(i3)).intValue());
        }
        return iH2;
    }

    static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + f(list);
    }

    static int g(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fiu) {
            fiu fiuVar = (fiu) list;
            int i2 = 0;
            while (i2 < size) {
                int i3 = fhp.i(fiuVar.c(i2)) + i;
                i2++;
                i = i3;
            }
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += fhp.i(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    static int g(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * fhp.f(i)) + g(list);
    }

    static int h(List list) {
        return list.size() << 2;
    }

    static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return fhp.i(i, 0) * size;
    }

    static int i(List list) {
        return list.size() << 3;
    }

    static int i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * fhp.g(i, 0L);
    }

    static int j(List list) {
        return list.size();
    }

    static int j(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * fhp.b(i, true);
    }

    static int a(int i, List list) {
        int iB;
        int iB2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF = fhp.f(i) * size;
        if (list instanceof fjo) {
            fjo fjoVar = (fjo) list;
            int i2 = 0;
            while (i2 < size) {
                Object objB = fjoVar.b(i2);
                if (objB instanceof fgy) {
                    iB2 = fhp.b((fgy) objB);
                } else {
                    iB2 = fhp.b((String) objB);
                }
                i2++;
                iF = iB2 + iF;
            }
            return iF;
        }
        int i3 = 0;
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof fgy) {
                iB = fhp.b((fgy) obj);
            } else {
                iB = fhp.b((String) obj);
            }
            i3++;
            iF = iB + iF;
        }
        return iF;
    }

    static int a(int i, Object obj, fky fkyVar) {
        return obj instanceof fjm ? fhp.a(i, (fjm) obj) : fhp.b(i, (fke) obj, fkyVar);
    }

    static int a(int i, List list, fky fkyVar) {
        int iB;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF = fhp.f(i) * size;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof fjm) {
                iB = fhp.a((fjm) obj);
            } else {
                iB = fhp.b((fke) obj, fkyVar);
            }
            i2++;
            iF = iB + iF;
        }
        return iF;
    }

    static int b(int i, List list) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF = size * fhp.f(i);
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                return iF;
            }
            iF += fhp.b((fgy) list.get(i3));
            i2 = i3 + 1;
        }
    }

    static int b(int i, List list, fky fkyVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iC += fhp.c(i, (fke) list.get(i2), fkyVar);
        }
        return iC;
    }

    private static flq a(boolean z) {
        try {
            Class clsB = b();
            if (clsB == null) {
                return null;
            }
            return (flq) clsB.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void a(fjz fjzVar, Object obj, Object obj2, long j) {
        flw.a(obj, j, fjzVar.a(flw.f(obj, j), flw.f(obj2, j)));
    }

    static void a(fid fidVar, Object obj, Object obj2) {
        fig figVarA = fidVar.a(obj2);
        if (!figVarA.a.isEmpty()) {
            fig figVarB = fidVar.b(obj);
            for (int i = 0; i < figVarA.a.b(); i++) {
                figVarB.a(figVarA.a.b(i));
            }
            Iterator it = figVarA.a.c().iterator();
            while (it.hasNext()) {
                figVarB.a((Map.Entry) it.next());
            }
        }
    }

    static void a(flq flqVar, Object obj, Object obj2) {
        flqVar.a(obj, flqVar.c(flqVar.b(obj), flqVar.b(obj2)));
    }

    static Object a(int i, List list, fiz fizVar, Object obj, flq flqVar) {
        Object obj2;
        Object objA;
        int i2;
        if (fizVar != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                obj2 = obj;
                while (i3 < size) {
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    if (fizVar.a(iIntValue)) {
                        if (i3 != i4) {
                            list.set(i4, Integer.valueOf(iIntValue));
                        }
                        i2 = i4 + 1;
                        objA = obj2;
                    } else {
                        int i5 = i4;
                        objA = a(i, iIntValue, obj2, flqVar);
                        i2 = i5;
                    }
                    i3++;
                    obj2 = objA;
                    i4 = i2;
                }
                if (i4 != size) {
                    list.subList(i4, size).clear();
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (!fizVar.a(iIntValue2)) {
                        obj = a(i, iIntValue2, obj, flqVar);
                        it.remove();
                    }
                }
                obj2 = obj;
            }
            return obj2;
        }
        return obj;
    }

    static Object a(int i, int i2, Object obj, flq flqVar) {
        if (obj == null) {
            obj = flqVar.b();
        }
        flqVar.a(obj, i, i2);
        return obj;
    }
}
