package flm;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dij implements dgb {
    public final /* synthetic */ dig a;

    dij(dig digVar) {
        this.a = digVar;
    }

    @Override // flm.dgb
    public final void b() {
        ((ScheduledExecutorService) this.a.d.a()).submit(new dik(this));
    }
}
