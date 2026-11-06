package flm;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dls extends dfm {
    private static final long c = TimeUnit.SECONDS.toMillis(2);
    private static final long d = TimeUnit.SECONDS.toMillis(1);
    private final List e;

    static dls a(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, dku dkuVar) {
        ArrayList arrayList = new ArrayList(2);
        if (dku.f()) {
            arrayList.add(new dmo(dmbVar2, gog.MEMORY_TOTAL_PSS_KB, c, new dlt(application)));
        }
        arrayList.add(new dmo(dmbVar2, gog.MEMORY_ALLOCATED_KB, d, new dlu()));
        return new dls(application, dpzVar, dmbVar, dmbVar2, arrayList);
    }

    private dls(Application application, dpz dpzVar, dmb dmbVar, dmb dmbVar2, List list) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K);
        new Object();
        this.e = list;
    }

    @Override // flm.dfm
    final void d() {
        for (dmo dmoVar : this.e) {
            synchronized (dmoVar.b) {
                dmoVar.a.clear();
            }
        }
    }
}
