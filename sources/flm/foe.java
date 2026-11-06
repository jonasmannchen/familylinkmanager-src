package flm;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foe {
    public String a;
    public String d;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final List f = new ArrayList();

    public foe() {
        this.f.add("");
    }

    final int a() {
        return this.e != -1 ? this.e : fod.a(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        if (this.d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        } else {
            sb.append(this.d);
        }
        int iA = a();
        if (iA != fod.a(this.a)) {
            sb.append(':');
            sb.append(iA);
        }
        fod.a(sb, this.f);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[LOOP:1: B:28:0x0043->B:31:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6 A[LOOP:2: B:35:0x0064->B:62:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x00bd A[EDGE_INSN: B:92:0x00bd->B:69:0x00bd BREAK  A[LOOP:1: B:28:0x0043->B:31:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a4 A[SYNTHETIC] */
    public static InetAddress a(String str, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        int i6;
        int i7;
        int iA;
        byte[] bArr = new byte[16];
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        int i11 = 1;
        while (i11 < i2) {
            if (i8 == 16) {
                return null;
            }
            if (i11 + 2 <= i2 && str.regionMatches(i11, "::", 0, 2)) {
                if (i9 != -1) {
                    return null;
                }
                i11 += 2;
                i9 = i8 + 2;
                if (i11 == i2) {
                    i8 = i9;
                    break;
                }
                i8 = i9;
                i5 = 0;
                i6 = i11;
                while (i6 < i2) {
                    iA = fod.a(str.charAt(i6));
                    if (iA != -1) {
                        break;
                        break;
                    }
                    i5 = (i5 << 4) + iA;
                    i6++;
                }
                i7 = i6 - i11;
                if (i7 != 0) {
                }
                return null;
            }
            if (i8 != 0) {
                if (str.regionMatches(i11, ":", 0, 1)) {
                    i11++;
                } else {
                    if (str.regionMatches(i11, ".", 0, 1)) {
                        int i12 = i8 - 2;
                        int i13 = i10;
                        int i14 = i12;
                        loop2: while (true) {
                            if (i13 < i2) {
                                if (i14 == bArr.length) {
                                    z = false;
                                    break;
                                }
                                if (i14 != i12) {
                                    if (str.charAt(i13) != '.') {
                                        z = false;
                                        break;
                                    }
                                    i13++;
                                    i3 = 0;
                                    i4 = i13;
                                    while (i4 < i2) {
                                        cCharAt = str.charAt(i4);
                                        if (cCharAt >= '0') {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i4 - i13 == 0) {
                                        z = false;
                                        break;
                                    }
                                    bArr[i14] = (byte) i3;
                                    i14++;
                                    i13 = i4;
                                } else {
                                    i3 = 0;
                                    i4 = i13;
                                    while (i4 < i2) {
                                        cCharAt = str.charAt(i4);
                                        if (cCharAt >= '0' && cCharAt <= '9') {
                                            if (i3 == 0 && i13 != i4) {
                                                z = false;
                                                break loop2;
                                            }
                                            i3 = ((i3 * 10) + cCharAt) - 48;
                                            if (i3 > 255) {
                                                z = false;
                                                break loop2;
                                            }
                                            i4++;
                                        } else {
                                            break;
                                        }
                                    }
                                    if (i4 - i13 == 0) {
                                        z = false;
                                        break;
                                    }
                                    bArr[i14] = (byte) i3;
                                    i14++;
                                    i13 = i4;
                                }
                            } else {
                                if (i14 == i12 + 4) {
                                    z = true;
                                    break;
                                }
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            return null;
                        }
                        i8 += 2;
                        break;
                    }
                    return null;
                }
            }
            i5 = 0;
            i6 = i11;
            while (i6 < i2) {
                iA = fod.a(str.charAt(i6));
                if (iA != -1) {
                    break;
                }
                i5 = (i5 << 4) + iA;
                i6++;
            }
            i7 = i6 - i11;
            if (i7 != 0 || i7 > 4) {
                return null;
            }
            int i15 = i8 + 1;
            bArr[i8] = (byte) (i5 >>> 8);
            i8 = i15 + 1;
            bArr[i15] = (byte) i5;
            int i16 = i6;
            i10 = i11;
            i11 = i16;
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            System.arraycopy(bArr, i9, bArr, 16 - (i8 - i9), i8 - i9);
            Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public static String a(String str) {
        boolean z = true;
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    if (z) {
                        return null;
                    }
                    return lowerCase;
                }
            }
            z = false;
            if (z) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
