package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyu {
    @SafeVarargs
    public static ArrayList a(Object... objArr) {
        dvl.a(objArr);
        int length = objArr.length;
        dwq.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(efx.a(((long) (length / 10)) + 5 + ((long) length)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List a(List list, dvc dvcVar) {
        if (list instanceof RandomAccess) {
            return new dyv(list, dvcVar);
        }
        return new dyx(list, dvcVar);
    }
}
