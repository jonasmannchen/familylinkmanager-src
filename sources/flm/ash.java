package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ash extends fmv {
    private String a = null;
    private String b = null;
    private String c = null;
    private arp d = null;

    public ash() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a);
        }
        if (this.b != null) {
            fmtVar.a(2, this.b);
        }
        if (this.c != null) {
            fmtVar.a(3, this.c);
        }
        if (this.d != null) {
            fmtVar.a(4, this.d);
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null) {
            iA += fmt.b(1, this.a);
        }
        if (this.b != null) {
            iA += fmt.b(2, this.b);
        }
        if (this.c != null) {
            iA += fmt.b(3, this.c);
        }
        if (this.d != null) {
            return iA + fhp.c(4, this.d);
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
                    this.a = fmsVar.c();
                    break;
                case 18:
                    this.b = fmsVar.c();
                    break;
                case 26:
                    this.c = fmsVar.c();
                    break;
                case 34:
                    arp arpVar = (arp) fmsVar.a((fko) arp.a.a(dp.aw, (Object) null));
                    if (this.d != null) {
                        arp arpVar2 = this.d;
                        fio fioVar = (fio) arpVar2.a(dp.au, (Object) null);
                        fioVar.a((fin) arpVar2);
                        arpVar = (arp) ((fin) ((arq) ((arq) fioVar).a((fin) arpVar)).h());
                    }
                    this.d = arpVar;
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
