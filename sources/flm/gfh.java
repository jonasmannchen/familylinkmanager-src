package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfh implements Runnable {
    private final /* synthetic */ gff a;

    gfh(gff gffVar) {
        this.a = gffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.execute(new gfg(this.a));
    }
}
