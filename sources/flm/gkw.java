package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkw {
    public static boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!(cCharAt >= ' ' && cCharAt <= '~')) {
                return false;
            }
        }
        return true;
    }
}
