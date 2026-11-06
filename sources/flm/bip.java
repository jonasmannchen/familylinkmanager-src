package flm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bip {
    private static Pattern a = null;

    private static Pattern a() {
        if (a == null) {
            a = Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
        }
        return a;
    }

    public static long a(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = a().matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        try {
            return Long.parseLong(matcher.group(2));
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    public static long b(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = a().matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        try {
            return Long.parseLong(matcher.group(1));
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    public static int a(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }
}
