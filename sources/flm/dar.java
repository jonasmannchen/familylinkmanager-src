package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dar implements Runnable {
    private final /* synthetic */ dbh a;
    private final /* synthetic */ daq b;

    dar(daq daqVar, dbh dbhVar) {
        this.b = daqVar;
        this.a = dbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.c()) {
            this.b.b.f();
            return;
        }
        try {
            this.b.b.a(this.b.a.a(this.a));
        } catch (dbg e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a((Exception) e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}
