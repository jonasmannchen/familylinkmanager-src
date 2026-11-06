package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvl {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(dvy.a(str, Character.valueOf(c)));
        }
    }

    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(dvy.a(str, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(dvy.a(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(dvy.a(str, obj));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(dvy.a(str, obj, obj2));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(dvy.a(str, obj));
        }
    }

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

    public static Object a(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(dvy.a(str, obj2));
        }
        return obj;
    }

    public static int a(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = dvy.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
                }
                strA = dvy.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
        return i;
    }

    public static int b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, "index"));
        }
        return i;
    }

    static String a(int i, int i2, String str) {
        if (i < 0) {
            return dvy.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        }
        return dvy.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void a(int i, int i2, int i3) {
        String strA;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strA = a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                strA = a(i2, i3, "end index");
            } else {
                strA = dvy.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
