package flm;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehc {
    public String a = null;
    public Boolean b = null;
    private Integer c = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
