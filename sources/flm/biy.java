package flm;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biy {
    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
}
