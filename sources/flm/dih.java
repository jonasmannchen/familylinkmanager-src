package flm;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dih implements dgb {
    public final /* synthetic */ dig a;

    dih(dig digVar) {
        this.a = digVar;
    }

    @Override // flm.dgb
    public final void b() {
        this.a.e();
        this.a.g = ((ScheduledExecutorService) this.a.d.a()).schedule(new dii(this), 10L, TimeUnit.SECONDS);
    }
}
