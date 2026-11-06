package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghw extends gib {
    private final /* synthetic */ long a;
    private final /* synthetic */ gho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghw(gho ghoVar, long j) {
        super(ghoVar, (byte) 0);
        this.b = ghoVar;
        this.a = j;
    }

    @Override // flm.gib
    public final void a() {
        if (this.b.e.get() == this.a) {
            this.b.b.b();
        }
    }
}
