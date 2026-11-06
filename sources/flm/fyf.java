package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyf extends frt {
    private final gmx a;

    fyf(gmx gmxVar) {
        this.a = (gmx) dvl.a(gmxVar, "span");
    }

    @Override // flm.fvi
    public final void a(int i, long j, long j2) {
        fyc.b(this.a, gmt.SENT, i, j, j2);
    }

    @Override // flm.fvi
    public final void b(int i, long j, long j2) {
        fyc.b(this.a, gmt.RECEIVED, i, j, j2);
    }
}
