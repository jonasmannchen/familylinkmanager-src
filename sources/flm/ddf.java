package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class ddf extends auv {
    protected ddf(atp atpVar) {
        super(dcc.a, atpVar);
    }

    protected abstract void a(dcw dcwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public /* synthetic */ void doExecute(asy asyVar) {
        ddh ddhVar = (ddh) asyVar;
        ddhVar.getContext();
        a((dcw) ddhVar.getService());
    }

    @Override // flm.auv, flm.auw
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }
}
