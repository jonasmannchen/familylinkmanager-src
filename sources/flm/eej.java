package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eej extends eeh {
    private static final String a = a();

    abstract int a(eeg eegVar, int i, String str, int i2, int i3, int i4);

    private static String a() {
        try {
            String property = System.getProperty("line.separator");
            return property.matches("\\n|\\r(?:\\n)?") ? property : "\n";
        } catch (SecurityException e) {
        }
    }

    @Override // flm.eeh
    public final void a(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (cCharAt == 'n') {
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(a);
                }
                i = i4 + 1;
                i3 = i;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eeh
    public final void a(eeg eegVar) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        String strD = eegVar.d();
        int iA = a(strD, 0);
        int i4 = 0;
        int i5 = -1;
        while (iA >= 0) {
            int i6 = iA + 1;
            int i7 = 0;
            int i8 = i6;
            while (true) {
                if (i8 < strD.length()) {
                    i = i8 + 1;
                    cCharAt = strD.charAt(i8);
                    char c = (char) (cCharAt - '0');
                    if (c < '\n') {
                        i7 = (i7 * 10) + c;
                        if (i7 >= 1000000) {
                            throw eei.a("index too large", strD, iA, i);
                        }
                        i8 = i;
                    }
                } else {
                    throw eei.b("unterminated parameter", strD, iA);
                }
            }
            if (cCharAt == '$') {
                if ((i - 1) - i6 == 0) {
                    throw eei.a("missing index", strD, iA, i);
                }
                if (strD.charAt(i6) == '0') {
                    throw eei.a("index has leading zero", strD, iA, i);
                }
                i3 = i7 - 1;
                if (i == strD.length()) {
                    throw eei.b("unterminated parameter", strD, iA);
                }
                i2 = i + 1;
                strD.charAt(i);
            } else if (cCharAt == '<') {
                if (i5 == -1) {
                    throw eei.a("invalid relative parameter", strD, iA, i);
                }
                if (i == strD.length()) {
                    throw eei.b("unterminated parameter", strD, iA);
                }
                i2 = i + 1;
                strD.charAt(i);
                i3 = i5;
            } else {
                int i9 = i4;
                i4++;
                i2 = i;
                i = i6;
                i3 = i9;
            }
            int i10 = i2 - 1;
            while (true) {
                if (i10 < strD.length()) {
                    if (((char) ((strD.charAt(i10) & (-33)) - 65)) < 26) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    throw eei.b("unterminated parameter", strD, iA);
                }
            }
            iA = a(strD, a(eegVar, i3, strD, iA, i, i10));
            i5 = i3;
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '%' || cCharAt == 'n') {
                    i = i2 + 1;
                } else {
                    return i2 - 1;
                }
            } else {
                throw eei.b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }
}
