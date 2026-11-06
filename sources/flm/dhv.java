package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhv implements Runnable {
    private final /* synthetic */ gsk a;
    private final /* synthetic */ dhu b;

    dhv(dhu dhuVar, gsk gskVar) {
        this.b = dhuVar;
        this.a = gskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
        gsm gsmVar = (gsm) ((fio) gsj.c.a(dp.au, (Object) null));
        gsk gskVar = this.a;
        gsmVar.c();
        gsj gsjVar = (gsj) gsmVar.a;
        if (gskVar == null) {
            throw new NullPointerException();
        }
        gsjVar.a |= 1;
        gsjVar.b = gskVar.c;
        gtsVar.c();
        gtr gtrVar = (gtr) gtsVar.a;
        gtrVar.o = (gsj) ((fin) gsmVar.h());
        gtrVar.a |= 16384;
        this.b.a((gtr) ((fin) gtsVar.h()));
    }
}
