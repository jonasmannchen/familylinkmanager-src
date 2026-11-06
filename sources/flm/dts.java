package flm;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dts {
    public final drr a;
    public final dtv b;
    public final dtn c;

    dts(drr drrVar, dtv dtvVar, Set set) {
        dtn dtnVarJ_;
        this.a = drrVar;
        this.b = dtvVar;
        if (set.isEmpty()) {
            dtnVarJ_ = dtp.d;
        } else if (set.size() == 1) {
            dtnVarJ_ = (dtn) set.iterator().next();
        } else {
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                int size = i;
                dtn dtnVar = (dtn) it.next();
                do {
                    size += dtnVar.b.size();
                    dtnVar = dtnVar.a;
                } while (dtnVar != null);
                i = size;
            }
            if (i == 0) {
                dtnVarJ_ = dtp.d;
            } else {
                so soVar = new so(i);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    dtn dtnVar2 = (dtn) it2.next();
                    do {
                        dtn dtnVar3 = dtnVar2;
                        for (int i2 = 0; i2 < dtnVar3.b.size(); i2++) {
                            dvl.a(soVar.put((dtm) dtnVar3.b.b(i2), dtnVar3.b.c(i2)) == null, "Duplicate bindings: %s", dtnVar3.b.b(i2));
                        }
                        dtnVar2 = dtnVar3.a;
                    } while (dtnVar2 != null);
                }
                dtnVarJ_ = new dtp(null, soVar).j_();
            }
        }
        this.c = dtnVarJ_;
    }

    public final dtq a(String str, dtn dtnVar, duo duoVar) {
        dvl.a(duoVar);
        return this.b.a(str, dtnVar, this.a.a(), this.a.b());
    }
}
