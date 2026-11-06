package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bca {
    public static final int MAX_TAG_LENGTH = 23;
    public static final String PII_SUFFIX = " PII_LOG";
    public final String mLogTag;
    public final String mPrefix;
    public static final int MAX_PII_TAG_LENGTH = 15;
    public static final String NO_PREFIX = null;
    public static final boolean LOG_PII_ENABLED = bav.APK_IS_DEBUG_APK;

    public static boolean isBuildPiiEnabled() {
        return LOG_PII_ENABLED;
    }

    public bca(String str, String str2) {
        bdi.checkNotNull(str, "log tag cannot be null");
        bdi.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.mLogTag = str;
        if (str2 == null || str2.length() <= 0) {
            this.mPrefix = NO_PREFIX;
        } else {
            this.mPrefix = str2;
        }
    }

    public bca(String str) {
        this(str, NO_PREFIX);
    }

    public final bca withMessagePrefix(String str) {
        return new bca(this.mLogTag, str);
    }

    public final String getTag() {
        return this.mLogTag;
    }

    public final boolean canLog(int i) {
        return Log.isLoggable(this.mLogTag, i);
    }

    public final boolean canLogPii() {
        return LOG_PII_ENABLED && canLog(4);
    }

    public final void d(String str, String str2) {
        if (canLog(3)) {
            prefix(str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            prefix(str2);
        }
    }

    public final void dfmt(String str, String str2, Object... objArr) {
        if (canLog(3)) {
            prefixfmt(str2, objArr);
        }
    }

    public final void v(String str, String str2) {
        if (canLog(2)) {
            prefix(str2);
        }
    }

    public final void v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            prefix(str2);
        }
    }

    public final void vfmt(String str, String str2, Object... objArr) {
        if (canLog(2)) {
            prefixfmt(str2, objArr);
        }
    }

    public final void i(String str, String str2) {
        if (canLog(4)) {
            prefix(str2);
        }
    }

    public final void i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            prefix(str2);
        }
    }

    public final void ifmt(String str, String str2, Object... objArr) {
        if (canLog(4)) {
            prefixfmt(str2, objArr);
        }
    }

    public final void w(String str, String str2) {
        if (canLog(5)) {
            Log.w(str, prefix(str2));
        }
    }

    public final void w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            Log.w(str, prefix(str2), th);
        }
    }

    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            Log.w(this.mLogTag, prefixfmt(str2, objArr));
        }
    }

    public final void e(String str, String str2) {
        if (canLog(6)) {
            Log.e(str, prefix(str2));
        }
    }

    public final void e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            Log.e(str, prefix(str2), th);
        }
    }

    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            Log.e(str, prefixfmt(str2, objArr));
        }
    }

    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            Log.e(str, prefix(str2), th);
            Log.wtf(str, prefix(str2), th);
        }
    }

    public final void pii(String str, String str2) {
        if (canLogPii()) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(PII_SUFFIX);
            if (strValueOf2.length() != 0) {
                strValueOf.concat(strValueOf2);
            } else {
                new String(strValueOf);
            }
            prefix(str2);
        }
    }

    public final void pii(String str, String str2, Throwable th) {
        if (canLogPii()) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(PII_SUFFIX);
            if (strValueOf2.length() != 0) {
                strValueOf.concat(strValueOf2);
            } else {
                new String(strValueOf);
            }
            prefix(str2);
        }
    }

    public final void piifmt(String str, String str2, Object... objArr) {
        if (canLogPii()) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(PII_SUFFIX);
            if (strValueOf2.length() != 0) {
                strValueOf.concat(strValueOf2);
            } else {
                new String(strValueOf);
            }
            prefixfmt(str2, objArr);
        }
    }

    private final String prefix(String str) {
        return this.mPrefix == null ? str : this.mPrefix.concat(str);
    }

    private final String prefixfmt(String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        return this.mPrefix == null ? str2 : this.mPrefix.concat(str2);
    }
}
