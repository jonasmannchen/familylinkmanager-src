package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwq {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            throw new NullPointerException(new StringBuilder(String.valueOf(strValueOf).length() + 24).append("null key in entry: null=").append(strValueOf).toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            throw new NullPointerException(new StringBuilder(String.valueOf(strValueOf2).length() + 26).append("null value in entry: ").append(strValueOf2).append("=null").toString());
        }
    }

    static int a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
        }
        return i;
    }
}
