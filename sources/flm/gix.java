package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gix implements ghm {
    public final guc a;
    private int b;
    private int c;

    gix(guc gucVar, int i) {
        this.a = gucVar;
        this.b = i;
    }

    @Override // flm.ghm
    public final void a(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }

    @Override // flm.ghm
    public final void a(byte b) {
        guc gucVar = this.a;
        gum gumVarA = gucVar.a(1);
        byte[] bArr = gumVarA.a;
        int i = gumVarA.c;
        gumVarA.c = i + 1;
        bArr[i] = b;
        gucVar.c++;
        this.b--;
        this.c++;
    }

    @Override // flm.ghm
    public final int a() {
        return this.b;
    }

    @Override // flm.ghm
    public final int b() {
        return this.c;
    }

    @Override // flm.ghm
    public final void c() {
    }
}
