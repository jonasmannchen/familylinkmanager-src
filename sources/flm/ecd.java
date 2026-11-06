package flm;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ecd implements ece {
    private static final Set a = new HashSet();
    private final String b;
    private final String c;
    private final StringBuilder d;
    private boolean e;

    ecd(String str, String str2, StringBuilder sb) {
        a.add(Boolean.class);
        a.add(Byte.class);
        a.add(Short.class);
        a.add(Integer.class);
        a.add(Long.class);
        a.add(Float.class);
        a.add(Double.class);
        this.e = false;
        this.b = str;
        this.c = str2;
        this.d = sb;
    }

    public final void a() {
        if (this.e) {
            this.d.append(this.c);
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt != '\"' && cCharAt != '\\') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // flm.ece
    public final /* synthetic */ ece a(String str, Object obj) {
        int i = 0;
        if (this.e) {
            this.d.append(' ');
        } else {
            if (this.d.length() > 0) {
                this.d.append((this.d.length() > 1000 || this.d.indexOf("\n") != -1) ? '\n' : ' ');
            }
            this.d.append(this.b);
            this.e = true;
        }
        this.d.append(str).append('=');
        if (obj == null) {
            this.d.append(true);
        } else if (a.contains(obj.getClass())) {
            this.d.append(obj);
        } else {
            this.d.append('\"');
            StringBuilder sb = this.d;
            String string = obj.toString();
            int iA = a(string, 0);
            while (iA != -1) {
                sb.append((CharSequence) string, i, iA);
                i = iA + 1;
                char cCharAt = string.charAt(iA);
                switch (cCharAt) {
                    case '\t':
                        cCharAt = 't';
                        break;
                    case '\n':
                        cCharAt = 'n';
                        break;
                    case '\r':
                        cCharAt = 'r';
                        break;
                    case '\"':
                    case '\\':
                        break;
                    default:
                        sb.append((char) 65533);
                        continue;
                        iA = a(string, i);
                        break;
                }
                sb.append("\\").append(cCharAt);
                iA = a(string, i);
            }
            sb.append((CharSequence) string, i, string.length());
            this.d.append('\"');
        }
        return this;
    }
}
