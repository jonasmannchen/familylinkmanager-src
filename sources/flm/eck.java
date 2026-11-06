package flm;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eck {
    public static String a = "flm.edf";
    public static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    public static String c = "flm.edr";
    public static final String[] d = {a, b, c};

    public abstract ecg b(String str);

    public abstract ecm b();

    public abstract String h();

    public static ecm a() {
        return ecl.a.b();
    }

    public static ecg a(String str) {
        return ecl.a.b(str);
    }

    public static boolean a(String str, Level level, boolean z) {
        return ecl.a.b(str, level, z);
    }

    public boolean b(String str, Level level, boolean z) {
        return false;
    }

    public static ecq c() {
        return ecl.a.d();
    }

    public ecq d() {
        return ecq.a;
    }

    public static long e() {
        return ecl.a.f();
    }

    public long f() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public static String g() {
        return ecl.a.h();
    }
}
