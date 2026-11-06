package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzh extends fzi {
    private int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ byte[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fzh(int i, byte[] bArr) {
        super((byte) 0);
        this.d = i;
        this.e = bArr;
        this.c = this.d;
    }

    @Override // flm.fzi
    public final int a(gez gezVar, int i) {
        gezVar.a(this.e, this.c, i);
        this.c += i;
        return 0;
    }
}
