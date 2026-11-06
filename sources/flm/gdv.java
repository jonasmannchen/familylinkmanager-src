package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdv extends fyl {
    private final /* synthetic */ gda a;

    gdv(gda gdaVar) {
        this.a = gdaVar;
    }

    @Override // flm.fyl
    final void a(Throwable th) {
        super.a(th);
        gda gdaVar = this.a;
        if (gdaVar.x) {
            return;
        }
        gdaVar.x = true;
        gdaVar.b(true);
        gdaVar.a(false);
        gdaVar.a(new gdd(th));
        if (gdaVar.I != null) {
            fym fymVar = gdaVar.I;
            ftb ftbVar = new ftb();
            ftbVar.a = "Entering TRANSIENT_FAILURE state";
            ftbVar.b = ftc.CT_INFO;
            fymVar.a(ftbVar.a(gdaVar.i.a()).a());
        }
        gdaVar.p.a(fsa.TRANSIENT_FAILURE);
    }
}
