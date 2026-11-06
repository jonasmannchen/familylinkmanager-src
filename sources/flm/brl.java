package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class brl extends auv {
    public brl(atp atpVar) {
        super(bqp.a, atpVar);
    }

    protected abstract void a(brr brrVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public /* synthetic */ void doExecute(asy asyVar) {
        bro broVar = (bro) asyVar;
        broVar.getContext();
        a((brr) broVar.getService());
    }

    @Override // flm.auv, flm.auw
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }
}
