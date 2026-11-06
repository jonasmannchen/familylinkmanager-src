package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfb extends cep {
    public cfb(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "FetchAppsTask";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        eya eyaVar;
        if (!((this.b.d().a & 2097152) == 2097152)) {
            final eya eyaVar2 = (eya) btc.a(this.b.b().getAppsInfo(this.b.d().f), cfc.a);
            this.b.a(new coy(eyaVar2) { // from class: flm.cfd
                private final eya a;

                {
                    this.a = eyaVar2;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfb.a(this.a, (cij) obj);
                }
            });
        }
        HashMap map = new HashMap();
        cij cijVarD = this.b.d();
        if (cijVarD.w == null) {
            eyaVar = eya.c;
        } else {
            eyaVar = cijVarD.w;
        }
        for (eta etaVar : eyaVar.b) {
            map.put(etaVar.b, etaVar);
        }
        return map;
    }

    static final /* synthetic */ cij a(eya eyaVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (eyaVar == null) {
            throw new NullPointerException();
        }
        cijVar2.w = eyaVar;
        cijVar2.a |= 2097152;
        return (cij) ((fin) cikVar.h());
    }
}
