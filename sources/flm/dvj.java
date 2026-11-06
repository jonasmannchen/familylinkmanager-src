package flm;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvj {
    private dvj() {
    }

    static long a() {
        return System.nanoTime();
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    static {
        Logger.getLogger(dvj.class.getName());
        new dvk();
    }
}
