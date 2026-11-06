package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class als extends fmv {
    public ejm a;

    public als() {
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) {
        if (this.a != null) {
            fmtVar.a(1, this.a);
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null) {
            return iA + fhp.c(1, this.a);
        }
        return iA;
    }

    @Override // flm.fnb
    public final /* synthetic */ fnb a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 10:
                    ejm ejmVar = (ejm) fmsVar.a((fko) ejm.d.a(dp.aw, (Object) null));
                    if (this.a != null) {
                        ejm ejmVar2 = this.a;
                        fio fioVar = (fio) ejmVar2.a(dp.au, (Object) null);
                        fioVar.a((fin) ejmVar2);
                        ejmVar = (ejm) ((fin) ((ejn) ((ejn) fioVar).a((fin) ejmVar)).h());
                    }
                    this.a = ejmVar;
                    break;
                default:
                    if (!super.a(fmsVar, iA)) {
                    }
                    break;
            }
        }
        return this;
    }
}
