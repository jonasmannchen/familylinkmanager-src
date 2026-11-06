package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fgt {
    static int a(byte[] bArr, int i, fgu fguVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a(b, bArr, i2, fguVar);
        }
        fguVar.a = b;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, fgu fguVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            fguVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = ((b & 127) << 7) | i3;
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            fguVar.a = (b2 << 14) | i5;
            return i6;
        }
        int i7 = ((b2 & 127) << 14) | i5;
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            fguVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = ((b3 & 127) << 21) | i7;
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            fguVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = ((b4 & 127) << 28) | i9;
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                fguVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int b(byte[] bArr, int i, fgu fguVar) {
        int i2 = 7;
        int i3 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            fguVar.b = j;
        } else {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            long j2 = (j & 127) | (((long) (b & 127)) << 7);
            i3 = i4;
            long j3 = j2;
            byte b2 = b;
            while (b2 < 0) {
                int i5 = i3 + 1;
                b2 = bArr[i3];
                int i6 = i2 + 7;
                j3 |= ((long) (b2 & 127)) << i6;
                i2 = i6;
                i3 = i5;
            }
            fguVar.b = j3;
        }
        return i3;
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static long b(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int c(byte[] bArr, int i, fgu fguVar) throws fjg {
        int iA = a(bArr, i, fguVar);
        int i2 = fguVar.a;
        if (i2 < 0) {
            throw fjg.b();
        }
        if (i2 == 0) {
            fguVar.c = "";
            return iA;
        }
        fguVar.c = new String(bArr, iA, i2, fiv.a);
        return iA + i2;
    }

    static int d(byte[] bArr, int i, fgu fguVar) throws fjg {
        int iA = a(bArr, i, fguVar);
        int i2 = fguVar.a;
        if (i2 < 0) {
            throw fjg.b();
        }
        if (i2 == 0) {
            fguVar.c = "";
            return iA;
        }
        fguVar.c = fmc.c(bArr, iA, i2);
        return iA + i2;
    }

    static int e(byte[] bArr, int i, fgu fguVar) throws fjg {
        int iA = a(bArr, i, fguVar);
        int i2 = fguVar.a;
        if (i2 < 0) {
            throw fjg.b();
        }
        if (i2 > bArr.length - iA) {
            throw fjg.a();
        }
        if (i2 == 0) {
            fguVar.c = fgy.a;
            return iA;
        }
        fguVar.c = fgy.a(bArr, iA, i2);
        return iA + i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, fjf fjfVar, fgu fguVar) {
        fiu fiuVar = (fiu) fjfVar;
        int iA = a(bArr, i2, fguVar);
        fiuVar.d(fguVar.a);
        while (iA < i3) {
            int iA2 = a(bArr, iA, fguVar);
            if (i != fguVar.a) {
                break;
            }
            iA = a(bArr, iA2, fguVar);
            fiuVar.d(fguVar.a);
        }
        return iA;
    }

    static int a(byte[] bArr, int i, fjf fjfVar, fgu fguVar) throws fjg {
        fiu fiuVar = (fiu) fjfVar;
        int iA = a(bArr, i, fguVar);
        int i2 = fguVar.a + iA;
        while (iA < i2) {
            iA = a(bArr, iA, fguVar);
            fiuVar.d(fguVar.a);
        }
        if (iA != i2) {
            throw fjg.a();
        }
        return iA;
    }

    static int a(int i, byte[] bArr, int i2, int i3, flr flrVar, fgu fguVar) throws fjg {
        int i4;
        if ((i >>> 3) == 0) {
            throw fjg.d();
        }
        switch (i & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                int iB = b(bArr, i2, fguVar);
                flrVar.a(i, Long.valueOf(fguVar.b));
                return iB;
            case 1:
                flrVar.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            case 2:
                int iA = a(bArr, i2, fguVar);
                int i5 = fguVar.a;
                if (i5 < 0) {
                    throw fjg.b();
                }
                if (i5 > bArr.length - iA) {
                    throw fjg.a();
                }
                if (i5 == 0) {
                    flrVar.a(i, fgy.a);
                } else {
                    flrVar.a(i, fgy.a(bArr, iA, i5));
                }
                return iA + i5;
            case 3:
                flr flrVar2 = new flr();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                int iA2 = i2;
                while (iA2 < i3) {
                    iA2 = a(bArr, iA2, fguVar);
                    i7 = fguVar.a;
                    if (i7 != i6) {
                        iA2 = a(i7, bArr, iA2, i3, flrVar2, fguVar);
                    } else {
                        int i8 = i7;
                        i4 = iA2;
                        if (i4 <= i3 || i8 != i6) {
                            throw fjg.i();
                        }
                        flrVar.a(i, flrVar2);
                        return i4;
                    }
                }
                int i9 = i7;
                i4 = iA2;
                if (i4 <= i3) {
                }
                throw fjg.i();
            case 4:
            default:
                throw fjg.d();
            case 5:
                flrVar.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, fgu fguVar) throws fjg {
        int i4;
        if ((i >>> 3) == 0) {
            throw fjg.d();
        }
        switch (i & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return b(bArr, i2, fguVar);
            case 1:
                return i2 + 8;
            case 2:
                return a(bArr, i2, fguVar) + fguVar.a;
            case 3:
                int i5 = (i & (-8)) | 4;
                int i6 = 0;
                int iA = i2;
                while (iA < i3) {
                    iA = a(bArr, iA, fguVar);
                    i6 = fguVar.a;
                    if (i6 != i5) {
                        iA = a(i6, bArr, iA, i3, fguVar);
                    } else {
                        int i7 = i6;
                        i4 = iA;
                        if (i4 <= i3 || i7 != i5) {
                            throw fjg.i();
                        }
                        return i4;
                    }
                }
                int i8 = i6;
                i4 = iA;
                if (i4 <= i3) {
                }
                throw fjg.i();
            case 4:
            default:
                throw fjg.d();
            case 5:
                return i2 + 4;
        }
    }
}
