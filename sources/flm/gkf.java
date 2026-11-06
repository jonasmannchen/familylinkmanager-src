package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkf {
    private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] b = new String[64];
    private static final String[] c = new String[256];

    gkf() {
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String strReplace;
        String str = b2 < a.length ? a[b2] : String.format("0x%02x", Byte.valueOf(b2));
        if (b3 != 0) {
            switch (b2) {
                case 2:
                case 3:
                case 7:
                case 8:
                    strReplace = c[b3];
                    break;
                case 4:
                case 6:
                    strReplace = b3 != 1 ? c[b3] : "ACK";
                    break;
                case 5:
                default:
                    strReplace = b3 < b.length ? b[b3] : c[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        strReplace = strReplace.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b2 == 0 && (b3 & 32) != 0) {
                        strReplace = strReplace.replace("PRIORITY", "COMPRESSED");
                    }
                    break;
            }
        } else {
            strReplace = "";
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = strReplace;
        return String.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    static {
        for (int i = 0; i < c.length; i++) {
            c[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        b[0] = "";
        b[1] = "END_STREAM";
        int[] iArr = {1};
        b[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            b[i3 | 8] = String.valueOf(b[i3]).concat("|PADDED");
        }
        b[4] = "END_HEADERS";
        b[32] = "PRIORITY";
        b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                String str = b[i7];
                String str2 = b[i5];
                b[i7 | i5] = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append('|').append(str2).toString();
                String[] strArr = b;
                int i8 = i7 | i5 | 8;
                String str3 = b[i7];
                String str4 = b[i5];
                strArr[i8] = new StringBuilder(String.valueOf(str3).length() + 8 + String.valueOf(str4).length()).append(str3).append('|').append(str4).append("|PADDED").toString();
            }
        }
        for (int i9 = 0; i9 < b.length; i9++) {
            if (b[i9] == null) {
                b[i9] = c[i9];
            }
        }
    }
}
