package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eei extends RuntimeException {
    public static eei a(String str, String str2, int i, int i2) {
        return new eei(b(str, str2, i, i2));
    }

    public static eei a(String str, String str2, int i) {
        return new eei(b(str, str2, i, i + 1));
    }

    public static eei b(String str, String str2, int i) {
        return new eei(b(str, str2, i, -1));
    }

    public eei(String str) {
        super(str);
    }

    private static String b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sbAppend = new StringBuilder(str).append(": ");
        if (i > 8) {
            sbAppend.append("...").append((CharSequence) str2, i - 5, i);
        } else {
            sbAppend.append((CharSequence) str2, 0, i);
        }
        sbAppend.append('[').append(str2.substring(i, i2)).append(']');
        if (str2.length() - i2 > 8) {
            sbAppend.append((CharSequence) str2, i2, i2 + 5).append("...");
        } else {
            sbAppend.append((CharSequence) str2, i2, str2.length());
        }
        return sbAppend.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
