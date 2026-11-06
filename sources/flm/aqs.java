package flm;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class aqs {
    public static final aqs a = new aqs(true, null, null);
    public final boolean b;
    private final String c;
    private final Throwable d;

    aqs(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    static aqs a(Callable callable) {
        return new aqt(callable);
    }

    static aqs a(String str) {
        return new aqs(false, str, null);
    }

    static aqs a(String str, Throwable th) {
        return new aqs(false, str, th);
    }

    String a() {
        return this.c;
    }

    final void b() {
        if (!this.b) {
            String strValueOf = String.valueOf("GoogleCertificatesRslt: ");
            String strValueOf2 = String.valueOf(a());
            String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            if (this.d != null) {
                throw new SecurityException(strConcat, this.d);
            }
            throw new SecurityException(strConcat);
        }
    }

    static String a(String str, aqi aqiVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, biq.a(bhr.a("SHA-1").digest(aqiVar.a())), Boolean.valueOf(z), new StringBuilder(17).append(bav.APK_BUILD_VERSION_CODE).append(".").append(bav.IS_PACKAGE_SIDE).toString());
    }
}
