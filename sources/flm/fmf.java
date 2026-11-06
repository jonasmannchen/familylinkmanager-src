package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fmf extends fme {
    fmf() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r12[r3] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        if (r12[r3] > (-65)) goto L47;
     */
    @Override // flm.fme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fmf.a(int, byte[], int, int):int");
    }

    @Override // flm.fme
    final String b(byte[] bArr, int i, int i2) throws fjg {
        int i3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = i;
        while (i6 < i4) {
            byte b = bArr[i6];
            if (!(b >= 0)) {
                break;
            }
            i6++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i6 < i4) {
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i3 = i5 + 1;
                i6 = i7;
                while (i6 < i4) {
                    byte b3 = bArr[i6];
                    if (!(b3 >= 0)) {
                        break;
                    }
                    cArr[i3] = (char) b3;
                    i3++;
                    i6++;
                }
            } else if (b2 < -32) {
                if (i7 >= i4) {
                    throw fjg.j();
                }
                int i8 = i7 + 1;
                byte b4 = bArr[i7];
                int i9 = i5 + 1;
                if (b2 < -62 || fmd.a(b4)) {
                    throw fjg.j();
                }
                cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                i5 = i9;
                i6 = i8;
            } else if (b2 < -16) {
                if (i7 >= i4 - 1) {
                    throw fjg.j();
                }
                int i10 = i7 + 1;
                fmd.b(b2, bArr[i7], bArr[i10], cArr, i5);
                i5++;
                i6 = i10 + 1;
            } else {
                if (i7 >= i4 - 2) {
                    throw fjg.j();
                }
                int i11 = i7 + 1;
                int i12 = i11 + 1;
                fmd.b(b2, bArr[i7], bArr[i11], bArr[i12], cArr, i5);
                i3 = i5 + 1 + 1;
                i6 = i12 + 1;
            }
            i5 = i3;
        }
        return new String(cArr, 0, i5);
    }

    @Override // flm.fme
    final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) cCharAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) cCharAt2;
            } else if (cCharAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i6 <= i5 - 3) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if (i6 <= i5 - 4) {
                    if (i4 + 1 != charSequence.length()) {
                        i4++;
                        char cCharAt3 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            int i10 = i6 + 1;
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i3 = i12 + 1;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    throw new fmg(i4 - 1, length);
                }
                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && (i4 + 1 == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4 + 1)))) {
                    throw new fmg(i4, length);
                }
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(cCharAt2).append(" at index ").append(i6).toString());
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    @Override // flm.fme
    final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        b(charSequence, byteBuffer);
    }
}
