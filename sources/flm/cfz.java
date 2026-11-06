package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfz extends cep {
    public cfz(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "InitializeDeviceSetupTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() throws cgf {
        if (this.b.b().hasMultipleAccounts()) {
            throw new cgf();
        }
        this.b.b().setPolicyLevel(1);
        this.b.a(cga.a);
        if (!((this.b.d().a & 131072) == 131072)) {
            final fdl fdlVar = (fdl) btc.a(this.b.b().reportDeviceInfo(), cgb.a);
            this.b.a(new coy(fdlVar) { // from class: flm.cgc
                private final fdl a;

                {
                    this.a = fdlVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfz.a(this.a, (cij) obj);
                }
            });
        }
        if (!((this.b.d().a & 262144) == 262144)) {
            final eyu eyuVar = (eyu) btc.a(this.b.b().initializeDeviceSetup(this.b.d().f), cgd.a);
            this.b.a(new coy(eyuVar) { // from class: flm.cge
                private final eyu a;

                {
                    this.a = eyuVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfz.a(this.a, (cij) obj);
                }
            });
            return null;
        }
        return null;
    }

    static final /* synthetic */ cij a(eyu eyuVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(eyuVar).b(1).h());
    }

    static final /* synthetic */ cij a(fdl fdlVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(fdlVar).h());
    }

    static final /* synthetic */ cij a(cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(1).h());
    }
}
