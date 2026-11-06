package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgj extends cep {
    public cgj(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "ListManagedDevicesTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List b() {
        ezq ezqVar;
        if (!((this.b.d().a & 33554432) == 33554432)) {
            final ezq ezqVar2 = (ezq) btc.a(this.b.b().listManagedDevices(), cgk.a);
            this.b.a(new coy(ezqVar2) { // from class: flm.cgl
                private final ezq a;

                {
                    this.a = ezqVar2;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cgj.a(this.a, (cij) obj);
                }
            });
        }
        cij cijVarD = this.b.d();
        if (cijVarD.A == null) {
            ezqVar = ezq.c;
        } else {
            ezqVar = cijVarD.A;
        }
        return ezqVar.b;
    }

    static final /* synthetic */ cij a(ezq ezqVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (ezqVar == null) {
            throw new NullPointerException();
        }
        cijVar2.A = ezqVar;
        cijVar2.a |= 33554432;
        return (cij) ((fin) cikVar.h());
    }
}
