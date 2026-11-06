package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fty extends fuc {
    private final ftz c;

    fty(String str, boolean z, ftz ftzVar) {
        super(str, z);
        dvl.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.c = (ftz) dvl.a(ftzVar, "marshaller");
    }

    @Override // flm.fuc
    final byte[] a(Object obj) {
        return this.c.a(obj).getBytes(dva.a);
    }

    @Override // flm.fuc
    final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, dva.a));
    }
}
