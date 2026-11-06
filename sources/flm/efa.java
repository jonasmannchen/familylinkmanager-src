package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class efa extends efc {
    efa(String str, String str2, Character ch) {
        this(new eey(str, str2.toCharArray()), ch);
    }

    private efa(eey eeyVar, Character ch) {
        super(eeyVar, ch);
        dvl.a(eeyVar.b.length == 64);
    }

    @Override // flm.efc, flm.eex
    final void a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        dvl.a(appendable);
        dvl.a(i, i + i2, bArr.length);
        int i3 = i;
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i5] & 255) << 8) | ((bArr[i3] & 255) << 16);
            i3 = i6 + 1;
            int i8 = i7 | (bArr[i6] & 255);
            appendable.append(this.c.b[i8 >>> 18]);
            appendable.append(this.c.b[(i8 >>> 12) & 63]);
            appendable.append(this.c.b[(i8 >>> 6) & 63]);
            appendable.append(this.c.b[i8 & 63]);
        }
        if (i3 < i + i2) {
            b(appendable, bArr, i3, (i + i2) - i3);
        }
    }

    @Override // flm.efc, flm.eex
    final int a(byte[] bArr, CharSequence charSequence) throws efb {
        int i = 0;
        dvl.a(bArr);
        CharSequence charSequenceB = b(charSequence);
        if (!this.c.a(charSequenceB.length())) {
            throw new efb(new StringBuilder(32).append("Invalid input length ").append(charSequenceB.length()).toString());
        }
        int i2 = 0;
        while (i < charSequenceB.length()) {
            int i3 = i + 1;
            int iA = this.c.a(charSequenceB.charAt(i)) << 18;
            i = i3 + 1;
            int iA2 = iA | (this.c.a(charSequenceB.charAt(i3)) << 12);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iA2 >>> 16);
            if (i < charSequenceB.length()) {
                int i5 = i + 1;
                int iA3 = iA2 | (this.c.a(charSequenceB.charAt(i)) << 6);
                int i6 = i4 + 1;
                bArr[i4] = (byte) (iA3 >>> 8);
                if (i5 < charSequenceB.length()) {
                    i = i5 + 1;
                    int iA4 = iA3 | this.c.a(charSequenceB.charAt(i5));
                    i2 = i6 + 1;
                    bArr[i6] = (byte) iA4;
                } else {
                    i = i5;
                    i2 = i6;
                }
            } else {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // flm.efc
    final eex a(eey eeyVar, Character ch) {
        return new efa(eeyVar, ch);
    }
}
