package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcx {
    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static bcz toStringHelper(Object obj) {
        return new bcz(obj);
    }

    private bcx() {
        throw new AssertionError("Uninstantiable");
    }
}
