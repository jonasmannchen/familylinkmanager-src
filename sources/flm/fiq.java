package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fiq extends fio implements fkg {
    public fiq(fir firVar) {
        super(firVar);
    }

    @Override // flm.fio
    public final void c() {
        if (this.b) {
            super.c();
            ((fir) this.a).f = (fig) ((fir) this.a).f.clone();
        }
    }

    @Override // flm.fio
    /* JADX INFO: renamed from: d */
    public /* synthetic */ fin g() {
        return (fir) g();
    }

    @Override // flm.fio, flm.fkf
    public /* synthetic */ fke g() {
        if (this.b) {
            return (fir) this.a;
        }
        ((fir) this.a).f.a();
        return (fir) super.g();
    }
}
