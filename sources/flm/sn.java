package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sn {
    public static Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        return obj;
    }

    public static int a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return i;
    }
}
