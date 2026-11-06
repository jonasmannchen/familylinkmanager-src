package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chk extends cep {
    private final boolean c;

    public chk(KidSetupViewModel kidSetupViewModel, boolean z) {
        super(kidSetupViewModel);
        this.c = z;
    }

    @Override // flm.cep
    protected final String a() {
        return "UpdateAppsTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        HashMap map = new HashMap();
        Collection<chu> collectionValues = this.b.d.values();
        for (chu chuVar : collectionValues) {
            map.put(chuVar.a.b, Boolean.valueOf(chuVar.c));
        }
        this.b.b().batchUpdateApps(this.b.d().f, map, ((Boolean) dyk.c(collectionValues, chl.a).a(chm.a).a((Object) true)).booleanValue(), this.c);
        return null;
    }
}
