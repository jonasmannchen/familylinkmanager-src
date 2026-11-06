package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fmh extends fme {
    fmh() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (flm.flw.a(r12, r0) > (-65)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (flm.flw.a(r12, r2) > (-65)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        if (flm.flw.a(r12, r2) > (-65)) goto L58;
     */
    @Override // flm.fme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fmh.a(int, byte[], int, int):int");
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
            byte bA = flw.a(bArr, i6);
            if (!(bA >= 0)) {
                break;
            }
            i6++;
            cArr[i5] = (char) bA;
            i5++;
        }
        while (i6 < i4) {
            int i7 = i6 + 1;
            byte bA2 = flw.a(bArr, i6);
            if (bA2 >= 0) {
                cArr[i5] = (char) bA2;
                i3 = i5 + 1;
                i6 = i7;
                while (i6 < i4) {
                    byte bA3 = flw.a(bArr, i6);
                    if (!(bA3 >= 0)) {
                        break;
                    }
                    cArr[i3] = (char) bA3;
                    i3++;
                    i6++;
                }
            } else if (bA2 < -32) {
                if (i7 >= i4) {
                    throw fjg.j();
                }
                int i8 = i7 + 1;
                byte bA4 = flw.a(bArr, i7);
                int i9 = i5 + 1;
                if (bA2 < -62 || fmd.a(bA4)) {
                    throw fjg.j();
                }
                cArr[i5] = (char) (((bA2 & 31) << 6) | (bA4 & 63));
                i5 = i9;
                i6 = i8;
            } else if (bA2 < -16) {
                if (i7 >= i4 - 1) {
                    throw fjg.j();
                }
                int i10 = i7 + 1;
                fmd.b(bA2, flw.a(bArr, i7), flw.a(bArr, i10), cArr, i5);
                i5++;
                i6 = i10 + 1;
            } else {
                if (i7 >= i4 - 2) {
                    throw fjg.j();
                }
                int i11 = i7 + 1;
                int i12 = i11 + 1;
                fmd.b(bA2, flw.a(bArr, i7), flw.a(bArr, i11), flw.a(bArr, i12), cArr, i5);
                i3 = i5 + 1 + 1;
                i6 = i12 + 1;
            }
            i5 = i3;
        }
        return new String(cArr, 0, i5);
    }

    @Override // flm.fme
    final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2 = i;
        long j3 = j2 + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(i + i2).toString());
        }
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt >= 128) {
                break;
            }
            flw.a(bArr, j2, (byte) cCharAt);
            i3++;
            j2 = 1 + j2;
        }
        if (i3 == length) {
            return (int) j2;
        }
        long j4 = j2;
        while (i3 < length) {
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 < 128 && j4 < j3) {
                j = 1 + j4;
                flw.a(bArr, j4, (byte) cCharAt2);
            } else if (cCharAt2 < 2048 && j4 <= j3 - 2) {
                long j5 = j4 + 1;
                flw.a(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                j = 1 + j5;
                flw.a(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j3 - 3) {
                    if (j4 <= j3 - 4) {
                        if (i3 + 1 != length) {
                            i3++;
                            char cCharAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j6 = 1 + j4;
                                flw.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j7 = 1 + j6;
                                flw.a(bArr, j6, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j8 = j7 + 1;
                                flw.a(bArr, j7, (byte) (((codePoint >>> 6) & 63) | 128));
                                j = 1 + j8;
                                flw.a(bArr, j8, (byte) ((codePoint & 63) | 128));
                            }
                        }
                        throw new fmg(i3 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && (i3 + 1 == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3 + 1)))) {
                        throw new fmg(i3, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j4).toString());
                }
                long j9 = 1 + j4;
                flw.a(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                long j10 = 1 + j9;
                flw.a(bArr, j9, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j = 1 + j10;
                flw.a(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
            }
            i3++;
            j4 = j;
        }
        return (int) j4;
    }

    @Override // flm.fme
    final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        long jA = flw.a(byteBuffer);
        long jPosition = jA + ((long) byteBuffer.position());
        long jLimit = jA + ((long) byteBuffer.limit());
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(byteBuffer.limit()).toString());
        }
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 128) {
                break;
            }
            flw.a(jPosition, (byte) cCharAt);
            i++;
            jPosition = 1 + jPosition;
        }
        if (i == length) {
            byteBuffer.position((int) (jPosition - jA));
            return;
        }
        long j2 = jPosition;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128 && j2 < jLimit) {
                j = 1 + j2;
                flw.a(j2, (byte) cCharAt2);
            } else if (cCharAt2 < 2048 && j2 <= jLimit - 2) {
                long j3 = j2 + 1;
                flw.a(j2, (byte) ((cCharAt2 >>> 6) | 960));
                j = 1 + j3;
                flw.a(j3, (byte) ((cCharAt2 & '?') | 128));
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > jLimit - 3) {
                    if (j2 <= jLimit - 4) {
                        if (i + 1 != length) {
                            i++;
                            char cCharAt3 = charSequence.charAt(i);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j4 = 1 + j2;
                                flw.a(j2, (byte) ((codePoint >>> 18) | 240));
                                long j5 = 1 + j4;
                                flw.a(j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j5 + 1;
                                flw.a(j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                j = 1 + j6;
                                flw.a(j6, (byte) ((codePoint & 63) | 128));
                            }
                        }
                        throw new fmg(i - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && (i + 1 == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i + 1)))) {
                        throw new fmg(i, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j2).toString());
                }
                long j7 = 1 + j2;
                flw.a(j2, (byte) ((cCharAt2 >>> '\f') | 480));
                long j8 = 1 + j7;
                flw.a(j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j = 1 + j8;
                flw.a(j8, (byte) ((cCharAt2 & '?') | 128));
            }
            i++;
            j2 = j;
        }
        byteBuffer.position((int) (j2 - jA));
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return fmc.a(i);
            case 1:
                return fmc.a(i, flw.a(bArr, j));
            case 2:
                return fmc.a(i, flw.a(bArr, j), flw.a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }
}
