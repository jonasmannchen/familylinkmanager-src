package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chr extends cep {
    public final String c;
    private final String d;

    public chr(KidSetupViewModel kidSetupViewModel, String str, String str2) {
        super(kidSetupViewModel);
        this.c = str;
        this.d = str2;
    }

    @Override // flm.cep
    protected final String a() {
        return "VerifyParentTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final dvi b() {
        final dvi dviVarC = dvi.c(this.b.b().reauthWithParentDelegation(this.b.d().e, this.c, this.d));
        if (dviVarC.a()) {
            this.b.a(new coy(this, dviVarC) { // from class: flm.chs
                private final chr a;
                private final dvi b;

                {
                    this.a = this;
                    this.b = dviVarC;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    chr chrVar = this.a;
                    dvi dviVar = this.b;
                    cij cijVar = (cij) obj;
                    fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
                    fioVar.a((fin) cijVar);
                    cik cikVar = (cik) fioVar;
                    String str = chrVar.c;
                    cikVar.c();
                    cij cijVar2 = (cij) cikVar.a;
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    cijVar2.a |= 2048;
                    cijVar2.m = str;
                    String str2 = (String) dviVar.b();
                    cikVar.c();
                    cij cijVar3 = (cij) cikVar.a;
                    if (str2 == null) {
                        throw new NullPointerException();
                    }
                    cijVar3.a |= 4096;
                    cijVar3.n = str2;
                    return (cij) ((fin) cikVar.h());
                }
            });
        }
        return dviVarC;
    }
}
