package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fud extends fuc {
    private final fue c;

    fud(String str, boolean z, fue fueVar) {
        super(str, z);
        dvl.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.c = (fue) dvl.a(fueVar, "marshaller");
    }

    @Override // flm.fuc
    final byte[] a(Object obj) {
        return this.c.a(obj);
    }

    @Override // flm.fuc
    final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }
}
