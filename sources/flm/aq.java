package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aq implements at {
    public final ak a;
    public final at b;
    private int c = -1;

    aq(ak akVar, at atVar) {
        this.a = akVar;
        this.b = atVar;
    }

    final void a() {
        ak akVar = this.a;
        am amVar = new am(akVar, this);
        ao aoVar = (ao) akVar.c.a(this, amVar);
        if (aoVar != null && (aoVar instanceof an)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aoVar == null) {
            amVar.a(true);
        }
    }

    @Override // flm.at
    public final void a(Object obj) {
        if (this.c != this.a.f) {
            this.c = this.a.f;
            this.b.a(obj);
        }
    }
}
