package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ced extends cep {
    public ced(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "AddMemberSupervisionTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() throws Throwable {
        String str = this.b.d().e;
        if ((this.b.d().a & 65536) == 65536) {
            if (!((this.b.d().a & 4194304) == 4194304)) {
                btv.b("MemberSpvsn", "AddMemberSupervisionTask: joining family", new Object[0]);
                a(eku.ACCEPT_FAMILY_INVITE, ekw.STARTED);
                final ehq ehqVar = (ehq) btc.a(this.b.b().acceptInvitation(this.b.d().r, str), cee.a);
                this.b.a(new coy(ehqVar) { // from class: flm.cef
                    private final ehq a;

                    {
                        this.a = ehqVar;
                    }

                    @Override // flm.coy
                    public final Object a(Object obj) {
                        return ced.a(this.a, (cij) obj);
                    }
                });
                this.b.a(ceg.a);
                a(eku.ACCEPT_FAMILY_INVITE, ekw.SUCCEEDED);
            }
        }
        btv.b("MemberSpvsn", "AddMemberSupervisionTask: removing additional accounts", new Object[0]);
        a(eku.REMOVE_ADDITIONAL_ACCOUNTS, ekw.STARTED);
        this.b.b().removeAllAccountsExcept(str);
        a(eku.REMOVE_ADDITIONAL_ACCOUNTS, ekw.SUCCEEDED);
        if (!((this.b.d().a & 8388608) == 8388608)) {
            btv.b("MemberSpvsn", "AddMemberSupervisionTask: opting into supervision", new Object[0]);
            a(eku.OPT_IN_SUPERVISION, ekw.STARTED);
            final eie eieVar = (eie) btc.a(this.b.b().optInSupervision(str, this.b.d().o), ceh.a);
            this.b.a(new coy(eieVar) { // from class: flm.cei
                private final eie a;

                {
                    this.a = eieVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return ced.a(this.a, (cij) obj);
                }
            });
            a(eku.OPT_IN_SUPERVISION, ekw.SUCCEEDED);
        }
        if (this.b.d().i != 1) {
            btv.b("MemberSpvsn", "AddMemberSupervisionTask: setting the policy level", new Object[0]);
            a(eku.SET_POLICY_LEVEL, ekw.STARTED);
            this.b.b().setPolicyLevel(1);
            this.b.a(cej.a);
            a(eku.SET_POLICY_LEVEL, ekw.SUCCEEDED);
        }
        if (!((this.b.d().a & 131072) == 131072)) {
            btv.b("MemberSpvsn", "AddMemberSupervisionTask: reporting device info", new Object[0]);
            a(eku.REPORT_DEVICE_INFO, ekw.STARTED);
            final fdl fdlVar = (fdl) btc.a(this.b.b().reportDeviceInfo(), cek.a);
            this.b.a(new coy(fdlVar) { // from class: flm.cel
                private final fdl a;

                {
                    this.a = fdlVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return ced.a(this.a, (cij) obj);
                }
            });
            a(eku.REPORT_DEVICE_INFO, ekw.SUCCEEDED);
        }
        if (!((this.b.d().a & 262144) == 262144)) {
            btv.b("MemberSpvsn", "AddMemberSupervisionTask: initializing device setup", new Object[0]);
            a(eku.INITIALIZE_DEVICE_SETUP, ekw.STARTED);
            final eyu eyuVar = (eyu) btc.a(this.b.b().initializeDeviceSetup(this.b.d().f), cem.a);
            this.b.a(new coy(eyuVar) { // from class: flm.cen
                private final eyu a;

                {
                    this.a = eyuVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return ced.a(this.a, (cij) obj);
                }
            });
            a(eku.INITIALIZE_DEVICE_SETUP, ekw.SUCCEEDED);
            return null;
        }
        return null;
    }

    private final void a(eku ekuVar, ekw ekwVar) throws Throwable {
        cij cijVarD = this.b.d();
        emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(cijVarD.d).a(((ela) ((fio) ekz.d.a(dp.au, (Object) null))).a(ekuVar).a(ekwVar));
        if ((cijVarD.a & 16384) == 16384) {
            emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
        }
        a((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h()));
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

    static final /* synthetic */ cij a(eie eieVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (eieVar == null) {
            throw new NullPointerException();
        }
        cijVar2.y = eieVar;
        cijVar2.a |= 8388608;
        return (cij) ((fin) cikVar.h());
    }

    static final /* synthetic */ cij b(cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a().h());
    }

    static final /* synthetic */ cij a(ehq ehqVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (ehqVar == null) {
            throw new NullPointerException();
        }
        cijVar2.x = ehqVar;
        cijVar2.a |= 4194304;
        return (cij) ((fin) cikVar.h());
    }
}
