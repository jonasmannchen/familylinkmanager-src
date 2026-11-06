package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgm extends cep {
    public cgm(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "ListSupervisableDevicesTask";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        fac facVar;
        if (!((this.b.d().a & 16777216) == 16777216)) {
            final fac facVar2 = (fac) btc.a(this.b.b().listSupervisableDevices(this.b.d().e), cgn.a);
            this.b.a(new coy(facVar2) { // from class: flm.cgo
                private final fac a;

                {
                    this.a = facVar2;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cgm.a(this.a, (cij) obj);
                }
            });
        }
        EnumMap enumMap = new EnumMap(evf.class);
        for (evf evfVar : evf.values()) {
            enumMap.put(evfVar, new ArrayList());
        }
        cij cijVarD = this.b.d();
        if (cijVarD.z == null) {
            facVar = fac.d;
        } else {
            facVar = cijVarD.z;
        }
        for (evd evdVar : facVar.b) {
            evf evfVarA = evf.a(evdVar.e);
            if (evfVarA == null) {
                evfVarA = evf.UNKNOWN;
            }
            ((List) enumMap.get(evfVarA)).add(evdVar);
        }
        return enumMap;
    }

    static final /* synthetic */ cij a(fac facVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (facVar == null) {
            throw new NullPointerException();
        }
        cijVar2.z = facVar;
        cijVar2.a |= 16777216;
        return (cij) ((fin) cikVar.h());
    }
}
