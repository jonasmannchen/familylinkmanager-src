package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfh extends cep {
    private final boolean c;

    public cfh(KidSetupViewModel kidSetupViewModel, boolean z) {
        super(kidSetupViewModel);
        this.c = z;
    }

    @Override // flm.cep
    protected final String a() {
        return "FetchFamilyMembersTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        exm exmVar;
        exm exmVar2;
        exm exmVar3;
        if (!((this.b.d().a & 1048576) == 1048576)) {
            final ezu ezuVar = (ezu) btc.a(this.b.b().listFamilyMembers(this.c), cfi.a);
            this.b.a(new coy(ezuVar) { // from class: flm.cfj
                private final ezu a;

                {
                    this.a = ezuVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfh.a(this.a, (cij) obj);
                }
            });
            final String str = this.b.d().e;
            final exj exjVar = (exj) dyk.b(ezuVar.b, new dvm(str) { // from class: flm.cfk
                private final String a;

                {
                    this.a = str;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return cfh.a(this.a, (exj) obj);
                }
            });
            if (exjVar.d == null) {
                exmVar = exm.h;
            } else {
                exmVar = exjVar.d;
            }
            if (exmVar.d.isEmpty()) {
                if (exjVar.d == null) {
                    exmVar2 = exm.h;
                } else {
                    exmVar2 = exjVar.d;
                }
                fio fioVar = (fio) exmVar2.a(dp.au, (Object) null);
                fioVar.a((fin) exmVar2);
                exn exnVar = (exn) fioVar;
                if (exjVar.d == null) {
                    exmVar3 = exm.h;
                } else {
                    exmVar3 = exjVar.d;
                }
                exm exmVar4 = (exm) ((fin) exnVar.a(exmVar3.e).h());
                fio fioVar2 = (fio) exjVar.a(dp.au, (Object) null);
                fioVar2.a((fin) exjVar);
                exl exlVar = (exl) fioVar2;
                exlVar.c();
                exj exjVar2 = (exj) exlVar.a;
                if (exmVar4 == null) {
                    throw new NullPointerException();
                }
                exjVar2.d = exmVar4;
                exjVar2.a |= 8;
                exjVar = (exj) ((fin) exlVar.h());
            }
            this.b.a(new coy(exjVar) { // from class: flm.cfl
                private final exj a;

                {
                    this.a = exjVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfh.a(this.a, (cij) obj);
                }
            });
        }
        return null;
    }

    static final /* synthetic */ cij a(exj exjVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(exjVar).h());
    }

    static final /* synthetic */ boolean a(String str, exj exjVar) {
        exm exmVar;
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        return str.equals(exmVar.f);
    }

    static final /* synthetic */ cij a(ezu ezuVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (ezuVar == null) {
            throw new NullPointerException();
        }
        cijVar2.v = ezuVar;
        cijVar2.a |= 1048576;
        return (cij) ((fin) cikVar.h());
    }
}
