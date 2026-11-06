package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkc {
    public final guc a;

    gkc(guc gucVar) {
        this.a = gucVar;
    }

    final void a(int i, int i2, int i3) {
        if (i < i2) {
            guc gucVar = this.a;
            gum gumVarA = gucVar.a(1);
            byte[] bArr = gumVarA.a;
            int i4 = gumVarA.c;
            gumVarA.c = i4 + 1;
            bArr[i4] = (byte) (i | 0);
            gucVar.c++;
            return;
        }
        guc gucVar2 = this.a;
        gum gumVarA2 = gucVar2.a(1);
        byte[] bArr2 = gumVarA2.a;
        int i5 = gumVarA2.c;
        gumVarA2.c = i5 + 1;
        bArr2[i5] = (byte) (i2 | 0);
        gucVar2.c++;
        int i6 = i - i2;
        while (true) {
            int i7 = i6;
            if (i7 >= 128) {
                guc gucVar3 = this.a;
                gum gumVarA3 = gucVar3.a(1);
                byte[] bArr3 = gumVarA3.a;
                int i8 = gumVarA3.c;
                gumVarA3.c = i8 + 1;
                bArr3[i8] = (byte) ((i7 & 127) | 128);
                gucVar3.c++;
                i6 = i7 >>> 7;
            } else {
                guc gucVar4 = this.a;
                gum gumVarA4 = gucVar4.a(1);
                byte[] bArr4 = gumVarA4.a;
                int i9 = gumVarA4.c;
                gumVarA4.c = i9 + 1;
                bArr4[i9] = (byte) i7;
                gucVar4.c++;
                return;
            }
        }
    }

    final void a(guf gufVar) {
        a(gufVar.e(), 127, 0);
        guc gucVar = this.a;
        if (gufVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        gufVar.a(gucVar);
    }
}
