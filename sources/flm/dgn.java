package flm;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class dgn implements Runnable {
    private final dgi a;
    private final gok b;
    private final String c;
    private final boolean d;

    dgn(dgi dgiVar, gok gokVar, String str, boolean z) {
        this.a = dgiVar;
        this.b = gokVar;
        this.c = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgi dgiVar = this.a;
        gok gokVar = this.b;
        String str = this.c;
        boolean z = this.d;
        dsg.b();
        if (dgiVar.b) {
            dkm.a(3, "BatteryMetricService", "shutdown - skipping capture", new Object[0]);
            return;
        }
        synchronized (dgiVar.c) {
            dnd dndVarA = dgiVar.a(gokVar, str, z).a();
            dnd dndVarG = dgiVar.g();
            if (dgiVar.a(dndVarA)) {
                dgiVar.a(dndVarG, dndVarA);
            } else {
                dgiVar.d();
                dkm.a(5, "BatteryMetricService", "Failure storing persistent snapshot and helper data", new Object[0]);
            }
        }
    }
}
