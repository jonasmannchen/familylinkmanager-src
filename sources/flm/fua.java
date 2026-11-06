package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fua extends fuc {
    private final fub c;

    fua(String str, fub fubVar) {
        super(str, false);
        dvl.a(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        dvl.a(str.length() > 4, "empty key name");
        this.c = (fub) dvl.a(fubVar, "marshaller is null");
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
