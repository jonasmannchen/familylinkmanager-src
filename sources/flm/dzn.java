package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzn {
    static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    static Object a(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(new StringBuilder(20).append("at index ").append(i).toString());
        }
        return obj;
    }
}
