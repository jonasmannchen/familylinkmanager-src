package flm;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgp extends dfm implements dkz {
    public final int c;
    private final int d;
    private final int e;
    private ScheduledFuture f;

    private final synchronized void g() {
        if (this.f == null && !this.b) {
            this.f = c().scheduleAtFixedRate(new dgq(this), this.e, this.d, TimeUnit.MILLISECONDS);
        }
    }

    final synchronized void a(boolean z) {
        if (this.f != null) {
            this.f.cancel(z);
            this.f = null;
        }
    }

    @Override // flm.dfm
    final synchronized void d() {
        a(true);
    }

    @Override // flm.dkz
    public final void e() {
    }

    @Override // flm.dkz
    public final void f() {
        g();
    }
}
