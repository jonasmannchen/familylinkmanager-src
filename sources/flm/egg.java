package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egg implements Runnable {
    public final efz a;
    public final egv b;

    egg(efz efzVar, egv egvVar) {
        this.a = efzVar;
        this.b = egvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.value == this) {
            if (efz.c.a(this.a, this, efz.b(this.b))) {
                efz.a(this.a);
            }
        }
    }
}
