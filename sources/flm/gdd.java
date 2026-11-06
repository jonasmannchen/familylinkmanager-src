package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdd extends fts {
    private final ftp a;
    private final /* synthetic */ Throwable b;

    gdd(Throwable th) {
        this.b = th;
        this.a = ftp.b(fvc.i.a("Panic! This is a bug!").b(this.b));
    }

    @Override // flm.fts
    public final ftp a() {
        return this.a;
    }
}
