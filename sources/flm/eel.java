package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eel {
    public static Object a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str).concat(" must not be null"));
        }
        return obj;
    }

    public static boolean a(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }
}
