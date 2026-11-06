package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class giv extends fws {
    private final guc a;

    giv(guc gucVar) {
        this.a = gucVar;
    }

    @Override // flm.gez
    public final int a() {
        return (int) this.a.c;
    }

    @Override // flm.gez
    public final int b() {
        return this.a.c() & 255;
    }

    @Override // flm.gez
    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iA = this.a.a(bArr, i, i2);
            if (iA == -1) {
                throw new IndexOutOfBoundsException(new StringBuilder(36).append("EOF trying to read ").append(i2).append(" bytes").toString());
            }
            i2 -= iA;
            i += iA;
        }
    }

    @Override // flm.gez
    public final gez b(int i) {
        guc gucVar = new guc();
        gucVar.a_(this.a, i);
        return new giv(gucVar);
    }

    @Override // flm.fws, flm.gez, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.i();
    }
}
