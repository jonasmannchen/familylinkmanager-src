package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbw implements fti {
    gbw() {
    }

    @Override // flm.fue
    public final /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String strValueOf = String.valueOf(new String(bArr, fth.a));
        throw new NumberFormatException(strValueOf.length() != 0 ? "Malformed status code ".concat(strValueOf) : new String("Malformed status code "));
    }

    @Override // flm.fue
    public final /* synthetic */ byte[] a(Object obj) {
        throw new UnsupportedOperationException();
    }
}
