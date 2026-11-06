package flm;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdh implements bbm {
    public final Context mContext;
    public Map mExplanations;
    public bep mPermUtils;
    public Set mRequiredPermGroups;

    public bdh(Context context, Set set, Map map) {
        this(context, set, map, bep.a);
    }

    bdh(Context context, Set set, Map map, bep bepVar) {
        this.mContext = context;
        this.mRequiredPermGroups = set;
        this.mPermUtils = bepVar;
        this.mExplanations = map;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        Set hashSet;
        if (!"com.google.android.gms".equals(bbnVar.getCallingPackage())) {
            bep bepVar = this.mPermUtils;
            Set set = this.mRequiredPermGroups;
            if (set == null) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet(bepVar.a());
                hashSet.retainAll(set);
            }
            if (!hashSet.isEmpty()) {
                return new apx(19, bep.a(this.mContext.getApplicationContext(), this.mRequiredPermGroups, this.mExplanations));
            }
        }
        return apx.a;
    }
}
