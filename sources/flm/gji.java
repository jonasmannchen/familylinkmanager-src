package flm;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gji implements HostnameVerifier {
    public static final gji a = new gji();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private gji() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0305 A[Catch: SSLException -> 0x00fb, TryCatch #0 {SSLException -> 0x00fb, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0029, B:12:0x0038, B:13:0x003c, B:15:0x004f, B:18:0x005d, B:20:0x0064, B:24:0x008c, B:26:0x0092, B:29:0x009c, B:30:0x00a2, B:31:0x00a5, B:32:0x00ad, B:34:0x00b3, B:112:0x0257, B:113:0x025d, B:114:0x0260, B:115:0x0278, B:116:0x0288, B:117:0x029e, B:118:0x02b4, B:120:0x02ba, B:122:0x02c2, B:123:0x02d5, B:125:0x02db, B:127:0x02e3, B:129:0x02eb, B:131:0x02f5, B:35:0x00c1, B:37:0x00c7, B:132:0x0305, B:134:0x030d, B:136:0x0317, B:138:0x031f, B:140:0x032f, B:141:0x0333, B:142:0x0336, B:143:0x0337, B:144:0x033d, B:146:0x0349, B:148:0x0359, B:149:0x035d, B:150:0x0360, B:151:0x0361, B:40:0x00cf, B:41:0x00dd, B:43:0x00e3, B:45:0x00f3, B:46:0x00f7, B:47:0x00fa, B:50:0x00fe, B:51:0x0104, B:53:0x010e, B:54:0x0114, B:56:0x011a, B:58:0x0122, B:64:0x0157, B:59:0x0129, B:61:0x0133, B:62:0x013d, B:63:0x014a, B:65:0x0167, B:67:0x016f, B:69:0x017f, B:70:0x0183, B:71:0x0186, B:72:0x0187, B:73:0x018d, B:74:0x0197, B:76:0x019d, B:78:0x01a5, B:80:0x01ad, B:92:0x01e0, B:94:0x01e8, B:95:0x01f2, B:83:0x01bb, B:85:0x01c4, B:107:0x0234, B:108:0x023d, B:110:0x0240, B:111:0x024c, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:91:0x01df, B:106:0x022e, B:97:0x01f8, B:99:0x0200, B:100:0x0207, B:102:0x0211, B:104:0x021b, B:105:0x0226, B:82:0x01b7), top: B:155:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x030d A[Catch: SSLException -> 0x00fb, TryCatch #0 {SSLException -> 0x00fb, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0029, B:12:0x0038, B:13:0x003c, B:15:0x004f, B:18:0x005d, B:20:0x0064, B:24:0x008c, B:26:0x0092, B:29:0x009c, B:30:0x00a2, B:31:0x00a5, B:32:0x00ad, B:34:0x00b3, B:112:0x0257, B:113:0x025d, B:114:0x0260, B:115:0x0278, B:116:0x0288, B:117:0x029e, B:118:0x02b4, B:120:0x02ba, B:122:0x02c2, B:123:0x02d5, B:125:0x02db, B:127:0x02e3, B:129:0x02eb, B:131:0x02f5, B:35:0x00c1, B:37:0x00c7, B:132:0x0305, B:134:0x030d, B:136:0x0317, B:138:0x031f, B:140:0x032f, B:141:0x0333, B:142:0x0336, B:143:0x0337, B:144:0x033d, B:146:0x0349, B:148:0x0359, B:149:0x035d, B:150:0x0360, B:151:0x0361, B:40:0x00cf, B:41:0x00dd, B:43:0x00e3, B:45:0x00f3, B:46:0x00f7, B:47:0x00fa, B:50:0x00fe, B:51:0x0104, B:53:0x010e, B:54:0x0114, B:56:0x011a, B:58:0x0122, B:64:0x0157, B:59:0x0129, B:61:0x0133, B:62:0x013d, B:63:0x014a, B:65:0x0167, B:67:0x016f, B:69:0x017f, B:70:0x0183, B:71:0x0186, B:72:0x0187, B:73:0x018d, B:74:0x0197, B:76:0x019d, B:78:0x01a5, B:80:0x01ad, B:92:0x01e0, B:94:0x01e8, B:95:0x01f2, B:83:0x01bb, B:85:0x01c4, B:107:0x0234, B:108:0x023d, B:110:0x0240, B:111:0x024c, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:91:0x01df, B:106:0x022e, B:97:0x01f8, B:99:0x0200, B:100:0x0207, B:102:0x0211, B:104:0x021b, B:105:0x0226, B:82:0x01b7), top: B:155:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0359 A[Catch: SSLException -> 0x00fb, TryCatch #0 {SSLException -> 0x00fb, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0029, B:12:0x0038, B:13:0x003c, B:15:0x004f, B:18:0x005d, B:20:0x0064, B:24:0x008c, B:26:0x0092, B:29:0x009c, B:30:0x00a2, B:31:0x00a5, B:32:0x00ad, B:34:0x00b3, B:112:0x0257, B:113:0x025d, B:114:0x0260, B:115:0x0278, B:116:0x0288, B:117:0x029e, B:118:0x02b4, B:120:0x02ba, B:122:0x02c2, B:123:0x02d5, B:125:0x02db, B:127:0x02e3, B:129:0x02eb, B:131:0x02f5, B:35:0x00c1, B:37:0x00c7, B:132:0x0305, B:134:0x030d, B:136:0x0317, B:138:0x031f, B:140:0x032f, B:141:0x0333, B:142:0x0336, B:143:0x0337, B:144:0x033d, B:146:0x0349, B:148:0x0359, B:149:0x035d, B:150:0x0360, B:151:0x0361, B:40:0x00cf, B:41:0x00dd, B:43:0x00e3, B:45:0x00f3, B:46:0x00f7, B:47:0x00fa, B:50:0x00fe, B:51:0x0104, B:53:0x010e, B:54:0x0114, B:56:0x011a, B:58:0x0122, B:64:0x0157, B:59:0x0129, B:61:0x0133, B:62:0x013d, B:63:0x014a, B:65:0x0167, B:67:0x016f, B:69:0x017f, B:70:0x0183, B:71:0x0186, B:72:0x0187, B:73:0x018d, B:74:0x0197, B:76:0x019d, B:78:0x01a5, B:80:0x01ad, B:92:0x01e0, B:94:0x01e8, B:95:0x01f2, B:83:0x01bb, B:85:0x01c4, B:107:0x0234, B:108:0x023d, B:110:0x0240, B:111:0x024c, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:91:0x01df, B:106:0x022e, B:97:0x01f8, B:99:0x0200, B:100:0x0207, B:102:0x0211, B:104:0x021b, B:105:0x0226, B:82:0x01b7), top: B:155:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0361 A[Catch: SSLException -> 0x00fb, TRY_LEAVE, TryCatch #0 {SSLException -> 0x00fb, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0029, B:12:0x0038, B:13:0x003c, B:15:0x004f, B:18:0x005d, B:20:0x0064, B:24:0x008c, B:26:0x0092, B:29:0x009c, B:30:0x00a2, B:31:0x00a5, B:32:0x00ad, B:34:0x00b3, B:112:0x0257, B:113:0x025d, B:114:0x0260, B:115:0x0278, B:116:0x0288, B:117:0x029e, B:118:0x02b4, B:120:0x02ba, B:122:0x02c2, B:123:0x02d5, B:125:0x02db, B:127:0x02e3, B:129:0x02eb, B:131:0x02f5, B:35:0x00c1, B:37:0x00c7, B:132:0x0305, B:134:0x030d, B:136:0x0317, B:138:0x031f, B:140:0x032f, B:141:0x0333, B:142:0x0336, B:143:0x0337, B:144:0x033d, B:146:0x0349, B:148:0x0359, B:149:0x035d, B:150:0x0360, B:151:0x0361, B:40:0x00cf, B:41:0x00dd, B:43:0x00e3, B:45:0x00f3, B:46:0x00f7, B:47:0x00fa, B:50:0x00fe, B:51:0x0104, B:53:0x010e, B:54:0x0114, B:56:0x011a, B:58:0x0122, B:64:0x0157, B:59:0x0129, B:61:0x0133, B:62:0x013d, B:63:0x014a, B:65:0x0167, B:67:0x016f, B:69:0x017f, B:70:0x0183, B:71:0x0186, B:72:0x0187, B:73:0x018d, B:74:0x0197, B:76:0x019d, B:78:0x01a5, B:80:0x01ad, B:92:0x01e0, B:94:0x01e8, B:95:0x01f2, B:83:0x01bb, B:85:0x01c4, B:107:0x0234, B:108:0x023d, B:110:0x0240, B:111:0x024c, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:91:0x01df, B:106:0x022e, B:97:0x01f8, B:99:0x0200, B:100:0x0207, B:102:0x0211, B:104:0x021b, B:105:0x0226, B:82:0x01b7), top: B:155:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[LOOP:2: B:26:0x0092->B:25:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7 A[Catch: SSLException -> 0x00fb, TryCatch #0 {SSLException -> 0x00fb, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0029, B:12:0x0038, B:13:0x003c, B:15:0x004f, B:18:0x005d, B:20:0x0064, B:24:0x008c, B:26:0x0092, B:29:0x009c, B:30:0x00a2, B:31:0x00a5, B:32:0x00ad, B:34:0x00b3, B:112:0x0257, B:113:0x025d, B:114:0x0260, B:115:0x0278, B:116:0x0288, B:117:0x029e, B:118:0x02b4, B:120:0x02ba, B:122:0x02c2, B:123:0x02d5, B:125:0x02db, B:127:0x02e3, B:129:0x02eb, B:131:0x02f5, B:35:0x00c1, B:37:0x00c7, B:132:0x0305, B:134:0x030d, B:136:0x0317, B:138:0x031f, B:140:0x032f, B:141:0x0333, B:142:0x0336, B:143:0x0337, B:144:0x033d, B:146:0x0349, B:148:0x0359, B:149:0x035d, B:150:0x0360, B:151:0x0361, B:40:0x00cf, B:41:0x00dd, B:43:0x00e3, B:45:0x00f3, B:46:0x00f7, B:47:0x00fa, B:50:0x00fe, B:51:0x0104, B:53:0x010e, B:54:0x0114, B:56:0x011a, B:58:0x0122, B:64:0x0157, B:59:0x0129, B:61:0x0133, B:62:0x013d, B:63:0x014a, B:65:0x0167, B:67:0x016f, B:69:0x017f, B:70:0x0183, B:71:0x0186, B:72:0x0187, B:73:0x018d, B:74:0x0197, B:76:0x019d, B:78:0x01a5, B:80:0x01ad, B:92:0x01e0, B:94:0x01e8, B:95:0x01f2, B:83:0x01bb, B:85:0x01c4, B:107:0x0234, B:108:0x023d, B:110:0x0240, B:111:0x024c, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:91:0x01df, B:106:0x022e, B:97:0x01f8, B:99:0x0200, B:100:0x0207, B:102:0x0211, B:104:0x021b, B:105:0x0226, B:82:0x01b7), top: B:155:0x0008 }] */
    /* JADX WARN: Switch 'out' block B:35:0x00c1 for B:113:0x025d already processed. Defaulting to fallback option. */
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean z;
        String str2;
        String strValueOf;
        String str3;
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (b.matcher(str).matches()) {
                List listA = a(x509Certificate, 7);
                int size = listA.size();
                for (int i = 0; i < size; i++) {
                    if (str.equalsIgnoreCase((String) listA.get(i))) {
                        z = true;
                    }
                }
                return false;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            List listA2 = a(x509Certificate, 2);
            int size2 = listA2.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size2) {
                if (a(lowerCase, (String) listA2.get(i2))) {
                    return true;
                }
                i2++;
                z2 = true;
            }
            if (!z2) {
                gjh gjhVar = new gjh(x509Certificate.getSubjectX500Principal());
                gjhVar.c = 0;
                gjhVar.d = 0;
                gjhVar.e = 0;
                gjhVar.f = 0;
                gjhVar.g = gjhVar.a.toCharArray();
                String strA = gjhVar.a();
                if (strA != null) {
                    while (true) {
                        String str4 = strA;
                        str2 = "";
                        if (gjhVar.c == gjhVar.b) {
                            str2 = null;
                        } else {
                            switch (gjhVar.g[gjhVar.c]) {
                                case '\"':
                                    gjhVar.c++;
                                    gjhVar.d = gjhVar.c;
                                    gjhVar.e = gjhVar.d;
                                    while (true) {
                                        if (gjhVar.c == gjhVar.b) {
                                            String strValueOf2 = String.valueOf(gjhVar.a);
                                            throw new IllegalStateException(strValueOf2.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf2) : new String("Unexpected end of DN: "));
                                        }
                                        if (gjhVar.g[gjhVar.c] == '\"') {
                                            gjhVar.c++;
                                            while (gjhVar.c < gjhVar.b && gjhVar.g[gjhVar.c] == ' ') {
                                                gjhVar.c++;
                                            }
                                            str2 = new String(gjhVar.g, gjhVar.d, gjhVar.e - gjhVar.d);
                                        } else {
                                            if (gjhVar.g[gjhVar.c] == '\\') {
                                                gjhVar.g[gjhVar.e] = gjhVar.b();
                                            } else {
                                                gjhVar.g[gjhVar.e] = gjhVar.g[gjhVar.c];
                                            }
                                            gjhVar.c++;
                                            gjhVar.e++;
                                        }
                                    }
                                    if ("cn".equalsIgnoreCase(str4)) {
                                        if (gjhVar.c >= gjhVar.b) {
                                            str2 = null;
                                        } else {
                                            if (gjhVar.g[gjhVar.c] == ',' && gjhVar.g[gjhVar.c] != ';' && gjhVar.g[gjhVar.c] != '+') {
                                                String strValueOf3 = String.valueOf(gjhVar.a);
                                                throw new IllegalStateException(strValueOf3.length() != 0 ? "Malformed DN: ".concat(strValueOf3) : new String("Malformed DN: "));
                                            }
                                            gjhVar.c++;
                                            strA = gjhVar.a();
                                            if (strA == null) {
                                                strValueOf = String.valueOf(gjhVar.a);
                                                if (strValueOf.length() != 0) {
                                                    str3 = "Malformed DN: ".concat(strValueOf);
                                                } else {
                                                    str3 = new String("Malformed DN: ");
                                                }
                                                throw new IllegalStateException(str3);
                                            }
                                        }
                                    }
                                    break;
                                case '#':
                                    if (gjhVar.c + 4 >= gjhVar.b) {
                                        String strValueOf4 = String.valueOf(gjhVar.a);
                                        throw new IllegalStateException(strValueOf4.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf4) : new String("Unexpected end of DN: "));
                                    }
                                    gjhVar.d = gjhVar.c;
                                    gjhVar.c++;
                                    while (true) {
                                        if (gjhVar.c == gjhVar.b || gjhVar.g[gjhVar.c] == '+' || gjhVar.g[gjhVar.c] == ',' || gjhVar.g[gjhVar.c] == ';') {
                                            gjhVar.e = gjhVar.c;
                                        } else if (gjhVar.g[gjhVar.c] == ' ') {
                                            gjhVar.e = gjhVar.c;
                                            gjhVar.c++;
                                            while (gjhVar.c < gjhVar.b && gjhVar.g[gjhVar.c] == ' ') {
                                                gjhVar.c++;
                                            }
                                        } else {
                                            if (gjhVar.g[gjhVar.c] >= 'A' && gjhVar.g[gjhVar.c] <= 'F') {
                                                char[] cArr = gjhVar.g;
                                                int i3 = gjhVar.c;
                                                cArr[i3] = (char) (cArr[i3] + ' ');
                                            }
                                            gjhVar.c++;
                                        }
                                    }
                                    int i4 = gjhVar.e - gjhVar.d;
                                    if (i4 < 5 || (i4 & 1) == 0) {
                                        String strValueOf5 = String.valueOf(gjhVar.a);
                                        throw new IllegalStateException(strValueOf5.length() != 0 ? "Unexpected end of DN: ".concat(strValueOf5) : new String("Unexpected end of DN: "));
                                    }
                                    byte[] bArr = new byte[i4 / 2];
                                    int i5 = gjhVar.d + 1;
                                    for (int i6 = 0; i6 < bArr.length; i6++) {
                                        bArr[i6] = (byte) gjhVar.a(i5);
                                        i5 += 2;
                                    }
                                    str2 = new String(gjhVar.g, gjhVar.d, i4);
                                    if ("cn".equalsIgnoreCase(str4)) {
                                        if (gjhVar.c >= gjhVar.b) {
                                            str2 = null;
                                        } else {
                                            if (gjhVar.g[gjhVar.c] == ',') {
                                            }
                                            gjhVar.c++;
                                            strA = gjhVar.a();
                                            if (strA == null) {
                                                strValueOf = String.valueOf(gjhVar.a);
                                                if (strValueOf.length() != 0) {
                                                    str3 = "Malformed DN: ".concat(strValueOf);
                                                } else {
                                                    str3 = new String("Malformed DN: ");
                                                }
                                                throw new IllegalStateException(str3);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                    break;
                                case '+':
                                case ',':
                                case ';':
                                    if ("cn".equalsIgnoreCase(str4)) {
                                        if (gjhVar.c >= gjhVar.b) {
                                            str2 = null;
                                        } else {
                                            if (gjhVar.g[gjhVar.c] == ',') {
                                            }
                                            gjhVar.c++;
                                            strA = gjhVar.a();
                                            if (strA == null) {
                                                strValueOf = String.valueOf(gjhVar.a);
                                                if (strValueOf.length() != 0) {
                                                    str3 = "Malformed DN: ".concat(strValueOf);
                                                } else {
                                                    str3 = new String("Malformed DN: ");
                                                }
                                                throw new IllegalStateException(str3);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    gjhVar.d = gjhVar.c;
                                    gjhVar.e = gjhVar.c;
                                    while (true) {
                                        if (gjhVar.c >= gjhVar.b) {
                                            str2 = new String(gjhVar.g, gjhVar.d, gjhVar.e - gjhVar.d);
                                        } else {
                                            switch (gjhVar.g[gjhVar.c]) {
                                                case ' ':
                                                    gjhVar.f = gjhVar.e;
                                                    gjhVar.c++;
                                                    char[] cArr2 = gjhVar.g;
                                                    int i7 = gjhVar.e;
                                                    gjhVar.e = i7 + 1;
                                                    cArr2[i7] = ' ';
                                                    while (gjhVar.c < gjhVar.b && gjhVar.g[gjhVar.c] == ' ') {
                                                        char[] cArr3 = gjhVar.g;
                                                        int i8 = gjhVar.e;
                                                        gjhVar.e = i8 + 1;
                                                        cArr3[i8] = ' ';
                                                        gjhVar.c++;
                                                    }
                                                    if (gjhVar.c == gjhVar.b || gjhVar.g[gjhVar.c] == ',' || gjhVar.g[gjhVar.c] == '+' || gjhVar.g[gjhVar.c] == ';') {
                                                        str2 = new String(gjhVar.g, gjhVar.d, gjhVar.f - gjhVar.d);
                                                    }
                                                    break;
                                                case '+':
                                                case ',':
                                                case ';':
                                                    str2 = new String(gjhVar.g, gjhVar.d, gjhVar.e - gjhVar.d);
                                                    break;
                                                case '\\':
                                                    char[] cArr4 = gjhVar.g;
                                                    int i9 = gjhVar.e;
                                                    gjhVar.e = i9 + 1;
                                                    cArr4[i9] = gjhVar.b();
                                                    gjhVar.c++;
                                                    break;
                                                default:
                                                    char[] cArr5 = gjhVar.g;
                                                    int i10 = gjhVar.e;
                                                    gjhVar.e = i10 + 1;
                                                    cArr5[i10] = gjhVar.g[gjhVar.c];
                                                    gjhVar.c++;
                                                    break;
                                            }
                                        }
                                    }
                                    if ("cn".equalsIgnoreCase(str4)) {
                                        if (gjhVar.c >= gjhVar.b) {
                                            str2 = null;
                                        } else {
                                            if (gjhVar.g[gjhVar.c] == ',') {
                                            }
                                            gjhVar.c++;
                                            strA = gjhVar.a();
                                            if (strA == null) {
                                                strValueOf = String.valueOf(gjhVar.a);
                                                if (strValueOf.length() != 0) {
                                                    str3 = "Malformed DN: ".concat(strValueOf);
                                                } else {
                                                    str3 = new String("Malformed DN: ");
                                                }
                                                throw new IllegalStateException(str3);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return a(lowerCase, str2);
                }
            }
            z = false;
            return z;
        } catch (SSLException e) {
            return false;
        }
    }

    private static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            String strValueOf = String.valueOf(str);
            str = new StringBuilder(String.valueOf(strValueOf).length() + 1).append(strValueOf).append('.').toString();
        }
        if (!str2.endsWith(".")) {
            String strValueOf2 = String.valueOf(str2);
            str2 = new StringBuilder(String.valueOf(strValueOf2).length() + 1).append(strValueOf2).append('.').toString();
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
    }
}
