package flm;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdi {
    public static Object checkNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        return obj;
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        return obj;
    }

    public static int checkNotZero(int i, Object obj) {
        if (i == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return i;
    }

    public static int checkNotZero(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        return i;
    }

    public static long checkNotZero(long j, Object obj) {
        if (j == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return j;
    }

    public static long checkNotZero(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
        return j;
    }

    public static void checkNotNullIfPresent(String str, ContentValues contentValues) {
        if (contentValues.containsKey(str) && contentValues.get(str) == null) {
            throw new IllegalArgumentException(String.valueOf(str).concat(" cannot be set to null"));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    private bdi() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String str) {
        if (!bja.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static void checkNotMainThread(String str) {
        if (bja.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkHandlerThread(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static int checkElementIndex(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(badElementIndex(i, i2, str));
        }
        return i;
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        }
        return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static int checkPositionIndex(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(badPositionIndex(i, i2, str));
        }
        return i;
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        }
        return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i, i2, i3));
        }
    }

    public static String checkTag(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Tag must not be empty or null");
        }
        if (str.length() > 23) {
            throw new IllegalArgumentException("Tag must not be greater than 23 chars.");
        }
        return str;
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return badPositionIndex(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return badPositionIndex(i2, i3, "end index");
        }
        return format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    static String format(String str, Object... objArr) {
        int iIndexOf;
        int i = 0;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i3 = i + 1;
            sb.append(objArr[i]);
            while (true) {
                int i4 = i3;
                if (i4 >= objArr.length) {
                    break;
                }
                sb.append(", ");
                i3 = i4 + 1;
                sb.append(objArr[i4]);
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
