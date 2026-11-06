package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awe extends awi {
    private final ArrayList a;
    private final /* synthetic */ avy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awe(avy avyVar, ArrayList arrayList) {
        super(avyVar);
        this.b = avyVar;
        this.a = arrayList;
    }

    @Override // flm.awi
    public final void a() {
        Set setEmptySet;
        awk awkVar = this.b.a.m;
        avy avyVar = this.b;
        if (avyVar.k == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(avyVar.k.getRequiredScopes());
            Map optionalApiSettings = avyVar.k.getOptionalApiSettings();
            for (asw aswVar : optionalApiSettings.keySet()) {
                if (!avyVar.a.g.containsKey(aswVar.c())) {
                    hashSet.addAll(((bbc) optionalApiSettings.get(aswVar)).mScopes);
                }
            }
            setEmptySet = hashSet;
        }
        awkVar.e = setEmptySet;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ate) obj).getRemoteService(this.b.h, this.b.a.m.e);
        }
    }
}
