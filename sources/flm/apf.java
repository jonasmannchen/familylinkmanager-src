package flm;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class apf extends auv {
    private final aog a;

    apf(aog aogVar, atp atpVar) {
        super(aob.a, atpVar);
        this.a = aogVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        aog aogVar;
        aph aphVar = (aph) asyVar;
        apg apgVar = new apg(this);
        try {
            aog aogVarA = this.a;
            Iterator it = aogVarA.a.p.iterator();
            while (true) {
                if (it.hasNext()) {
                    aogVarA = ((aof) it.next()).a();
                    if (aogVarA == null) {
                        aogVar = null;
                        break;
                    }
                } else {
                    Iterator it2 = aob.o.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            aogVar = aogVarA;
                            break;
                        }
                        aogVarA = ((aof) it2.next()).a();
                        if (aogVarA == null) {
                            aogVar = null;
                            break;
                        }
                    }
                }
            }
            if (aogVar == null) {
                apgVar.a(Status.a);
                return;
            }
            if (!aogVar.a.n.a(aogVar.e, aogVar.f, ((fng) aogVar.i.a).e)) {
                setResult((aty) Status.a);
                return;
            }
            try {
                apc apcVar = new apc(new apq(aogVar.a.c, aogVar.a.d, aogVar.f, aogVar.e, aogVar.d, aogVar.h, aogVar.a.i, aogVar.g), (fng) ((fin) aogVar.i.h()), aogVar.b, null, aob.a((ArrayList) null), null, aob.a((ArrayList) null), null, null, aogVar.c, null);
                fng fngVar = apcVar.j;
                fio fioVar = (fio) fngVar.a(dp.au, (Object) null);
                fioVar.a((fin) fngVar);
                fnh fnhVar = (fnh) fioVar;
                if (apcVar.k != null && apcVar.j.g.b() == 0) {
                    fnhVar.a(fgy.a(apcVar.k.a()));
                }
                if (apcVar.l != null && apcVar.j.i.b() == 0) {
                    fgy fgyVarA = fgy.a(apcVar.l.a());
                    fnhVar.c();
                    fng fngVar2 = (fng) fnhVar.a;
                    if (fgyVarA == null) {
                        throw new NullPointerException();
                    }
                    fngVar2.a |= 131072;
                    fngVar2.i = fgyVarA;
                }
                apcVar.j = (fng) ((fin) fnhVar.h());
                apcVar.b = apcVar.j.b();
                ((apl) aphVar.getService()).a(apgVar, apcVar);
            } catch (RuntimeException e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                setFailedResult(new Status(10, "MessageProducer"));
            }
        } catch (RuntimeException e2) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e2);
            setFailedResult(new Status(10, "EventModifier"));
        }
    }

    @Override // flm.auv, flm.auw
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return status;
    }
}
