package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duw extends duv {
    private final char a;

    public duw(char c) {
        this.a = c;
    }

    @Override // flm.duu
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        char c = this.a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return new StringBuilder(String.valueOf(strCopyValueOf).length() + 18).append("CharMatcher.is('").append(strCopyValueOf).append("')").toString();
    }
}
