package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dss extends IllegalStateException {
    dss(String str, String str2, String str3) {
        super(a(str, str2, str3));
    }

    dss(String str, String str2, String str3, Throwable th) {
        super(a(str, str2, str3), th);
    }

    private static String a(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str2).length() + 125 + String.valueOf(str).length() + String.valueOf(str3).length()).append("Starting new trace ").append(str2).append(" when already associated with a trace ").append(str).append(".").append(str3).append(" For more help, see go/tiktok-tracing#fixing-duplicate-trace-issues").toString();
    }
}
