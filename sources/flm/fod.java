package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fod {
    public final String a;
    public final int b;
    private final String c;

    public fod(foe foeVar) {
        a(foeVar.b, false);
        a(foeVar.c, false);
        this.a = foeVar.d;
        this.b = foeVar.a();
        List<String> list = foeVar.f;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(str != null ? a(str, false) : null);
        }
        Collections.unmodifiableList(arrayList);
        this.c = foeVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    static void a(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fod) && ((fod) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0179  */
    /* JADX WARN: Code duplicated, block: B:41:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fd A[SYNTHETIC] */
    public static String a(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                guc gucVar = new guc();
                gucVar.a(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && iCharCount + 2 < i2) {
                        int iA = a(str.charAt(iCharCount + 1));
                        int iA2 = a(str.charAt(iCharCount + 2));
                        if (iA != -1 && iA2 != -1) {
                            int i4 = (iA << 4) + iA2;
                            gum gumVarA = gucVar.a(1);
                            byte[] bArr = gumVarA.a;
                            int i5 = gumVarA.c;
                            gumVarA.c = i5 + 1;
                            bArr[i5] = (byte) i4;
                            gucVar.c++;
                            i3 = iCharCount + 2;
                        } else if (iCodePointAt < 128) {
                            gum gumVarA2 = gucVar.a(1);
                            byte[] bArr2 = gumVarA2.a;
                            int i6 = gumVarA2.c;
                            gumVarA2.c = i6 + 1;
                            bArr2[i6] = (byte) iCodePointAt;
                            gucVar.c++;
                            i3 = iCharCount;
                        } else if (iCodePointAt < 2048) {
                            gum gumVarA3 = gucVar.a(1);
                            byte[] bArr3 = gumVarA3.a;
                            int i7 = gumVarA3.c;
                            gumVarA3.c = i7 + 1;
                            bArr3[i7] = (byte) ((iCodePointAt >> 6) | 192);
                            gucVar.c++;
                            gum gumVarA4 = gucVar.a(1);
                            byte[] bArr4 = gumVarA4.a;
                            int i8 = gumVarA4.c;
                            gumVarA4.c = i8 + 1;
                            bArr4[i8] = (byte) ((iCodePointAt & 63) | 128);
                            gucVar.c++;
                            i3 = iCharCount;
                        } else if (iCodePointAt < 65536) {
                            if (iCodePointAt < 55296) {
                                gum gumVarA5 = gucVar.a(1);
                                byte[] bArr5 = gumVarA5.a;
                                int i9 = gumVarA5.c;
                                gumVarA5.c = i9 + 1;
                                bArr5[i9] = (byte) ((iCodePointAt >> 12) | 224);
                                gucVar.c++;
                                gum gumVarA6 = gucVar.a(1);
                                byte[] bArr6 = gumVarA6.a;
                                int i10 = gumVarA6.c;
                                gumVarA6.c = i10 + 1;
                                bArr6[i10] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                gucVar.c++;
                                gum gumVarA7 = gucVar.a(1);
                                byte[] bArr7 = gumVarA7.a;
                                int i11 = gumVarA7.c;
                                gumVarA7.c = i11 + 1;
                                bArr7[i11] = (byte) ((iCodePointAt & 63) | 128);
                                gucVar.c++;
                                i3 = iCharCount;
                            } else {
                                gum gumVarA8 = gucVar.a(1);
                                byte[] bArr8 = gumVarA8.a;
                                int i12 = gumVarA8.c;
                                gumVarA8.c = i12 + 1;
                                bArr8[i12] = (byte) ((iCodePointAt >> 12) | 224);
                                gucVar.c++;
                                gum gumVarA9 = gucVar.a(1);
                                byte[] bArr9 = gumVarA9.a;
                                int i13 = gumVarA9.c;
                                gumVarA9.c = i13 + 1;
                                bArr9[i13] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                gucVar.c++;
                                gum gumVarA10 = gucVar.a(1);
                                byte[] bArr10 = gumVarA10.a;
                                int i14 = gumVarA10.c;
                                gumVarA10.c = i14 + 1;
                                bArr10[i14] = (byte) ((iCodePointAt & 63) | 128);
                                gucVar.c++;
                                i3 = iCharCount;
                            }
                        } else if (iCodePointAt <= 1114111) {
                            gum gumVarA11 = gucVar.a(1);
                            byte[] bArr11 = gumVarA11.a;
                            int i15 = gumVarA11.c;
                            gumVarA11.c = i15 + 1;
                            bArr11[i15] = (byte) ((iCodePointAt >> 18) | 240);
                            gucVar.c++;
                            gum gumVarA12 = gucVar.a(1);
                            byte[] bArr12 = gumVarA12.a;
                            int i16 = gumVarA12.c;
                            gumVarA12.c = i16 + 1;
                            bArr12[i16] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                            gucVar.c++;
                            gum gumVarA13 = gucVar.a(1);
                            byte[] bArr13 = gumVarA13.a;
                            int i17 = gumVarA13.c;
                            gumVarA13.c = i17 + 1;
                            bArr13[i17] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            gucVar.c++;
                            gum gumVarA14 = gucVar.a(1);
                            byte[] bArr14 = gumVarA14.a;
                            int i18 = gumVarA14.c;
                            gumVarA14.c = i18 + 1;
                            bArr14[i18] = (byte) ((iCodePointAt & 63) | 128);
                            gucVar.c++;
                            i3 = iCharCount;
                        } else {
                            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(iCodePointAt));
                        }
                    } else if (iCodePointAt == 43 && z) {
                        gum gumVarA15 = gucVar.a(1);
                        byte[] bArr15 = gumVarA15.a;
                        int i19 = gumVarA15.c;
                        gumVarA15.c = i19 + 1;
                        bArr15[i19] = (byte) 32;
                        gucVar.c++;
                        i3 = iCharCount;
                    } else if (iCodePointAt < 128) {
                        gum gumVarA16 = gucVar.a(1);
                        byte[] bArr16 = gumVarA16.a;
                        int i20 = gumVarA16.c;
                        gumVarA16.c = i20 + 1;
                        bArr16[i20] = (byte) iCodePointAt;
                        gucVar.c++;
                        i3 = iCharCount;
                    } else if (iCodePointAt < 2048) {
                        gum gumVarA17 = gucVar.a(1);
                        byte[] bArr17 = gumVarA17.a;
                        int i21 = gumVarA17.c;
                        gumVarA17.c = i21 + 1;
                        bArr17[i21] = (byte) ((iCodePointAt >> 6) | 192);
                        gucVar.c++;
                        gum gumVarA18 = gucVar.a(1);
                        byte[] bArr18 = gumVarA18.a;
                        int i22 = gumVarA18.c;
                        gumVarA18.c = i22 + 1;
                        bArr18[i22] = (byte) ((iCodePointAt & 63) | 128);
                        gucVar.c++;
                        i3 = iCharCount;
                    } else if (iCodePointAt < 65536) {
                        if (iCodePointAt < 55296 && iCodePointAt <= 57343) {
                            gum gumVarA19 = gucVar.a(1);
                            byte[] bArr19 = gumVarA19.a;
                            int i23 = gumVarA19.c;
                            gumVarA19.c = i23 + 1;
                            bArr19[i23] = (byte) 63;
                            gucVar.c++;
                            i3 = iCharCount;
                        } else {
                            gum gumVarA20 = gucVar.a(1);
                            byte[] bArr20 = gumVarA20.a;
                            int i110 = gumVarA20.c;
                            gumVarA20.c = i110 + 1;
                            bArr20[i110] = (byte) ((iCodePointAt >> 12) | 224);
                            gucVar.c++;
                            gum gumVarA21 = gucVar.a(1);
                            byte[] bArr21 = gumVarA21.a;
                            int i111 = gumVarA21.c;
                            gumVarA21.c = i111 + 1;
                            bArr21[i111] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            gucVar.c++;
                            gum gumVarA110 = gucVar.a(1);
                            byte[] bArr110 = gumVarA110.a;
                            int i112 = gumVarA110.c;
                            gumVarA110.c = i112 + 1;
                            bArr110[i112] = (byte) ((iCodePointAt & 63) | 128);
                            gucVar.c++;
                            i3 = iCharCount;
                        }
                    } else if (iCodePointAt <= 1114111) {
                        gum gumVarA111 = gucVar.a(1);
                        byte[] bArr111 = gumVarA111.a;
                        int i113 = gumVarA111.c;
                        gumVarA111.c = i113 + 1;
                        bArr111[i113] = (byte) ((iCodePointAt >> 18) | 240);
                        gucVar.c++;
                        gum gumVarA112 = gucVar.a(1);
                        byte[] bArr112 = gumVarA112.a;
                        int i114 = gumVarA112.c;
                        gumVarA112.c = i114 + 1;
                        bArr112[i114] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                        gucVar.c++;
                        gum gumVarA113 = gucVar.a(1);
                        byte[] bArr113 = gumVarA113.a;
                        int i115 = gumVarA113.c;
                        gumVarA113.c = i115 + 1;
                        bArr113[i115] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                        gucVar.c++;
                        gum gumVarA114 = gucVar.a(1);
                        byte[] bArr114 = gumVarA114.a;
                        int i116 = gumVarA114.c;
                        gumVarA114.c = i116 + 1;
                        bArr114[i116] = (byte) ((iCodePointAt & 63) | 128);
                        gucVar.c++;
                        i3 = iCharCount;
                    } else {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(iCodePointAt));
                    }
                    iCharCount = Character.charCount(iCodePointAt) + i3;
                }
                return gucVar.g();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 'A') + 10;
    }
}
