package flm;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class efc extends eex {
    public final eey c;
    private final Character d;
    private transient eex e;

    efc(String str, String str2, Character ch) {
        this(new eey(str, str2.toCharArray()), ch);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    efc(eey eeyVar, Character ch) {
        boolean z;
        this.c = (eey) dvl.a(eeyVar);
        if (ch == null) {
            z = true;
        } else {
            char cCharValue = ch.charValue();
            if (cCharValue < eeyVar.g.length && eeyVar.g[cCharValue] != -1) {
                z = false;
            } else {
                z = true;
            }
        }
        dvl.a(z, "Padding character %s was already in alphabet", ch);
        this.d = ch;
    }

    @Override // flm.eex
    final int a(int i) {
        return this.c.e * eft.a(i, this.c.f, RoundingMode.CEILING);
    }

    @Override // flm.eex
    void a(Appendable appendable, byte[] bArr, int i, int i2) {
        dvl.a(appendable);
        dvl.a(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            b(appendable, bArr, i + i3, Math.min(this.c.f, i2 - i3));
            i3 += this.c.f;
        }
    }

    final void b(Appendable appendable, byte[] bArr, int i, int i2) {
        dvl.a(appendable);
        dvl.a(i, i + i2, bArr.length);
        dvl.a(i2 <= this.c.f);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j | ((long) (bArr[i + i3] & 255))) << 8;
        }
        int i4 = ((i2 + 1) << 3) - this.c.d;
        int i5 = 0;
        while (i5 < (i2 << 3)) {
            appendable.append(this.c.b[((int) (j >>> (i4 - i5))) & this.c.c]);
            i5 += this.c.d;
        }
        if (this.d != null) {
            while (i5 < (this.c.f << 3)) {
                appendable.append(this.d.charValue());
                i5 += this.c.d;
            }
        }
    }

    @Override // flm.eex
    final int b(int i) {
        return (int) (((((long) this.c.d) * ((long) i)) + 7) / 8);
    }

    @Override // flm.eex
    final CharSequence b(CharSequence charSequence) {
        dvl.a(charSequence);
        if (this.d != null) {
            char cCharValue = this.d.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }
        return charSequence;
    }

    @Override // flm.eex
    int a(byte[] bArr, CharSequence charSequence) throws efb {
        dvl.a(bArr);
        CharSequence charSequenceB = b(charSequence);
        if (!this.c.a(charSequenceB.length())) {
            throw new efb(new StringBuilder(32).append("Invalid input length ").append(charSequenceB.length()).toString());
        }
        int i = 0;
        int i2 = 0;
        while (i2 < charSequenceB.length()) {
            long j = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.c.e; i4++) {
                long jA = j << this.c.d;
                if (i2 + i4 < charSequenceB.length()) {
                    jA |= (long) this.c.a(charSequenceB.charAt(i3 + i2));
                    i3++;
                }
                j = jA;
            }
            int i5 = (this.c.f << 3) - (i3 * this.c.d);
            int i6 = (this.c.f - 1) << 3;
            while (i6 >= i5) {
                bArr[i] = (byte) ((j >>> i6) & 255);
                i6 -= 8;
                i++;
            }
            i2 += this.c.e;
        }
        return i;
    }

    @Override // flm.eex
    public final eex a() {
        boolean z;
        boolean z2;
        eey eeyVar;
        eex eexVar = this.e;
        if (eexVar != null) {
            return eexVar;
        }
        eey eeyVar2 = this.c;
        char[] cArr = eeyVar2.b;
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (dut.a(cArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            char[] cArr2 = eeyVar2.b;
            int length2 = cArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                char c = cArr2[i2];
                if (c >= 'a' && c <= 'z') {
                    z2 = true;
                    break;
                }
                i2++;
            }
            dvl.b(z2 ? false : true, "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr3 = new char[eeyVar2.b.length];
            for (int i3 = 0; i3 < eeyVar2.b.length; i3++) {
                char c2 = eeyVar2.b[i3];
                if (dut.a(c2)) {
                    c2 = (char) (c2 ^ ' ');
                }
                cArr3[i3] = c2;
            }
            eeyVar = new eey(String.valueOf(eeyVar2.a).concat(".lowerCase()"), cArr3);
        } else {
            eeyVar = eeyVar2;
        }
        eex eexVarA = eeyVar == this.c ? this : a(eeyVar, this.d);
        this.e = eexVarA;
        return eexVarA;
    }

    eex a(eey eeyVar, Character ch) {
        return new efc(eeyVar, ch);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.c.toString());
        if (8 % this.c.d != 0) {
            if (this.d == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('").append(this.d).append("')");
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof efc)) {
            return false;
        }
        efc efcVar = (efc) obj;
        return this.c.equals(efcVar.c) && dvh.a(this.d, efcVar.d);
    }

    public int hashCode() {
        return this.c.hashCode() ^ Arrays.hashCode(new Object[]{this.d});
    }
}
