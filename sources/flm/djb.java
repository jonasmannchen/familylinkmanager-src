package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djb implements Runnable {
    private final /* synthetic */ dhn a;

    djb(dhn dhnVar) {
        this.a = dhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhn dhnVar = this.a;
        (dhnVar.e.g ? (dki) dhnVar.a() : new dkd()).a(new dkc());
    }
}
