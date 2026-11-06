package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfc extends fws {
    private int a;
    private final int b;
    private final byte[] c;

    gfc(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    gfc(byte[] bArr, int i, int i2) {
        dvl.a(i >= 0, "offset must be >= 0");
        dvl.a(i2 >= 0, "length must be >= 0");
        dvl.a(i + i2 <= bArr.length, "offset + length exceeds array boundary");
        this.c = (byte[]) dvl.a(bArr, "bytes");
        this.a = i;
        this.b = i + i2;
    }

    @Override // flm.gez
    public final int a() {
        return this.b - this.a;
    }

    @Override // flm.gez
    public final int b() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    @Override // flm.gez
    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // flm.gez
    public final /* synthetic */ gez b(int i) {
        a(i);
        int i2 = this.a;
        this.a += i;
        return new gfc(this.c, i2, i);
    }
}
