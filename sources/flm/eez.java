package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eez extends efc {
    private final char[] d;

    eez(String str, String str2) {
        this(new eey(str, str2.toCharArray()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private eez(eey eeyVar) {
        super(eeyVar, null);
        this.d = new char[512];
        dvl.a(eeyVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.d[i] = eeyVar.b[i >>> 4];
            this.d[i | 256] = eeyVar.b[i & 15];
        }
    }

    @Override // flm.efc, flm.eex
    final void a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        dvl.a(appendable);
        dvl.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            appendable.append(this.d[i4]);
            appendable.append(this.d[i4 | 256]);
        }
    }

    @Override // flm.efc, flm.eex
    final int a(byte[] bArr, CharSequence charSequence) throws efb {
        int i = 0;
        dvl.a(bArr);
        if (charSequence.length() % 2 == 1) {
            throw new efb(new StringBuilder(32).append("Invalid input length ").append(charSequence.length()).toString());
        }
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) (this.c.a(charSequence.charAt(i + 1)) | (this.c.a(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // flm.efc
    final eex a(eey eeyVar, Character ch) {
        return new eez(eeyVar);
    }
}
