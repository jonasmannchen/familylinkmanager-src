package flm;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmt {
    public final ByteBuffer a;
    public int b;
    private fhp c;

    private fmt(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private fmt(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static fmt a(byte[] bArr, int i, int i2) {
        return new fmt(bArr, i, i2);
    }

    final fhp a() {
        if (this.c == null) {
            this.c = fhp.a(this.a);
            this.b = this.a.position();
        } else if (this.b != this.a.position()) {
            this.c.c(this.a.array(), this.b, this.a.position() - this.b);
            this.b = this.a.position();
        }
        return this.c;
    }

    public final void a(int i, double d) throws fmu {
        c(i, 1);
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        if (this.a.remaining() < 8) {
            throw new fmu(this.a.position(), this.a.limit());
        }
        this.a.putLong(jDoubleToLongBits);
    }

    public final void a(int i, float f) throws fmu {
        c(11, 5);
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (this.a.remaining() < 4) {
            throw new fmu(this.a.position(), this.a.limit());
        }
        this.a.putInt(iFloatToIntBits);
    }

    public final void a(int i, long j) throws fmu {
        c(i, 0);
        a(j);
    }

    public final void a(int i, int i2) throws fmu {
        c(i, 0);
        if (i2 >= 0) {
            c(i2);
        } else {
            a(i2);
        }
    }

    public final void a(int i, boolean z) throws fmu {
        c(i, 0);
        byte b = (byte) (z ? 1 : 0);
        if (!this.a.hasRemaining()) {
            throw new fmu(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void a(int i, String str) throws fmu {
        c(i, 2);
        try {
            int iD = d(str.length());
            if (iD == d(str.length() * 3)) {
                int iPosition = this.a.position();
                if (this.a.remaining() < iD) {
                    throw new fmu(iD + iPosition, this.a.limit());
                }
                this.a.position(iPosition + iD);
                a(str, this.a);
                int iPosition2 = this.a.position();
                this.a.position(iPosition);
                c((iPosition2 - iPosition) - iD);
                this.a.position(iPosition2);
                return;
            }
            c(a((CharSequence) str));
            a(str, this.a);
        } catch (BufferOverflowException e) {
            fmu fmuVar = new fmu(this.a.position(), this.a.limit());
            fmuVar.initCause(e);
            throw fmuVar;
        }
    }

    public final void a(int i, fnb fnbVar) throws fmu {
        c(i, 2);
        a(fnbVar);
    }

    public final void a(int i, fke fkeVar) {
        fhp fhpVarA = a();
        fhpVarA.a(i, fkeVar);
        fhpVarA.h();
        this.b = this.a.position();
    }

    private static int a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 < length) {
                char cCharAt = charSequence.charAt(i3);
                if (cCharAt < 2048) {
                    i4 += (127 - cCharAt) >>> 31;
                    i3++;
                } else {
                    int length2 = charSequence.length();
                    while (i3 < length2) {
                        char cCharAt2 = charSequence.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i2 += (127 - cCharAt2) >>> 31;
                        } else {
                            i2 += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(charSequence, i3) < 65536) {
                                    throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
                                }
                                i3++;
                            }
                        }
                        i3++;
                    }
                    i = i4 + i2;
                    break;
                }
            } else {
                i = i4;
                break;
            }
        }
        if (i < length) {
            throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i) + 4294967296L).toString());
        }
        return i;
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3 = 0;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int iRemaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = iArrayOffset + iRemaining;
                while (i3 < length && i3 + iArrayOffset < i4) {
                    char cCharAt = charSequence.charAt(i3);
                    if (cCharAt >= 128) {
                        break;
                    }
                    bArrArray[iArrayOffset + i3] = (byte) cCharAt;
                    i3++;
                }
                if (i3 == length) {
                    i = iArrayOffset + length;
                } else {
                    int i5 = iArrayOffset + i3;
                    while (i3 < length) {
                        char cCharAt2 = charSequence.charAt(i3);
                        if (cCharAt2 < 128 && i5 < i4) {
                            i2 = i5 + 1;
                            bArrArray[i5] = (byte) cCharAt2;
                        } else if (cCharAt2 < 2048 && i5 <= i4 - 2) {
                            int i6 = i5 + 1;
                            bArrArray[i5] = (byte) ((cCharAt2 >>> 6) | 960);
                            i2 = i6 + 1;
                            bArrArray[i6] = (byte) ((cCharAt2 & '?') | 128);
                        } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i5 <= i4 - 3) {
                            int i7 = i5 + 1;
                            bArrArray[i5] = (byte) ((cCharAt2 >>> '\f') | 480);
                            int i8 = i7 + 1;
                            bArrArray[i7] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                            i2 = i8 + 1;
                            bArrArray[i8] = (byte) ((cCharAt2 & '?') | 128);
                        } else {
                            if (i5 <= i4 - 4) {
                                if (i3 + 1 != charSequence.length()) {
                                    i3++;
                                    char cCharAt3 = charSequence.charAt(i3);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        int i9 = i5 + 1;
                                        bArrArray[i5] = (byte) ((codePoint >>> 18) | 240);
                                        int i10 = i9 + 1;
                                        bArrArray[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i10 + 1;
                                        bArrArray[i10] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i11 + 1;
                                        bArrArray[i11] = (byte) ((codePoint & 63) | 128);
                                    }
                                }
                                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
                            }
                            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(cCharAt2).append(" at index ").append(i5).toString());
                        }
                        i3++;
                        i5 = i2;
                    }
                    i = i5;
                }
                byteBuffer.position(i - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i3 < length2) {
            char cCharAt4 = charSequence.charAt(i3);
            if (cCharAt4 < 128) {
                byteBuffer.put((byte) cCharAt4);
            } else if (cCharAt4 < 2048) {
                byteBuffer.put((byte) ((cCharAt4 >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
            } else if (cCharAt4 < 55296 || 57343 < cCharAt4) {
                byteBuffer.put((byte) ((cCharAt4 >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt4 >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
            } else {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    char cCharAt5 = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                        int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                        byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                    }
                }
                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
            }
            i3++;
        }
    }

    public final void a(fnb fnbVar) throws fmu {
        if (fnbVar.h < 0) {
            fnbVar.d();
        }
        c(fnbVar.h);
        fnbVar.a(this);
    }

    public static int b(int i, long j) {
        return b(i) + b(j);
    }

    public static int b(int i, int i2) {
        return b(i) + a(i2);
    }

    public static int b(int i, String str) {
        return b(i) + a(str);
    }

    public static int b(int i, fnb fnbVar) {
        int iB = b(i);
        int iD = fnbVar.d();
        return iB + iD + d(iD);
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(String str) {
        int iA = a((CharSequence) str);
        return iA + d(iA);
    }

    private final void e(int i) throws fmu {
        byte b = (byte) i;
        if (!this.a.hasRemaining()) {
            throw new fmu(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void a(byte[] bArr) throws fmu {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new fmu(this.a.position(), this.a.limit());
    }

    public final void c(int i, int i2) throws fmu {
        c((i << 3) | i2);
    }

    public static int b(int i) {
        return d(0 | (i << 3));
    }

    public final void c(int i) throws fmu {
        while ((i & (-128)) != 0) {
            e((i & 127) | 128);
            i >>>= 7;
        }
        e(i);
    }

    public static int d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    public final void a(long j) throws fmu {
        while (((-128) & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }

    public static int b(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }
}
