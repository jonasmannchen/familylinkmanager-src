package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chc extends cep {
    public chc(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "StartMemberSvOnboardingTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final chf b() {
        this.b.b().setPolicyLevel(3);
        this.b.a(chd.a);
        String str = this.b.d().e;
        Collection<buh> collectionA = bug.a(this.a);
        for (final buh buhVar : collectionA) {
            if (buhVar.b.equals(str)) {
                this.b.a(new coy(buhVar) { // from class: flm.che
                    private final buh a;

                    {
                        this.a = buhVar;
                    }

                    @Override // flm.coy
                    public final Object a(Object obj) {
                        return chc.a(this.a, (cij) obj);
                    }
                });
                break;
            }
        }
        Map mapB = new cgm(this.b).b();
        return new chf(collectionA.size(), ((List) mapB.get(evf.SUPERVISABLE_WITH_ACTION)).size(), ((List) mapB.get(evf.UNSUPERVISABLE_BUT_ALLOWED)).size(), ((List) mapB.get(evf.NOT_ALLOWED)).size());
    }

    static final /* synthetic */ cij a(buh buhVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVarA = ((cik) fioVar).a(buhVar.a);
        exl exlVar = (exl) ((fio) exj.g.a(dp.au, (Object) null));
        String str = buhVar.a;
        exlVar.c();
        exj exjVar = (exj) exlVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        exjVar.a |= 1;
        exjVar.b = str;
        exn exnVar = (exn) ((fio) exm.h.a(dp.au, (Object) null));
        String str2 = buhVar.b;
        exnVar.c();
        exm exmVar = (exm) exnVar.a;
        if (str2 == null) {
            throw new NullPointerException();
        }
        exmVar.a |= 64;
        exmVar.f = str2;
        String str3 = buhVar.c;
        exnVar.c();
        exm exmVar2 = (exm) exnVar.a;
        if (str3 == null) {
            throw new NullPointerException();
        }
        exmVar2.a |= 1;
        exmVar2.b = str3;
        String str4 = buhVar.d;
        exnVar.c();
        exm exmVar3 = (exm) exnVar.a;
        if (str4 == null) {
            throw new NullPointerException();
        }
        exmVar3.a |= 4;
        exmVar3.c = str4;
        exn exnVarA = exnVar.a(dvj.b(buhVar.e));
        exlVar.c();
        exj exjVar2 = (exj) exlVar.a;
        exjVar2.d = (exm) ((fin) exnVarA.h());
        exjVar2.a |= 8;
        return (cij) ((fin) cikVarA.a((exj) ((fin) exlVar.h())).h());
    }

    static final /* synthetic */ cij a(cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(3).h());
    }
}
