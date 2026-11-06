package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gaj implements Runnable {
    private final /* synthetic */ ghg a;
    private final /* synthetic */ gai b;

    gaj(gai gaiVar, ghg ghgVar) {
        this.b = gaiVar;
        this.a = ghgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
