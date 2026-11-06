package flm;

import java.net.ProtocolException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fok {
    public final int a;
    public final String b;
    private final fof c;

    private fok(fof fofVar, int i, String str) {
        this.c = fofVar;
        this.a = i;
        this.b = str;
    }

    public static fok a(String str) throws ProtocolException {
        fof fofVar;
        String strSubstring;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                fofVar = fof.HTTP_1_0;
            } else if (iCharAt == 1) {
                fofVar = fof.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            fofVar = fof.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        if (str.length() < i + 3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i2 = Integer.parseInt(str.substring(i, i + 3));
            if (str.length() <= i + 3) {
                strSubstring = "";
            } else {
                if (str.charAt(i + 3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
            }
            return new fok(fofVar, i2, strSubstring);
        } catch (NumberFormatException e) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c == fof.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ').append(this.a);
        if (this.b != null) {
            sb.append(' ').append(this.b);
        }
        return sb.toString();
    }
}
