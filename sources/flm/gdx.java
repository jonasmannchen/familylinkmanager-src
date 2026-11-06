package flm;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdx extends fwv {
    public gcb a;
    private final Object b = new Object();
    private boolean c;
    private ScheduledFuture d;
    private final /* synthetic */ gda e;

    gdx(gda gdaVar, frd frdVar) {
        this.e = gdaVar;
        dvl.a(frdVar, "attrs");
    }

    @Override // flm.fwv
    final fzb c() {
        return this.a.a();
    }

    @Override // flm.ftr
    public final void a() {
        synchronized (this.b) {
            if (this.c) {
                if (this.e.D && this.d != null) {
                    this.d.cancel(false);
                    this.d = null;
                } else {
                    return;
                }
            } else {
                this.c = true;
            }
            if (!this.e.D) {
                this.d = this.e.e.a().schedule(new gcx(new gdy(this)), 5L, TimeUnit.SECONDS);
            } else {
                this.a.a(gda.b);
            }
        }
    }

    @Override // flm.ftr
    public final void b() {
        this.a.a();
    }

    public final String toString() {
        return this.a.b.toString();
    }
}
