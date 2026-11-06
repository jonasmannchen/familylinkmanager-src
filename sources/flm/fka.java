package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fka implements fjz {
    fka() {
    }

    @Override // flm.fjz
    public final Map a(Object obj) {
        return (fjy) obj;
    }

    @Override // flm.fjz
    public final fjx e(Object obj) {
        return ((fjw) obj).a;
    }

    @Override // flm.fjz
    public final Map b(Object obj) {
        return (fjy) obj;
    }

    @Override // flm.fjz
    public final boolean c(Object obj) {
        return !((fjy) obj).a;
    }

    @Override // flm.fjz
    public final Object d(Object obj) {
        ((fjy) obj).a = false;
        return obj;
    }

    @Override // flm.fjz
    public final Object a() {
        return fjy.b.a();
    }

    @Override // flm.fjz
    public final Object a(Object obj, Object obj2) {
        fjy fjyVarA = (fjy) obj;
        fjy fjyVar = (fjy) obj2;
        if (!fjyVar.isEmpty()) {
            if (!fjyVarA.a) {
                fjyVarA = fjyVarA.a();
            }
            fjyVarA.b();
            if (!fjyVar.isEmpty()) {
                fjyVarA.putAll(fjyVar);
            }
        }
        return fjyVarA;
    }

    @Override // flm.fjz
    public final int a(int i, Object obj, Object obj2) {
        int iK = 0;
        fjy fjyVar = (fjy) obj;
        fjw fjwVar = (fjw) obj2;
        if (fjyVar.isEmpty()) {
            return 0;
        }
        Iterator it = fjyVar.entrySet().iterator();
        while (true) {
            int i2 = iK;
            if (!it.hasNext()) {
                return i2;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            iK = fhp.k(fjw.a(fjwVar.a, key, value)) + fhp.f(i) + i2;
        }
    }
}
